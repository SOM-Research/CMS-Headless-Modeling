/**
 */
package edu.uoc.som.cmsdiscover.GenericModel.user;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see edu.uoc.som.cmsdiscover.GenericModel.user.UserPackage
 * @generated
 */
public interface UserFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UserFactory eINSTANCE = edu.uoc.som.cmsdiscover.GenericModel.user.impl.UserFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>User</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User</em>'.
	 * @generated
	 */
	User createUser();

	/**
	 * Returns a new object of class '<em>Roles</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Roles</em>'.
	 * @generated
	 */
	Roles createRoles();

	/**
	 * Returns a new object of class '<em>Permission</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Permission</em>'.
	 * @generated
	 */
	Permission createPermission();

	/**
	 * Returns a new object of class '<em>Contact Form</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contact Form</em>'.
	 * @generated
	 */
	ContactForm createContactForm();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	UserPackage getUserPackage();

} //UserFactory
