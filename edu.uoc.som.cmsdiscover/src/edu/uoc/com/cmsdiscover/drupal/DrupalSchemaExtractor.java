package edu.uoc.com.cmsdiscover.drupal;

import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Base64;
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

public class DrupalSchemaExtractor {

	EcoreFactory coreFactory;
	EcorePackage corePackage;
	EPackage genericModelEPackage;
	EPackage extendedEPackage;
	Map<String, List<String>> genericModelHelper;

	URL apiUrl;
	String userName;
	String password;
	String basePath;
	List<String> resource_paths = null;

	public DrupalSchemaExtractor(URL url, String user, String pass) {
		// Initialize parameters.
		apiUrl = url;
		userName = user;
		password = pass;
		coreFactory = EcoreFactory.eINSTANCE;
		corePackage = EcorePackage.eINSTANCE;
		extendedEPackage = coreFactory.createEPackage();

	}

	/***
	 * 
	 * @param genericEPackage    The generic model.
	 * @param genericModelHelper A helper to generate the model.
	 */
	public EPackage ModelExtractor(EPackage genericEPackage, Map<String, List<String>> genericModelHelper) {

		this.genericModelEPackage = genericEPackage;
		this.genericModelHelper = genericModelHelper;

		// Read the OpenApi specification in JSON format of the remote site.
		JsonObject OpenApiSpecification = OpenApiSpecificationRequest().getAsJsonObject();

		// Init the _extendedPackage, and build the model.
		for (Entry<String, JsonElement> entry : OpenApiSpecification.entrySet()) {
			JsonElement entryValue = entry.getValue();
			switch (entry.getKey()) {
			case ("info"): {
				JsonObject info = entryValue.getAsJsonObject();
				String title = info.get("title").getAsString().replaceAll("-", "_").replaceAll(" ", "_");
				extendedEPackage.setName(title);
				extendedEPackage.setNsPrefix(title);
				break;
			}
			case ("host"): {
				extendedEPackage.setNsURI(entryValue.toString());
				break;
			}
			case ("basePath"): {
				basePath = entryValue.toString();
				break;
			}
			case ("paths"): {
				// Get the paths of the resources
				for (Map.Entry<String, JsonElement> path : entryValue.getAsJsonObject().entrySet()) {
					// if (path.getKey() != null) _resource_paths.add(path.getKey());
				}
				break;
			}
			case ("definitions"): {
				// Generate the entity model extracting de definitions
				generateEntityModel(entryValue);
				break;
			}

			}
		}
		return extendedEPackage;
	}

	/***
	 * 
	 * @param title definitions Get the site model.
	 */
	public void generateEntityModel(JsonElement definitions) {
		// Get the OpenAPI specification and extract the entities of the site.
		extractEntities(definitions);
		// Once we have detected the entities, then model the relationships between this
		// entities.
		extractRelationships(definitions);
	}

	/***
	 * 
	 * @param definitions Extract the entities of the site.
	 */
	public void extractEntities(JsonElement definitions) {
		// Iterate over definitions and create Classes and Attributes
		for (Map.Entry<String, JsonElement> definition : definitions.getAsJsonObject().entrySet()) {

			// Get the type of the definition.
			int iend = definition.getKey().indexOf("--");
			String definitionType = normalizeDefinition(definition.getKey().substring(0, iend).substring(0, 1).toUpperCase()
					+ definition.getKey().substring(0, iend).substring(1));
			String classTitle = definition.getKey().substring(iend + 2).substring(0, 1).toUpperCase()
					+ definition.getKey().substring(iend + 2).substring(1);

			// Create Classes with title
			if (excludeNoContentEntities(definitionType)) {
				// Create the class.
				EClass dynamicEClass = createDynamicEClass(classTitle);
				// Check if has a superType form the generic model and create it.
				boolean isFromMetamodel = false;
				List<String> superTypeAttributes = null;
				for (Map.Entry<String, List<String>> metamodelClasses : genericModelHelper.entrySet()) {
					if (definitionType.startsWith(metamodelClasses.getKey())) {
						superTypeAttributes = metamodelClasses.getValue();

						// Add super type
						EClass genericSuperType = (EClass) genericModelEPackage
								.getEClassifier(metamodelClasses.getKey());
						dynamicEClass.getESuperTypes().add(genericSuperType);
						isFromMetamodel = true;

					}
				}

				// Create Attributes
				boolean hasAttributes = false;
				JsonObject attributes = definition.getValue().getAsJsonObject().get("properties").getAsJsonObject()
						.get("data").getAsJsonObject().get("properties").getAsJsonObject().get("attributes")
						.getAsJsonObject().get("properties").getAsJsonObject();
				for (Map.Entry<String, JsonElement> singleAttr : attributes.entrySet()) {
					// the Attribute is present in the generic model, or is an id of the entity?
					// TODO; identify when "yes" and no call the following function
					String attrName = singleAttr.getKey();
					JsonObject attrValues = singleAttr.getValue().getAsJsonObject();
					if (isFromMetamodel) {
						String attributeKey = singleAttr.getKey().replaceAll("drupal_internal__", "");
						if (superTypeAttributes.contains(attributeKey) || attributeKey == "nid") {
							// If it is present, is a attributes inherit form the genericModel
							System.out.println("******************* this is not included: " + singleAttr.getKey());
						} else {
							// If it is not present, is a specific attributes from the extended class
							EStructuralFeature attribute = createDynamicEstructuralFeatures(attrName, attrValues,
									dynamicEClass, false, false);
							dynamicEClass.getEStructuralFeatures().add(attribute);
							hasAttributes = true;
						}
					} else {
						EStructuralFeature attribute = createDynamicEstructuralFeatures(attrName, attrValues,
								dynamicEClass, false, false);
						dynamicEClass.getEStructuralFeatures().add(attribute);
						hasAttributes = true;
					}
				}

				// Add the created class to the extendedPackage
				extendedEPackage.getEClassifiers().add(dynamicEClass);
			} else {
				// Do not create the class. Following definition.
			}
		}
		;

	}

	/***
	 * 
	 * @param definitions Model the relationships between the detected entities
	 */
	public void extractRelationships(JsonElement definitions) {

		// Iterate again over definitions and create EReferences.
		for (

		Map.Entry<String, JsonElement> defRelation : definitions.getAsJsonObject().entrySet()) {

			// Get the type of the definition.
			int iend = defRelation.getKey().indexOf("--");
			String definitionType = defRelation.getKey().substring(0, iend).substring(0, 1).toUpperCase()
					+ defRelation.getKey().substring(0, iend).substring(1);
			;
			String normalizedType = normalizeDefinition(definitionType);

			// Get the custom name of the definition.
			String classTitle = defRelation.getKey().substring(iend + 2).substring(0, 1).toUpperCase()
					+ defRelation.getKey().substring(iend + 2).substring(1);
			// Create Classes with title
			if (excludeNoContentEntities(normalizedType)) {
				// Get entities
				// Is a class that is a extension of the generic model
				// Check if the class is extension of the generic model
				// get list attributes form the generic model helper
				boolean isFromMetamodel = false;
				List<String> excludedReferences = null;
				List<String> superTypeAttributes = null;
				for (Map.Entry<String, List<String>> metamodelClasses : genericModelHelper.entrySet()) {
					if (normalizedType.startsWith(metamodelClasses.getKey())) {
						superTypeAttributes = metamodelClasses.getValue();
						isFromMetamodel = true;
					}
				}

				// Get the referencing class name.
				EClass parentClass = (EClass) extendedEPackage.getEClassifier(classTitle);

				// Get the references of the class.
				JsonObject propertiesJson = defRelation.getValue().getAsJsonObject().get("properties").getAsJsonObject()
						.get("data").getAsJsonObject().get("properties").getAsJsonObject().get("relationships")
						.getAsJsonObject();
				if (propertiesJson.has("properties")) {
					JsonObject properties = propertiesJson.getAsJsonObject("properties");
					for (Map.Entry<String, JsonElement> singleProp : properties.entrySet()) {
						String referencedClassLowerCase;
						String referencedClass;
						if (singleProp.getKey().startsWith("pid")) {
							referencedClass = classTitle;
						} else if (singleProp.getKey().startsWith("entity_id")) {
							continue;
						} else {
							JsonObject referencedClass_temp = singleProp.getValue().getAsJsonObject()
									.getAsJsonObject("properties").getAsJsonObject("data");
							if (referencedClass_temp.get("type").getAsString().startsWith("array")) {
								referencedClassLowerCase = referencedClass_temp.get("items").getAsJsonObject()
										.get("properties").getAsJsonObject().get("type").getAsJsonObject().get("enum")
										.getAsString().replaceAll("--", "_");
								int index = referencedClassLowerCase.indexOf("--");
								// Get the custom name of the definition.
								referencedClass = referencedClassLowerCase.substring(index + 2).substring(0, 1)
										.toUpperCase() + referencedClassLowerCase.substring(index + 2).substring(1);
							} else {
								referencedClassLowerCase = referencedClass_temp.get("properties").getAsJsonObject()
										.get("type").getAsJsonObject().get("enum").getAsString()
										.replaceAll("file--", "").replaceAll("user--", "")
										.replaceAll("contact_form--", "").replaceAll("--", "_");
								int index = referencedClassLowerCase.indexOf("--");
								// Get the custom name of the definition.
								referencedClass = referencedClassLowerCase.substring(index + 2).substring(0, 1)
										.toUpperCase() + referencedClassLowerCase.substring(index + 2).substring(1);
							}
							referencedClass = referencedClassLowerCase.substring(0, 1).toUpperCase()
									+ referencedClassLowerCase.substring(1);
						}

						// Check if the referenced class is present in the model or in the generic
						// model.
						EClass referencedClassObject = (EClass) extendedEPackage.getEClassifier(referencedClass);
						if (referencedClassObject == null) {

							// The class is not created, to review
						} else {
							System.out.println("Creating Reference: From: " + classTitle + " has a reference: "
									+ singleProp.getKey() + " pointing to:  " + referencedClass);

							JsonObject relationValues = singleProp.getValue().getAsJsonObject();
							if (singleProp.getKey().startsWith("bundle") || singleProp.getKey().startsWith("node_type")
									|| singleProp.getKey().startsWith("block_content_type")
									|| singleProp.getKey().startsWith("contact_form")) {
								// Primitive Drupal types, not really a relationsuip, nothing to do.
							} else if (isFromMetamodel) {
								if (superTypeAttributes
										.contains(singleProp.getKey().replaceAll("drupal_internal_", ""))) {
									// Inherent from the generic model. No need to create it.
								} else {
									EStructuralFeature relationship = createDynamicEstructuralFeatures(
											singleProp.getKey(), relationValues, referencedClassObject, true, false);
									parentClass.getEStructuralFeatures().add(relationship);
								}
							} else {
								EStructuralFeature relationship = createDynamicEstructuralFeatures(singleProp.getKey(),
										relationValues, referencedClassObject, true, false);
								parentClass.getEStructuralFeatures().add(relationship);

							}
						}
						// Check if the properties are present in the generic model.
						// TODO

					}
				} else {
					// Not form the generic model. Nothing to do.
				}
			} else {
				// If we have not created the class we donot model it.
			}
		}

	}

	/***
	 * 
	 * @param title Create EClass dynamically.
	 */
	public EClass createDynamicEClass(String title) {
		EClass dynamicEClass = coreFactory.createEClass();
		dynamicEClass.setName(title);
		System.out.println("Class created: " + title);
		
		return dynamicEClass;
	}

	public EStructuralFeature createDynamicEstructuralFeatures(String featureName, JsonObject featureValues,
			EClass referencedClass, boolean isRelationShip, boolean isMetaModel) {
		// Get Attributes type

		if (isRelationShip) {
			EReference EReferenceObject = createDynamicEReference(featureName, referencedClass, isMetaModel);
			return (EStructuralFeature) EReferenceObject;
		} else {
			String featureType = featureValues.get("type").getAsString();
			switch (featureType) {
			case "object":
				if (featureName.startsWith("langcode") || featureName.startsWith("content_translation_source")) {
					EAttribute EAttributeObject = createDynamicEAttributes(featureName, featureValues);
					return (EStructuralFeature) EAttributeObject;
				} else {
					// Is a object with custom DataType.
					EClass extraDynamicEClass;
					if (extendedEPackage.getEClassifier(featureName) == null) {
						extraDynamicEClass = createDynamicEClass(featureName);
						JsonObject attributeProperties = featureValues.get("properties").getAsJsonObject();
						for (Map.Entry<String, JsonElement> singleProperty : attributeProperties.entrySet()) {
							String propName = singleProperty.getKey();
							JsonObject propValues = singleProperty.getValue().getAsJsonObject();
							EAttribute ExtraAttribute = createDynamicEAttributes(propName, propValues);
							extraDynamicEClass.getEStructuralFeatures().add(ExtraAttribute);
						}
						extendedEPackage.getEClassifiers().add(extraDynamicEClass);
					} else {
						extraDynamicEClass = (EClass) extendedEPackage.getEClassifier(featureName);
					}

					EReference EReferenceObject = createDynamicEReference(featureName, extraDynamicEClass, true);
					return (EStructuralFeature) EReferenceObject;
				}
			default:
				EAttribute EAttributeObject = createDynamicEAttributes(featureName, featureValues);
				return (EStructuralFeature) EAttributeObject;
			}
		}

	}

	/***
	 * 
	 * @param attr_key
	 * @param attr_type
	 * @param attr_title Create EAttribute dynamically.
	 */
	public EAttribute createDynamicEAttributes(String attrName, JsonObject singleAttr) {

		EAttribute dynamicEAttribute = coreFactory.createEAttribute();
		dynamicEAttribute.setName(attrName);
		String attrType = singleAttr.get("type").getAsString();

		// Check Attribute type
		if (attrType.startsWith("integer") || attrType.startsWith("number")) {
			dynamicEAttribute.setEType(corePackage.getEIntegerObject());
		} else if (attrType.startsWith("string")) {
			dynamicEAttribute.setEType(corePackage.getEString());
		} else if (attrType.startsWith("boolean")) {
			dynamicEAttribute.setEType(corePackage.getEBoolean());
		} else if (attrType.startsWith("array")) {
			String arrayTypeOf = singleAttr.get("items").getAsJsonObject().get("type").getAsString();
			if (arrayTypeOf.startsWith("string")) {
				dynamicEAttribute.setEType(corePackage.getEString());
				dynamicEAttribute.setUpperBound(-1);
			} else if (arrayTypeOf.startsWith("layout_section")) {
				// TO DO: Here we have and array of Layout object sections
				dynamicEAttribute.setEType(corePackage.getEString());
			} else {
				// TO DO: Here we have other types of array.
				dynamicEAttribute.setEType(corePackage.getEString());
			}
		} else {
			// TO DO. How we can proceed when EAttributes are objects and Arrays????
			dynamicEAttribute.setEType(corePackage.getEString());
		}
		return dynamicEAttribute;
	}

	/***
	 * 
	 * @param ClassTitle
	 * @param property_name
	 * @param ReferencedClass Create EREferences dynamically.
	 */
	public EReference createDynamicEReference(String propertyName, EClass referencedClass, boolean setContainment) {
		EReference dynamicEReference = coreFactory.createEReference();
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
	 * @param title Create EPackage dynamically
	 */
	public void initDynamicEPackage(JsonElement entry) {
		// Instantiate EPackage and provide unique URI to identify the package
		// instance
		JsonObject info = entry.getAsJsonObject();
		String title = info.get("title").getAsString().replaceAll("-", "_").replaceAll(" ", "_");
		// We create the extended package
		extendedEPackage.setName(title);
		extendedEPackage.setNsPrefix(title);
	}

	/***
	 * Get OpenAPI Specifications
	 */
	public JsonElement OpenApiSpecificationRequest() {

		// create a client
		var client = HttpClient.newHttpClient();

		// create a request
		var request = HttpRequest.newBuilder().uri(URI.create(apiUrl.toString() + "/openapi/jsonapi"))
				.method("GET", HttpRequest.BodyPublishers.noBody()).header("accept", "application/json")
				// .header("Authorization", basicAuth(userName, password))
				.build();

		// use the client to send the request
		try {
			request.method();
			var response = client.send(request, BodyHandlers.ofString());
			if (response.statusCode() == 200) {
				JsonElement res = new JsonParser().parse(response.body());
				return res;
			} else {
				System.out.println("Has returned status: " + response.statusCode());
				return null;
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	private String normalizeDefinition(String definitionType) {

		switch (definitionType) {
		case ("Block_content"): {
			definitionType = "Block";
			break;
		}
		case ("Contact_message"): {
			definitionType = "ContactForm";
			break;
		}
		case ("Node"): {
			definitionType = "ContentType";
			break;
		}
		case ("Taxonomy_term"): {
			definitionType = "Taxonomy";
			break;
		}
		}

		return definitionType;

	}

	private boolean excludeNoContentEntities(String definitionType) {

		switch (definitionType) {
		case ("Path_alias"): {
			return false;
		}
		case ("Oauth2_token"): {
			return false;
		}
		case ("Menu_link_content"): {
			return false;
		}
		case ("Shortcut"): {
			return false;
		}
		case ("Auth_code"): {
			return false;
		}
		case ("File"): {
			return false;
		}
		case ("Consumer"): {
			return false;
		}
		case ("Access_Token"): {
			return false;
		}
		case ("secret"): {
			return false;
		}
		case ("Default"): {
			return false;
		}
		case ("Content_moderation_state"): {
			return false;
		}
		default: {
			return true;
		}
		}

	}

	private static String basicAuth(String username, String password) {
		return "Basic " + Base64.getEncoder().encodeToString((username + ":" + password).getBytes());
	}

}
