/**
 */
package edu.uoc.som.cmsdiscover.GenericModel.features.moderation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workflow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.features.moderation.ModerationWorkflow#getWorkflow_code <em>Workflow code</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.features.moderation.ModerationWorkflow#getLabel <em>Label</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.features.moderation.ModerationWorkflow#getStates <em>States</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.features.moderation.ModerationWorkflow#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.features.moderation.ModerationWorkflow#getDefault_moderation_state <em>Default moderation state</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.features.moderation.ModerationWorkflow#isStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.cmsdiscover.GenericModel.features.moderation.ModerationPackage#getModerationWorkflow()
 * @model
 * @generated
 */
public interface ModerationWorkflow extends EObject {
	/**
	 * Returns the value of the '<em><b>Workflow code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workflow code</em>' attribute.
	 * @see #setWorkflow_code(String)
	 * @see edu.uoc.som.cmsdiscover.GenericModel.features.moderation.ModerationPackage#getModerationWorkflow_Workflow_code()
	 * @model
	 * @generated
	 */
	String getWorkflow_code();

	/**
	 * Sets the value of the '{@link edu.uoc.som.cmsdiscover.GenericModel.features.moderation.ModerationWorkflow#getWorkflow_code <em>Workflow code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Workflow code</em>' attribute.
	 * @see #getWorkflow_code()
	 * @generated
	 */
	void setWorkflow_code(String value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see edu.uoc.som.cmsdiscover.GenericModel.features.moderation.ModerationPackage#getModerationWorkflow_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link edu.uoc.som.cmsdiscover.GenericModel.features.moderation.ModerationWorkflow#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link edu.uoc.som.cmsdiscover.GenericModel.features.moderation.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.features.moderation.ModerationPackage#getModerationWorkflow_States()
	 * @model containment="true"
	 * @generated
	 */
	EList<State> getStates();

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link edu.uoc.som.cmsdiscover.GenericModel.features.moderation.Transition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.features.moderation.ModerationPackage#getModerationWorkflow_Transitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getTransitions();

	/**
	 * Returns the value of the '<em><b>Default moderation state</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default moderation state</em>' reference.
	 * @see #setDefault_moderation_state(State)
	 * @see edu.uoc.som.cmsdiscover.GenericModel.features.moderation.ModerationPackage#getModerationWorkflow_Default_moderation_state()
	 * @model
	 * @generated
	 */
	State getDefault_moderation_state();

	/**
	 * Sets the value of the '{@link edu.uoc.som.cmsdiscover.GenericModel.features.moderation.ModerationWorkflow#getDefault_moderation_state <em>Default moderation state</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default moderation state</em>' reference.
	 * @see #getDefault_moderation_state()
	 * @generated
	 */
	void setDefault_moderation_state(State value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see #setStatus(boolean)
	 * @see edu.uoc.som.cmsdiscover.GenericModel.features.moderation.ModerationPackage#getModerationWorkflow_Status()
	 * @model
	 * @generated
	 */
	boolean isStatus();

	/**
	 * Sets the value of the '{@link edu.uoc.som.cmsdiscover.GenericModel.features.moderation.ModerationWorkflow#isStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #isStatus()
	 * @generated
	 */
	void setStatus(boolean value);

} // ModerationWorkflow
