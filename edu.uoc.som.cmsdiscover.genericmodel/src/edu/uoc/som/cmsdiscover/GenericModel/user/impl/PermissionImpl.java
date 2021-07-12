/**
 */
package edu.uoc.som.cmsdiscover.GenericModel.user.impl;

import edu.uoc.som.cmsdiscover.GenericModel.user.Permission;
import edu.uoc.som.cmsdiscover.GenericModel.user.UserPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Permission</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.user.impl.PermissionImpl#getPermission_code <em>Permission code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PermissionImpl extends MinimalEObjectImpl.Container implements Permission {
	/**
	 * The default value of the '{@link #getPermission_code() <em>Permission code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermission_code()
	 * @generated
	 * @ordered
	 */
	protected static final String PERMISSION_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPermission_code() <em>Permission code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermission_code()
	 * @generated
	 * @ordered
	 */
	protected String permission_code = PERMISSION_CODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PermissionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UserPackage.Literals.PERMISSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPermission_code() {
		return permission_code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPermission_code(String newPermission_code) {
		String oldPermission_code = permission_code;
		permission_code = newPermission_code;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UserPackage.PERMISSION__PERMISSION_CODE, oldPermission_code, permission_code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UserPackage.PERMISSION__PERMISSION_CODE:
				return getPermission_code();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UserPackage.PERMISSION__PERMISSION_CODE:
				setPermission_code((String)newValue);
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
			case UserPackage.PERMISSION__PERMISSION_CODE:
				setPermission_code(PERMISSION_CODE_EDEFAULT);
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
			case UserPackage.PERMISSION__PERMISSION_CODE:
				return PERMISSION_CODE_EDEFAULT == null ? permission_code != null : !PERMISSION_CODE_EDEFAULT.equals(permission_code);
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
		result.append(" (permission_code: ");
		result.append(permission_code);
		result.append(')');
		return result.toString();
	}

} //PermissionImpl
