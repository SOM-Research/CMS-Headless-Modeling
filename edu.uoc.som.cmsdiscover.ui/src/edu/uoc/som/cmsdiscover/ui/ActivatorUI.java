package edu.uoc.som.cmsdiscover.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class ActivatorUI extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "edu.uoc.som.cmsdiscover.ui"; //$NON-NLS-1$

	// The shared instance
	private static ActivatorUI plugin;
	
	/**
	 * The constructor
	 */
	public ActivatorUI() {
	}

	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static ActivatorUI getDefault() {
		return plugin;
	}

}
