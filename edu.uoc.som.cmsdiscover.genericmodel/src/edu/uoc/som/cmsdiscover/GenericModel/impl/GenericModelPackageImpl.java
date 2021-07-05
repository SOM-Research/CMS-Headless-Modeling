/**
 */
package edu.uoc.som.cmsdiscover.GenericModel.impl;

import edu.uoc.som.cmsdiscover.GenericModel.ContentEntity;
import edu.uoc.som.cmsdiscover.GenericModel.GenericModelFactory;
import edu.uoc.som.cmsdiscover.GenericModel.GenericModelPackage;

import edu.uoc.som.cmsdiscover.GenericModel.features.moderation.ModerationPackage;

import edu.uoc.som.cmsdiscover.GenericModel.features.moderation.impl.ModerationPackageImpl;

import edu.uoc.som.cmsdiscover.GenericModel.features.revisions.RevisionsPackage;

import edu.uoc.som.cmsdiscover.GenericModel.features.revisions.impl.RevisionsPackageImpl;

import edu.uoc.som.cmsdiscover.GenericModel.features.translations.TranslationsPackage;

import edu.uoc.som.cmsdiscover.GenericModel.features.translations.impl.TranslationsPackageImpl;

import edu.uoc.som.cmsdiscover.GenericModel.genericSchema.GenericSchemaPackage;

import edu.uoc.som.cmsdiscover.GenericModel.genericSchema.impl.GenericSchemaPackageImpl;

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
public class GenericModelPackageImpl extends EPackageImpl implements GenericModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contentEntityEClass = null;

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
	 * @see edu.uoc.som.cmsdiscover.GenericModel.GenericModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GenericModelPackageImpl() {
		super(eNS_URI, GenericModelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link GenericModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GenericModelPackage init() {
		if (isInited) return (GenericModelPackage)EPackage.Registry.INSTANCE.getEPackage(GenericModelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredGenericModelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		GenericModelPackageImpl theGenericModelPackage = registeredGenericModelPackage instanceof GenericModelPackageImpl ? (GenericModelPackageImpl)registeredGenericModelPackage : new GenericModelPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GenericSchemaPackage.eNS_URI);
		GenericSchemaPackageImpl theGenericSchemaPackage = (GenericSchemaPackageImpl)(registeredPackage instanceof GenericSchemaPackageImpl ? registeredPackage : GenericSchemaPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(UserPackage.eNS_URI);
		UserPackageImpl theUserPackage = (UserPackageImpl)(registeredPackage instanceof UserPackageImpl ? registeredPackage : UserPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ModerationPackage.eNS_URI);
		ModerationPackageImpl theModerationPackage = (ModerationPackageImpl)(registeredPackage instanceof ModerationPackageImpl ? registeredPackage : ModerationPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(RevisionsPackage.eNS_URI);
		RevisionsPackageImpl theRevisionsPackage = (RevisionsPackageImpl)(registeredPackage instanceof RevisionsPackageImpl ? registeredPackage : RevisionsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TranslationsPackage.eNS_URI);
		TranslationsPackageImpl theTranslationsPackage = (TranslationsPackageImpl)(registeredPackage instanceof TranslationsPackageImpl ? registeredPackage : TranslationsPackage.eINSTANCE);

		// Create package meta-data objects
		theGenericModelPackage.createPackageContents();
		theGenericSchemaPackage.createPackageContents();
		theUserPackage.createPackageContents();
		theModerationPackage.createPackageContents();
		theRevisionsPackage.createPackageContents();
		theTranslationsPackage.createPackageContents();

		// Initialize created meta-data
		theGenericModelPackage.initializePackageContents();
		theGenericSchemaPackage.initializePackageContents();
		theUserPackage.initializePackageContents();
		theModerationPackage.initializePackageContents();
		theRevisionsPackage.initializePackageContents();
		theTranslationsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGenericModelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GenericModelPackage.eNS_URI, theGenericModelPackage);
		return theGenericModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContentEntity() {
		return contentEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContentEntity_Uuid() {
		return (EAttribute)contentEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericModelFactory getGenericModelFactory() {
		return (GenericModelFactory)getEFactoryInstance();
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
		contentEntityEClass = createEClass(CONTENT_ENTITY);
		createEAttribute(contentEntityEClass, CONTENT_ENTITY__UUID);
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

		// Obtain other dependent packages
		GenericSchemaPackage theGenericSchemaPackage = (GenericSchemaPackage)EPackage.Registry.INSTANCE.getEPackage(GenericSchemaPackage.eNS_URI);
		UserPackage theUserPackage = (UserPackage)EPackage.Registry.INSTANCE.getEPackage(UserPackage.eNS_URI);
		ModerationPackage theModerationPackage = (ModerationPackage)EPackage.Registry.INSTANCE.getEPackage(ModerationPackage.eNS_URI);
		RevisionsPackage theRevisionsPackage = (RevisionsPackage)EPackage.Registry.INSTANCE.getEPackage(RevisionsPackage.eNS_URI);
		TranslationsPackage theTranslationsPackage = (TranslationsPackage)EPackage.Registry.INSTANCE.getEPackage(TranslationsPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theGenericSchemaPackage);
		getESubpackages().add(theUserPackage);
		getESubpackages().add(theModerationPackage);
		getESubpackages().add(theRevisionsPackage);
		getESubpackages().add(theTranslationsPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(contentEntityEClass, ContentEntity.class, "ContentEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContentEntity_Uuid(), ecorePackage.getEInt(), "uuid", null, 0, 1, ContentEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //GenericModelPackageImpl
