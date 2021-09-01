package edu.uoc.com.cmsdiscover.wordpress;

import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.ArrayList;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class WordpressSchemaExtractor {

	EcoreFactory coreFactory;
	EcorePackage corePackage;
	EPackage extendedEPackage;
	EClass extendedPostType;

	URL apiUrl;
	String userName;
	String password;
	String name;
	String host;
	String description;

	EPackage genericModelEPackage;
	Map<String, List<String>> metaModelHelper = new HashMap<String, List<String>>();
	List<String> namespaces = new ArrayList<String>();

	public WordpressSchemaExtractor(URL url, String user, String pass) {
		// TODO Auto-generated constructor stub
		apiUrl = url;
		userName = user;
		password = pass;
		// init Ecore.
		coreFactory = EcoreFactory.eINSTANCE;
		corePackage = EcorePackage.eINSTANCE;
		extendedEPackage = coreFactory.createEPackage();
	}

	public EPackage ModelExtractor(EPackage genericEPackage, Map<String, List<String>> genericModelHelper) {

		this.genericModelEPackage = genericEPackage;
		this.metaModelHelper = genericModelHelper;

		// Get the main Wp JSON Route
		JsonElement wpJson = ResourceRequest("", "GET");
		for (Entry<String, JsonElement> wpEntry : wpJson.getAsJsonObject().entrySet()) {
			String key = wpEntry.getKey();
			JsonElement entryValue = wpEntry.getValue();

			switch (key) {
			case ("name"): {
				// Create package with the title
				name = entryValue.toString();
				break;
			}
			case ("description"): {
				description = entryValue.getAsString();
				break;
			}
			case ("url"): {
				host = entryValue.getAsString();
				break;
			}
			case ("namespaces"): {
				// Get the paths of the resources
				entryValue.getAsJsonArray().forEach((element) -> {
					// String namespace = element.getValue().getAsString();
					namespaces.add(element.getAsString());
				});
				break;
			}
			case ("routes"): {
				// Generate the entity model extracting de definitions
				initDynamicEPackage(name, description);
				generateEntityModel(entryValue);
				System.out.println("This");
				return extendedEPackage;
			}

			}
		}

		// Get the differents workspaces
		// From wp2 space. Extract from routes first schema
		// Extract general settings info (from /settings route).
		// -- Call every route and try to guess from which class of genericModel departs
		// -- Extract the post-type, taxonomies, the custom-post-type,
		// custom-taxonomies, medias, blocs, references to Custom Fields
		// -- Extract custom fields form ACF space
		// -- Extract Menu mapping form menu-rest space

		// TODO Auto-generated method stub
		return null;
	}

	public void generateEntityModel(JsonElement routes) {

		// First we extract the Content Types, and the Taxonomies (core and custom ones)
		// from the API and create Classes
		extractExtendedContentTypes(routes);

		// Then we model the relationships.
		modelRelationships(routes);
	}

	/***
	 * 
	 * @param routes Extract the extended entites.
	 */
	public void extractExtendedContentTypes(JsonElement routes) {
		for (Map.Entry<String, JsonElement> route : routes.getAsJsonObject().entrySet()) {
			// Extract extended Content Types

			if (route.getKey().replaceFirst("/", "").contentEquals("wp/v2/types")) {
				System.out.println(route.getKey());
				JsonElement singleRoute = ResourceRequest(route.getKey() + "?context=edit", "GET");
				JsonObject result = singleRoute.getAsJsonObject();
				for (Entry<String, JsonElement> innerResult : result.entrySet()) {
					String restBaseLowerCase = innerResult.getValue().getAsJsonObject().get("rest_base").getAsString();
					String restBase = restBaseLowerCase.substring(0, 1).toUpperCase() + restBaseLowerCase.substring(1);
					// Create Class
					if (restBase.contains("Media")) {
						restBase = "extended_" + restBase;
					}
					extendedPostType = createDynamicEClass(restBase);
					// Get Supports specialitzacion from the post type
					JsonObject supports = innerResult.getValue().getAsJsonObject().get("supports").getAsJsonObject();
					extendedPostType = enableSupports(supports, extendedPostType);
					String hierarchical = innerResult.getValue().getAsJsonObject().get("hierarchical").getAsString();
					if (hierarchical.contains("true")) {
						EReference selfReference = createDynamicEReference("parent", extendedPostType, 1, 0);
						extendedPostType.getEStructuralFeatures().add(selfReference);
					}
					if (!restBase.contains("Blocks")) {
						// Look at custom fields of ACF
						JsonElement response = ResourceRequest("/acf/v3/" + restBase, "GET");
						if (response != null) {
							System.out.println(restBase + " custom fields:");
							JsonElement exampleContent = response.getAsJsonArray().get(0).getAsJsonObject().get("acf");
							if (exampleContent.isJsonObject()) {
								for (Entry<String, JsonElement> CustomField : exampleContent.getAsJsonObject()
										.entrySet()) {
									EAttribute acfEAttribute = createDynamicEAttributes("acf_" + CustomField.getKey(),
											"string");
									extendedPostType.getEStructuralFeatures().add(acfEAttribute);
									// TO DO
									// Analyze Value structure to determine if its a relationships or has special
									// data format (object)
									System.out.println(CustomField.getValue());
								}
							}
						}
					}
					// Add inheritance relationship with the generic model class to extended model.
					extendedEPackage.getEClassifiers().add(extendedPostType);
					EClass metaModelClassObject;
					if (restBase.contains("Blocks")) {
						metaModelClassObject = (EClass) genericModelEPackage.getEClassifier("Block");
						EClass currentClass = (EClass) extendedEPackage.getEClassifier(restBase);
						currentClass.getESuperTypes().add(metaModelClassObject);
					} else if (restBase.contains("Media")) {
						metaModelClassObject = (EClass) genericModelEPackage.getEClassifier("Media");
						EClass currentClass = (EClass) extendedEPackage.getEClassifier(restBase);
						currentClass.getESuperTypes().add(metaModelClassObject);
					} else {
						metaModelClassObject = (EClass) genericModelEPackage.getEClassifier("ContentType");
						EClass currentClass = (EClass) extendedEPackage.getEClassifier(restBase);
						currentClass.getESuperTypes().add(metaModelClassObject);
					}

				}
			}
			if (route.getKey().replaceFirst("/", "").equals("wp/v2/taxonomies")) {
				JsonElement singleRoute = ResourceRequest(route.getKey(), "GET");
				JsonObject result = singleRoute.getAsJsonObject();
				for (Entry<String, JsonElement> innerResult : result.entrySet()) {
					String slugBaseLowerCase = innerResult.getValue().getAsJsonObject().get("slug").getAsString()
							.replaceAll("-", "_");
					String slug = slugBaseLowerCase.substring(0, 1).toUpperCase() + slugBaseLowerCase.substring(1);
					EClass taxType = createDynamicEClass(slug);

					String hierarchical = innerResult.getValue().getAsJsonObject().get("hierarchical").getAsString();
					if (hierarchical.contains("true")) {
						// Add parent class to the taxonomy.
						EReference selfReference = createDynamicEReference("parent", taxType, 1, 0);
						taxType.getEStructuralFeatures().add(selfReference);
					}
					// Add inheritance relationship with the generic model class class to extended
					// model.
					extendedEPackage.getEClassifiers().add(taxType);
					EClass metaModelClassObject = (EClass) genericModelEPackage.getEClassifier("Taxonomy");
					EClass currentClass = (EClass) extendedEPackage.getEClassifier(slug);
					currentClass.getESuperTypes().add(metaModelClassObject);
				}
			}
			if (route.getKey().replaceFirst("/", "").contains("wp/v2/media")) {
				/*
				 * JsonElement singleRoute = ResourceRequest(Api_Url, route.getKey(), "GET");
				 * JsonObject result = singleRoute.getAsJsonObject(); for(Entry<String,
				 * JsonElement> innerResult : result.entrySet()) { String restBase =
				 * innerResult.getValue().getAsJsonObject().get("rest_base").getAsString(); //
				 * Create EClass derived from taxonomy // Then JsonElement response =
				 * ResourceRequest(Api_Url, "/wp/v2/"+restBase, "GET"); for(Entry<String,
				 * JsonElement> properties : response.getAsJsonObject().entrySet()) { if
				 * (properties.getKey().startsWith("media_details")) { // Check the media
				 * details dynamically } if(properties.getKey().startsWith("acf") ) { //
				 * Specialized fields of ACF // Taxonomy gets specialized with its parent and
				 * with ACF // Metafields are a key-value pair // AS a POF, build it as a
				 * specialized fields without relationships. } } }
				 */
			}

		}
	}

	/***
	 * 
	 * @param routes Model the relationships between the detected entities
	 */
	public void modelRelationships(JsonElement routes) {
		// Then we can extract the EReferences between taxonomies ans post type.
		for (Map.Entry<String, JsonElement> routeRef : routes.getAsJsonObject().entrySet()) {
			if (routeRef.getKey().replaceFirst("/", "").equals("wp/v2/types")) {
				JsonElement singleRoute = ResourceRequest(routeRef.getKey(), "GET");
				JsonObject result = singleRoute.getAsJsonObject();
				for (Entry<String, JsonElement> innerResult : result.entrySet()) {
					String restBaseLowerCase = innerResult.getValue().getAsJsonObject().get("rest_base").getAsString();
					String restBase = restBaseLowerCase.substring(0, 1).toUpperCase() + restBaseLowerCase.substring(1);
					if (!restBase.contains("Blocks")) {
						EClass parentClass = (EClass) extendedEPackage.getEClassifier(restBase);
						JsonArray taxonomies = innerResult.getValue().getAsJsonObject().get("taxonomies")
								.getAsJsonArray();
						if (taxonomies.size() >= 1) {
							taxonomies.forEach(taxonomy -> {
								String taxString = taxonomy.getAsString().replaceAll("-", "_");
								String taxonomyUpper = taxString.substring(0, 1).toUpperCase() + taxString.substring(1);
								// CreateEReference
								EClass taxonomyClass = (EClass) extendedEPackage.getEClassifier(taxonomyUpper);
								EReference taxReference = createDynamicEReference(taxonomyUpper, taxonomyClass, -1, 0);
								parentClass.getEStructuralFeatures().add(taxReference);
							});
						}
					}
				}
			}
		}

	}

	public JsonElement ResourceRequest(String singleResource, String method) {

		// create a client
		var client = HttpClient.newHttpClient();

		// create a request
		var request = HttpRequest.newBuilder().uri(URI.create(apiUrl + "/wp-json" + singleResource))
				.method(method, HttpRequest.BodyPublishers.noBody()).header("accept", "application/json")
				.header("Authorization", basicAuth(userName, password))
				.build();

		// use the client to send the request
		try {
			request.method();
			var response = client.send(request, BodyHandlers.ofString());
			if (response.statusCode() == 200) {
				JsonElement res = new JsonParser().parse(response.body());
				return res;
			} else {
				System.out.println("Opps route: " + singleResource + " has returned status: " + response.statusCode());
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

	private static String basicAuth(String username, String password) {
		return "Basic " + Base64.getEncoder().encodeToString((username + ":" + password).getBytes());
	}

	/***
	 * @param title Create EPackage dynamically
	 */
	public void initDynamicEPackage(String name, String description) {
		name = name.replaceAll(" ", "_").replaceAll("\"", "");
		extendedEPackage.setName(name);
		extendedEPackage.setNsPrefix(name);
		extendedEPackage.setNsURI(apiUrl.toString());
	}

	/***
	 * @param title Create EClass dynamically
	 */
	public EClass createDynamicEClass(String title) {
		EClass dynamicEClass = coreFactory.createEClass();
		dynamicEClass.setName(title);
		return dynamicEClass;
	}

	/***
	 * @param support
	 * @param EClass  Extended Post Type Create Custom attributes
	 */
	public EClass enableSupports(JsonObject supports, EClass extendedPostType) {

		for (Entry<String, JsonElement> support : supports.entrySet()) {
			switch (support.getKey()) {
			case ("title"): {
				EAttribute titleEAttribute = createDynamicEAttributes("title", "string");
				extendedPostType.getEStructuralFeatures().add(titleEAttribute);
				System.out.println("Added title suport");
				break;
			}
			case ("editor"): {
				System.out.println("editor");
				break;
			}
			case ("author"): {
				EClass userClass = (EClass) genericModelEPackage.getEClassifier("User");
				EReference userReference = createDynamicEReference("author", userClass, 1, 1);
				extendedPostType.getEStructuralFeatures().add(userReference);
				System.out.println("author");
				break;
			}
			case ("excerpt"): {
				EAttribute excerptEAttribute = createDynamicEAttributes("excerpt", "string");
				extendedPostType.getEStructuralFeatures().add(excerptEAttribute);
				System.out.println("excerpt");
				break;
			}
			case ("trackbacks"): {
				EAttribute trackBacksEAttribute = createDynamicEAttributes("ping_status", "string");
				extendedPostType.getEStructuralFeatures().add(trackBacksEAttribute);

				System.out.println("trackbacks");
				break;
			}
			case ("custom-fields"): {
				System.out.println("custom-fields");
				EClass metaClass = (EClass) genericModelEPackage.getEClassifier("MetaData");
				EReference commentsReference = createDynamicEReference("meta", metaClass, -1, 0);
				extendedPostType.getEStructuralFeatures().add(commentsReference);
				break;
			}
			case ("comments"): {
				// Comments status attribute
				EAttribute commentEAttribute = createDynamicEAttributes("comment_status", "string");
				extendedPostType.getEStructuralFeatures().add(commentEAttribute);
				System.out.println("comments");
				// Comments related
				EClass commentsClass = (EClass) genericModelEPackage.getEClassifier("Comment");
				EReference commentsReference = createDynamicEReference("comments", commentsClass, -1, 0);
				extendedPostType.getEStructuralFeatures().add(commentsReference);
				break;
			}
			case ("revisions"): {
				EClass revisionClass = (EClass) genericModelEPackage.getEClassifier("Revision");
				EReference revisionReference = createDynamicEReference("revisions", revisionClass, -1, 0);
				extendedPostType.getEStructuralFeatures().add(revisionReference);
				System.out.println("revisions");
				break;
			}
			case ("thumbnail"): {
				EClass mediaClass = (EClass) genericModelEPackage.getEClassifier("Media");
				EReference mediaReference = createDynamicEReference("featured_image", mediaClass, 1, 0);
				extendedPostType.getEStructuralFeatures().add(mediaReference);
				System.out.println("revisions");
				break;
			}
			case ("page-attributes"): {
				System.out.println("page-attributes");
				// TO DO
				break;
			}
			case ("post-formats"): {
				// TO DO
				break;
			}
			}
		}
		return extendedPostType;
	}

	public EAttribute createDynamicEAttributes(String attrName, String Etype) {
		EAttribute dynamicEAttribute = coreFactory.createEAttribute();
		dynamicEAttribute.setName(attrName);
		if (Etype.contains("string")) {
			dynamicEAttribute.setEType(corePackage.getEString());
		} else {
			dynamicEAttribute.setEType(corePackage.getEString());
		}
		return dynamicEAttribute;
	}

	public EReference createDynamicEReference(String attrName, EClass targetClass, int upperBound, int lowerBound) {
		EReference dynamicEReference = coreFactory.createEReference();
		dynamicEReference.setName(attrName);
		dynamicEReference.setEType(targetClass);
		dynamicEReference.setUpperBound(upperBound);
		dynamicEReference.setLowerBound(lowerBound);
		return dynamicEReference;

	}

}
