package edu.uoc.som.cmsdiscover.test;

import static org.junit.jupiter.api.Assertions.*;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.xtext.builder.EclipseResourceFileSystemAccess2;
import org.junit.jupiter.api.Test;
import edu.uoc.som.cmsdiscover.generator.*;
import org.eclipse.core.runtime.Path;

class GeneratorBasicTest {

	@Test
	void test() {
		final EclipseResourceFileSystemAccess2 fsa = new EclipseResourceFileSystemAccess2();
		fsa.setOutputPath("./src-gen");
		CodeGenerator generator = new CodeGenerator();
		
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
		ResourceSet resourceSet = new ResourceSetImpl();
		URI file = URI.createFileURI("./MarcelCMS.ecore");
		Resource model = resourceSet.getResource(file, true);
		EPackage input = (EPackage) model.getContents().get(0);
		
		// HERE
		IFolder srcGenFolder = ResourcesPlugin.getWorkspace().getRoot().getFolder(new Path(System.getProperty("user.dir")+"/src-gen"));		
		if (!srcGenFolder.exists()) {
			try {
				srcGenFolder.create(true, true, new NullProgressMonitor());
			} catch (CoreException e) {
				
			}
		}
		generator.doGenerate(input, srcGenFolder);
		fail("Not yet implemented");
	}

}
