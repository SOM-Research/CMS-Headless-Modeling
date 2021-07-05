/**
 */
package edu.uoc.som.cmsdiscover.GenericModel.features.translations.impl;

import edu.uoc.som.cmsdiscover.GenericModel.GenericModelPackage;

import edu.uoc.som.cmsdiscover.GenericModel.features.moderation.ModerationPackage;

import edu.uoc.som.cmsdiscover.GenericModel.features.moderation.impl.ModerationPackageImpl;

import edu.uoc.som.cmsdiscover.GenericModel.features.revisions.RevisionsPackage;

import edu.uoc.som.cmsdiscover.GenericModel.features.revisions.impl.RevisionsPackageImpl;

import edu.uoc.som.cmsdiscover.GenericModel.features.translations.Translation;
import edu.uoc.som.cmsdiscover.GenericModel.features.translations.TranslationsFactory;
import edu.uoc.som.cmsdiscover.GenericModel.features.translations.TranslationsPackage;

import edu.uoc.som.cmsdiscover.GenericModel.genericSchema.GenericSchemaPackage;

import edu.uoc.som.cmsdiscover.GenericModel.genericSchema.impl.GenericSchemaPackageImpl;

import edu.uoc.som.cmsdiscover.GenericModel.impl.GenericModelPackageImpl;

import edu.uoc.som.cmsdiscover.GenericModel.user.UserPackage;

import edu.uoc.som.cmsdiscover.GenericModel.user.impl.UserPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TranslationsPackageImpl extends EPackageImpl implements TranslationsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass translationEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see edu.uoc.som.cmsdiscover.GenericModel.features.translations.TranslationsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TranslationsPackageImpl() {
		super(eNS_URI, TranslationsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link TranslationsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TranslationsPackage init() {
		if (isInited) return (TranslationsPackage)EPackage.Registry.INSTANCE.getEPackage(TranslationsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTranslationsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TranslationsPackageImpl theTranslationsPackage = registeredTranslationsPackage instanceof TranslationsPackageImpl ? (TranslationsPackageImpl)registeredTranslationsPackage : new TranslationsPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GenericModelPackage.eNS_URI);
		GenericModelPackageImpl theGenericModelPackage = (GenericModelPackageImpl)(registeredPackage instanceof GenericModelPackageImpl ? registeredPackage : GenericModelPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GenericSchemaPackage.eNS_URI);
		GenericSchemaPackageImpl theGenericSchemaPackage = (GenericSchemaPackageImpl)(registeredPackage instanceof GenericSchemaPackageImpl ? registeredPackage : GenericSchemaPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(UserPackage.eNS_URI);
		UserPackageImpl theUserPackage = (UserPackageImpl)(registeredPackage instanceof UserPackageImpl ? registeredPackage : UserPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ModerationPackage.eNS_URI);
		ModerationPackageImpl theModerationPackage = (ModerationPackageImpl)(registeredPackage instanceof ModerationPackageImpl ? registeredPackage : ModerationPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(RevisionsPackage.eNS_URI);
		RevisionsPackageImpl theRevisionsPackage = (RevisionsPackageImpl)(registeredPackage instanceof RevisionsPackageImpl ? registeredPackage : RevisionsPackage.eINSTANCE);

		// Create package meta-data objects
		theTranslationsPackage.createPackageContents();
		theGenericModelPackage.createPackageContents();
		theGenericSchemaPackage.createPackageContents();
		theUserPackage.createPackageContents();
		theModerationPackage.createPackageContents();
		theRevisionsPackage.createPackageContents();

		// Initialize created meta-data
		theTranslationsPackage.initializePackageContents();
		theGenericModelPackage.initializePackageContents();
		theGenericSchemaPackage.initializePackageContents();
		theUserPackage.initializePackageContents();
		theModerationPackage.initializePackageContents();
		theRevisionsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTranslationsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TranslationsPackage.eNS_URI, theTranslationsPackage);
		return theTranslationsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTranslation() {
		return translationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTranslation_Langcode() {
		return (EAttribute)translationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTranslation_Tcreated() {
		return (EAttribute)translationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TranslationsFactory getTranslationsFactory() {
		return (TranslationsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		translationEClass = createEClass(TRANSLATION);
		createEAttribute(translationEClass, TRANSLATION__LANGCODE);
		createEAttribute(translationEClass, TRANSLATION__TCREATED);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(translationEClass, Translation.class, "Translation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTranslation_Langcode(), ecorePackage.getEString(), "langcode", null, 0, 1, Translation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTranslation_Tcreated(), ecorePackage.getEDate(), "tcreated", null, 0, 1, Translation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //TranslationsPackageImpl
