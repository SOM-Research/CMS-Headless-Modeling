package edu.uoc.som.cmsdiscover.ui.importWizards;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.preference.FileFieldEditor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;


public class ImportWizardPage extends WizardNewFileCreationPage {
	
	protected FileFieldEditor editor;
	private Composite container;
	private Text url;
	private Text user;
	private Text pass;
	private Text tech;
	
	

	public ImportWizardPage(String pageName, IStructuredSelection selection) {
		super(pageName, selection);
		setTitle(pageName); //NON-NLS-1
		setDescription("Import CMS model"); //NON-NLS-1
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.dialogs.WizardNewFileCreationPage#createAdvancedControls(org.eclipse.swt.widgets.Composite)
	 */	
	protected void createAdvancedControls(Composite parent) {
        container = new Composite(parent, SWT.NONE);
        GridLayout layout = new GridLayout();
        container.setLayout(layout);
        layout.numColumns = 2;
        
        Label label1 = new Label(container, SWT.NONE);
        label1.setText("Set the URL: .");
        url = new Text(container, SWT.BORDER | SWT.SINGLE);
        url.setText("");
        
        Label label2 = new Label(container, SWT.NONE);
        label2.setText("User: ");
        user = new Text(container, SWT.BORDER | SWT.SINGLE);
        user.setText("");
        
        Label label3 = new Label(container, SWT.NONE);
        label3.setText("Passwrod: ");
        pass = new Text(container, SWT.BORDER | SWT.SINGLE);
        pass.setText("");
        
        Label label4 = new Label(container, SWT.NONE);
        label4.setText("Technology: ");
        tech = new Text(container, SWT.BORDER | SWT.SINGLE);
        tech.setText("");
        tech.addKeyListener(new KeyListener() {

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                if (!tech.getText().isEmpty()) {
                    setPageComplete(true);

                }
            }

        });
        GridData gd = new GridData(GridData.FILL_HORIZONTAL);
        tech.setLayoutData(gd);
        // required to avoid an error in the system
        setControl(container);
        setPageComplete(false);

	}
	
	 /* (non-Javadoc)
	 * @see org.eclipse.ui.dialogs.WizardNewFileCreationPage#createLinkTarget()
	 */
	protected void createLinkTarget() {
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.dialogs.WizardNewFileCreationPage#getInitialContents()
	 */
	protected InputStream getInitialContents() {
		try {
			return new FileInputStream(new File(editor.getStringValue()));
		} catch (FileNotFoundException e) {
			return null;
		}
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.dialogs.WizardNewFileCreationPage#getNewFileLabel()
	 */
	protected String getNewFileLabel() {
		return "New File Name:"; //NON-NLS-1
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.dialogs.WizardNewFileCreationPage#validateLinkedResource()
	 */
	protected IStatus validateLinkedResource() {
		return new Status(IStatus.OK, "edu.uoc.som.cmsdiscover.ui", IStatus.OK, "", null); //NON-NLS-1 //NON-NLS-2
	}
	
    public String getUrl() {
        return url.getText();
    }
    public String getUser() {
        return user.getText();
    }
    public String getPass() {
        return pass.getText();
    }
    public String getTech() {
        return tech.getText();
    }
}
