/**
 */
package edu.uoc.som.cmsdiscover.GenericModel.user.impl;

import edu.uoc.som.cmsdiscover.GenericModel.user.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UserFactoryImpl extends EFactoryImpl implements UserFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UserFactory init() {
		try {
			UserFactory theUserFactory = (UserFactory)EPackage.Registry.INSTANCE.getEFactory(UserPackage.eNS_URI);
			if (theUserFactory != null) {
				return theUserFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UserFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case UserPackage.USER: return createUser();
			case UserPackage.ROLES: return createRoles();
			case UserPackage.PERMISSION: return createPermission();
			case UserPackage.CONTACT_FORM: return createContactForm();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User createUser() {
		UserImpl user = new UserImpl();
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Roles createRoles() {
		RolesImpl roles = new RolesImpl();
		return roles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Permission createPermission() {
		PermissionImpl permission = new PermissionImpl();
		return permission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactForm createContactForm() {
		ContactFormImpl contactForm = new ContactFormImpl();
		return contactForm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserPackage getUserPackage() {
		return (UserPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UserPackage getPackage() {
		return UserPackage.eINSTANCE;
	}

} //UserFactoryImpl
