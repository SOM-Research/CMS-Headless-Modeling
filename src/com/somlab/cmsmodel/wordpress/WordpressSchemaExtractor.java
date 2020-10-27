package com.somlab.cmsmodel.wordpress;

import java.io.Console;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class WordpressSchemaExtractor {

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
			if (route.getKey().replaceFirst("/","").contains("wp/v2/types")) {
				JsonElement singleRoute = ResourceRequest(Api_Url, route.getKey(), "GET");
				JsonObject result = singleRoute.getAsJsonObject();
				for(Entry<String, JsonElement> innerResult : result.entrySet()) {		
					String restBase = innerResult.getValue().getAsJsonObject().get("rest_base").getAsString();
					// ++ Create EClass derived from Post type (or node)
					// Miren quin camps especials te aquesta classe
				    /* TO DO: Veure quins supports te el post type activats els suports possibles son 
						'title'
						'editor' (content)
						'author'
						'thumbnail' (featured image) (current theme must also support Post Thumbnails)
						'excerpt'
						'trackbacks'
						'custom-fields' (see Custom_Fields, aka meta-data)
						'comments' (also will see comment count balloon on edit screen)
						'revisions' (will store revisions)
						'page-attributes' (template and menu order) (hierarchical must be true)
						'post-formats' (see Post_Formats)
					
					*/
					// Miren quins camps especials te aquesta classe del ACF
					JsonElement response = ResourceRequest(Api_Url, "/wp/v2/"+restBase, "GET");
					for(Entry<String, JsonElement> properties : response.getAsJsonObject().entrySet()) {	
						System.out.println("properties");
						if(properties.getKey().startsWith("acf") ) {
							// Attach custom fields to the Content Type.
							// Aqui farem com si no fossin relacions, nomes camps especialitzats, mes endavant tractarem les relacion entre entitats.
						}
					}
				}
			}
			if (route.getKey().replaceFirst("/","").contains("wp/v2/taxonomies")) {
				JsonElement singleRoute = ResourceRequest(Api_Url, route.getKey(), "GET");
				JsonObject result = singleRoute.getAsJsonObject();
				for(Entry<String, JsonElement> innerResult : result.entrySet()) {		
					String restBase = innerResult.getValue().getAsJsonObject().get("rest_base").getAsString();
					// Create EClass derived from taxonomy
					// Then
					JsonElement response = ResourceRequest(Api_Url, "/wp/v2/"+restBase, "GET");
					for(Entry<String, JsonElement> properties : response.getAsJsonObject().entrySet()) {	
						if(properties.getKey().startsWith("acf") ) {
							// camps especialitzats de la taxonomia
							// Aqui farem com si no fossin relacions, nomes camps especialitzats, mes endavant tractarem les relacion entre entitats.
						}
					}
				}
			}
		}
		// Then we can extract the EReferences between taxonomies ans post type.
		for(Map.Entry<String,JsonElement> route : routes.getAsJsonObject().entrySet()) { 
			if (route.getKey().replaceFirst("/","").contains("wp/v2/types")) {
				JsonElement singleRoute = ResourceRequest(Api_Url, route.getKey(), "GET");
				JsonObject result = singleRoute.getAsJsonObject();
				for(Entry<String, JsonElement> innerResult : result.entrySet()) {		
					String restBase = innerResult.getValue().getAsJsonObject().get("rest_base").getAsString();
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

	

}
