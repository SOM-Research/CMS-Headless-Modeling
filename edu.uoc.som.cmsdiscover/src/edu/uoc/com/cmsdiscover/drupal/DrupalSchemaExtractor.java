package edu.uoc.com.cmsdiscover.drupal;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;

public class DrupalSchemaExtractor {
	
	
	EcoreFactory _coreFactory;
	EcorePackage _corePackage;

	String _specificationPath;
	String host;
	String basePath;
	List<String> resource_paths = new ArrayList<String>();
	
	EPackage _dynamicEPackage;
	Map<String, List<String>> _metaModelHelper = new HashMap<String, List<String>>();
	
	public DrupalSchemaExtractor(String specificactionPath) {
		// TODO Auto-generated constructor stub
		_specificationPath = specificactionPath;
		
		// init Ecore.
		_coreFactory = EcoreFactory.eINSTANCE;
		_corePackage = EcorePackage.eINSTANCE;
	}
	public EPackage ModelExtractor(EPackage genericEPackage, Map<String, List<String>> genericModelHelper) {
		
		_dynamicEPackage = genericEPackage;
		_metaModelHelper = genericModelHelper;
	
		try {
			// Read the OpenApi specification in JSON format.
			JsonObject data = (new JsonParser().parse(new JsonReader(new FileReader(_specificationPath)))).getAsJsonObject();
			for(Entry<String, JsonElement> entry : data.entrySet()) {
			  String key = entry.getKey();
			  JsonElement entryValue = entry.getValue();
			  switch (key) {
			  	case("info"): {
			  	  // Create package with the title
				  initDynamicEPackage(entryValue);
				  break;
			  	}
			 	case("host"): {	  	  
				  host = entryValue.toString();
				  break;
			  	}
			 	case("basePath"): {
			 	  basePath = entryValue.toString();
				  break;
	  			}
			 	case("paths"): {
			 	  // Get the paths of the resources
			 	  for(Map.Entry<String,JsonElement> path : entryValue.getAsJsonObject().entrySet()) { 
			 		 String pather = path.getKey(); 
			 	     resource_paths.add(path.getKey());
			 	  }
				  break;
		  		}
				case("definitions"): {
				 	  // Generate the entity model extracting de definitions
				  generateEntityModel(entryValue);
				  break;
			  	}
			  
			  }
			}
				
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		// TODO Auto-generated method stub
		return _dynamicEPackage;
	}
	public void generateEntityModel(JsonElement definitions) {
		
		  List<String> excludedEntities = new ArrayList<String>();
		  // Iterate over definitions and create Classes and Attributes
		  for(Map.Entry<String,JsonElement> definition : definitions.getAsJsonObject().entrySet()) { 
			  String definitionKeyLowerCase = definition.getKey().replaceAll("--", "_");
			  String definitionKey = definitionKeyLowerCase.substring(0, 1).toUpperCase() + definitionKeyLowerCase.substring(1);
			  // Get entities
			  // Is a class that is a extension of the metamodel. 
			  // Check if the class is extension of the metamodel
			  // get list attributes form de metamodel helper
			  boolean isFromMetamodel = false;
			  boolean hasAttributes = false;
			  List<String> excludedAttributes = null;
			  for (Map.Entry<String, List<String>> metamodelClasses : _metaModelHelper.entrySet()) {
				    if (definitionKey.startsWith(metamodelClasses.getKey())) {
				    	isFromMetamodel = true;
				    	excludedAttributes = metamodelClasses.getValue();
				    } else if (definitionKey.startsWith("contact_") && metamodelClasses.getKey().startsWith("contact_")) {
				    	isFromMetamodel = true;
				    	excludedAttributes = metamodelClasses.getValue();
				    }
			  }
			  // Create Classes with title 
			  EClass dynamicEClass = createDynamicEClass(definitionKey);
			  // Create Attributes
			  JsonObject attributes = definition.getValue().getAsJsonObject().get("properties").getAsJsonObject().get("data").getAsJsonObject().get("properties").getAsJsonObject().get("attributes").getAsJsonObject().get("properties").getAsJsonObject();
			  for(Map.Entry<String,JsonElement> singleAttr : attributes.entrySet()) {
				  // the Attribute is present in the generic model, or is an id of the entity?
				  // TODO; identify when "yes" and no call the following function
				  String attrName = singleAttr.getKey();
				  JsonObject attrValues = singleAttr.getValue().getAsJsonObject();
				  if (isFromMetamodel) {
					  if (excludedAttributes.contains(singleAttr.getKey().replaceAll("drupal_internal__", ""))) {
						  // If it is present, is a attributes inherit form the metamodel.
						  System.out.println("******************* this is not included: " + singleAttr.getKey());
					  } else {
						  // If it is not present, is a specific attributes form de class
						  EStructuralFeature attribute = createDynamicEstructuralFeatures (attrName, attrValues, dynamicEClass, false, false);
						  dynamicEClass.getEStructuralFeatures().add(attribute);
						  hasAttributes = true;
					  }
				  } else {
					  EStructuralFeature attribute = createDynamicEstructuralFeatures (attrName, attrValues, dynamicEClass, false, false);
					  dynamicEClass.getEStructuralFeatures().add(attribute);
					  hasAttributes = true;
				  }
			  }
			  // if the class does not have new attributes, no need to create the class.
			  if ((hasAttributes && definitionKey != "shortcut_default") || definitionKey.startsWith("contact_")) {
				  _dynamicEPackage.getEClassifiers().add(dynamicEClass);
			  } else {
				  excludedEntities.add(definitionKey);
			  }
		  };
		  // Iterate again over definitions and create EReferences.
		  for(Map.Entry<String,JsonElement> defRelation : definitions.getAsJsonObject().entrySet()) {
			String definitionKeyLowerCase = defRelation.getKey().replaceAll("--", "_");
			String definitionKey = definitionKeyLowerCase.substring(0, 1).toUpperCase() + definitionKeyLowerCase.substring(1);
			if (excludedEntities.contains(definitionKey)) {
				// If we have not created this entites, we does not have to create relationships
			} else {
			  // Get entities
			  // Is a class that is a extension of the generic model 
			  // Check if the class is extension of the generic model
			  // get list attributes form the generic model helper
			  boolean isFromMetamodel = false;
			  List<String> excludedReferences = null;
			  String metaModelClass = null;
			  for (Map.Entry<String, List<String>> metamodelClasses : _metaModelHelper.entrySet()) {
				    if (definitionKey.startsWith(metamodelClasses.getKey())){
				    	isFromMetamodel = true;
				    	excludedReferences = metamodelClasses.getValue();
				    	metaModelClass = metamodelClasses.getKey();
				    } else if (definitionKey.startsWith("contact_") && metamodelClasses.getKey().startsWith("contact_")) {
				    	isFromMetamodel = true;
				    	excludedReferences= metamodelClasses.getValue();
				    	metaModelClass = metamodelClasses.getKey();
				    }
			  }
			// Class are a extension from the generic model.
			
			  String classTitleLowerCase = defRelation.getKey().replaceAll("--", "_");
			  String classTitle =  classTitleLowerCase.substring(0, 1).toUpperCase() + classTitleLowerCase.substring(1);
			  EClass parentClass = (EClass)_dynamicEPackage.getEClassifier(classTitle);
			  JsonObject propertiesJson = defRelation.getValue().getAsJsonObject().get("properties").getAsJsonObject().get("data").getAsJsonObject().get("properties").getAsJsonObject().get("relationships").getAsJsonObject();
			  if (propertiesJson.has("properties")){
				JsonObject properties = propertiesJson.getAsJsonObject("properties");
				for(Map.Entry<String,JsonElement> singleProp : properties.entrySet()) { 
				  String referencedClassLowerCase;	
				  String referencedClass;
				  if (singleProp.getKey().startsWith("pid")) {
					  referencedClass = classTitle;
				  } else if (singleProp.getKey().startsWith("entity_id")) {
					  continue;
				  }
				  else {
					  JsonObject referencedClass_temp = singleProp.getValue().getAsJsonObject().getAsJsonObject("properties").getAsJsonObject("data");
					  if (referencedClass_temp.get("type").getAsString().startsWith("array")) {
					    referencedClassLowerCase = referencedClass_temp.get("items").getAsJsonObject().get("properties").getAsJsonObject().get("type").getAsJsonObject().get("enum").getAsString().replaceAll("--", "_");
					  } else {
						referencedClassLowerCase = referencedClass_temp.get("properties").getAsJsonObject().get("type").getAsJsonObject().get("enum").getAsString().replaceAll("file--", "").replaceAll("user--", "").replaceAll("contact_form--","").replaceAll("--", "_");
					  }
					  referencedClass = referencedClassLowerCase.substring(0, 1).toUpperCase() + referencedClassLowerCase.substring(1);
				  }
				  
				  EClass referencedClassObject = (EClass)_dynamicEPackage.getEClassifier(referencedClass);
				  System.out.println("Creating Reference: From: " + classTitle + " has a reference: " + singleProp.getKey() + " pointing to:  " + referencedClass);   
				  // Check if the properties are present in the generic model.
				  // TODO
				  JsonObject relationValues = singleProp.getValue().getAsJsonObject();
				  if (singleProp.getKey().startsWith("bundle") || singleProp.getKey().startsWith("node_type") || singleProp.getKey().startsWith("block_content_type") || singleProp.getKey().startsWith("contact_form")) {
					// Primitive types nothing to do.
				  } else if(isFromMetamodel){
					  if (excludedReferences.contains(singleProp.getKey().replaceAll("drupal_internal_", ""))) {
						  // Inherent from the generic model.
					  } else {
						  EStructuralFeature relationship = createDynamicEstructuralFeatures (singleProp.getKey(), relationValues, referencedClassObject, true, false);
						  parentClass.getEStructuralFeatures().add(relationship);
					  }
				  } else {
					  EStructuralFeature relationship = createDynamicEstructuralFeatures (singleProp.getKey(), relationValues, referencedClassObject, true, false);
					  parentClass.getEStructuralFeatures().add(relationship);
		
				  }	 
				}	
				if (isFromMetamodel) {
					// Then we have to create a containment relationship with the generic model class
					
					EClass metaModelClassObject = (EClass)_dynamicEPackage.getEClassifier(metaModelClass);
					//EStructuralFeature relationship = createDynamicEstructuralFeatures (metaModelClass, null, metaModelClassObject, true, true);
					//parentClass.getEStructuralFeatures().add(relationship);
					parentClass.getESuperTypes().add(metaModelClassObject);
					//createDynamicEReference(classTitle, metaModelClass, metaModelClass, true);
			      }
				} else {
					// Not form the generic model. Nothing to do.
				}

			  }
		}
		
	}
	public EClass createDynamicEClass(String title) {
		EClass dynamicEClass = _coreFactory.createEClass();
		dynamicEClass.setName(title);
		return dynamicEClass;
	}
	public EStructuralFeature createDynamicEstructuralFeatures (String featureName, JsonObject featureValues, EClass referencedClass, boolean isRelationShip, boolean isMetaModel){
		// Get Attributes type 
		
		if (isRelationShip) {
			EReference EReferenceObject = createDynamicEReference(featureName, referencedClass, isMetaModel);
			return (EStructuralFeature) EReferenceObject;
		} else {
			String featureType = featureValues.get("type").getAsString();	
			switch (featureType) {
	        case "object":
	         	if(featureName.startsWith("langcode") || featureName.startsWith("content_translation_source")) {
	         		EAttribute  EAttributeObject = createDynamicEAttributes(featureName, featureValues);
	         		return (EStructuralFeature) EAttributeObject;
	  	    	} else {
	  	    		// Is a object with custom DataType.
	  	    		EClass extraDynamicEClass;
	  	    		if (_dynamicEPackage.getEClassifier(featureName) == null) {
	  	    		  extraDynamicEClass = createDynamicEClass(featureName);
	  	    		  JsonObject attributeProperties = featureValues.get("properties").getAsJsonObject();
	  	    		  for(Map.Entry<String,JsonElement> singleProperty : attributeProperties.entrySet()) { 
	  	    			  String propName = singleProperty.getKey();
	  	    			  JsonObject propValues = singleProperty.getValue().getAsJsonObject();
		    			  EAttribute ExtraAttribute = createDynamicEAttributes(propName, propValues);
		    			  extraDynamicEClass.getEStructuralFeatures().add(ExtraAttribute);
	  	    		  }
		  	    	  _dynamicEPackage.getEClassifiers().add(extraDynamicEClass);
	  	    		} else {
	  	    		  extraDynamicEClass = (EClass)_dynamicEPackage.getEClassifier(featureName);
	  	    		}

	  	    	
	  	    		EReference EReferenceObject = createDynamicEReference(featureName, extraDynamicEClass, true);
	  	    		return (EStructuralFeature) EReferenceObject;
	  	    	} 
	        default:
	       		EAttribute  EAttributeObject = createDynamicEAttributes(featureName, featureValues);
         		return (EStructuralFeature) EAttributeObject;
			}
		}
		
	    
	}
	/***
	 * 
	 * @param attr_key
	 * @param attr_type
	 * @param attr_title
	 * Create EAttribute dynamically.
	 */
	public EAttribute createDynamicEAttributes(String attrName, JsonObject singleAttr) {
		
		EAttribute dynamicEAttribute = _coreFactory.createEAttribute();
		dynamicEAttribute.setName(attrName);
		String attrType = singleAttr.get("type").getAsString();
		
		// Check Attribute type
		if (attrType.startsWith("integer") || attrType.startsWith("number")) {
			dynamicEAttribute.setEType(_corePackage.getEIntegerObject());
		} else if (attrType.startsWith("string")) {
			dynamicEAttribute.setEType(_corePackage.getEString());
		} else if (attrType.startsWith("boolean")) {
			dynamicEAttribute.setEType(_corePackage.getEBoolean());
		} else if (attrType.startsWith("array")) {
			String arrayTypeOf = singleAttr.get("items").getAsJsonObject().get("type").getAsString();
			if (arrayTypeOf.startsWith("string")) {
				dynamicEAttribute.setEType(_corePackage.getEString());
				dynamicEAttribute.setUpperBound(-1);
			} else if (arrayTypeOf.startsWith("layout_section")) {
				// TO DO: Here we have and array of Layout object sections
				dynamicEAttribute.setEType(_corePackage.getEString());
			} else {
				// TO DO: Here we have other types of array.
				dynamicEAttribute.setEType(_corePackage.getEString());
			}
	    } else {
			 // TO DO. How we can proceed when EAttributes are objects and Arrays????
	    	dynamicEAttribute.setEType(_corePackage.getEString());
		}
		return dynamicEAttribute;
	}
	/***
	 * 
	 * @param ClassTitle
	 * @param property_name
	 * @param ReferencedClass
	 * Create EREferences dynamically.
	 */
	public EReference createDynamicEReference(String propertyName, EClass referencedClass, boolean setContainment) {
		EReference dynamicEReference = _coreFactory.createEReference();
		dynamicEReference.setName(propertyName);
		dynamicEReference.setEType(referencedClass);
		dynamicEReference.setUpperBound(EStructuralFeature.UNBOUNDED_MULTIPLICITY);
		// Set containment to true.
		if (setContainment) {
			dynamicEReference.setContainment(true); 
			
		} else {
			dynamicEReference.setContainment(false);
		}
		return dynamicEReference;
	}

	/***
	 * @param title
	 * Create EPackage dynamically
	 */
	public void initDynamicEPackage(JsonElement entry) {
		// Instantiate EPackage and provide unique URI to identify the package
		// instance
		 JsonObject info = entry.getAsJsonObject();
		 String title = info.get("title").getAsString().replaceAll("-", "_").replaceAll(" ", "_");
		 // Package is loaded from generic model.
		 // _dynamicEPackage = _coreFactory.createEPackage();
		_dynamicEPackage.setName(title);
		_dynamicEPackage.setNsPrefix(title);
		_dynamicEPackage
				.setNsURI("http:///com.somlab.drupal");
	}
}
