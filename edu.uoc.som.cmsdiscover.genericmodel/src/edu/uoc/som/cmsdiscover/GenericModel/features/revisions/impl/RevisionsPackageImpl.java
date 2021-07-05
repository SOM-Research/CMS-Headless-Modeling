/**
 */
package edu.uoc.som.cmsdiscover.GenericModel.features.revisions.impl;

import edu.uoc.som.cmsdiscover.GenericModel.GenericModelPackage;

import edu.uoc.som.cmsdiscover.GenericModel.features.moderation.ModerationPackage;

import edu.uoc.som.cmsdiscover.GenericModel.features.moderation.impl.ModerationPackageImpl;

import edu.uoc.som.cmsdiscover.GenericModel.features.revisions.Revision;
import edu.uoc.som.cmsdiscover.GenericModel.features.revisions.RevisionableEntity;
import edu.uoc.som.cmsdiscover.GenericModel.features.revisions.RevisionsFactory;
import edu.uoc.som.cmsdiscover.GenericModel.features.revisions.RevisionsPackage;

import edu.uoc.som.cmsdiscover.GenericModel.features.translations.TranslationsPackage;

import edu.uoc.som.cmsdiscover.GenericModel.features.translations.impl.TranslationsPackageImpl;

import edu.uoc.som.cmsdiscover.GenericModel.genericSchema.GenericSchemaPackage;

import edu.uoc.som.cmsdiscover.GenericModel.genericSchema.impl.GenericSchemaPackageImpl;

import edu.uoc.som.cmsdiscover.GenericModel.impl.GenericModelPackageImpl;

import edu.uoc.som.cmsdiscover.GenericModel.user.UserPackage;

import edu.uoc.som.cmsdiscover.GenericModel.user.impl.UserPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RevisionsPackageImpl extends EPackageImpl implements RevisionsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass revisionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass revisionableEntityEClass = null;

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
	 * @see edu.uoc.som.cmsdiscover.GenericModel.features.revisions.RevisionsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RevisionsPackageImpl() {
		super(eNS_URI, RevisionsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RevisionsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RevisionsPackage init() {
		if (isInited) return (RevisionsPackage)EPackage.Registry.INSTANCE.getEPackage(RevisionsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredRevisionsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		RevisionsPackageImpl theRevisionsPackage = registeredRevisionsPackage instanceof RevisionsPackageImpl ? (RevisionsPackageImpl)registeredRevisionsPackage : new RevisionsPackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TranslationsPackage.eNS_URI);
		TranslationsPackageImpl theTranslationsPackage = (TranslationsPackageImpl)(registeredPackage instanceof TranslationsPackageImpl ? registeredPackage : TranslationsPackage.eINSTANCE);

		// Create package meta-data objects
		theRevisionsPackage.createPackageContents();
		theGenericModelPackage.createPackageContents();
		theGenericSchemaPackage.createPackageContents();
		theUserPackage.createPackageContents();
		theModerationPackage.createPackageContents();
		theTranslationsPackage.createPackageContents();

		// Initialize created meta-data
		theRevisionsPackage.initializePackageContents();
		theGenericModelPackage.initializePackageContents();
		theGenericSchemaPackage.initializePackageContents();
		theUserPackage.initializePackageContents();
		theModerationPackage.initializePackageContents();
		theTranslationsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRevisionsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RevisionsPackage.eNS_URI, theRevisionsPackage);
		return theRevisionsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRevision() {
		return revisionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRevision_Vid() {
		return (EAttribute)revisionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRevision_Revision_uid() {
		return (EReference)revisionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRevision_Revision_timestamp() {
		return (EAttribute)revisionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRevision_Revision_log() {
		return (EAttribute)revisionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRevisionableEntity() {
		return revisionableEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRevisionableEntity_Revisions() {
		return (EReference)revisionableEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRevisionableEntity_DefaultRevision() {
		return (EReference)revisionableEntityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RevisionsFactory getRevisionsFactory() {
		return (RevisionsFactory)getEFactoryInstance();
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
		revisionEClass = createEClass(REVISION);
		createEAttribute(revisionEClass, REVISION__VID);
		createEReference(revisionEClass, REVISION__REVISION_UID);
		createEAttribute(revisionEClass, REVISION__REVISION_TIMESTAMP);
		createEAttribute(revisionEClass, REVISION__REVISION_LOG);

		revisionableEntityEClass = createEClass(REVISIONABLE_ENTITY);
		createEReference(revisionableEntityEClass, REVISIONABLE_ENTITY__REVISIONS);
		createEReference(revisionableEntityEClass, REVISIONABLE_ENTITY__DEFAULT_REVISION);
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
		UserPackage theUserPackage = (UserPackage)EPackage.Registry.INSTANCE.getEPackage(UserPackage.eNS_URI);
		GenericModelPackage theGenericModelPackage = (GenericModelPackage)EPackage.Registry.INSTANCE.getEPackage(GenericModelPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		revisionableEntityEClass.getESuperTypes().add(theGenericModelPackage.getContentEntity());

		// Initialize classes and features; add operations and parameters
		initEClass(revisionEClass, Revision.class, "Revision", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRevision_Vid(), ecorePackage.getEInt(), "vid", null, 0, 1, Revision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRevision_Revision_uid(), theUserPackage.getUser(), null, "revision_uid", null, 0, 1, Revision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRevision_Revision_timestamp(), ecorePackage.getEDate(), "revision_timestamp", null, 0, 1, Revision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRevision_Revision_log(), ecorePackage.getEString(), "revision_log", null, 0, 1, Revision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(revisionableEntityEClass, RevisionableEntity.class, "RevisionableEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRevisionableEntity_Revisions(), this.getRevision(), null, "revisions", null, 1, -1, RevisionableEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRevisionableEntity_DefaultRevision(), this.getRevision(), null, "defaultRevision", null, 0, 1, RevisionableEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //RevisionsPackageImpl
