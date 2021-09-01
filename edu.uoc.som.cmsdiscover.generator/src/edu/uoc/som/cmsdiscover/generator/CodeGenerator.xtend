package edu.uoc.som.cmsdiscover.generator

import org.eclipse.core.runtime.IPath
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl
import org.eclipse.xtext.builder.EclipseResourceFileSystemAccess2
import org.eclipse.core.resources.IFile
import org.eclipse.core.runtime.CoreException
import java.io.ByteArrayInputStream
import org.eclipse.core.runtime.NullProgressMonitor
import org.eclipse.core.resources.IResource
import org.eclipse.core.resources.IFolder

class CodeGenerator {

	Template template = new Template

	EPackage thePackage

	Resource model

	EPackage modelPackage

	def doGenerate(EPackage input, IFolder srcGenFolder) {

		if (input !== null && input instanceof EPackage) {
			thePackage = input as EPackage;
			val eClasses = thePackage.EClassifiers.filter(EClass)
				println("vamos");
			// For every class we call the generator template
			for (EClass modelClass : eClasses) {
				val superClasses = modelClass.getEAllSuperTypes()
				val content = template.generateMiddleWare(modelClass)
				val name = modelClass.getName()
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
