/**
 */
package edu.uoc.som.cmsdiscover.GenericModel.features.translations;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see edu.uoc.som.cmsdiscover.GenericModel.features.translations.TranslationsFactory
 * @model kind="package"
 * @generated
 */
public interface TranslationsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "translations";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "translations";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "translations";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TranslationsPackage eINSTANCE = edu.uoc.som.cmsdiscover.GenericModel.features.translations.impl.TranslationsPackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.uoc.som.cmsdiscover.GenericModel.features.translations.impl.TranslationImpl <em>Translation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.cmsdiscover.GenericModel.features.translations.impl.TranslationImpl
	 * @see edu.uoc.som.cmsdiscover.GenericModel.features.translations.impl.TranslationsPackageImpl#getTranslation()
	 * @generated
	 */
	int TRANSLATION = 0;

	/**
	 * The feature id for the '<em><b>Langcode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATION__LANGCODE = 0;

	/**
	 * The feature id for the '<em><b>Tcreated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATION__TCREATED = 1;

	/**
	 * The number of structural features of the '<em>Translation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATION_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link edu.uoc.som.cmsdiscover.GenericModel.features.translations.Translation <em>Translation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Translation</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.features.translations.Translation
	 * @generated
	 */
	EClass getTranslation();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.cmsdiscover.GenericModel.features.translations.Translation#getLangcode <em>Langcode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Langcode</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.features.translations.Translation#getLangcode()
	 * @see #getTranslation()
	 * @generated
	 */
	EAttribute getTranslation_Langcode();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.cmsdiscover.GenericModel.features.translations.Translation#getTcreated <em>Tcreated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tcreated</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.features.translations.Translation#getTcreated()
	 * @see #getTranslation()
	 * @generated
	 */
	EAttribute getTranslation_Tcreated();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TranslationsFactory getTranslationsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link edu.uoc.som.cmsdiscover.GenericModel.features.translations.impl.TranslationImpl <em>Translation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.cmsdiscover.GenericModel.features.translations.impl.TranslationImpl
		 * @see edu.uoc.som.cmsdiscover.GenericModel.features.translations.impl.TranslationsPackageImpl#getTranslation()
		 * @generated
		 */
		EClass TRANSLATION = eINSTANCE.getTranslation();

		/**
		 * The meta object literal for the '<em><b>Langcode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSLATION__LANGCODE = eINSTANCE.getTranslation_Langcode();

		/**
		 * The meta object literal for the '<em><b>Tcreated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSLATION__TCREATED = eINSTANCE.getTranslation_Tcreated();

	}

} //TranslationsPackage
