package edu.uoc.som.cmsdiscover.ui.importWizards;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Base64;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

import edu.uoc.com.cmsdiscover.CmsDiscover;

public class ImportWizard extends Wizard implements INewWizard {

	ImportWizardPage mainPage;

	public ImportWizard() {
		super();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.wizard.Wizard#performFinish()
	 */
	public boolean performFinish() {
		String url = null;
		URL passUrl = null;
		MessageBox messageBox = new MessageBox(getContainer().getShell(), SWT.ICON_ERROR);
		try {
			passUrl = new URL(mainPage.getUrl());
			
			if (mainPage.getTech() == "d") {
				url = mainPage.getUrl().toString() + "/openapi/jsonapi";
			} else {
				url = mainPage.getUrl().toString() + "/wp-json/";
			}
			URI uri = URI.create(url);
			var client = HttpClient.newHttpClient();
			var request = HttpRequest.newBuilder().uri(uri).method("GET", HttpRequest.BodyPublishers.noBody()).header("accept", "application/json")
					.header("Authorization", basicAuth(mainPage.getUser(), mainPage.getPass()))
					.build();
			request.method();
			var response = client.send(request, BodyHandlers.ofString());
			if (response.statusCode() == 200) {
				
			} else if (response.statusCode() == 403 ) {
				messageBox.setMessage("Unauthorized to acces to the API specification. Check your credentials");
				int result = messageBox.open();
				return false;
				
			}
			else if (response.statusCode() == 404) { 
				messageBox.setMessage("API not found, check your check the selected technology");
				int result = messageBox.open();
				return false;
			}
		
		} catch (MalformedURLException e) {
			
		} 
		catch (IOException e) {
			messageBox.setMessage("There was problems with your credentials");
			int result = messageBox.open();
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			messageBox.setMessage("There was problems with your credentials");
			int result = messageBox.open();
			// TODO Auto-generated catch block
			//e.printStackTrace();
			return false;
		}
		
	
		String Workspace = ResourcesPlugin.getWorkspace().getRoot().getLocation().toString();
		String ModelResultPath = Workspace + mainPage.getContainerFullPath() + "/" + mainPage.getFileName();
		CmsDiscover.getDefault().buildExtendModel(passUrl, mainPage.getUser(), mainPage.getPass(), mainPage.getTech(),
				ModelResultPath);
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.IWorkbenchWizard#init(org.eclipse.ui.IWorkbench,
	 * org.eclipse.jface.viewers.IStructuredSelection)
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		setWindowTitle("Import CMS model"); // NON-NLS-1
		setNeedsProgressMonitor(true);
		mainPage = new ImportWizardPage("Import CMS model", selection); // NON-NLS-1
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.wizard.IWizard#addPages()
	 */
	public void addPages() {
		super.addPages();
		addPage(mainPage);
	}
	
	private static String basicAuth(String username, String password) {
		return "Basic " + Base64.getEncoder().encodeToString((username + ":" + password).getBytes());
	}

}
