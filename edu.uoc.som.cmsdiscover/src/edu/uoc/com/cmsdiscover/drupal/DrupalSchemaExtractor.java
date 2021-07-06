package edu.uoc.com.cmsdiscover.drupal;

import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.ArrayList;
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

	EcoreFactory _coreFactory;
	EcorePackage _corePackage;
	EPackage _genericModelEPackage;
	EPackage _extendedEPackage;
	Map<String, List<String>> _genericModelHelper;

	URL _apiUrl;
	String _userName;
	String _password;
	String _basePath;
	List<String> _resource_paths = null;

	public DrupalSchemaExtractor(URL url, String user, String pass) {
		// Init parameters.
		_apiUrl = url;
		_userName = user;
		_password = pass;
		_coreFactory = EcoreFactory.eINSTANCE;
		_corePackage = EcorePackage.eINSTANCE;
		_extendedEPackage = _coreFactory.createEPackage();

	}

	public EPackage ModelExtractor(EPackage genericEPackage, Map<String, List<String>> genericModelHelper) {

		_genericModelEPackage = genericEPackage;
		_genericModelHelper = genericModelHelper;

		// Read the OpenApi specification in JSON format of the remote site.
		JsonObject OpenApiSpecification = OpenApiSpecificationRequest().getAsJsonObject();

		// Init the _extendedPackage, and build the model.
		for (Entry<String, JsonElement> entry : OpenApiSpecification.entrySet()) {
			JsonElement entryValue = entry.getValue();
			switch (entry.getKey()) {
			case ("info"): {
				JsonObject info = entryValue.getAsJsonObject();
				String title = info.get("title").getAsString().replaceAll("-", "_").replaceAll(" ", "_");
				_extendedEPackage.setName(title);
				_extendedEPackage.setNsPrefix(title);
				break;
			}
			case ("host"): {
				_extendedEPackage.setNsURI(entryValue.toString());
				break;
			}
			case ("basePath"): {
				_basePath = entryValue.toString();
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
		return _extendedEPackage;
	}

	public void generateEntityModel(JsonElement definitions) {

		// Iterate over definitions and create Classes and Attributes
		for (Map.Entry<String, JsonElement> definition : definitions.getAsJsonObject().entrySet()) {

			// Get the type of the definition.
			int iend = definition.getKey().indexOf("--");
			String definitionType = definition.getKey().substring(0, iend).substring(0, 1).toUpperCase()
					+ definition.getKey().substring(0, iend).substring(1);
			;
			String normalizedType = normalizeDefinition(definitionType);

			// Get the custom name of the definition.
			String customDefinition = definition.getKey().substring(iend + 2).substring(0, 1).toUpperCase()
					+ definition.getKey().substring(iend + 2).substring(1);

			// Create Classes with title
			if (definitionType != "Path_alias" && definitionType != "Oauth2_token" && definitionType != "Menu_link"
					&& definitionType != "Shortcut" && definitionType != "File" && definitionType != "Consumer") {
				// Create the class.
				EClass dynamicEClass = createDynamicEClass(customDefinition);
				// Check if has a superType form the generic model and create it.
				boolean isFromMetamodel = false;
				List<String> superTypeAttributes = null;
				for (Map.Entry<String, List<String>> metamodelClasses : _genericModelHelper.entrySet()) {
					if (normalizedType.startsWith(metamodelClasses.getKey())) {
						superTypeAttributes = metamodelClasses.getValue();

						// Add super type
						EClass genericSuperType = (EClass) _genericModelEPackage
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
				_extendedEPackage.getEClassifiers().add(dynamicEClass);
			} else {
				// Do not create the class. Following definition.
				break;
			}
		}
		;
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
			if (definitionType != "Path_alias" && definitionType != "Oauth2_token" && definitionType != "Menu_link"
					&& definitionType != "Shortcut" && definitionType != "File" && definitionType != "Consumer") {
				// If we have not created these entities, we do not create relationships
			} else {
				// Get entities
				// Is a class that is a extension of the generic model
				// Check if the class is extension of the generic model
				// get list attributes form the generic model helper
				boolean isFromMetamodel = false;
				List<String> excludedReferences = null;
				List<String> superTypeAttributes = null;
				for (Map.Entry<String, List<String>> metamodelClasses : _genericModelHelper.entrySet()) {
					if (normalizedType.startsWith(metamodelClasses.getKey())) {
						superTypeAttributes = metamodelClasses.getValue();
						isFromMetamodel = true;
					}
				}

				// Get the referencing class name.
				EClass parentClass = (EClass) _extendedEPackage.getEClassifier(classTitle);

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
						EClass referencedClassObject = (EClass) _extendedEPackage.getEClassifier(referencedClass);
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

			}
		}

	}

	public EClass createDynamicEClass(String title) {
		EClass dynamicEClass = _coreFactory.createEClass();
		dynamicEClass.setName(title);
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
					if (_extendedEPackage.getEClassifier(featureName) == null) {
						extraDynamicEClass = createDynamicEClass(featureName);
						JsonObject attributeProperties = featureValues.get("properties").getAsJsonObject();
						for (Map.Entry<String, JsonElement> singleProperty : attributeProperties.entrySet()) {
							String propName = singleProperty.getKey();
							JsonObject propValues = singleProperty.getValue().getAsJsonObject();
							EAttribute ExtraAttribute = createDynamicEAttributes(propName, propValues);
							extraDynamicEClass.getEStructuralFeatures().add(ExtraAttribute);
						}
						_extendedEPackage.getEClassifiers().add(extraDynamicEClass);
					} else {
						extraDynamicEClass = (EClass) _extendedEPackage.getEClassifier(featureName);
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
	 * @param ReferencedClass Create EREferences dynamically.
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
	 * @param title Create EPackage dynamically
	 */
	public void initDynamicEPackage(JsonElement entry) {
		// Instantiate EPackage and provide unique URI to identify the package
		// instance
		JsonObject info = entry.getAsJsonObject();
		String title = info.get("title").getAsString().replaceAll("-", "_").replaceAll(" ", "_");
		// We create the extended package
		_extendedEPackage.setName(title);
		_extendedEPackage.setNsPrefix(title);
	}

	/***
	 * Get OpenAPI Specifications
	 */
	public JsonElement OpenApiSpecificationRequest() {

		// create a client
		var client = HttpClient.newHttpClient();

		// create a request
		var request = HttpRequest.newBuilder().uri(URI.create(_apiUrl.toString() + "/openapi/jsonapi"))
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

	private static String basicAuth(String username, String password) {
		return "Basic " + Base64.getEncoder().encodeToString((username + ":" + password).getBytes());
	}

}
