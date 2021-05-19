package com.somlab.cmsmodel;

/**
 * This class provides methods for building Dynamically Drupal Modeled API based on OpenApi Documentation
 * 
 */

import java.util.Map;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import com.somlab.cmsmodel.drupal.DrupalSchemaExtractor;
import com.somlab.cmsmodel.wordpress.*;



public class CmsModelingEngine {

	EcoreFactory _coreFactory;
	EcorePackage _corePackage;
	EPackage _dynamicEPackage;
	
	public CmsModelingEngine() {
		// Instantiate EcoreFactory and EcorePackage
		_coreFactory = EcoreFactory.eINSTANCE;
		_corePackage = EcorePackage.eINSTANCE;
	}
	
	/***
	 * Load the generic model.
	 */
	public Map<String, List<String>> loadCmsGenericModel(EPackage genericEPackage) {
		 
		 Map<String, List<String>> genericModelHelper = new HashMap<String, List<String>>();
		 EList<EClassifier> metaClasses = genericEPackage.getEClassifiers();
		 metaClasses.forEach((metaClass) ->  { 
			 if (metaClass != null && metaClass instanceof EClass) {
				List<String> listEFeatures = new ArrayList<String>();
				EList<EStructuralFeature> attributes = ((EClass) metaClass).getEAllStructuralFeatures();
				attributes.forEach((attribute) -> {
					listEFeatures.add(attribute.getName());
			    });
				genericModelHelper.put(metaClass.getName(),listEFeatures);			
			}
		 } );
		 System.out.println(genericModelHelper);
		return genericModelHelper;
	}
	
	public static void main(String[] args) {
		
		// Set your Drupal openAPi specification path (in JSON) or your WordPress API URL.
		String WordpressUrl = "http://localhost:80/wordpress/wp-json";
		String DrupalspecificactionPath = "./OpenApiSpecifications/drupalExample.json";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Which type of CMS is: Wordpress(type: w) or Drupal(type: d)?");
		String cmsType = sc.nextLine();
		// Instance of the own class.
		CmsModelingEngine theModelingEngine = new CmsModelingEngine();
		// Instance of Serializer class.
		CmsModelSerializer theModelSerializer = new CmsModelSerializer();
		
		// Is Drupal based site.
		if (cmsType.contains("d")) {
			System.out.println("******************* Extracting model from a Drupal based site");
			// Load Generic CMS model.
			EPackage genericEPackage = theModelSerializer.loadCmsGenericModel("Drupal");
			Map<String, List<String>> genericModelHelper = theModelingEngine.loadCmsGenericModel(genericEPackage);
			// Change this to your Drupal OpenAPI specification.
			DrupalSchemaExtractor DrupalExtractor = new DrupalSchemaExtractor(DrupalspecificactionPath);
			EPackage ExtendedModel = DrupalExtractor.ModelExtractor(genericEPackage, genericModelHelper);
			// Serialize model to .ecore
			theModelSerializer.serializeModel(ExtendedModel);
		
		// Is Wordpress based site.
		} else if (cmsType.contains("w")) {
			// Load Generic CMS model.
			EPackage genericEPackage = theModelSerializer.loadCmsGenericModel("Wordpress");
			Map<String, List<String>> genericModelHelper = theModelingEngine.loadCmsGenericModel(genericEPackage);
			System.out.println("******************* Extracting model from a Wordpress based site");
			// Change this to your Wordpress URL.
			WordpressSchemaExtractor WordpressExtractor = new WordpressSchemaExtractor(WordpressUrl);
			EPackage ExtendedModel = WordpressExtractor.ModelExtractor(genericEPackage, genericModelHelper);
			// Serialize model to .ecore
			theModelSerializer.serializeModel(ExtendedModel);
		}

	}

}
