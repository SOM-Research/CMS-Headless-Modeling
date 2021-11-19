package edu.uoc.som.cmsdiscover.ui.importWizards;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse.BodyHandlers;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

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
		String JWTToken = null;
		URL passUrl = null;
		MessageBox messageBox = new MessageBox(getContainer().getShell(), SWT.ICON_ERROR);
		try {
			url = mainPage.getUrl();

			if (url.endsWith("/")) {
				url = url.substring(0, url.length() - 1);
			}
			passUrl = new URL(url);
			
			if (mainPage.getTech() == "d") {
				url = url + "/openapi/jsonapi";
			
				URI uri = URI.create(url);
				var client = HttpClient.newHttpClient();
				var request = HttpRequest.newBuilder().uri(uri).method("GET", HttpRequest.BodyPublishers.noBody()).header("accept", "application/json")
						.header("Authorization", basicAuth(mainPage.getUser(), mainPage.getPass()))
						.build();
				request.method();
				var response = client.send(request, BodyHandlers.ofString());
				if (response.statusCode() == 200) {
					
				} else if (response.statusCode() == 403 ) {
					messageBox.setMessage("Unauthorized to acces to the API specification. Please, set `Acces API Docs` permission to anonymous users for Drupal");
					messageBox.open();
					return false;
					
				}
				else if (response.statusCode() == 404) { 
					messageBox.setMessage("API not found, ensure that required API plugins are enabled: `json_api_openapi` for Drupal");
					messageBox.open();
					return false;
				} else {
					messageBox.setMessage("API OpenAPI not reachable, please check your URL and your permissions ");
					messageBox.open();
					return false;
				}
			} else {
				url = url + "/wp-json/";
				
				if (mainPage.getUser() != "" && mainPage.getPass() != "") {
					URI uri = URI.create(url+"wp/v2/types?context=edit");
					var client = HttpClient.newHttpClient();
					var request = HttpRequest.newBuilder().uri(uri).method("GET", HttpRequest.BodyPublishers.noBody()).header("accept", "application/json")
							.header("Authorization", basicAuth(mainPage.getUser(), mainPage.getPass()))
							.build();
					request.method();
					var response = client.send(request, BodyHandlers.ofString());
					if (response.statusCode() == 200) {
						// all ok
					} else {
						// check if JWToken
						Map<String, String> parameters = new HashMap<>();
						parameters.put("username", mainPage.getUser());
						parameters.put("password", mainPage.getPass());
						
						String urlJwt = url + "jwt-auth/v1/token";
						URI uriJwt = URI.create(urlJwt);
						String form = parameters.keySet().stream()
						        .map(key -> key + "=" + URLEncoder.encode(parameters.get(key), StandardCharsets.UTF_8))
						        .collect(Collectors.joining("&"));
						
						var requestJWT = HttpRequest.newBuilder().uri(uriJwt)
								.POST(BodyPublishers.ofString(form))
								.headers("Content-Type", "application/x-www-form-urlencoded")
								.header("accept", "application/json")
								.build();
						requestJWT.method();
						String body = requestJWT.bodyPublisher().get().toString();
						var responseJWT = client.send(requestJWT, BodyHandlers.ofString());
						if (responseJWT.statusCode() == 200) {
							JsonElement res = new JsonParser().parse(responseJWT.body());
							JWTToken = res.getAsJsonObject().get("token").getAsString();
						} else {
							messageBox.setMessage("There is an issue with your credentails or you should enable API authentication, using basic auth, or JWT Authentication for WP-API pluguin");
							messageBox.open();
							return false;
						}
					 }
						
				} else {
					messageBox.setMessage("For WordPress case, user and password are required ");
					messageBox.open();
					return false;
				}				
				// if not get the token
				
				// if not return Activate the token 
			}
		
		} catch (MalformedURLException e) {
			
		} 
		catch (IOException e) {
			messageBox.setMessage("There was problems with your credentials");
			messageBox.open();
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			messageBox.setMessage("There was problems with your credentials");
			messageBox.open();
			// TODO Auto-generated catch block
			//e.printStackTrace();
			return false;
		}
		
	
		String Workspace = ResourcesPlugin.getWorkspace().getRoot().getLocation().toString();
		String ModelResultPath = Workspace + mainPage.getContainerFullPath() + "/" + mainPage.getFileName();
		CmsDiscover.getDefault().buildExtendModel(passUrl, mainPage.getUser(), mainPage.getPass(), JWTToken, mainPage.getTech(),
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
