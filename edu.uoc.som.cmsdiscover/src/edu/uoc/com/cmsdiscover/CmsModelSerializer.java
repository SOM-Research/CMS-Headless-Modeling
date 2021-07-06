package edu.uoc.com.cmsdiscover;

/**
 * This class provides methods to serialize the generated model
 * 
 * @author Joan Giner
 */

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

public class CmsModelSerializer {

	ResourceSet _resourceSet;

	public CmsModelSerializer() {
		// Instantiate EcoreFactory and EcorePackage
		_resourceSet = new ResourceSetImpl();
	}

	public void serializeModel(EPackage dynamicEPackage, String Path) {

		// Create empty resource with the given URI
		Resource resource = _resourceSet.createResource(URI.createFileURI(Path + ".ecore"));
		System.out.println("Created resource");
		resource.getContents().add(dynamicEPackage);

		try {
			// Save the resource
			resource.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
