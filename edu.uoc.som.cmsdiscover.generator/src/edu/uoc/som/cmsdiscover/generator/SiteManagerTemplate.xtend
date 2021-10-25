package edu.uoc.som.cmsdiscover.generator

import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.common.util.EMap
import org.eclipse.emf.ecore.EPackage

class SiteManagerTemplate {
	
	
	String cmsTechnology
	EMap<String, String> Annotations
	Iterable<String> modelClasses
	String packageName
	
	Iterable<String> fieldClassesName
	
	EPackage eFieldPackage
	
	Iterable<EClass> eClasses
	
	new(EPackage thePackage, Iterable<EClass> eClasses) {

		this.Annotations = thePackage.EAnnotations.get(0).details
		this.eClasses = eClasses
		this.packageName = thePackage.getName();
		for (Annotation : this.Annotations) {
			if (Annotation.getKey().contains("cmsTechnology")) this.cmsTechnology = Annotation.getValue();
		}
	}
	
	def generateClass() 
	'''
	package generated.middleware.«this.packageName»;
	
	import com.google.gson.JsonParser;
	import java.util.List;
	import java.util.ArrayList;
	import generated.middleware.«packageName».drivers.SearchQuery;
	import generated.middleware.«packageName».drivers.SearchQueryInterface.ImmutableSearchQuery;
	import generated.middleware.«packageName».drivers.DriverInterface;
	import generated.middleware.«packageName».drivers.GenericResource;
	«IF this.cmsTechnology.contains("Drupal")»
	import generated.middleware.«packageName».drivers.DrupalDriver;
	«ELSEIF this.cmsTechnology.contains("Wordpress")»
	import generated.middleware.«packageName».drivers.WordpressDriver;
	«ENDIF»
	
	public class «this.packageName.substring(0,10)» {
	
		
		// STATIC VALUES
		«FOR Annotation : this.Annotations»
			public static final String «Annotation.getKey()» = "«Annotation.getValue»";
		«ENDFOR»
		
		private DriverInterface driver;
		
		public «this.packageName.substring(0,10)» (){
			driver = DrupalDriver.getInstance(this.cmsUrl, this.consumerUser, this.consumerPass);
		}
		
		public SearchQuery getSearchQuery() {
			return driver.getSearchQuery();
		}
		
		// Attributes
		« FOR EClass modelClass : this.eClasses»
		«addClassFetcher(modelClass)»
		«ENDFOR»
	
	
	}
	'''
	
	def addClassFetcher(EClass modelClass) '''
		public «modelClass.getName» get«modelClass.getName»ById(String Id){
			GenericResource answer = driver.getSingle("«modelClass.EAnnotations.get(0).details.get("resourceRoute")»", Id);
			«modelClass.getName» entity = new «modelClass.getName»(driver);
			entity.mapSingleAnswer(answer);
			return entity;
		}
		
		public List<«modelClass.getName»> search«modelClass.getName»(ImmutableSearchQuery searchQuery){
			List<GenericResource> answer = driver.getCollection("«modelClass.EAnnotations.get(0).details.get("resourceRoute")»", searchQuery);
			List<«modelClass.getName»> entityCollection = new ArrayList<«modelClass.getName»>();
			answer.forEach((singleAnswer) -> {
				«modelClass.getName» entity = new «modelClass.getName»(driver);
				entity.mapSingleAnswer(singleAnswer);
				entityCollection.add(entity);
			});
			return entityCollection;
		}
	'''
	
}