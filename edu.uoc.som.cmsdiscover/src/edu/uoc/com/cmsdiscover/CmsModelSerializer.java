package edu.uoc.com.cmsdiscover;

/**
 * This class provides methods to serialize the Ecore-based model and 
 * the model instances.
 * 
 * @author Joan Giner
 */

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Date;

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


public class CmsModelSerializer {
	
	ResourceSet _resourceSet;
	
	public CmsModelSerializer() {
		// Instantiate EcoreFactory and EcorePackage
		_resourceSet = new ResourceSetImpl();
	}
	
	public void serializeModel(EPackage dynamicEPackage, String Path) {

		// Register XML Factory implementation to handle .ecore files
		_resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("ecore", new XMLResourceFactoryImpl());
		// Create empty resource with the given URI
		System.out.println(Path); 
		Resource resource = _resourceSet.createResource(URI
				.createFileURI(Path + ".ecore"));
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
	

	public EPackage loadCmsGenericModel(String techBase) {

		_resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
		_resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());
		System.out.println(URI.createFileURI("./GenericModel/cmsGenericModel"+techBase+".ecore"));
		Resource drupalMetaModel= _resourceSet.getResource(URI.createFileURI("./GenericModel/cmsGenericModel"+techBase+".ecore"), true);
		EPackage ecorePackage = (EPackage) drupalMetaModel.getContents().get(0);


		return ecorePackage;

	}
	
}
