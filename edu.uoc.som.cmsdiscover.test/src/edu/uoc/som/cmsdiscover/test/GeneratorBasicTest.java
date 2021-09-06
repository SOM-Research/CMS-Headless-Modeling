package edu.uoc.som.cmsdiscover.test;

import static org.junit.jupiter.api.Assertions.fail;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.junit.jupiter.api.Test;

import edu.uoc.som.cmsdiscover.generator.CodeGenerator;

class GeneratorBasicTest {

	@Test
	void test() {

		CodeGenerator generator = new CodeGenerator();
		
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
		ResourceSet resourceSet = new ResourceSetImpl();
		URI file = URI.createFileURI("./MarcelCMS.ecore");
		Resource model = resourceSet.getResource(file, true);
		EPackage input = (EPackage) model.getContents().get(0);
		
		
		// HERE
		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject();
		IWorkspaceRoot srcFolder = ResourcesPlugin.getWorkspace().getRoot();
	
		IFolder srcGenFolder = srcFolder.getFolder(srcFolder.getLocation().append("generator"));
		if (!srcGenFolder.exists()) {
			try {
				srcGenFolder.create(true, true, new NullProgressMonitor());
			} catch (CoreException e) {
				
			}
		}
		//generator.doGenerate(input, srcGenFolder);
		fail("Not yet implemented");
	}

}
