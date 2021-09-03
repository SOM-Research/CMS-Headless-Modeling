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

class CodeGenerator {

	Template template = new Template

	EPackage thePackage

	Resource model

	EPackage modelPackage
	
	//String cmsUrl
	
	//String consumerUser
	
	//String consumerPass
	
	//String cmsTechnology
	
	//EMap<String, String> sourceCmsInformation

	def doGenerate(EPackage input, IFolder srcGenFolder) {

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
				for (detail:sourceCmsInformation) {
					classAnnotation.put(detail.key, detail.value)
				}
				// Call the generator
				val content = template.generateEntitiesClasses(modelClass, classAnnotation, superClasses)
				// Create File
				val resultFile = srcGenFolder.getFile(modelClass.getName+".java")
				resultFile.create(new ByteArrayInputStream(content.toString().getBytes()), IResource.FORCE, new NullProgressMonitor())
			}
			
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