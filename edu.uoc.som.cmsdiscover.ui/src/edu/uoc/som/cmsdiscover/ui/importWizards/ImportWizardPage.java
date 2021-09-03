package edu.uoc.som.cmsdiscover.ui.importWizards;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse.BodyHandlers;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.preference.FileFieldEditor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

public class ImportWizardPage extends WizardNewFileCreationPage {

	protected FileFieldEditor editor;
	private Composite container;
	private Text url;
	private Text user;
	private Text pass;
	private Group techGroup;
	private Button buttonDrupal;
	private Button buttonWp;
	private Boolean urlValidation;

	public ImportWizardPage(String pageName, IStructuredSelection selection) {
		super(pageName, selection);
		setTitle(pageName); // NON-NLS-1
		setDescription("Import CMS model"); // NON-NLS-1
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.dialogs.WizardNewFileCreationPage#createAdvancedControls(org.
	 * eclipse.swt.widgets.Composite)
	 */
	protected void createAdvancedControls(Composite parent) {
		container = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 2;

		// Create radios
		Label labelRadio = new Label(container, SWT.NONE);
		labelRadio.setText("Which technology are powering your CMS: ");
		Group techGroup = new Group(container, SWT.NONE);
		techGroup.setLayout(new RowLayout(SWT.HORIZONTAL));
		buttonWp = new Button(techGroup, SWT.RADIO);
		buttonWp.setText("Wordpress");
		InputStream input = ImportWizardPage.class.getResourceAsStream("/icons/wordpress.png");
		Image image = new Image(null, input);
		final Image scaledWp = new Image(null, image.getImageData().scaledTo((int) (30), (int) (30)));
		buttonWp.setImage(scaledWp);

		buttonDrupal = new Button(techGroup, SWT.RADIO);
		buttonDrupal.setText("Drupal");
		InputStream inputDru = ImportWizardPage.class.getResourceAsStream("/icons/drupal.png");
		Image imageDru = new Image(null, inputDru);
		final Image scaledDru = new Image(null, imageDru.getImageData().scaledTo((int) (30), (int) (30)));
		buttonDrupal.setImage(scaledDru);

		// The URL
		Label label1 = new Label(container, SWT.NONE);
		label1.setText("Set the URL: (https://myurl.domain) ");
		url = new Text(container, SWT.BORDER | SWT.SINGLE);
		url.setText("");
		urlValidation = false;

		// User & Password
		Label label2 = new Label(container, SWT.NONE);
		label2.setText("User: ");
		user = new Text(container, SWT.BORDER | SWT.SINGLE);
		user.setText("");

		Label label3 = new Label(container, SWT.NONE);
		label3.setText("Passwrod: ");
		pass = new Text(container, SWT.BORDER | SWT.PASSWORD);
		pass.setText("");

		// String Workspace =
		// ResourcesPlugin.getWorkspace().getRoot().getLocation().toString();
		// File[] directories = new File(Workspace).listFiles(File::isDirectory);

		// URL Listener
		url.addFocusListener(new FocusListener() {
			public void focusGained(FocusEvent event) {

			}

			public void focusLost(FocusEvent event) {
				Label labelUrl = new Label(container, SWT.NONE);
				labelUrl.setText("validating");
				String rawUrl = url.getText();
				new Thread() {
					public void run() {
						System.out.print("In my thread");
						Display.getDefault().asyncExec(new Runnable() {
							public void run() {
								boolean answer = checkUrl(rawUrl);
								if (answer == true) {
									url.setBackground(Display.getCurrent().getSystemColor(SWT.COLOR_GREEN));
									urlValidation = true;
								} else {
									url.setBackground(Display.getCurrent().getSystemColor(SWT.COLOR_RED));
									urlValidation = false;
									MessageBox messageBox = new MessageBox(container.getShell(), SWT.ICON_ERROR);
									messageBox.setMessage("Please check your URL");
									int result = messageBox.open();
								}

							}
						});
					}

				}.start();
			}
		});

		// Event listeners
		url.addKeyListener(new KeyListener() {

			@Override
			public void keyPressed(KeyEvent e) {
			}

			@Override
			public void keyReleased(KeyEvent e) {
				if (urlValidation && (buttonDrupal.getSelection() || buttonWp.getSelection())) {
					// setPageComplete(true);
				}
			}

		});

		buttonWp.addKeyListener(new KeyListener() {

			@Override
			public void keyPressed(KeyEvent e) {
			}

			@Override
			public void keyReleased(KeyEvent e) {
				if (!url.getText().isEmpty() && (buttonDrupal.getSelection() || buttonWp.getSelection())) {
					setPageComplete(true);

				}
			}

		});

		buttonDrupal.addKeyListener(new KeyListener() {

			@Override
			public void keyPressed(KeyEvent e) {
			}

			@Override
			public void keyReleased(KeyEvent e) {
				if (!url.getText().isEmpty() && (buttonDrupal.getSelection() || buttonWp.getSelection())) {
					setPageComplete(true);

				}
			}

		});
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		url.setLayoutData(gd);
		// required to avoid an error in the system
		setControl(container);
		setPageComplete(false);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.dialogs.WizardNewFileCreationPage#createLinkTarget()
	 */
	protected void createLinkTarget() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.dialogs.WizardNewFileCreationPage#getInitialContents()
	 */
	protected InputStream getInitialContents() {
		try {
			return new FileInputStream(new File(editor.getStringValue()));
		} catch (FileNotFoundException e) {
			return null;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.dialogs.WizardNewFileCreationPage#getNewFileLabel()
	 */
	protected String getNewFileLabel() {
		return "Name of the extended model file: "; // NON-NLS-1
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.dialogs.WizardNewFileCreationPage#validateLinkedResource()
	 */
	protected IStatus validateLinkedResource() {
		return new Status(IStatus.OK, "edu.uoc.som.cmsdiscover.ui", IStatus.OK, "", null); // NON-NLS-1 //NON-NLS-2
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
		if (buttonDrupal.getSelection())
			return "d";
		else
			return "w";
	}

	public boolean checkUrl(String url) {
		var client = HttpClient.newHttpClient();

		// use the client to send the request
		try {
			URL passUrl = new URL(url);
			URI uri = URI.create(url);
			// create a request
			var request = HttpRequest.newBuilder().uri(uri).method("GET", HttpRequest.BodyPublishers.noBody()).build();
			request.method();
			var response = client.send(request, BodyHandlers.ofString());
			if (response.statusCode() == 200 || response.statusCode() == 301) {
				return true;
			} else {
				System.out.println("Has returned status: " + response.statusCode());
				return false;
			}

		} catch (MalformedURLException e) {
			return false;

		} catch (IOException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			return false;
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			return false;
		}
	}

	public String getFileName() {
		return super.getFileName();
	}
}
