/**
 */
package edu.uoc.som.cmsdiscover.GenericModel.features.translations.impl;

import edu.uoc.som.cmsdiscover.GenericModel.features.translations.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TranslationsFactoryImpl extends EFactoryImpl implements TranslationsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TranslationsFactory init() {
		try {
			TranslationsFactory theTranslationsFactory = (TranslationsFactory)EPackage.Registry.INSTANCE.getEFactory(TranslationsPackage.eNS_URI);
			if (theTranslationsFactory != null) {
				return theTranslationsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TranslationsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TranslationsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TranslationsPackage.TRANSLATION: return createTranslation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Translation createTranslation() {
		TranslationImpl translation = new TranslationImpl();
		return translation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TranslationsPackage getTranslationsPackage() {
		return (TranslationsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TranslationsPackage getPackage() {
		return TranslationsPackage.eINSTANCE;
	}

} //TranslationsFactoryImpl
