package com.somlab.cmsmodel.wordpress;

import java.io.Console;
import java.io.IOException;
import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.ArrayList;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

//import jdk.internal.net.http.HttpClientBuilderImpl;

public class WordpressSchemaExtractor {
	
	EcoreFactory _coreFactory;
	EcorePackage _corePackage;


	String Api_Url;
	String name;
	String host;
	String description;
	
	EPackage _dynamicEPackage;
	Map<String, List<String>> _metaModelHelper = new HashMap<String, List<String>>();
	List<String> namespaces = new ArrayList<String>();
	
	public WordpressSchemaExtractor(String url) {
		// TODO Auto-generated constructor stub
		Api_Url = url;
		// init Ecore.
		_coreFactory = EcoreFactory.eINSTANCE;
		_corePackage = EcorePackage.eINSTANCE;
	}

	public EPackage ModelExtractor(EPackage genericEPackage, Map<String, List<String>> genericModelHelper) {
		
		_dynamicEPackage = genericEPackage;
		_metaModelHelper = genericModelHelper;
		
		// Get the main Wp JSON Route
		JsonElement wpJson = ResourceRequest(Api_Url, "", "GET");
		for(Entry<String, JsonElement> wpEntry : wpJson.getAsJsonObject().entrySet()) {		
			String key = wpEntry.getKey();
			JsonElement entryValue = wpEntry.getValue();
			
			  switch (key) {
			  	case("name"): {
			  	  // Create package with the title
				  name = entryValue.toString();
				  break;
			  	}
			 	case("description"): {	  	  
				  description = entryValue.getAsString();
				  break;
			  	}
			 	case("url"): {
			 	  host = entryValue.getAsString();
				  break;
	  			}
			 	case("namespaces"): {
			 	  // Get the paths of the resources
			 	  entryValue.getAsJsonArray().forEach((element) -> {  
			 		 // String namespace = element.getValue().getAsString();
			 	     namespaces.add(element.getAsString());
			 	  });
				  break;
		  		}
				case("routes"): {
				 	  // Generate the entity model extracting de definitions
				  generateEntityModel(entryValue);
				  break;
			  	}
			  
			  }
		}
		
		// Get the differents workspaces
		// From wp2 space. Extract from routes first schema
		// Extract general settings info (from /settings route).
		// -- Call every route and try to guess from which class of genericModel departs
		// -- Extract the post-type, taxonomies, the custom-post-type, custom-taxonomies, medias, blocs, references to Custom Fields
		// -- Extract custom fields form ACF space
		// -- Extract Menu mapping form menu-rest space
		
		
		// TODO Auto-generated method stub
		return null;
	}
	
	public void generateEntityModel(JsonElement routes) {
		
		// First we extract the Content Types, and the Taxonomies (core and custom ones) from the API and create Classes
		for(Map.Entry<String,JsonElement> route : routes.getAsJsonObject().entrySet()) { 
			if (route.getKey().replaceFirst("/","").contentEquals("wp/v2/types")) {
				System.out.println(route.getKey());
				JsonElement singleRoute = ResourceRequest(Api_Url, route.getKey() + "?context=edit", "GET");
				JsonObject result = singleRoute.getAsJsonObject();
				for(Entry<String, JsonElement> innerResult : result.entrySet()) {		
					String restBaseLowerCase = innerResult.getValue().getAsJsonObject().get("rest_base").getAsString();
					String restBase = restBaseLowerCase.substring(0, 1).toUpperCase() + restBaseLowerCase.substring(1);
					// Create Class
					EClass extendedPostType = createDynamicEClass(restBase);
			
			
					// Get Supports specialitzacion fro the post type
					JsonObject supports = innerResult.getValue().getAsJsonObject().get("supports").getAsJsonObject();
					extendedPostType = enableSupports(supports, extendedPostType);
					//System.exit(200);
					if (!restBase.contains("Blocks")) { 
					// Miren quins camps especials te aquesta classe del ACF
						JsonElement response = ResourceRequest(Api_Url, "/acf/v3/"+restBase, "GET");
						if(response != null) {
							System.out.println(restBase + " custom fields:");
							JsonElement exampleContent = response.getAsJsonArray().get(0).getAsJsonObject().get("acf");
							if (exampleContent.isJsonObject()) {
								for(Entry<String, JsonElement> CustomField : exampleContent.getAsJsonObject().entrySet()) {	
									System.out.println(CustomField.getKey());
									System.out.println(CustomField.getValue());
								}
							}
						}
					}
					//Add heritance relationship with metamodel class class to extended model.
					_dynamicEPackage.getEClassifiers().add(extendedPostType);
					EClass metaModelClassObject = (EClass)_dynamicEPackage.getEClassifier("PostType");
					EClass currentClass = (EClass)_dynamicEPackage.getEClassifier(restBase);
					currentClass.getESuperTypes().add(metaModelClassObject);
				}
			}
			if (route.getKey().replaceFirst("/","").contains("wp/v2/taxonomies")) {
				JsonElement singleRoute = ResourceRequest(Api_Url, route.getKey(), "GET");
				JsonObject result = singleRoute.getAsJsonObject();
				for(Entry<String, JsonElement> innerResult : result.entrySet()) {		
					String restBaseLowerCase = innerResult.getValue().getAsJsonObject().get("rest_base").getAsString();
					String restBase = restBaseLowerCase.substring(0, 1).toUpperCase() + restBaseLowerCase.substring(1);
					EClass extendedPostType = createDynamicEClass(restBase);
				
					String hierarchical = innerResult.getValue().getAsJsonObject().get("hierarchical").getAsString();
					if (hierarchical.contains("true")) {
					 // Add parent class to the taxonomy.
					}
					//Add heritance relationship with metamodel class class to extended model.
					_dynamicEPackage.getEClassifiers().add(extendedPostType);
					EClass metaModelClassObject = (EClass)_dynamicEPackage.getEClassifier("PostType");
					EClass currentClass = (EClass)_dynamicEPackage.getEClassifier(restBase);
					currentClass.getESuperTypes().add(metaModelClassObject);
				}
			}
			if (route.getKey().replaceFirst("/","").contains("wp/v2/media")) {
			/*
				JsonElement singleRoute = ResourceRequest(Api_Url, route.getKey(), "GET");
				JsonObject result = singleRoute.getAsJsonObject();
				for(Entry<String, JsonElement> innerResult : result.entrySet()) {		
					String restBase = innerResult.getValue().getAsJsonObject().get("rest_base").getAsString();
					// Create EClass derived from taxonomy
					// Then
					JsonElement response = ResourceRequest(Api_Url, "/wp/v2/"+restBase, "GET");
					for(Entry<String, JsonElement> properties : response.getAsJsonObject().entrySet()) {	
						if (properties.getKey().startsWith("media_details")) {
							// Check the media details dinamycalle
						}
						if(properties.getKey().startsWith("acf") ) {
							// camps especialitzats de la taxonomia
							// La taxonomy s'especialitza amb el parent si es jerarquica i amb el ACF.
							// Els meta son un array clau - valor
							// Aqui farem com si no fossin relacions, nomes camps especialitzats, mes endavant tractarem les relacion entre entitats.
						}
					}
				}*/
			}
			
		}
		// Then we can extract the EReferences between taxonomies ans post type.
		for(Map.Entry<String,JsonElement> routeRef : routes.getAsJsonObject().entrySet()) { 
			if (routeRef.getKey().replaceFirst("/","").contains("wp/v2/types")) {
				JsonElement singleRoute = ResourceRequest(Api_Url, routeRef.getKey(), "GET");
				JsonObject result = singleRoute.getAsJsonObject();
				for(Entry<String, JsonElement> innerResult : result.entrySet()) {		

					String restBaseLowerCase = innerResult.getValue().getAsJsonObject().get("rest_base").getAsString();
					String restBase = restBaseLowerCase.substring(0, 1).toUpperCase() + restBaseLowerCase.substring(1);
					EClass parentClass = (EClass)_dynamicEPackage.getEClassifier(restBase);
					
					JsonArray taxonomies = innerResult.getValue().getAsJsonObject().get("taxonomies").getAsJsonArray();
					if (taxonomies.size() >= 1) {
						taxonomies.forEach(taxonomy -> {
							String taxonomyUpper = restBaseLowerCase.substring(0, 1).toUpperCase() + restBaseLowerCase.substring(1);
							// CreateEReference
							// EReference TaxReference = createEReferece(taxonomyUpper, parentClass)
							// parentClass.add(TaxReference);
						});
					}
					JsonElement response = ResourceRequest(Api_Url, "/wp/v2/"+restBase, "GET");
					for(Entry<String, JsonElement> properties : response.getAsJsonObject().entrySet()) {	
						System.out.println("properties");
						if(properties.getKey().startsWith("taxonomies") ) {
							properties.getValue().getAsJsonArray().forEach(taxonomia ->{
								String parent = innerResult.getKey();
								System.out.println(taxonomia);
								// Create EReference from de parent content Type to this Taxonomy.
							});
							// Attach custom fields to the Content Type.
							// Aqui farem com si no fossin relacions, nomes camps especialitzats, mes endavant tractarem les relacion entre entitats.
						}
					}
				}
			}
			if (routeRef.getKey().replaceFirst("/","").contains("wp/v2/taxonomies")) {
				JsonElement singleRoute = ResourceRequest(Api_Url, routeRef.getKey(), "GET");
				JsonObject result = singleRoute.getAsJsonObject();
				for(Entry<String, JsonElement> innerResult : result.entrySet()) {		
					String restBaseLowerCase = innerResult.getValue().getAsJsonObject().get("rest_base").getAsString();
					String restBase = restBaseLowerCase.substring(0, 1).toUpperCase() + restBaseLowerCase.substring(1);
				
					String hierarchical = innerResult.getValue().getAsJsonObject().get("hierarchical").getAsString();
					if (hierarchical.contains("true")) {
						EClass parentClass = (EClass)_dynamicEPackage.getEClassifier(restBase);
						
					 // Create EReference
				     // EReference reference = getDynamicReferences();
					 // parentClass.getEStructuralFeatures().add(reference);
						
					}
					//Add heritance relationship with metamodel class class to extended model.
					
				}
			}
		}		
	}
	
	public JsonElement ResourceRequest(String baseUrl, String singleResource, String method) {
		
		// create a client
		var client = HttpClient.newHttpClient();

			    
		// create a request
		var request = HttpRequest.newBuilder()
			.uri(URI.create(baseUrl + singleResource ))
			.method(method, HttpRequest.BodyPublishers.noBody())
		    .header("accept", "application/json")
		    .header("Authorization", basicAuth("giner.joan", "joangi"))
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
	 * @param title
	 * Create EPackage dynamically
	 */
	public void initDynamicEPackage(JsonElement entry) {
		// Instantiate EPackage and provide unique URI to identify the package
		// instance
		 JsonObject info = entry.getAsJsonObject();
		 String title = info.get("title").getAsString().replaceAll("-", "_").replaceAll(" ", "_");
		 // Package is loaded from metamodel.
		 // _dynamicEPackage = _coreFactory.createEPackage();
		_dynamicEPackage.setName(title);
		_dynamicEPackage.setNsPrefix(title);
		_dynamicEPackage
				.setNsURI("http:///com.somlab.drupal");
	}
	/***
	 * @param title
	 * Create EClass dynamically
	 */
	public EClass createDynamicEClass(String title) {
		EClass dynamicEClass = _coreFactory.createEClass();
		dynamicEClass.setName(title);
		return dynamicEClass;
	}
	/***
	 * @param support
	 * @param EClass Extended Post Type
	 * Create Custom attributes
	 */
	public EClass enableSupports(JsonObject supports, EClass extendedPostType) {
		
		for(Entry<String, JsonElement> support : supports.entrySet()) {
			  switch (support.getKey()) {
			  	case("title"): {
			  	  System.out.println("title");
				  break;
			  	}
				case("editor"): {
				 	  System.out.println("editor");
					  break;
				  	}
				case("author"): {  
				 	  System.out.println("author");
					  break;
				  	}
				case("excerpt"): {	 
				 	  System.out.println("excerpt");
					  break;
				  	}
				case("trackbacks"): {
				 	  System.out.println("trackbacks");
					  break;
				  	}
				case("custom-fields"): {
				 	  System.out.println("custom-fields");
					  break;
				  	}
				case("comments"): {
				 	  System.out.println("comments");	
					  break;
				  	}
				case("revisions"): {
				 	  System.out.println("revisions");
					  break;
				  	}
				case("page-attributes"): {
				 	  System.out.println("page-attributes");
					  break;
				  	}
				case("post-formats"): {

					  break;
				  	}
				}
		}
		return extendedPostType;
	}


}
