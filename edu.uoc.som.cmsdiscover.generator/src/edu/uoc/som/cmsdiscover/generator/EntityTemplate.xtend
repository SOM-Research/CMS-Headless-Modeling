package edu.uoc.som.cmsdiscover.generator

import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.common.util.EMap
import org.eclipse.emf.ecore.EReference

class EntityTemplate {
	
	String cmsTechnology
	String modelClassName
	EClass modelClass
	EList<EAttribute> classAttributes
	EList<EReference> classReferences
	EMap<String, String> Annotations
	Iterable<String> modelClasses
	String packageName
	
	Iterable<String> fieldClassesName
	
	new(EClass modelClass, EMap<String, String> Annotations, Iterable<String> modelClasses, Iterable<String> fieldClassesName, String packageName) {
		this.modelClass = modelClass
		this.modelClassName = modelClass.getName()
		this.classAttributes = modelClass.getEAllAttributes()
		this.classReferences = modelClass.getEAllReferences()
		this.Annotations = Annotations
		this.modelClasses = modelClasses
		this.fieldClassesName = fieldClassesName
		this.packageName = packageName
		for (Annotation : this.Annotations) {
			if (Annotation.getKey().contains("cmsTechnology")) this.cmsTechnology = Annotation.getValue();
		}
	}
		
	def generateEntitiesClasses() '''

	package «packageName»;
	
	

	import java.util.List;
	import java.util.Arrays;
	import java.util.ArrayList;
	import org.joda.time.DateTime;
	import generated.middleware.Umami_Food_Magazine_API___JSON_API.customAttributes.*;
	import generated.middleware.Umami_Food_Magazine_API___JSON_API.drivers.GenericEntity;
	import «packageName».drivers.DriverInterface;
	«IF this.cmsTechnology.contains("Drupal")»
	import «packageName».drivers.DrupalDriver;
	«ELSEIF this.cmsTechnology.contains("Wordpress")»
	import «packageName».drivers.WordpressDriver;
	«ENDIF»
		
	public class «this.modelClassName» {
			
		// STATIC VALUES
		«FOR Annotation : this.Annotations»
		public static final String «Annotation.getKey()» = "«Annotation.getValue»";
		«ENDFOR»
		
		public DriverInterface driver;
	
		
		List<String> attributesList = Arrays.asList(«FOR String attribute : this.classAttributes.map[name] SEPARATOR ","»"«attribute»"«ENDFOR»);
		
		
		// Attributes
		« FOR EAttribute attribute : this.classAttributes»
		«addAttribute(attribute)»
		«ENDFOR»
		
		// Relationships
		« FOR EReference reference : this.classReferences»
		«addReference(reference)»
		«ENDFOR»
		
		«addConstructor()»
			
		// Main Methods
		«addCollectionGetter()»
		
		«addSingleGetter()»
		

		«mapAnswer()»

		«addReferenceMethods()»
		
		// Attributes
		« FOR EAttribute attribute : this.classAttributes»
		«addGettersAndSetters(attribute)»
		«ENDFOR»
			
	}

		'''
	
	def addGettersAndSetters(EAttribute attribute) '''
	public «attribute.getEAttributeType().getInstanceTypeName()» get_«attribute.getName()» () {
		return 	this.«attribute.getName()»;
	}
	
	public void set_«attribute.getName()» («attribute.getEAttributeType().getInstanceTypeName()» value) {
		this.«attribute.getName()» = value;
	}
	
	'''	
	def addConstructor() '''
	public «this.modelClassName»() {
		this.driver = new «this.cmsTechnology»Driver();
	}
	'''
	
	def addSingleGetter() '''
	public «this.modelClassName» getSingle(String Id) {
		GenericEntity singleAnswer = driver.getSingle(resourceRoute+"/",Id);
		«this.modelClassName» return«this.modelClassName» = null;
		return«this.modelClassName» = mapSingleAnswer(singleAnswer);
		return return«this.modelClassName»;
	}
	'''
	
	def addCollectionGetter() '''
	public List<«this.modelClassName»> getCollection() {
		List<GenericEntity> answer = driver.getCollection(resourceRoute);
		List<«this.modelClassName»> «this.modelClassName»Collection = mapAnswer(answer); 
		return «this.modelClassName»Collection;
	}
	'''
	
		
	def mapAnswer() '''
		
	protected List<«this.modelClassName»> mapAnswer(List<GenericEntity> answer) {
		
		List<«this.modelClassName»> «this.modelClassName»Collection = new ArrayList<«this.modelClassName»>();
		answer.forEach((singleAnswer) -> {
			«this.modelClassName»Collection.add(mapSingleAnswer(singleAnswer));
		});
		
		
		return «this.modelClassName»Collection;
		
	}
	
	protected «this.modelClassName» mapSingleAnswer(GenericEntity singleAnswer) {
		
		«this.modelClassName» returnInstance = new «this.modelClassName»();
		
		singleAnswer.attributesList.forEach((attribute) -> {
			« FOR EAttribute attribute: this.classAttributes »
				if(attribute.getName().equals("«attribute.getName()»")) {
					if (attribute.getValue()!= null) {
				«IF attribute.getEAttributeType().getInstanceTypeName().contains("Integer")  »	
				 returnInstance.«attribute.getName()» = Integer.parseInt(attribute.getValue());
				«ELSEIF attribute.getEAttributeType().getInstanceTypeName().contains("String") »
				 returnInstance.«attribute.getName()» = attribute.getValue().toString();
				«ELSEIF attribute.getEAttributeType().getInstanceTypeName().contains("boolean") »
				 returnInstance.«attribute.getName()» = Boolean.parseBoolean(attribute.getValue());
				«ELSEIF attribute.getEAttributeType().getInstanceTypeName().contains("Date") »
				 returnInstance.«attribute.getName()» = new DateTime(attribute.getValue().replace("\"", "")).toDate();
				 «ENDIF»
				 }
				}
			«ENDFOR»
			« FOR EReference reference: this.classReferences » 
				«IF(this.fieldClassesName.contains(reference.getEReferenceType().getName())) »
					// To do full custom classes
				«ENDIF»
			«ENDFOR»
		});

		singleAnswer.referenceList.forEach((reference) -> {
		« FOR EReference reference: this.classReferences » 
			«IF(this.modelClasses.contains(reference.getEReferenceType().getName())) »
			if(reference.getName().equals("«reference.getName().toString()»")) {
			  returnInstance.«reference.getName().toString».add(reference.getValue());
			}
			«ENDIF»
		«ENDFOR»
		});
		return returnInstance;
	}
	'''
			
	def addAttribute(EAttribute attribute) '''
	private «attribute.getEAttributeType().getInstanceTypeName()» «attribute.getName()»;
	«««»»// public String «attribute.getName()»;
	'''
		
	def addReference(EReference reference) '''
	«IF(this.modelClasses.contains(reference.getEReferenceType().getName())) »
	public List<String> «reference.getName().toString()»  = new ArrayList<String>();
	«ENDIF»

	«IF(this.fieldClassesName.contains(reference.getEReferenceType().getName())) »
	public «reference.getEReferenceType().getName()» «reference.getName().toString()»  = new «reference.getEReferenceType().getName()»();
	«ENDIF»

	'''
		
	def addReferenceMethods()'''
	« FOR EReference reference: this.classReferences » 
	«IF(this.modelClasses.contains(reference.getEReferenceType().getName())) »
	public List<«reference.getEReferenceType().getName()»> get_«reference.getName()» () {

		List<«reference.getEReferenceType().getName()»> referenceList = new ArrayList<«reference.getEReferenceType().getName()»>();
		this.«reference.getName()».forEach((element) -> {
			«reference.getEReferenceType().getName()» referencedEntity = new «reference.getEReferenceType().getName()»();
			referenceList.add(referencedEntity.getSingle(element));
		});
		return referenceList;

	}
	«ENDIF»
	«ENDFOR»
	'''
				
}
