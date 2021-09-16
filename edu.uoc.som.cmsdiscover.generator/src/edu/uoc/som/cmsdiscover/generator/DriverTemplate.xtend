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
				
			public class «this.cmsTechnology»Driver implements DriverInterface {
				
			// STATIC VALUES
			«FOR Annotation : this.sourceCmsInformation»
				public static final String «Annotation.getKey()» = "«Annotation.getValue»";
			«ENDFOR»
			
			// FilterRequest
			String filterQuery = "";
			// SortingRequest
			String sorterQuery = "";
			// EmbeddingRequest
			String embedQuery = "";
			// Pagination
			String paginationQuery = "";
			
			«addSingleGetter()»
			
			«addCollectionGetter()»
			
			«IF this.cmsTechnology.contains("Drupal")»
			«addDrupalFilterBuilder()»
			
			«addDrupalSorterBuilder()»
			
			«addDrupalEmbedding()»
			
			«addDrupalPagination()»
			
			«addDrupalSessionManager()»
				
			«addDrupalRequester()»
			
			«addDrupalMapAnswer()»
			
			«addDrupalSingleMapAnswer()»

			«ENDIF»
			«IF this.cmsTechnology.contains("Wordpress")»
			«addWordpressFilterBuilder()»
				
			«addWordpressSorterBuilder()»
				
			«addWordpressEmbedding()»
				
			«addWordpressSessionManager()»
					
			«addWordpressRequester()»
			«ENDIF»
			}
		
	'''
	
	def addSingleGetter() '''
	public GenericEntity getSingle(String resourceRoute, String Id) {
			JsonElement answer = resourceRequest(resourceRoute+"/"+Id,"GET");
			GenericEntity returnEntity = mapSingleAnswer(answer.getAsJsonObject().get("data"));
			return returnEntity;
		}
	'''
	
	def addCollectionGetter() '''
	public List<GenericEntity> getCollection(String resourceRoute) {
		JsonElement answer = resourceRequest(resourceRoute,"GET");
		List<GenericEntity> entityCollection = mapAnswer(answer); 
		return entityCollection;
	}
	'''
	
	def addDrupalSingleMapAnswer() '''
	private GenericEntity mapSingleAnswer(JsonElement res) {
			// TODO Auto-generated method stub
			GenericEntity genericInstance = new GenericEntity();
			
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
					if(value != null && value.matches("[0-9.]+")){
						// Create the attribute
						GenericAttribute genericAttribute = new GenericAttribute();
						genericAttribute.setName(element.getKey());
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
	private List<GenericEntity> mapAnswer(JsonElement res) {
		// TODO Auto-generated method stub
		GenericEntity generic = new GenericEntity();
		
		List<GenericEntity> entityCollection = new ArrayList<GenericEntity>();
		res.getAsJsonObject().get("data").getAsJsonArray().forEach((content) -> {
			entityCollection.add(mapSingleAnswer(content));
		});
				
		return entityCollection;
	}
	'''
	

	
	def addWordpressRequester() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	def addWordpressSessionManager() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	def addWordpressEmbedding() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	def addWordpressSorterBuilder() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	def addWordpressFilterBuilder() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	def addDrupalPagination() { '''
		public void addPagination(int pageOffset, int pageLimit) {
			if ((pageOffset != 0) && (pageLimit != 0)) this.paginationQuery = "&page[offset]="+pageOffset+"&page[limit]="+pageLimit;
			if (pageOffset != 0) this.paginationQuery = "&page[offset]="+pageOffset;
			if (pageLimit != 0) this.paginationQuery = "&page[limit]="+pageLimit;
		}
	'''
	}
	def addDrupalSessionManager() '''
		@Override
		public void manageConsumer(String user, String password) {
			// TODO Auto-generated method stub
			
		}
	'''

	def addDrupalEmbedding() '''
		public void addEmbedReference(String referenceName) {
			this.embedQuery = "&include="+referenceName;
		}
	'''

	def addDrupalSorterBuilder() '''
		public void addSorter(String fieldName, String sortType) {
			if(sortType.contains("ASC")) {
				this.sorterQuery = "&sort="+fieldName;
			}
			else {
				this.sorterQuery = "&sort=-"+fieldName;
			}
		}
	'''

	def addDrupalFilterBuilder() '''
		public void addFilter(String fieldName, String value) {
			this.filterQuery = this.filterQuery + "&filter["+fieldName+"]="+value;
		}
	'''

	def addDrupalRequester() '''
		public JsonElement resourceRequest(String resource, String method) {
		
			// create a client
			HttpClient client = HttpClient.newHttpClient();
		
			// create a request
			HttpRequest request = HttpRequest.newBuilder().uri(URI.create(this.cmsUrl + resource + this.filterQuery + this.paginationQuery + this.sorterQuery + this.embedQuery))
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
