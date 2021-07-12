/**
 */
package edu.uoc.som.cmsdiscover.GenericModel.user;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Roles</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.user.Roles#getLabel <em>Label</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.user.Roles#getRole_code <em>Role code</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.user.Roles#getPermissions <em>Permissions</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.cmsdiscover.GenericModel.user.UserPackage#getRoles()
 * @model
 * @generated
 */
public interface Roles extends EObject {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see edu.uoc.som.cmsdiscover.GenericModel.user.UserPackage#getRoles_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link edu.uoc.som.cmsdiscover.GenericModel.user.Roles#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Role code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role code</em>' attribute.
	 * @see #setRole_code(String)
	 * @see edu.uoc.som.cmsdiscover.GenericModel.user.UserPackage#getRoles_Role_code()
	 * @model
	 * @generated
	 */
	String getRole_code();

	/**
	 * Sets the value of the '{@link edu.uoc.som.cmsdiscover.GenericModel.user.Roles#getRole_code <em>Role code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role code</em>' attribute.
	 * @see #getRole_code()
	 * @generated
	 */
	void setRole_code(String value);

	/**
	 * Returns the value of the '<em><b>Permissions</b></em>' reference list.
	 * The list contents are of type {@link edu.uoc.som.cmsdiscover.GenericModel.user.Permission}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permissions</em>' reference list.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.user.UserPackage#getRoles_Permissions()
	 * @model
	 * @generated
	 */
	EList<Permission> getPermissions();

} // Roles
