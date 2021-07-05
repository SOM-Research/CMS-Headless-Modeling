/**
 */
package edu.uoc.som.cmsdiscover.GenericModel.user;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Permission</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.user.Permission#getPermission_code <em>Permission code</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.cmsdiscover.GenericModel.user.UserPackage#getPermission()
 * @model
 * @generated
 */
public interface Permission extends EObject {
	/**
	 * Returns the value of the '<em><b>Permission code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permission code</em>' attribute.
	 * @see #setPermission_code(String)
	 * @see edu.uoc.som.cmsdiscover.GenericModel.user.UserPackage#getPermission_Permission_code()
	 * @model
	 * @generated
	 */
	String getPermission_code();

	/**
	 * Sets the value of the '{@link edu.uoc.som.cmsdiscover.GenericModel.user.Permission#getPermission_code <em>Permission code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Permission code</em>' attribute.
	 * @see #getPermission_code()
	 * @generated
	 */
	void setPermission_code(String value);

} // Permission
