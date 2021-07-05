/**
 */
package edu.uoc.som.cmsdiscover.GenericModel.features.moderation.impl;

import edu.uoc.som.cmsdiscover.GenericModel.features.moderation.ModerationPackage;
import edu.uoc.som.cmsdiscover.GenericModel.features.moderation.State;
import edu.uoc.som.cmsdiscover.GenericModel.features.moderation.Transition;

import edu.uoc.som.cmsdiscover.GenericModel.user.Permission;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.features.moderation.impl.TransitionImpl#getCode <em>Code</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.features.moderation.impl.TransitionImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.features.moderation.impl.TransitionImpl#getFrom <em>From</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.features.moderation.impl.TransitionImpl#getTo <em>To</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.features.moderation.impl.TransitionImpl#getTransition_permision <em>Transition permision</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionImpl extends MinimalEObjectImpl.Container implements Transition {
	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected String code = CODE_EDEFAULT;

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
	 * The cached value of the '{@link #getFrom() <em>From</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected EList<State> from;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected State to;

	/**
	 * The cached value of the '{@link #getTransition_permision() <em>Transition permision</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransition_permision()
	 * @generated
	 * @ordered
	 */
	protected Permission transition_permision;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModerationPackage.Literals.TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(String newCode) {
		String oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModerationPackage.TRANSITION__CODE, oldCode, code));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModerationPackage.TRANSITION__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getFrom() {
		if (from == null) {
			from = new EObjectResolvingEList<State>(State.class, this, ModerationPackage.TRANSITION__FROM);
		}
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getTo() {
		if (to != null && to.eIsProxy()) {
			InternalEObject oldTo = (InternalEObject)to;
			to = (State)eResolveProxy(oldTo);
			if (to != oldTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModerationPackage.TRANSITION__TO, oldTo, to));
			}
		}
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(State newTo) {
		State oldTo = to;
		to = newTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModerationPackage.TRANSITION__TO, oldTo, to));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Permission getTransition_permision() {
		if (transition_permision != null && transition_permision.eIsProxy()) {
			InternalEObject oldTransition_permision = (InternalEObject)transition_permision;
			transition_permision = (Permission)eResolveProxy(oldTransition_permision);
			if (transition_permision != oldTransition_permision) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModerationPackage.TRANSITION__TRANSITION_PERMISION, oldTransition_permision, transition_permision));
			}
		}
		return transition_permision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Permission basicGetTransition_permision() {
		return transition_permision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransition_permision(Permission newTransition_permision) {
		Permission oldTransition_permision = transition_permision;
		transition_permision = newTransition_permision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModerationPackage.TRANSITION__TRANSITION_PERMISION, oldTransition_permision, transition_permision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModerationPackage.TRANSITION__CODE:
				return getCode();
			case ModerationPackage.TRANSITION__LABEL:
				return getLabel();
			case ModerationPackage.TRANSITION__FROM:
				return getFrom();
			case ModerationPackage.TRANSITION__TO:
				if (resolve) return getTo();
				return basicGetTo();
			case ModerationPackage.TRANSITION__TRANSITION_PERMISION:
				if (resolve) return getTransition_permision();
				return basicGetTransition_permision();
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
			case ModerationPackage.TRANSITION__CODE:
				setCode((String)newValue);
				return;
			case ModerationPackage.TRANSITION__LABEL:
				setLabel((String)newValue);
				return;
			case ModerationPackage.TRANSITION__FROM:
				getFrom().clear();
				getFrom().addAll((Collection<? extends State>)newValue);
				return;
			case ModerationPackage.TRANSITION__TO:
				setTo((State)newValue);
				return;
			case ModerationPackage.TRANSITION__TRANSITION_PERMISION:
				setTransition_permision((Permission)newValue);
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
			case ModerationPackage.TRANSITION__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case ModerationPackage.TRANSITION__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case ModerationPackage.TRANSITION__FROM:
				getFrom().clear();
				return;
			case ModerationPackage.TRANSITION__TO:
				setTo((State)null);
				return;
			case ModerationPackage.TRANSITION__TRANSITION_PERMISION:
				setTransition_permision((Permission)null);
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
			case ModerationPackage.TRANSITION__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case ModerationPackage.TRANSITION__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case ModerationPackage.TRANSITION__FROM:
				return from != null && !from.isEmpty();
			case ModerationPackage.TRANSITION__TO:
				return to != null;
			case ModerationPackage.TRANSITION__TRANSITION_PERMISION:
				return transition_permision != null;
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
		result.append(" (code: ");
		result.append(code);
		result.append(", label: ");
		result.append(label);
		result.append(')');
		return result.toString();
	}

} //TransitionImpl
