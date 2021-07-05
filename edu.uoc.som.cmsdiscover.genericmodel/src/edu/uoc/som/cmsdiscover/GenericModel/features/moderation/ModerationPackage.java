/**
 */
package edu.uoc.som.cmsdiscover.GenericModel.features.moderation;

import edu.uoc.som.cmsdiscover.GenericModel.GenericModelPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see edu.uoc.som.cmsdiscover.GenericModel.features.moderation.ModerationFactory
 * @model kind="package"
 * @generated
 */
public interface ModerationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "moderation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://workflowmodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "moderation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModerationPackage eINSTANCE = edu.uoc.som.cmsdiscover.GenericModel.features.moderation.impl.ModerationPackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.uoc.som.cmsdiscover.GenericModel.features.moderation.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.cmsdiscover.GenericModel.features.moderation.impl.StateImpl
	 * @see edu.uoc.som.cmsdiscover.GenericModel.features.moderation.impl.ModerationPackageImpl#getState()
	 * @generated
	 */
	int STATE = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Published</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__PUBLISHED = 2;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link edu.uoc.som.cmsdiscover.GenericModel.features.moderation.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.cmsdiscover.GenericModel.features.moderation.impl.TransitionImpl
	 * @see edu.uoc.som.cmsdiscover.GenericModel.features.moderation.impl.ModerationPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 1;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__CODE = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__LABEL = 1;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__FROM = 2;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TO = 3;

	/**
	 * The feature id for the '<em><b>Transition permision</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TRANSITION_PERMISION = 4;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link edu.uoc.som.cmsdiscover.GenericModel.features.moderation.impl.ModerationWorkflowImpl <em>Workflow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.cmsdiscover.GenericModel.features.moderation.impl.ModerationWorkflowImpl
	 * @see edu.uoc.som.cmsdiscover.GenericModel.features.moderation.impl.ModerationPackageImpl#getModerationWorkflow()
	 * @generated
	 */
	int MODERATION_WORKFLOW = 2;

	/**
	 * The feature id for the '<em><b>Workflow code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODERATION_WORKFLOW__WORKFLOW_CODE = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODERATION_WORKFLOW__LABEL = 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODERATION_WORKFLOW__STATES = 2;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODERATION_WORKFLOW__TRANSITIONS = 3;

	/**
	 * The feature id for the '<em><b>Default moderation state</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODERATION_WORKFLOW__DEFAULT_MODERATION_STATE = 4;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODERATION_WORKFLOW__STATUS = 5;

	/**
	 * The number of structural features of the '<em>Workflow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODERATION_WORKFLOW_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link edu.uoc.som.cmsdiscover.GenericModel.features.moderation.impl.ModerableEntityImpl <em>Moderable Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.cmsdiscover.GenericModel.features.moderation.impl.ModerableEntityImpl
	 * @see edu.uoc.som.cmsdiscover.GenericModel.features.moderation.impl.ModerationPackageImpl#getModerableEntity()
	 * @generated
	 */
	int MODERABLE_ENTITY = 3;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODERABLE_ENTITY__UUID = GenericModelPackage.CONTENT_ENTITY__UUID;

	/**
	 * The number of structural features of the '<em>Moderable Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODERABLE_ENTITY_FEATURE_COUNT = GenericModelPackage.CONTENT_ENTITY_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link edu.uoc.som.cmsdiscover.GenericModel.features.moderation.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.features.moderation.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.cmsdiscover.GenericModel.features.moderation.State#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.features.moderation.State#getLabel()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Label();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.cmsdiscover.GenericModel.features.moderation.State#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.features.moderation.State#getCode()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Code();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.cmsdiscover.GenericModel.features.moderation.State#isPublished <em>Published</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Published</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.features.moderation.State#isPublished()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Published();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.cmsdiscover.GenericModel.features.moderation.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.features.moderation.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.cmsdiscover.GenericModel.features.moderation.Transition#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.features.moderation.Transition#getCode()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Code();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.cmsdiscover.GenericModel.features.moderation.Transition#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.features.moderation.Transition#getLabel()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Label();

	/**
	 * Returns the meta object for the reference list '{@link edu.uoc.som.cmsdiscover.GenericModel.features.moderation.Transition#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>From</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.features.moderation.Transition#getFrom()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_From();

	/**
	 * Returns the meta object for the reference '{@link edu.uoc.som.cmsdiscover.GenericModel.features.moderation.Transition#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.features.moderation.Transition#getTo()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_To();

	/**
	 * Returns the meta object for the reference '{@link edu.uoc.som.cmsdiscover.GenericModel.features.moderation.Transition#getTransition_permision <em>Transition permision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transition permision</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.features.moderation.Transition#getTransition_permision()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Transition_permision();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.cmsdiscover.GenericModel.features.moderation.ModerationWorkflow <em>Workflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.features.moderation.ModerationWorkflow
	 * @generated
	 */
	EClass getModerationWorkflow();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.cmsdiscover.GenericModel.features.moderation.ModerationWorkflow#getWorkflow_code <em>Workflow code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Workflow code</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.features.moderation.ModerationWorkflow#getWorkflow_code()
	 * @see #getModerationWorkflow()
	 * @generated
	 */
	EAttribute getModerationWorkflow_Workflow_code();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.cmsdiscover.GenericModel.features.moderation.ModerationWorkflow#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.features.moderation.ModerationWorkflow#getLabel()
	 * @see #getModerationWorkflow()
	 * @generated
	 */
	EAttribute getModerationWorkflow_Label();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.uoc.som.cmsdiscover.GenericModel.features.moderation.ModerationWorkflow#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.features.moderation.ModerationWorkflow#getStates()
	 * @see #getModerationWorkflow()
	 * @generated
	 */
	EReference getModerationWorkflow_States();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.uoc.som.cmsdiscover.GenericModel.features.moderation.ModerationWorkflow#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.features.moderation.ModerationWorkflow#getTransitions()
	 * @see #getModerationWorkflow()
	 * @generated
	 */
	EReference getModerationWorkflow_Transitions();

	/**
	 * Returns the meta object for the reference '{@link edu.uoc.som.cmsdiscover.GenericModel.features.moderation.ModerationWorkflow#getDefault_moderation_state <em>Default moderation state</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Default moderation state</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.features.moderation.ModerationWorkflow#getDefault_moderation_state()
	 * @see #getModerationWorkflow()
	 * @generated
	 */
	EReference getModerationWorkflow_Default_moderation_state();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.cmsdiscover.GenericModel.features.moderation.ModerationWorkflow#isStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.features.moderation.ModerationWorkflow#isStatus()
	 * @see #getModerationWorkflow()
	 * @generated
	 */
	EAttribute getModerationWorkflow_Status();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.cmsdiscover.GenericModel.features.moderation.ModerableEntity <em>Moderable Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Moderable Entity</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.features.moderation.ModerableEntity
	 * @generated
	 */
	EClass getModerableEntity();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModerationFactory getModerationFactory();

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
		 * The meta object literal for the '{@link edu.uoc.som.cmsdiscover.GenericModel.features.moderation.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.cmsdiscover.GenericModel.features.moderation.impl.StateImpl
		 * @see edu.uoc.som.cmsdiscover.GenericModel.features.moderation.impl.ModerationPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__LABEL = eINSTANCE.getState_Label();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__CODE = eINSTANCE.getState_Code();

		/**
		 * The meta object literal for the '<em><b>Published</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__PUBLISHED = eINSTANCE.getState_Published();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.cmsdiscover.GenericModel.features.moderation.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.cmsdiscover.GenericModel.features.moderation.impl.TransitionImpl
		 * @see edu.uoc.som.cmsdiscover.GenericModel.features.moderation.impl.ModerationPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__CODE = eINSTANCE.getTransition_Code();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__LABEL = eINSTANCE.getTransition_Label();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__FROM = eINSTANCE.getTransition_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TO = eINSTANCE.getTransition_To();

		/**
		 * The meta object literal for the '<em><b>Transition permision</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TRANSITION_PERMISION = eINSTANCE.getTransition_Transition_permision();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.cmsdiscover.GenericModel.features.moderation.impl.ModerationWorkflowImpl <em>Workflow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.cmsdiscover.GenericModel.features.moderation.impl.ModerationWorkflowImpl
		 * @see edu.uoc.som.cmsdiscover.GenericModel.features.moderation.impl.ModerationPackageImpl#getModerationWorkflow()
		 * @generated
		 */
		EClass MODERATION_WORKFLOW = eINSTANCE.getModerationWorkflow();

		/**
		 * The meta object literal for the '<em><b>Workflow code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODERATION_WORKFLOW__WORKFLOW_CODE = eINSTANCE.getModerationWorkflow_Workflow_code();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODERATION_WORKFLOW__LABEL = eINSTANCE.getModerationWorkflow_Label();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODERATION_WORKFLOW__STATES = eINSTANCE.getModerationWorkflow_States();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODERATION_WORKFLOW__TRANSITIONS = eINSTANCE.getModerationWorkflow_Transitions();

		/**
		 * The meta object literal for the '<em><b>Default moderation state</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODERATION_WORKFLOW__DEFAULT_MODERATION_STATE = eINSTANCE.getModerationWorkflow_Default_moderation_state();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODERATION_WORKFLOW__STATUS = eINSTANCE.getModerationWorkflow_Status();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.cmsdiscover.GenericModel.features.moderation.impl.ModerableEntityImpl <em>Moderable Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.cmsdiscover.GenericModel.features.moderation.impl.ModerableEntityImpl
		 * @see edu.uoc.som.cmsdiscover.GenericModel.features.moderation.impl.ModerationPackageImpl#getModerableEntity()
		 * @generated
		 */
		EClass MODERABLE_ENTITY = eINSTANCE.getModerableEntity();

	}

} //ModerationPackage
