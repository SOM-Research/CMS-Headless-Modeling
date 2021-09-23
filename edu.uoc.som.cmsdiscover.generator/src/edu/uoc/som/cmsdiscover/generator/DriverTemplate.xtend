package edu.uoc.som.cmsdiscover.generator

import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.common.util.EMap

class DriverTemplate {

	EMap<String, String> sourceCmsInformation
	EPackage thePackage
	String cmsTechnology

	def generateDriver(EPackage thePackage) {

		this.thePackage = thePackage
		this.sourceCmsInformation = thePackage.EAnnotations.get(0).details
		for (detail : sourceCmsInformation) {
			if(detail.key.contains("cmsTechnology")) this.cmsTechnology = detail.value
		}
		generate()
	}

	def generate() '''
		package generated.middleware.«thePackage.getName()».drivers;
			
			
			import java.io.IOException;
			import java.io.UnsupportedEncodingException;
			import java.net.URI;
			import java.net.http.HttpClient;
			import java.net.http.HttpRequest;
			import java.net.http.HttpResponse;
			import java.net.http.HttpResponse.BodyHandlers;
			import com.google.gson.JsonElement;
			import com.google.gson.JsonParser;
			import java.util.List;
			import java.util.ArrayList;
			import java.util.Map.Entry;
			import java.nio.charset.StandardCharsets;
			import java.net.URLEncoder;
				
			public class «this.cmsTechnology»Driver implements DriverInterface {
				
			// STATIC VALUES
			«FOR Annotation : this.sourceCmsInformation»
				public static final String «Annotation.getKey()» = "«Annotation.getValue»";
			«ENDFOR»
			
			
			«addGetSearchQuery()»
			«addSingleGetter()»
			
			«addCollectionGetter()»
				
			«addDrupalRequester()»
			
			«addDrupalMapAnswer()»
			
			«addDrupalSingleMapAnswer()»

			}
		
	'''
	
	def addGetSearchQuery() '''
	public SearchQuery getSearchQuery() {
		return new SearchQuery();
	}
	'''
	
	def addSingleGetter() '''
	public GenericResource getSingle(String resourceRoute, String Id) {
			JsonElement answer = resourceRequest(resourceRoute+Id,"GET", new SearchQuery());
			GenericResource returnEntity = mapSingleAnswer(answer.getAsJsonObject().get("data"));
			return returnEntity;
		}
	'''
	
	def addCollectionGetter() '''
	public List<GenericResource> getCollection(String resourceRoute, SearchQuery searchQuery) {
		JsonElement answer = resourceRequest(resourceRoute,"GET", searchQuery);
		List<GenericResource> entityCollection = mapAnswer(answer); 
		return entityCollection;
	}
	'''
	
	def addDrupalSingleMapAnswer() '''
	private GenericResource mapSingleAnswer(JsonElement res) {
			// TODO Auto-generated method stub
			GenericResource genericInstance = new GenericResource();
			
			for (Entry<String, JsonElement> element : res.getAsJsonObject().entrySet()) {
				if (element.getKey().contains("relationships")) {
							for (Entry<String, JsonElement> singleRelation : element.getValue().getAsJsonObject().entrySet()) {
								JsonElement relationData = singleRelation.getValue().getAsJsonObject().get("data");
								if (!relationData.isJsonNull()) {
									String entityType = null;
									String entityId = null;
									if (relationData.isJsonObject()) {
										entityType = relationData.getAsJsonObject().get("type").getAsJsonPrimitive().getAsString();
										entityId = relationData.getAsJsonObject().get("id").getAsJsonPrimitive().getAsString();
										if (!(entityType == null)) {
											GenericReference genericReference = new GenericReference();
											genericReference.setName(singleRelation.getKey());
											genericReference.setValue(entityId);
											// Add attribute to instance
											genericInstance.referenceList.add(genericReference);
										}
									} else {
										if(!relationData.getAsJsonArray().isEmpty()) {
											relationData.getAsJsonArray().forEach((singleReference) ->{
												String Type = singleReference.getAsJsonObject().get("type").getAsString();			
												if (!(Type == null)) {
													GenericReference genericReference = new GenericReference();
													genericReference.setName(singleRelation.getKey());
													genericReference.setValue(singleReference.getAsJsonObject().get("id").getAsString());
													// Add attribute to instance
													genericInstance.referenceList.add(genericReference);
												}
												
											});
											
										}
									}
								
								}
							}
						}
				if (element.getKey().contains("id")) {
					String value = element.getValue().toString().replaceAll("\"","");
					if(value != null ){
						// Create the attribute
						GenericAttribute genericAttribute = new GenericAttribute();
						genericAttribute.setName("uuid");
						genericAttribute.setValue(value);
						// Add attribute to instance
						genericInstance.attributesList.add(genericAttribute);
				
					}
					
				} if(element.getKey().contains("attributes")) {
					for( Entry<String, JsonElement> attribute: element.getValue().getAsJsonObject().entrySet()) {
						GenericAttribute genericAttribute = new GenericAttribute();
						genericAttribute.setName(attribute.getKey());
						genericAttribute.setValue(attribute.getValue().toString());
						// Add attribute to instance
						genericInstance.attributesList.add(genericAttribute);
						
					}
					
				}
			}
			
			return genericInstance;
		}
	'''
	
	def addDrupalMapAnswer() '''
	private List<GenericResource> mapAnswer(JsonElement res) {
		// TODO Auto-generated method stub
		GenericResource generic = new GenericResource();
		
		List<GenericResource> entityCollection = new ArrayList<GenericResource>();
		res.getAsJsonObject().get("data").getAsJsonArray().forEach((content) -> {
			entityCollection.add(mapSingleAnswer(content));
		});
				
		return entityCollection;
	}
	'''
	

	def addDrupalRequester() '''
		public JsonElement resourceRequest(String resource, String method, SearchQuery searchQuery) {
		
			// create a client
			HttpClient client = HttpClient.newHttpClient();
		
			// create a request
			HttpRequest request = HttpRequest.newBuilder().uri(URI.create(this.cmsUrl + resource +"?"+ searchQuery.filterQuery + searchQuery.paginationQuery + searchQuery.sorterQuery + searchQuery.embedQuery))
				.method(method, HttpRequest.BodyPublishers.noBody()).header("accept", "application/json")
				//.header("Authorization", basicAuth(this.consumerUser, this.consumerPass))
				.build();
		
			// use the client to send the request
			try {
				request.method();
				HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
				if (response.statusCode() == 200) {
					JsonElement res = new JsonParser().parse(response.body());
					return res;
				} else {
					System.out.println("Opps route: " + resource + " has returned status: " + response.statusCode());
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
	'''
}
