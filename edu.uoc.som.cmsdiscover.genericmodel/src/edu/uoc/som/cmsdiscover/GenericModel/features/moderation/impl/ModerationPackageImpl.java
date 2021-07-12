/**
 */
package edu.uoc.som.cmsdiscover.GenericModel.features.moderation.impl;

import edu.uoc.som.cmsdiscover.GenericModel.GenericModelPackage;

import edu.uoc.som.cmsdiscover.GenericModel.features.moderation.ModerableEntity;
import edu.uoc.som.cmsdiscover.GenericModel.features.moderation.ModerationFactory;
import edu.uoc.som.cmsdiscover.GenericModel.features.moderation.ModerationPackage;
import edu.uoc.som.cmsdiscover.GenericModel.features.moderation.ModerationWorkflow;
import edu.uoc.som.cmsdiscover.GenericModel.features.moderation.State;
import edu.uoc.som.cmsdiscover.GenericModel.features.moderation.Transition;

import edu.uoc.som.cmsdiscover.GenericModel.features.revisions.RevisionsPackage;

import edu.uoc.som.cmsdiscover.GenericModel.features.revisions.impl.RevisionsPackageImpl;

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
public class ModerationPackageImpl extends EPackageImpl implements ModerationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moderationWorkflowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moderableEntityEClass = null;

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
	 * @see edu.uoc.som.cmsdiscover.GenericModel.features.moderation.ModerationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ModerationPackageImpl() {
		super(eNS_URI, ModerationFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ModerationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ModerationPackage init() {
		if (isInited) return (ModerationPackage)EPackage.Registry.INSTANCE.getEPackage(ModerationPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredModerationPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ModerationPackageImpl theModerationPackage = registeredModerationPackage instanceof ModerationPackageImpl ? (ModerationPackageImpl)registeredModerationPackage : new ModerationPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GenericModelPackage.eNS_URI);
		GenericModelPackageImpl theGenericModelPackage = (GenericModelPackageImpl)(registeredPackage instanceof GenericModelPackageImpl ? registeredPackage : GenericModelPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GenericSchemaPackage.eNS_URI);
		GenericSchemaPackageImpl theGenericSchemaPackage = (GenericSchemaPackageImpl)(registeredPackage instanceof GenericSchemaPackageImpl ? registeredPackage : GenericSchemaPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(UserPackage.eNS_URI);
		UserPackageImpl theUserPackage = (UserPackageImpl)(registeredPackage instanceof UserPackageImpl ? registeredPackage : UserPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(RevisionsPackage.eNS_URI);
		RevisionsPackageImpl theRevisionsPackage = (RevisionsPackageImpl)(registeredPackage instanceof RevisionsPackageImpl ? registeredPackage : RevisionsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TranslationsPackage.eNS_URI);
		TranslationsPackageImpl theTranslationsPackage = (TranslationsPackageImpl)(registeredPackage instanceof TranslationsPackageImpl ? registeredPackage : TranslationsPackage.eINSTANCE);

		// Create package meta-data objects
		theModerationPackage.createPackageContents();
		theGenericModelPackage.createPackageContents();
		theGenericSchemaPackage.createPackageContents();
		theUserPackage.createPackageContents();
		theRevisionsPackage.createPackageContents();
		theTranslationsPackage.createPackageContents();

		// Initialize created meta-data
		theModerationPackage.initializePackageContents();
		theGenericModelPackage.initializePackageContents();
		theGenericSchemaPackage.initializePackageContents();
		theUserPackage.initializePackageContents();
		theRevisionsPackage.initializePackageContents();
		theTranslationsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theModerationPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ModerationPackage.eNS_URI, theModerationPackage);
		return theModerationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getState() {
		return stateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getState_Label() {
		return (EAttribute)stateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getState_Code() {
		return (EAttribute)stateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getState_Published() {
		return (EAttribute)stateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransition() {
		return transitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransition_Code() {
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransition_Label() {
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_From() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_To() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Transition_permision() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModerationWorkflow() {
		return moderationWorkflowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModerationWorkflow_Workflow_code() {
		return (EAttribute)moderationWorkflowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModerationWorkflow_Label() {
		return (EAttribute)moderationWorkflowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModerationWorkflow_States() {
		return (EReference)moderationWorkflowEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModerationWorkflow_Transitions() {
		return (EReference)moderationWorkflowEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModerationWorkflow_Default_moderation_state() {
		return (EReference)moderationWorkflowEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModerationWorkflow_Status() {
		return (EAttribute)moderationWorkflowEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModerableEntity() {
		return moderableEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModerationFactory getModerationFactory() {
		return (ModerationFactory)getEFactoryInstance();
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
		stateEClass = createEClass(STATE);
		createEAttribute(stateEClass, STATE__LABEL);
		createEAttribute(stateEClass, STATE__CODE);
		createEAttribute(stateEClass, STATE__PUBLISHED);

		transitionEClass = createEClass(TRANSITION);
		createEAttribute(transitionEClass, TRANSITION__CODE);
		createEAttribute(transitionEClass, TRANSITION__LABEL);
		createEReference(transitionEClass, TRANSITION__FROM);
		createEReference(transitionEClass, TRANSITION__TO);
		createEReference(transitionEClass, TRANSITION__TRANSITION_PERMISION);

		moderationWorkflowEClass = createEClass(MODERATION_WORKFLOW);
		createEAttribute(moderationWorkflowEClass, MODERATION_WORKFLOW__WORKFLOW_CODE);
		createEAttribute(moderationWorkflowEClass, MODERATION_WORKFLOW__LABEL);
		createEReference(moderationWorkflowEClass, MODERATION_WORKFLOW__STATES);
		createEReference(moderationWorkflowEClass, MODERATION_WORKFLOW__TRANSITIONS);
		createEReference(moderationWorkflowEClass, MODERATION_WORKFLOW__DEFAULT_MODERATION_STATE);
		createEAttribute(moderationWorkflowEClass, MODERATION_WORKFLOW__STATUS);

		moderableEntityEClass = createEClass(MODERABLE_ENTITY);
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
		moderableEntityEClass.getESuperTypes().add(theGenericModelPackage.getContentEntity());

		// Initialize classes and features; add operations and parameters
		initEClass(stateEClass, State.class, "State", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getState_Label(), ecorePackage.getEString(), "label", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getState_Code(), ecorePackage.getEString(), "code", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getState_Published(), ecorePackage.getEBoolean(), "published", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransition_Code(), ecorePackage.getEString(), "code", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_Label(), ecorePackage.getEString(), "label", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_From(), this.getState(), null, "from", null, 0, -1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_To(), this.getState(), null, "to", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Transition_permision(), theUserPackage.getPermission(), null, "transition_permision", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moderationWorkflowEClass, ModerationWorkflow.class, "ModerationWorkflow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModerationWorkflow_Workflow_code(), ecorePackage.getEString(), "workflow_code", null, 0, 1, ModerationWorkflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModerationWorkflow_Label(), ecorePackage.getEString(), "label", null, 0, 1, ModerationWorkflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModerationWorkflow_States(), this.getState(), null, "states", null, 0, -1, ModerationWorkflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModerationWorkflow_Transitions(), this.getTransition(), null, "transitions", null, 0, -1, ModerationWorkflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModerationWorkflow_Default_moderation_state(), this.getState(), null, "default_moderation_state", null, 0, 1, ModerationWorkflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModerationWorkflow_Status(), ecorePackage.getEBoolean(), "status", null, 0, 1, ModerationWorkflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moderableEntityEClass, ModerableEntity.class, "ModerableEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //ModerationPackageImpl
