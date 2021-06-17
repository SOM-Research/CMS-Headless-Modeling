package edu.uoc.com.cmsdiscover;

import java.net.URL;

import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class CmsDiscover extends Plugin {

	private static CmsDiscover INSTANCE;


	public void start(BundleContext bundleContext) throws Exception {
		
		
	}
		

	public void stop(BundleContext bundleContext) throws Exception {
		
	}
	
	public static CmsDiscover getDefault() {
		return INSTANCE;
	}
	
	public void buildExtendModel(URL url, String user, String pass, String tech) {
		
		System.out.println("******************* Recieved Values: " + url + " user:" + user + " pass:" + pass + " tech:" + tech);
		
	}


}
