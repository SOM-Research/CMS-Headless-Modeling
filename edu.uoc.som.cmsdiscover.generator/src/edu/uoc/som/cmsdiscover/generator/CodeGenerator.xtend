package edu.uoc.som.cmsdiscover.generator

import java.io.ByteArrayInputStream
import org.eclipse.core.resources.IFolder
import org.eclipse.core.resources.IResource
import org.eclipse.core.runtime.IPath
import org.eclipse.core.runtime.NullProgressMonitor
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl
import org.eclipse.core.resources.IProject
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.resources.ResourcesPlugin

class CodeGenerator {

	PomTeamplate pomTeamplate = new PomTeamplate
	TestsTeamplate testsTeamplate = new TestsTeamplate
	EPackage thePackage
	Resource model
	EPackage modelPackage

	def doGenerate(EPackage input, IFolder srcGenFolder, IProject project) {

		if (input !== null && input instanceof EPackage) {
			thePackage = input as EPackage;
			// Get classes
			val eClasses = thePackage.EClassifiers.filter(EClass)
			val classesName = eClasses.map[name]
			// Get Annotation information	
			val sourceCmsInformation = thePackage.EAnnotations.get(0).details

			println("Generating")
			// For every class we call the generator template
			for (EClass modelClass : eClasses) {
				val superClasses = modelClass.getESuperTypes()
				val classAnnotation = modelClass.EAnnotations.get(0).details
				for (detail : sourceCmsInformation) {
					classAnnotation.put(detail.key, detail.value)
				}
				// Call the generator
				val template = new EntityTemplate(modelClass, classAnnotation, classesName, "generated.middleware."+ thePackage.getName());
				val content = template.generateEntitiesClasses()
				// Create File
				val resultFile = srcGenFolder.getFile(modelClass.getName + ".java")
				resultFile.create(new ByteArrayInputStream(content.toString().getBytes()), IResource.FORCE,
					new NullProgressMonitor())
			}
			
			
			// Generate Test
		   	val testFolder = project.getFolder("test")
		   	if (!testFolder.exists()) testFolder.create(true, true, new NullProgressMonitor());
		   	
		   	val testFile = srcGenFolder.getFile("mainTest.java")
		   	val testcontent = testsTeamplate.getTest();
	   		testFile.create(new ByteArrayInputStream(testcontent.toString().getBytes()), IResource.FORCE,
	   		new NullProgressMonitor())
			// Generate POM

			val rootFolder = project.getFolder("test");
			val pomFile = rootFolder.getFile("pom.xml")
			val pomContent = pomTeamplate.getPom();
			pomFile.create(new ByteArrayInputStream(pomContent.toString().getBytes()), IResource.FORCE,
		   		new NullProgressMonitor())
		   		
	
		}
	}
	

	def EPackage loadModel(IPath path) {

		val uri = URI.createPlatformResourceURI(path.toString, true)

		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
		val resourceSet = new ResourceSetImpl

		model = resourceSet.getResource(uri, true);
		modelPackage = model.getContents().get(0) as EPackage;
		return modelPackage;

	}

}
