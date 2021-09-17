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
import java.util.List
import java.util.ArrayList

class CodeGenerator {

	PomTemplate pomTemplate = new PomTemplate
	TestsTemplate testsTemplate = new TestsTemplate
	DriverTemplate driverTemplate = new DriverTemplate
	DriverInterface interfaceTemplate = new DriverInterface
	GenericEntityTemplate genericTemplate = new GenericEntityTemplate
	FieldTemplate fieldTemplate = new FieldTemplate
	EPackage thePackage
	Resource model
	EPackage modelPackage

	def doGenerate(EPackage input, IFolder srcGenFolder, IProject project) {

		if (input !== null && input instanceof EPackage) {
			thePackage = input as EPackage;


			val eClasses = thePackage.EClassifiers.filter(EClass);
	
			val classesName = eClasses.map[name]

			// Add field classes
			val eFieldClasses = thePackage.getESubpackages().get(0).EClassifiers.filter(EClass)
	
			val fieldClassesName = eFieldClasses.map[name]
			val sourceCmsInformation = thePackage.EAnnotations.get(0).details

			// Generate Drivers
			generateDrivers(input, srcGenFolder)

			println("Generating")

			// Generate Entities
			for (EClass modelClass : eClasses) {
				val superClasses = modelClass.getESuperTypes()
				val classAnnotation = modelClass.EAnnotations.get(0).details
				for (detail : sourceCmsInformation) {
					classAnnotation.put(detail.key, detail.value)
				}
				// Call the generator
				val template = new EntityTemplate(modelClass, classAnnotation, classesName, fieldClassesName,
					"generated.middleware." + thePackage.getName());
				val content = template.generateEntitiesClasses()
				// Create File
				val resultFile = srcGenFolder.getFile(modelClass.getName + ".java")
				resultFile.create(new ByteArrayInputStream(content.toString().getBytes()), IResource.FORCE,
					new NullProgressMonitor())
			}
			
			// Generate Fields
			val srcGenField = srcGenFolder.getFolder("customAttributes");
			if(!srcGenField.exists()) srcGenField.create(true,true, new NullProgressMonitor());
			for (EClass fieldClass : eFieldClasses) {
				val fieldTemplate = fieldTemplate.generate(fieldClass, "generated.middleware." + thePackage.getName() + ".customAttributes");
				val fieldFile = srcGenField.getFile(fieldClass.getName + ".java")
				fieldFile.create(new ByteArrayInputStream(fieldTemplate.toString().getBytes()), IResource.FORCE,
					new NullProgressMonitor())
			}

			// Generate Test
			val testFolder = project.getFolder("test")
			if(!testFolder.exists()) testFolder.create(true, true, new NullProgressMonitor());

			val testFile = srcGenFolder.getFile("mainTest.java")
			val testcontent = testsTemplate.getTest();
			testFile.create(new ByteArrayInputStream(testcontent.toString().getBytes()), IResource.FORCE,
				new NullProgressMonitor())

			// Generate POM
			val pomFile = project.getFile("pom.xml")
			val pomContent = pomTemplate.getPom();
			pomFile.create(new ByteArrayInputStream(pomContent.toString().getBytes()), IResource.FORCE,
				new NullProgressMonitor())

		}
	}

	def generateDrivers(EPackage input, IFolder srcGenFolder) {
		// Generate drivers folder
		val driversFolder = srcGenFolder.getFolder("drivers");
		if(!driversFolder.exists()) driversFolder.create(true, true, new NullProgressMonitor());

		// Generate Interface
		val interface = interfaceTemplate.generate(thePackage.getName());
		val interfaceFile = driversFolder.getFile("DriverInterface.java");
		interfaceFile.create(new ByteArrayInputStream(interface.toString().getBytes()), IResource.FORCE,
			new NullProgressMonitor())

		// Generate drivers
		val driver = driverTemplate.generateDriver(thePackage);
		val resultDriver = driversFolder.getFile("DrupalDriver.java")
		resultDriver.create(new ByteArrayInputStream(driver.toString().getBytes()), IResource.FORCE,
			new NullProgressMonitor())
			
		// Generate Generic Entities
		val genericAttribute = genericTemplate.generateGenericAttribute(input)
		val resultAttribute = driversFolder.getFile("GenericAttribute.java")
		resultAttribute.create(new ByteArrayInputStream(genericAttribute.toString().getBytes()), IResource.FORCE,
			new NullProgressMonitor())
			
		val genericReference = genericTemplate.generateGenericReference(input)
		val resultReference = driversFolder.getFile("GenericReference.java")
		resultReference.create(new ByteArrayInputStream(genericReference.toString().getBytes()), IResource.FORCE,
			new NullProgressMonitor())
			
		val genericEntity = genericTemplate.generateGenericEntity(input)
		val resultEntity = driversFolder.getFile("GenericEntity.java")
		resultEntity.create(new ByteArrayInputStream(genericEntity.toString().getBytes()), IResource.FORCE,
			new NullProgressMonitor())
			
			
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
