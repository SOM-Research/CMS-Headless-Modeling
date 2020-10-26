package com.somlab.cmsmodel.wordpress;

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
		JsonObject wpJson = ResourceRequest(Api_Url, "wp-json");
		for(Entry<String, JsonElement> wpEntry : wpJson.entrySet()) {		
			String key = wpEntry.getKey();
			JsonObject entryValue = wpEntry.getValue().getAsJsonObject();
			
			  switch (key) {
			  	case("name"): {
			  	  // Create package with the title
				  name = entryValue.getAsString();
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
			 	  for(Map.Entry<String,JsonElement> single : entryValue.getAsJsonObject().entrySet()) { 
			 		 String namespace = single.getValue().getAsString();
			 	     namespaces.add(namespace);
			 	  }
				  break;
		  		}
				case("routes"): {
				 	  // Generate the entity model extracting de definitions
				  //generateEntityModel(entryValue);
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
	
	public JsonObject ResourceRequest(String baseUrl, String singleResource) {
		
		// create a client
		var client = HttpClient.newHttpClient();

		// create a request
		var request = HttpRequest.newBuilder(
		       URI.create("https://" + baseUrl.replace("\"", "") + singleResource.replace("\"", "") ))
		   .header("accept", "application/json")
		   .build();

		// use the client to send the request
		try {
			var response = client.send(request, BodyHandlers.ofString());
			JsonObject res = new JsonParser().parse(response.body()).getAsJsonObject();
			return res;

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
