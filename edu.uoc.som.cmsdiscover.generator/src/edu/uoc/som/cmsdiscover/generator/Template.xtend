package edu.uoc.som.cmsdiscover.generator

import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.common.util.EMap

class Template {
	def generateEntitiesClasses(EClass modelClass, EMap<String, String> Annotations, EList<EClass> superClasses) '''
	package org.middleware.generator;

	import org.eclipse.emf.ecore.EClass;
	import org.eclipse.emf.ecore.EAttribute;
	
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
	import org.eclipse.emf.ecore.EObject;
	import org.eclipse.emf.ecore.EInt;
	import org.eclipse.emf.ecore.EBoolean;
	import org.eclipse.emf.ecore.EString;
	
	import com.google.gson.JsonArray;
	import com.google.gson.JsonElement;
	import com.google.gson.JsonObject;
	import com.google.gson.JsonParser;
	
	public class �modelClass.getName()� extends � IF !superClasses.isEmpty()�� superClasses.get(0).getName()� �ENDIF�{
		
		// STATIC VALUES
		�FOR Annotation : Annotations�
		public static final String �Annotation.getKey()� = "�Annotation.getValue�"
		�ENDFOR�
		
		// Attributes
		� FOR EAttribute attribute : modelClass.getEAllAttributes()�
			�addAttribute(attribute)�
		�ENDFOR�
		
		// Constructor
		 �������addConstructor(modelClass)�
		
		// Getters & Setters
		� FOR EAttribute attribute : modelClass.getEAllAttributes()�
		�ENDFOR�
		// Main Methods
		������addSingleGetter(modelClass)�
		�addCollectionGetter()�
		�addRequester()�

	}
	'''
	
	def addConstructor(EClass entity) '''
		public �entity.getName()�(params) {
		  // URL
		  // Endpoint
		  // User
		  // Password
		  // Technology type
		}
	'''

	
	def addGetter(EAttribute attribute) '''
		public Entity get�attribute.getEAttributeType().getName()� () {
			return this.�attribute.getEAttributeType().getName()�;
		}
	'''
	def addSetter(EAttribute attribute) '''
		public Entity get�attribute.getEAttributeType().getName()� (String �attribute.getEAttributeType().getName()� ) {
			this.�attribute.getEAttributeType().getName()� = �attribute.getEAttributeType().getName()� 
		}
	'''
	
	def addSingleGetter(EClass modelClass) '''
		public �modelClass.getName()� get�modelClass.getName()�(String entityID) {
			// request (URL, Resource + name)
			JsonElement answer = ResourceRequest(this.endpoint, "GET")
			// map()
			return List<Entity>
		}
	'''
	
	def addCollectionGetter() '''
	public List<Entity> getCollection() {
		JsonElement answer = ResourceRequest("","GET");
		System.out.println(answer);
		// request (URL, Resource + name)
		// For answer : aswers
		// map()
		return List<Entity>
	}
	'''
	
	def addAttribute(EAttribute attribute) '''
		private �attribute.getEAttributeType().getName()� �attribute.getName()� ;
	'''
	
	def addRequester() '''
	public JsonElement ResourceRequest(String singleResource, String method) {

		// create a client
		var client = HttpClient.newHttpClient();

		// create a request
		var request = HttpRequest.newBuilder().uri(URI.create(this.cmsUrl + this.resourceRoute + singleResource))
				.method(method, HttpRequest.BodyPublishers.noBody()).header("accept", "application/json")
				//.header("Authorization", basicAuth(this.consumerUser, this.consumerPass))
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
	'''
		
}