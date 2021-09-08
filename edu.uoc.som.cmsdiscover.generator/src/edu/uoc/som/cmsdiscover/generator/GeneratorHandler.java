package edu.uoc.som.cmsdiscover.generator;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.jdt.core.IAccessRule;
import org.eclipse.jdt.core.IClasspathAttribute;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.launching.IVMInstall;
import org.eclipse.jdt.launching.JavaRuntime;
import org.eclipse.jdt.launching.LibraryLocation;

public class GeneratorHandler extends AbstractHandler implements IHandler {
	
	private EPackage extendedModel;
	private IFolder srcGenFolder;

	private CodeGenerator generator = new CodeGenerator();

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		ISelection selection = HandlerUtil.getCurrentSelection(event);
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			Object firstElement = structuredSelection.getFirstElement();
			if (firstElement instanceof IFile) {
				IFile file = (IFile) firstElement;
				// Get Selected Resource.
				this.extendedModel = generator.loadModel(file.getFullPath());

				IProject project = generateProject(file.getWorkspace(), extendedModel.getName());

				generator.doGenerate(extendedModel, srcGenFolder, project);
			
			
			}
		}
		return null;
	}

	private IProject generateProject(IWorkspace workspace, String name) {
		// TODO Auto-generated method stub
		NullProgressMonitor monitor = new NullProgressMonitor();
		IProject project = workspace.getRoot().getProject("cmsdiscover.middleware." + name);
		if (!project.exists()) {
			try {
				project.create(monitor);
				project.open(monitor);
				IProjectDescription description = project.getDescription();
				description.setNatureIds(new String[] { JavaCore.NATURE_ID , "org.eclipse.m2e.core.maven2Nature" });
				project.setDescription(description, monitor);
				// src
				IFolder src = project.getFolder("src");
				if (!src.exists())
					src.create(true, true, monitor);

				// src/main
				IFolder srcMain = src.getFolder("main");
				if (!srcMain.exists())
					srcMain.create(true, true, monitor);

				// src/main/java
				IFolder srcMainJava = srcMain.getFolder("java");
				if (!srcMainJava.exists())
					srcMainJava.create(true, true, monitor);
				
				IJavaProject javaProject = JavaCore.create(project);
				javaProject.setOutputLocation(src.getFullPath(), monitor);

				List<IClasspathEntry> entries = new ArrayList<IClasspathEntry>();
				IVMInstall vmInstall = JavaRuntime.getDefaultVMInstall();
				LibraryLocation[] locations = JavaRuntime.getLibraryLocations(vmInstall);
				for (LibraryLocation element : locations) {
					entries.add(JavaCore.newLibraryEntry(element.getSystemLibraryPath(), null, null));
				}
				// add libs to project class path
				javaProject.setRawClasspath(entries.toArray(new IClasspathEntry[entries.size()]), null);

				// Let's add the maven container to our classpath to let the maven plug-in add
				// the dependencies computed from a pom.xml file to our classpath
				IClasspathEntry mavenEntry = JavaCore.newContainerEntry(
						new Path("org.eclipse.m2e.MAVEN2_CLASSPATH_CONTAINER"), new IAccessRule[0],
						new IClasspathAttribute[] { JavaCore
								.newClasspathAttribute("org.eclipse.jst.component.dependency", "/WEB-INF/lib") },
						false);
				entries.add(mavenEntry);

				javaProject.setRawClasspath(entries.toArray(new IClasspathEntry[entries.size()]), null);
				
				// Let's create our target/classes output folder
				IFolder target = project.getFolder("target");
				if (!target.exists()) target.create(true, true, monitor);

				IFolder classes = target.getFolder("classes");
				if (!classes.exists()) classes.create(true, true, monitor);

				// Let's add target/classes as our output folder for compiled ".class"
				javaProject.setOutputLocation(classes.getFullPath(), monitor);

				// Now let's add our source folder and output folder to our classpath
				IClasspathEntry[] oldEntries = javaProject.getRawClasspath();
				// +1 for our src/main/java entry
				IClasspathEntry[] newEntries = new IClasspathEntry[oldEntries.length + 1];
				System.arraycopy(oldEntries, 0, newEntries, 0, oldEntries.length);

				IPackageFragmentRoot packageRoot = javaProject.getPackageFragmentRoot(srcMainJava);
				newEntries[oldEntries.length] = JavaCore.newSourceEntry(packageRoot.getPath(), new Path[] {},
						new Path[] {}, classes.getFullPath());

				javaProject.setRawClasspath(newEntries, null);
				

				
				try {
				IFolder generated = srcMainJava.getFolder("generated");
				if (!generated.exists())
					generated.create(true, true, new NullProgressMonitor());

				IFolder connector = generated.getFolder("middleware");
				if (!connector.exists())
					connector.create(true, true, new NullProgressMonitor());

				this.srcGenFolder = connector.getFolder(extendedModel.getName());
				if (!srcGenFolder.exists())
					this.srcGenFolder.create(true, true, new NullProgressMonitor());
				
				
				} catch (CoreException e) { 
					e.getCause(); return
					null; 
				} 
	

				return project;

			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}

		}
		return null;

	}

}
