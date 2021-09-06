package edu.uoc.som.cmsdiscover.generator

import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.common.util.EMap
import org.eclipse.emf.ecore.EReference

class EntityTemplate {
	
	String cmsTechnology
	String modelClassName
	EClass modelClass
	EList<EAttribute> classAttributes
	EList<EReference> classReferences
	EMap<String, String> Annotations
	Iterable<String> modelClasses
	String packageName
	
	new(EClass modelClass, EMap<String, String> Annotations, Iterable<String> modelClasses, String packageName) {
		this.modelClass = modelClass
		this.modelClassName = modelClass.getName()
		this.classAttributes = modelClass.getEAllAttributes()
		this.classReferences = modelClass.getEAllReferences()
		this.Annotations = Annotations
		this.modelClasses = modelClasses
		this.packageName = packageName
	}
	
	
	def generateEntitiesClasses() '''
package «packageName»;


import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import java.util.Map.Entry;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
	
public class «this.modelClassName» {
		
		// STATIC VALUES
		«FOR Annotation : this.Annotations»
		public static final String «Annotation.getKey()» = "«Annotation.getValue»";
		«IF Annotation.getKey() == "cmsTechnology"»
		//	«this.cmsTechnology = Annotation.getValue »
		«ENDIF»
		«ENDFOR»
		
		List<String> attributesList = Arrays.asList(«FOR String attribute : this.classAttributes.map[name] SEPARATOR ","»"«attribute»"«ENDFOR»);
		
		
		// Attributes
		« FOR EAttribute attribute : this.classAttributes»
			«addAttribute(attribute)»
		«ENDFOR»
		
		// Relationships
		« FOR EReference reference : this.classReferences»
			«addReference(reference)»
		«ENDFOR»
		

		// Main Methods
		«addCollectionGetter()»
		«addSingleGetter()»
		
		«addRequester()»
		
		«mapDrupalAnswer()»
		
		«mapWordpressAnswer()»
		
}
	'''
	

	
	def addConstructor(EClass entity) '''
		public «entity.getName()»(params) {
		  // URL
		  // Endpoint
		  // User
		  // Password
		  // Technology type
		}
	'''
	
	def addSingleGetter() '''
	public «this.modelClassName» getSingle(String Id) {
			JsonElement answer = ResourceRequest("/"+Id,"GET");
			«this.modelClassName» return«this.modelClassName» = null;
			if (this.cmsTechnology.contains("Drupal")) {
				return«this.modelClassName» = mapSingleDrupalAnswer(answer); 
			} else {
				//return«this.modelClassName» = mapWordpressAnswer(answer); 
			}
			return return«this.modelClassName»;
		}
	'''
	
	def addCollectionGetter() '''
	public List<«this.modelClassName»> getCollection() {
		JsonElement answer = ResourceRequest("","GET");
		List<«this.modelClassName»> «this.modelClassName»Collection;
		if (this.cmsTechnology.contains("Drupal")) {
			«this.modelClassName»Collection = mapDrupalAnswer(answer); 
		} else {
			«this.modelClassName»Collection = mapWordpressAnswer(answer); 
		}
		return «this.modelClassName»Collection;
	}
	'''
	
	def mapWordpressAnswer() '''
	public List<«this.modelClassName»> mapWordpressAnswer(JsonElement answer) {
		List<«this.modelClassName»> «this.modelClassName»Collection = null;
		return «this.modelClassName»Collection;
	}
	'''
	
	def mapDrupalAnswer() '''
	
	public List<«this.modelClassName»> mapDrupalAnswer(JsonElement answer) {
		
		List<«this.modelClassName»> «this.modelClassName»Collection = new ArrayList<«this.modelClassName»>();
		answer.getAsJsonObject().get("data").getAsJsonArray().forEach((content) -> {
			«this.modelClassName»Collection.add(mapSingleDrupalAnswer(content));
		});
		
		
		return «this.modelClassName»Collection;
		
	}
	
	public «this.modelClassName» mapSingleDrupalAnswer(JsonElement answer) {
		
			«this.modelClassName» returnInstance = new «this.modelClassName»();
	
			for (Entry<String, JsonElement> element : answer.getAsJsonObject().entrySet()) {{
				if (element.getKey().contains("relationships")) {
					for (Entry<String, JsonElement> singleRelation : element.getValue().getAsJsonObject().entrySet()) {
						JsonElement relationData = singleRelation.getValue().getAsJsonObject().get("data");
						String entityType = null;
						String entityId = null;
						if (relationData.isJsonObject()) {
							entityType = relationData.getAsJsonObject().get("type").getAsJsonPrimitive().getAsString();
							entityId = relationData.getAsJsonObject().get("id").getAsJsonPrimitive().getAsString();
						} else {
							if(!relationData.getAsJsonArray().isEmpty()) {
								entityType = relationData.getAsJsonArray().get(0).getAsJsonObject().get("type").getAsString();
								entityId = relationData.getAsJsonArray().get(0).getAsJsonObject().get("id").getAsString();
							}
						}
						if (!(entityType == null)) {
							int index = entityType.indexOf("--");
							String referencedClass = entityType.substring(index + 2).substring(0, 1)
									.toUpperCase() + entityType.substring(index + 2).substring(1);
							« FOR EReference reference: this.classReferences » 
							«IF(this.modelClasses.contains(reference.getEReferenceType().getName())) »
							 if(entityType.equals("«reference.getEReferenceType().getName()»")) {
							«reference.getEReferenceType().getName()» «reference.getName().toString» = new «reference.getEReferenceType().getName()»();
							 returnInstance.«reference.getName().toString» = «reference.getName().toString».getSingle(entityId);
							}
								«ENDIF»
							«ENDFOR»
						}
					}
				}
				if (element.getKey().contains("id")) {
					returnInstance.uuid = element.getValue().toString().replaceAll("\"","");
				}
				if(element.getKey().contains("attributes")) {
					for( Entry<String, JsonElement> attribute: element.getValue().getAsJsonObject().entrySet()) {
						System.out.println(attribute.getKey()+": "+attribute.getValue());
						« FOR EAttribute attribute: this.classAttributes »
							if(attribute.getKey().equals("«attribute.getName()»")) {
							 returnInstance.«attribute.getName()» = attribute.getValue().toString();
							}
						«ENDFOR»
						if(element.getValue().getAsJsonObject().get("drupal_internal__nid") != null) {
							// returnInstance.contentId = element.getValue().getAsJsonObject().get("drupal_internal__nid").getAsJsonObject().get("value").toString();
						}
					}
				}
			}
		}
		return returnInstance;
		
	}
	'''
	
	
	
	def addAttribute(EAttribute attribute) '''
	«««private «attribute.getEAttributeType().getInstanceClass().getName()» «attribute.getName()»;vate «attribute.getEAttributeType().getInstanceClass().getName()» «attribute.getName()»;
	public String «attribute.getName()»;
	'''
	
	def addReference(EReference reference) '''
	«IF(this.modelClasses.contains(reference.getEReferenceType().getName())) »
	public «reference.getEReferenceType().getName()» «reference.getName().toString()»;
	«ENDIF»
	'''
	
	
	def addRequester() '''
	public JsonElement ResourceRequest(String singleResource, String method) {

		// create a client
		HttpClient client = HttpClient.newHttpClient();

		// create a request
		HttpRequest request = HttpRequest.newBuilder().uri(URI.create(this.cmsUrl + this.resourceRoute + singleResource))
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
	'''
		
}
