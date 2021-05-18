package com.somlab.cmsmodel;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * This class provides methods for building Dynamically Drupal Modeled API based on OpenApi Documentation
 * 
 */

import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import com.somlab.cmsmodel.drupal.DrupalSchemaExtractor;
import com.somlab.cmsmodel.drupal.DrupalWorkflowExtractor;

import com.somlab.cmsmodel.wordpress.*;

import workflowMetamodel.WorkflowMetamodelPackage;
import workflowMetamodel.WorkflowMetamodelFactory;
import workflowMetamodel.root;




public class CmsModelingEngine {

	EcoreFactory _coreFactory;
	EcorePackage _corePackage;
	EPackage _dynamicEPackage;
	WorkflowMetamodelPackage _MetamodelPackage;
	
	public CmsModelingEngine() {
		// Instantiate EcoreFactory and EcorePackage
		_coreFactory = EcoreFactory.eINSTANCE;
		_corePackage = EcorePackage.eINSTANCE;
	}
	
	/***
	 * Load the Drupal  Metamodel.
	 */
	public Map<String, List<String>> loadCmsGenericModel(EPackage genericEPackage) {
		 
		 Map<String, List<String>> genericModelHelper = new HashMap<String, List<String>>();
		 
		 
		 //EList<EPackage> packages = genericEPackage.getESubpackages();
		 //packages.forEach((pack) -> {
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
		// });
		return genericModelHelper;
	}
	
	public root workflowsExtractor(){
		// Instance of workflowExtracgor class.
		
		//DrupalWorkflowExtractor workflowExtractor = new DrupalWorkflowExtractor();
		//root workflowsPackage = workflowExtractor.getWorkflows(host, basePath, resource_paths);
		//return  workflowsPackage;
		return null;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Which type of CMS is: Wordpress(type: w) or Drupal(type: d)?");
		String cmsType = sc.nextLine();
		// Instance of the own class.
		CmsModelingEngine theModelingEngine = new CmsModelingEngine();
		// Instance of Serializer class.
		CmsModelSerializer theModelSerializer = new CmsModelSerializer();


		
		if (cmsType.contains("d")) {
		// Is Drupal based site:
			System.out.println("******************* Extracting model from a Drupal based site");
			// Load Generic CMS model.
			EPackage genericEPackage = theModelSerializer.loadCmsGenericModel("Drupal");
			Map<String, List<String>> genericModelHelper = theModelingEngine.loadCmsGenericModel(genericEPackage);
			// Change this to your Drupal OpenAPI specification.
			String specificactionPath = "./OpenApiSpecifications/drupalExample.json";
			DrupalSchemaExtractor DrupalExtractor = new DrupalSchemaExtractor(specificactionPath);
			EPackage ExtendedModel = DrupalExtractor.ModelExtractor(genericEPackage, genericModelHelper);
			// Serialize model to .ecore
			theModelSerializer.serializeModel(ExtendedModel);
		} else if (cmsType.contains("w")) {
			// Load Generic CMS model.
			EPackage genericEPackage = theModelSerializer.loadCmsGenericModel("Wordpress");
			Map<String, List<String>> genericModelHelper = theModelingEngine.loadCmsGenericModel(genericEPackage);
			// Is Wordpress based site:
			System.out.println("******************* Extracting model from a Wordpress based site");
			// Change this to your Wordpress URL.
			String Url = "http://localhost:80/wordpress/wp-json";
			WordpressSchemaExtractor WordpressExtractor = new WordpressSchemaExtractor(Url);
			EPackage ExtendedModel = WordpressExtractor.ModelExtractor(genericEPackage, genericModelHelper);
			// Serialize model to .ecore
			theModelSerializer.serializeModel(ExtendedModel);
		}
		//System.out.println("******************* Extracting workflow content paths of the site");
		// Instance of the own class.
		// Calling the model generator.
		// root metamodelPackage = theModelingEngine.workflowsExtractor();
		// System.out.println("******************* Creating Workflow resource");
		// theModelSerializer.serializeWorkflowModel(metamodelPackage);

	}

}
