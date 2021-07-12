/**
 */
package edu.uoc.som.cmsdiscover.GenericModel.user.impl;

import edu.uoc.som.cmsdiscover.GenericModel.user.Permission;
import edu.uoc.som.cmsdiscover.GenericModel.user.Roles;
import edu.uoc.som.cmsdiscover.GenericModel.user.UserPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Roles</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.user.impl.RolesImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.user.impl.RolesImpl#getRole_code <em>Role code</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.user.impl.RolesImpl#getPermissions <em>Permissions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RolesImpl extends MinimalEObjectImpl.Container implements Roles {
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
	 * The default value of the '{@link #getRole_code() <em>Role code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole_code()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRole_code() <em>Role code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole_code()
	 * @generated
	 * @ordered
	 */
	protected String role_code = ROLE_CODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPermissions() <em>Permissions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermissions()
	 * @generated
	 * @ordered
	 */
	protected EList<Permission> permissions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RolesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UserPackage.Literals.ROLES;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UserPackage.ROLES__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRole_code() {
		return role_code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole_code(String newRole_code) {
		String oldRole_code = role_code;
		role_code = newRole_code;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UserPackage.ROLES__ROLE_CODE, oldRole_code, role_code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Permission> getPermissions() {
		if (permissions == null) {
			permissions = new EObjectResolvingEList<Permission>(Permission.class, this, UserPackage.ROLES__PERMISSIONS);
		}
		return permissions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UserPackage.ROLES__LABEL:
				return getLabel();
			case UserPackage.ROLES__ROLE_CODE:
				return getRole_code();
			case UserPackage.ROLES__PERMISSIONS:
				return getPermissions();
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
			case UserPackage.ROLES__LABEL:
				setLabel((String)newValue);
				return;
			case UserPackage.ROLES__ROLE_CODE:
				setRole_code((String)newValue);
				return;
			case UserPackage.ROLES__PERMISSIONS:
				getPermissions().clear();
				getPermissions().addAll((Collection<? extends Permission>)newValue);
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
			case UserPackage.ROLES__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case UserPackage.ROLES__ROLE_CODE:
				setRole_code(ROLE_CODE_EDEFAULT);
				return;
			case UserPackage.ROLES__PERMISSIONS:
				getPermissions().clear();
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
			case UserPackage.ROLES__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case UserPackage.ROLES__ROLE_CODE:
				return ROLE_CODE_EDEFAULT == null ? role_code != null : !ROLE_CODE_EDEFAULT.equals(role_code);
			case UserPackage.ROLES__PERMISSIONS:
				return permissions != null && !permissions.isEmpty();
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
		result.append(" (label: ");
		result.append(label);
		result.append(", role_code: ");
		result.append(role_code);
		result.append(')');
		return result.toString();
	}

} //RolesImpl
