package edu.uoc.som.cmsdiscover.generator

import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.common.util.EMap
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.EPackage
import com.google.common.base.CaseFormat;

class EntityTemplate {

	String modelClassName
	EClass modelClass
	EList<EAttribute> classAttributes
	EList<EReference> classReferences
	EMap<String, String> Annotations
	Iterable<String> modelClasses
	String packageName

	Iterable<String> fieldClassesName

	EPackage eFieldPackage

	new(EClass modelClass, EMap<String, String> Annotations, Iterable<String> modelClasses, EPackage eFieldPackage,
		String packageName) {
		this.modelClass = modelClass
		this.modelClassName = modelClass.getName()
		this.classAttributes = modelClass.getEAllAttributes()
		this.classReferences = modelClass.getEAllReferences()
		this.Annotations = Annotations
		this.modelClasses = modelClasses
		this.fieldClassesName = eFieldPackage.EClassifiers.filter(EClass).map[name];
		this.eFieldPackage = eFieldPackage;
		this.packageName = packageName

	}

	def generateEntitiesClasses() '''
		
		package «packageName»;
		
		
		
		import java.util.List;
		import java.util.Arrays;
		import java.util.Date;
		import java.util.ArrayList;
		import com.google.gson.JsonElement;
		import com.google.gson.JsonParser;
		import org.joda.time.DateTime;
		import «packageName».customAttributes.*;
		import «packageName».drivers.GenericResource;
		import «packageName».drivers.DriverInterface;
		import «packageName».drivers.SearchQueryInterface.SearchQuery;
		
			
		public class «this.modelClassName» {
				
			// STATIC VALUES
			«FOR Annotation : this.Annotations»
				public static final String «Annotation.getKey()» = "«Annotation.getValue»";
			«ENDFOR»
			
			private DriverInterface driver;
			private JsonParser parser;
		
			
			private List<String> attributesList = Arrays.asList(«FOR String attribute : this.classAttributes.map[name] SEPARATOR ","»"«attribute»"«ENDFOR»);
			
			// Filters
			«FOR EAttribute attribute : this.classAttributes»
				public static String FILTER_«attribute.getName().allCaps()» = "«attribute.getName()»";
			«ENDFOR»
			
			
			// Attributes
			«FOR EAttribute attribute : this.classAttributes»
				«addAttribute(attribute)»
			«ENDFOR»
			
			// Relationships
			«FOR EReference reference : this.classReferences»
				«addReference(reference)»
			«ENDFOR»
			
			«addConstructor()»
				
			// Main Methods
			«addDriverWrapperMethods()»
			«mapAnswer()»
			
			// Add References Methods
			«addReferenceMethods()»
			
			// Getters and Setters
			«FOR EAttribute attribute : this.classAttributes»
				«addGettersAndSetters(attribute)»
			«ENDFOR»
			
		}
		
		'''

	def addDriverWrapperMethods() '''
		public «this.modelClassName» getSingle(String Id) {
			GenericResource singleAnswer = driver.getSingle(resourceRoute,Id);
			«this.modelClassName» return«this.modelClassName» = null;
			return«this.modelClassName» = mapSingleAnswer(singleAnswer);
			return return«this.modelClassName»;
		}
		
		public List<«this.modelClassName»> search(SearchQuery searchQuery) {
			List<GenericResource> answer = driver.getCollection(resourceRoute, searchQuery);
			List<«this.modelClassName»> «this.modelClassName»Collection = mapAnswer(answer); 
			return «this.modelClassName»Collection;
		}
		
	'''

	def addGettersAndSetters(EAttribute attribute) '''
		public «attribute.getEAttributeType().getInstanceClass().getSimpleName()» get«attribute.getName().FirstUpperCase.camelCase» () {
			return 	this.«attribute.getName()»;
		}
		
		public void set«attribute.getName().FirstUpperCase.camelCase» («attribute.getEAttributeType().getInstanceClass().getSimpleName()» value) {
			this.«attribute.getName()» = value;
		}
		
	'''

	def addConstructor() '''
		public «this.modelClassName»(DriverInterface driver) {
			this.driver = driver;
			this.parser = new JsonParser();
		}
	'''

	def mapAnswer() '''
			
		List<«this.modelClassName»> mapAnswer(List<GenericResource> answer) {
			
			List<«this.modelClassName»> «this.modelClassName»Collection = new ArrayList<«this.modelClassName»>();
			answer.forEach((singleAnswer) -> {
				«this.modelClassName»Collection.add(mapSingleAnswer(singleAnswer));
			});
			
			return «this.modelClassName»Collection;
			
		}
		
		«this.modelClassName» mapSingleAnswer(GenericResource singleAnswer) {
			
			
			singleAnswer.attributesList.forEach((attribute) -> {
				«FOR EAttribute attribute : this.classAttributes»
					if(attribute.getName().equals("«attribute.getName()»")) {
						if (attribute.getValue()!= null) {
					«IF attribute.getEAttributeType().getInstanceTypeName().contains("Integer")  »	
						this.«attribute.getName()» = Integer.parseInt(attribute.getValue());
					«ELSEIF attribute.getEAttributeType().getInstanceTypeName().contains("String") »
						this.«attribute.getName()» = attribute.getValue().toString();
					«ELSEIF attribute.getEAttributeType().getInstanceTypeName().contains("boolean") »
						this.«attribute.getName()» = Boolean.parseBoolean(attribute.getValue());
					«ELSEIF attribute.getEAttributeType().getInstanceTypeName().contains("Date") »
						this.«attribute.getName()» = new DateTime(attribute.getValue().replace("\"", "")).toDate();
					«ENDIF»
					}
					}
				«ENDFOR»
				«FOR EReference reference : this.classReferences» 
					«IF this.fieldClassesName.contains(reference.getEReferenceType().getName())»
						if(attribute.getName().equals("«reference.getName()»")) {
						 	if (attribute.getValue()!= null) {
						 	JsonElement elm = parser.parse(attribute.getValue());
						« val fieldClass = eFieldPackage.getEClassifier(reference.getEReferenceType().getName()) as EClass»
						« FOR attribute : fieldClass.getEAllAttributes()»
							if(!elm.getAsJsonObject().get("«attribute.getName()»").isJsonNull()) {
							 	«IF attribute.getEAttributeType().getInstanceTypeName().contains("Integer")  »	
							 	this.«reference.getEReferenceType().getName()».set«attribute.getName().FirstUpperCase»(Integer.parseInt(elm.getAsJsonObject().get("«attribute.getName()»").toString()));
							 	«ELSEIF attribute.getEAttributeType().getInstanceTypeName().contains("String") »
							 	this.«reference.getEReferenceType().getName()».set«attribute.getName().FirstUpperCase»(elm.getAsJsonObject().get("«attribute.getName()»").toString());
								«ELSEIF attribute.getEAttributeType().getInstanceTypeName().contains("boolean") »
							 	this.«reference.getEReferenceType().getName()».set«attribute.getName().FirstUpperCase»(Boolean.parseBoolean(elm.getAsJsonObject().get("«attribute.getName()»").toString()));
								«ELSEIF attribute.getEAttributeType().getInstanceTypeName().contains("Date") »
							 	this.«reference.getEReferenceType().getName()».set«attribute.getName().FirstUpperCase»(new DateTime(elm.getAsJsonObject().get("«attribute.getName()»").toString()).toDate());
								«ENDIF»
							}
						«ENDFOR»
						}
						}
						«ENDIF»
					«ENDFOR»
				});
		
			singleAnswer.referenceList.forEach((reference) -> {
			«FOR EReference reference : this.classReferences» 
				«IF(this.modelClasses.contains(reference.getEReferenceType().getName())) »
					if(reference.getName().equals("«reference.getName().toString()»")) {
						this.«reference.getName().toString».add(reference.getValue());
					}
				«ENDIF»
			«ENDFOR»
			});
			return this;
			}
		'''

	def addAttribute(EAttribute attribute) '''
		private «attribute.getEAttributeType().getInstanceClass().getSimpleName()» «attribute.getName()»;
	'''

	def addReference(EReference reference) '''
		«IF (this.modelClasses.contains(reference.getEReferenceType().getName())) »
			private List<String> «reference.getName().toString()»  = new ArrayList<String>();
		«ENDIF»
		«IF (this.fieldClassesName.contains(reference.getEReferenceType().getName())) »
			private «reference.getEReferenceType().getName()» «reference.getName().toString()»  = new «reference.getEReferenceType().getName()»();
		«ENDIF»
	'''

	def addReferenceMethods() '''
		«FOR EReference reference : this.classReferences» 
			«IF(this.modelClasses.contains(reference.getEReferenceType().getName())) »
				
				public List<«reference.getEReferenceType().getName()»> get«reference.getName().FirstUpperCase.camelCase» () {
					List<«reference.getEReferenceType().getName()»> referenceList = new ArrayList<«reference.getEReferenceType().getName()»>();
					this.«reference.getName()».forEach((element) -> {
						«reference.getEReferenceType().getName()» referencedEntity = new «reference.getEReferenceType().getName()»(driver);
						referenceList.add(referencedEntity.getSingle(element));
					});
					return referenceList;
				}
			«ENDIF»
		«ENDFOR»
	'''

	def FirstUpperCase(String in) {
		return in.substring(0, 1).toUpperCase() + in.substring(1);
	}

	def camelCase(String in) {
		return CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, in)
	}

	def allCaps(String in) {
		return CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.UPPER_UNDERSCORE, in).toUpperCase();
	}
}
