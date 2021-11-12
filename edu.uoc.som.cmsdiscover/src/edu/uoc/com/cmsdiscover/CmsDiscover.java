package edu.uoc.com.cmsdiscover;

import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.Plugin;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.osgi.framework.BundleContext;

import edu.uoc.com.cmsdiscover.drupal.DrupalSchemaExtractor;
import edu.uoc.com.cmsdiscover.wordpress.WordpressSchemaExtractor;
import edu.uoc.som.cmsdiscover.GenericModel.GenericModelPackage;

public class CmsDiscover extends Plugin {

	private static CmsDiscover plugin;

	public CmsDiscover() {

	}

	public void start(BundleContext bundleContext) throws Exception {
		super.start(bundleContext);
		plugin = this;
	}

	public void stop(BundleContext bundleContext) throws Exception {
		plugin = null;
		super.stop(bundleContext);
	}

	public static CmsDiscover getDefault() {
		return plugin;
	}

	/***
	 * Load the generic model.
	 */
	public Map<String, List<String>> genericModelHelper(EPackage genericEPackage) {

		Map<String, List<String>> genericModelHelper = new HashMap<String, List<String>>();
		EList<EClassifier> metaClasses = genericEPackage.getEClassifiers();
		// Dive into the packages.
		EList<EPackage> genericPackages = genericEPackage.getESubpackages();
		genericPackages.forEach((singlePackage) -> {
			metaClasses.addAll(singlePackage.getEClassifiers());
		});

		metaClasses.forEach((metaClass) -> {
			if (metaClass != null && metaClass instanceof EClass) {
				List<String> listEFeatures = new ArrayList<String>();
				EList<EStructuralFeature> attributes = ((EClass) metaClass).getEAllStructuralFeatures();
				attributes.forEach((attribute) -> {
					listEFeatures.add(attribute.getName());
				});
				genericModelHelper.put(metaClass.getName(), listEFeatures);
			}
		});
		System.out.println(genericModelHelper);
		return genericModelHelper;
	}

	public void buildExtendModel(URL url, String user, String pass, String JWTToken , String tech, String ModelResultPath) {

		System.out.println(
				"******************* Recieved Values: " + url + " user:" + user + " pass:" + pass + " tech:" + tech);

		// Instance of the own class.
		CmsDiscover theModelingEngine = plugin;
		// Instance of Serialize class.
		CmsModelSerializer theModelSerializer = new CmsModelSerializer();
		// Load Generic CMS model.
		EPackage genericEPackage = GenericModelPackage.eINSTANCE;
		// Helper class of generic model.
		Map<String, List<String>> genericModelHelper = theModelingEngine.genericModelHelper(genericEPackage);

		// Is Drupal based site.
		if (tech.contains("d")) {
			System.out.println("******************* Extracting model from a Drupal based site");
			DrupalSchemaExtractor DrupalExtractor = new DrupalSchemaExtractor(url, user, pass);
			EPackage ExtendedModel = DrupalExtractor.ModelExtractor(genericEPackage, genericModelHelper);
			// Save the model.
			theModelSerializer.serializeModel(ExtendedModel, ModelResultPath);

			// Is Wordpress based site.
		} else if (tech.contains("w")) {
			System.out.println("******************* Extracting model from a Wordpress based site");
			// Change this to your Wordpress URL.
			WordpressSchemaExtractor WordpressExtractor = new WordpressSchemaExtractor(url, user, pass, JWTToken);
			EPackage ExtendedModel = WordpressExtractor.ModelExtractor(genericEPackage, genericModelHelper);
			// Save the model.
			theModelSerializer.serializeModel(ExtendedModel, ModelResultPath);
		}

	}

}
