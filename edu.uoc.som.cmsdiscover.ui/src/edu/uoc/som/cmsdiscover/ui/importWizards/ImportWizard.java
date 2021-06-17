package edu.uoc.som.cmsdiscover.ui.importWizards;

import edu.uoc.com.cmsdiscover.CmsDiscover;

import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.IImportWizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

public class ImportWizard extends Wizard implements INewWizard {
	
	ImportWizardPage mainPage;

	public ImportWizard() {
		super();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.wizard.Wizard#performFinish()
	 */
	public boolean performFinish() {
		URL url = null;
		try {
			url = new URL(mainPage.getUrl());
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("HOLAAAAAAAAAAAA:   "+mainPage.getTech());
		CmsDiscover.getDefault().buildExtendModel(url, mainPage.getUser(), mainPage.getPass(), mainPage.getTech());
		return true;
	}
	 
	/* (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchWizard#init(org.eclipse.ui.IWorkbench, org.eclipse.jface.viewers.IStructuredSelection)
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		setWindowTitle("Import CMS model"); //NON-NLS-1
		setNeedsProgressMonitor(true);
		mainPage = new ImportWizardPage("Import CMS model", selection); //NON-NLS-1
	}
	
	/* (non-Javadoc)
     * @see org.eclipse.jface.wizard.IWizard#addPages()
     */
    public void addPages() {
        super.addPages(); 
        addPage(mainPage);        
    }

}
