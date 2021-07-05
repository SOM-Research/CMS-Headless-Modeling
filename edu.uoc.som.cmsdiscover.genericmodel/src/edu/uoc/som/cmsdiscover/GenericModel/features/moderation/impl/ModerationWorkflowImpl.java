/**
 */
package edu.uoc.som.cmsdiscover.GenericModel.features.moderation.impl;

import edu.uoc.som.cmsdiscover.GenericModel.features.moderation.ModerationPackage;
import edu.uoc.som.cmsdiscover.GenericModel.features.moderation.ModerationWorkflow;
import edu.uoc.som.cmsdiscover.GenericModel.features.moderation.State;
import edu.uoc.som.cmsdiscover.GenericModel.features.moderation.Transition;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Workflow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.features.moderation.impl.ModerationWorkflowImpl#getWorkflow_code <em>Workflow code</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.features.moderation.impl.ModerationWorkflowImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.features.moderation.impl.ModerationWorkflowImpl#getStates <em>States</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.features.moderation.impl.ModerationWorkflowImpl#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.features.moderation.impl.ModerationWorkflowImpl#getDefault_moderation_state <em>Default moderation state</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.features.moderation.impl.ModerationWorkflowImpl#isStatus <em>Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModerationWorkflowImpl extends MinimalEObjectImpl.Container implements ModerationWorkflow {
	/**
	 * The default value of the '{@link #getWorkflow_code() <em>Workflow code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkflow_code()
	 * @generated
	 * @ordered
	 */
	protected static final String WORKFLOW_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWorkflow_code() <em>Workflow code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkflow_code()
	 * @generated
	 * @ordered
	 */
	protected String workflow_code = WORKFLOW_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStates() <em>States</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStates()
	 * @generated
	 * @ordered
	 */
	protected EList<State> states;

	/**
	 * The cached value of the '{@link #getTransitions() <em>Transitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> transitions;

	/**
	 * The cached value of the '{@link #getDefault_moderation_state() <em>Default moderation state</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault_moderation_state()
	 * @generated
	 * @ordered
	 */
	protected State default_moderation_state;

	/**
	 * The default value of the '{@link #isStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStatus()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STATUS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStatus()
	 * @generated
	 * @ordered
	 */
	protected boolean status = STATUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModerationWorkflowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModerationPackage.Literals.MODERATION_WORKFLOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWorkflow_code() {
		return workflow_code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkflow_code(String newWorkflow_code) {
		String oldWorkflow_code = workflow_code;
		workflow_code = newWorkflow_code;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModerationPackage.MODERATION_WORKFLOW__WORKFLOW_CODE, oldWorkflow_code, workflow_code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModerationPackage.MODERATION_WORKFLOW__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStates() {
		if (states == null) {
			states = new EObjectContainmentEList<State>(State.class, this, ModerationPackage.MODERATION_WORKFLOW__STATES);
		}
		return states;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getTransitions() {
		if (transitions == null) {
			transitions = new EObjectContainmentEList<Transition>(Transition.class, this, ModerationPackage.MODERATION_WORKFLOW__TRANSITIONS);
		}
		return transitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getDefault_moderation_state() {
		if (default_moderation_state != null && default_moderation_state.eIsProxy()) {
			InternalEObject oldDefault_moderation_state = (InternalEObject)default_moderation_state;
			default_moderation_state = (State)eResolveProxy(oldDefault_moderation_state);
			if (default_moderation_state != oldDefault_moderation_state) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModerationPackage.MODERATION_WORKFLOW__DEFAULT_MODERATION_STATE, oldDefault_moderation_state, default_moderation_state));
			}
		}
		return default_moderation_state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetDefault_moderation_state() {
		return default_moderation_state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefault_moderation_state(State newDefault_moderation_state) {
		State oldDefault_moderation_state = default_moderation_state;
		default_moderation_state = newDefault_moderation_state;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModerationPackage.MODERATION_WORKFLOW__DEFAULT_MODERATION_STATE, oldDefault_moderation_state, default_moderation_state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(boolean newStatus) {
		boolean oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModerationPackage.MODERATION_WORKFLOW__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModerationPackage.MODERATION_WORKFLOW__STATES:
				return ((InternalEList<?>)getStates()).basicRemove(otherEnd, msgs);
			case ModerationPackage.MODERATION_WORKFLOW__TRANSITIONS:
				return ((InternalEList<?>)getTransitions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModerationPackage.MODERATION_WORKFLOW__WORKFLOW_CODE:
				return getWorkflow_code();
			case ModerationPackage.MODERATION_WORKFLOW__LABEL:
				return getLabel();
			case ModerationPackage.MODERATION_WORKFLOW__STATES:
				return getStates();
			case ModerationPackage.MODERATION_WORKFLOW__TRANSITIONS:
				return getTransitions();
			case ModerationPackage.MODERATION_WORKFLOW__DEFAULT_MODERATION_STATE:
				if (resolve) return getDefault_moderation_state();
				return basicGetDefault_moderation_state();
			case ModerationPackage.MODERATION_WORKFLOW__STATUS:
				return isStatus();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModerationPackage.MODERATION_WORKFLOW__WORKFLOW_CODE:
				setWorkflow_code((String)newValue);
				return;
			case ModerationPackage.MODERATION_WORKFLOW__LABEL:
				setLabel((String)newValue);
				return;
			case ModerationPackage.MODERATION_WORKFLOW__STATES:
				getStates().clear();
				getStates().addAll((Collection<? extends State>)newValue);
				return;
			case ModerationPackage.MODERATION_WORKFLOW__TRANSITIONS:
				getTransitions().clear();
				getTransitions().addAll((Collection<? extends Transition>)newValue);
				return;
			case ModerationPackage.MODERATION_WORKFLOW__DEFAULT_MODERATION_STATE:
				setDefault_moderation_state((State)newValue);
				return;
			case ModerationPackage.MODERATION_WORKFLOW__STATUS:
				setStatus((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ModerationPackage.MODERATION_WORKFLOW__WORKFLOW_CODE:
				setWorkflow_code(WORKFLOW_CODE_EDEFAULT);
				return;
			case ModerationPackage.MODERATION_WORKFLOW__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case ModerationPackage.MODERATION_WORKFLOW__STATES:
				getStates().clear();
				return;
			case ModerationPackage.MODERATION_WORKFLOW__TRANSITIONS:
				getTransitions().clear();
				return;
			case ModerationPackage.MODERATION_WORKFLOW__DEFAULT_MODERATION_STATE:
				setDefault_moderation_state((State)null);
				return;
			case ModerationPackage.MODERATION_WORKFLOW__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModerationPackage.MODERATION_WORKFLOW__WORKFLOW_CODE:
				return WORKFLOW_CODE_EDEFAULT == null ? workflow_code != null : !WORKFLOW_CODE_EDEFAULT.equals(workflow_code);
			case ModerationPackage.MODERATION_WORKFLOW__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case ModerationPackage.MODERATION_WORKFLOW__STATES:
				return states != null && !states.isEmpty();
			case ModerationPackage.MODERATION_WORKFLOW__TRANSITIONS:
				return transitions != null && !transitions.isEmpty();
			case ModerationPackage.MODERATION_WORKFLOW__DEFAULT_MODERATION_STATE:
				return default_moderation_state != null;
			case ModerationPackage.MODERATION_WORKFLOW__STATUS:
				return status != STATUS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (workflow_code: ");
		result.append(workflow_code);
		result.append(", label: ");
		result.append(label);
		result.append(", status: ");
		result.append(status);
		result.append(')');
		return result.toString();
	}

} //ModerationWorkflowImpl
