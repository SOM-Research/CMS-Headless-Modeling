package com.somlab.cmsmodel;

/**
 * This class provides methods to serialize the Ecore-based model and 
 * the model instance.
 * 
 * @author Joan Giner
 */

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;

import workflowMetamodel.root;

public class CmsModelSerializer {
	
	ResourceSet _resourceSet;
	
	public CmsModelSerializer() {
		// Instantiate EcoreFactory and EcorePackage
		_resourceSet = new ResourceSetImpl();


	}
	
	public void serializeModel(EPackage dynamicEPackage) {

		// Register XML Factory implementation to handle .ecore files
		_resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("ecore", new XMLResourceFactoryImpl());
		
		// Create empty resource with the given URI
		Resource resource = _resourceSet.createResource(URI
				.createURI("./model/extendedModel.ecore"));
		 System.out.println("Created resource"); 

		// Add bookStoreEPackage to contents list of the resource
		resource.getContents().add(dynamicEPackage);

		try {
			// Save the resource
			resource.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void serializeWorkflowModel(root WorkflowEPackage) {

		// Register XML Factory implementation to handle .ecore files
		_resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("workflowmetamodel", new XMLResourceFactoryImpl());
		
		// Create empty resource with the given URI
		Resource resource = _resourceSet.createResource(URI
				.createURI("./model/workflowsmeta.ecore"));
		 System.out.println("Created resource"); 

		// Add bookStoreEPackage to contents list of the resource
		resource.getContents().add(WorkflowEPackage);

		try {
			// Save the resource
			resource.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/***
	 * Load the Drupal  Metamodel.
	 * Metamodel extracted from BaseFieldDefinitions of Drupal Core. Doc:
	 * Nodes: https://api.drupal.org/api/drupal/core%21modules%21node%21src%21Entity%21Node.php/function/Node%3A%3AbaseFieldDefinitions/8.2.x
	 * User: https://api.drupal.org/api/drupal/core%21modules%21user%21src%21Entity%21User.php/function/User%3A%3AbaseFieldDefinitions/8.2.x
	 * Taxonomy: https://api.drupal.org/api/drupal/core%21modules%21taxonomy%21src%21Entity%21Term.php/function/Term%3A%3AbaseFieldDefinitions/8.2.x
	 * File: https://api.drupal.org/api/drupal/core%21modules%21file%21src%21Entity%21File.php/function/File%3A%3AbaseFieldDefinitions/8.2.x
	 * Media: https://api.drupal.org/api/drupal/core%21modules%21media%21src%21Entity%21Media.php/function/Media%3A%3AbaseFieldDefinitions/8.5.x
	 */
	public EPackage loadCmsGenericModel() {

		_resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
		_resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());
		
		Resource drupalMetaModel= _resourceSet.getResource(URI.createFileURI("./model/cmsGenericModel.ecore"), true);
		EPackage ecorePackage = (EPackage) drupalMetaModel.getContents().get(0);


		return ecorePackage;

	}
	

}
