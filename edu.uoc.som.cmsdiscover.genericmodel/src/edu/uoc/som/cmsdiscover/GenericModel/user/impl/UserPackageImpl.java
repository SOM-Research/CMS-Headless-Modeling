/**
 */
package edu.uoc.som.cmsdiscover.GenericModel.user.impl;

import edu.uoc.som.cmsdiscover.GenericModel.GenericModelPackage;

import edu.uoc.som.cmsdiscover.GenericModel.features.moderation.ModerationPackage;

import edu.uoc.som.cmsdiscover.GenericModel.features.moderation.impl.ModerationPackageImpl;

import edu.uoc.som.cmsdiscover.GenericModel.features.revisions.RevisionsPackage;

import edu.uoc.som.cmsdiscover.GenericModel.features.revisions.impl.RevisionsPackageImpl;

import edu.uoc.som.cmsdiscover.GenericModel.features.translations.TranslationsPackage;

import edu.uoc.som.cmsdiscover.GenericModel.features.translations.impl.TranslationsPackageImpl;

import edu.uoc.som.cmsdiscover.GenericModel.genericSchema.GenericSchemaPackage;

import edu.uoc.som.cmsdiscover.GenericModel.genericSchema.impl.GenericSchemaPackageImpl;

import edu.uoc.som.cmsdiscover.GenericModel.impl.GenericModelPackageImpl;

import edu.uoc.som.cmsdiscover.GenericModel.user.ContactForm;
import edu.uoc.som.cmsdiscover.GenericModel.user.Permission;
import edu.uoc.som.cmsdiscover.GenericModel.user.Roles;
import edu.uoc.som.cmsdiscover.GenericModel.user.User;
import edu.uoc.som.cmsdiscover.GenericModel.user.UserFactory;
import edu.uoc.som.cmsdiscover.GenericModel.user.UserPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UserPackageImpl extends EPackageImpl implements UserPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rolesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass permissionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contactFormEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see edu.uoc.som.cmsdiscover.GenericModel.user.UserPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UserPackageImpl() {
		super(eNS_URI, UserFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link UserPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UserPackage init() {
		if (isInited) return (UserPackage)EPackage.Registry.INSTANCE.getEPackage(UserPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredUserPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		UserPackageImpl theUserPackage = registeredUserPackage instanceof UserPackageImpl ? (UserPackageImpl)registeredUserPackage : new UserPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GenericModelPackage.eNS_URI);
		GenericModelPackageImpl theGenericModelPackage = (GenericModelPackageImpl)(registeredPackage instanceof GenericModelPackageImpl ? registeredPackage : GenericModelPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GenericSchemaPackage.eNS_URI);
		GenericSchemaPackageImpl theGenericSchemaPackage = (GenericSchemaPackageImpl)(registeredPackage instanceof GenericSchemaPackageImpl ? registeredPackage : GenericSchemaPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ModerationPackage.eNS_URI);
		ModerationPackageImpl theModerationPackage = (ModerationPackageImpl)(registeredPackage instanceof ModerationPackageImpl ? registeredPackage : ModerationPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(RevisionsPackage.eNS_URI);
		RevisionsPackageImpl theRevisionsPackage = (RevisionsPackageImpl)(registeredPackage instanceof RevisionsPackageImpl ? registeredPackage : RevisionsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TranslationsPackage.eNS_URI);
		TranslationsPackageImpl theTranslationsPackage = (TranslationsPackageImpl)(registeredPackage instanceof TranslationsPackageImpl ? registeredPackage : TranslationsPackage.eINSTANCE);

		// Create package meta-data objects
		theUserPackage.createPackageContents();
		theGenericModelPackage.createPackageContents();
		theGenericSchemaPackage.createPackageContents();
		theModerationPackage.createPackageContents();
		theRevisionsPackage.createPackageContents();
		theTranslationsPackage.createPackageContents();

		// Initialize created meta-data
		theUserPackage.initializePackageContents();
		theGenericModelPackage.initializePackageContents();
		theGenericSchemaPackage.initializePackageContents();
		theModerationPackage.initializePackageContents();
		theRevisionsPackage.initializePackageContents();
		theTranslationsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theUserPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UserPackage.eNS_URI, theUserPackage);
		return theUserPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUser() {
		return userEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Uid() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Langcode() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Preferred_langcode() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Preferred_admin_langcode() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Name() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Pass() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Mail() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Timezone() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Status() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Changed() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Access() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Login() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Init() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Created() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Default_langcode() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUser_Roles() {
		return (EReference)userEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoles() {
		return rolesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoles_Label() {
		return (EAttribute)rolesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoles_Role_code() {
		return (EAttribute)rolesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoles_Permissions() {
		return (EReference)rolesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPermission() {
		return permissionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPermission_Permission_code() {
		return (EAttribute)permissionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContactForm() {
		return contactFormEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContactForm_Langcode() {
		return (EAttribute)contactFormEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContactForm_Name() {
		return (EAttribute)contactFormEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContactForm_Mail() {
		return (EAttribute)contactFormEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContactForm_Subject() {
		return (EAttribute)contactFormEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContactForm_Message() {
		return (EAttribute)contactFormEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContactForm_Copy() {
		return (EAttribute)contactFormEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContactForm_Recipient() {
		return (EReference)contactFormEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserFactory getUserFactory() {
		return (UserFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		userEClass = createEClass(USER);
		createEAttribute(userEClass, USER__UID);
		createEAttribute(userEClass, USER__LANGCODE);
		createEAttribute(userEClass, USER__PREFERRED_LANGCODE);
		createEAttribute(userEClass, USER__PREFERRED_ADMIN_LANGCODE);
		createEAttribute(userEClass, USER__NAME);
		createEAttribute(userEClass, USER__PASS);
		createEAttribute(userEClass, USER__MAIL);
		createEAttribute(userEClass, USER__TIMEZONE);
		createEAttribute(userEClass, USER__STATUS);
		createEAttribute(userEClass, USER__CHANGED);
		createEAttribute(userEClass, USER__ACCESS);
		createEAttribute(userEClass, USER__LOGIN);
		createEAttribute(userEClass, USER__INIT);
		createEAttribute(userEClass, USER__CREATED);
		createEAttribute(userEClass, USER__DEFAULT_LANGCODE);
		createEReference(userEClass, USER__ROLES);

		rolesEClass = createEClass(ROLES);
		createEAttribute(rolesEClass, ROLES__LABEL);
		createEAttribute(rolesEClass, ROLES__ROLE_CODE);
		createEReference(rolesEClass, ROLES__PERMISSIONS);

		permissionEClass = createEClass(PERMISSION);
		createEAttribute(permissionEClass, PERMISSION__PERMISSION_CODE);

		contactFormEClass = createEClass(CONTACT_FORM);
		createEAttribute(contactFormEClass, CONTACT_FORM__LANGCODE);
		createEAttribute(contactFormEClass, CONTACT_FORM__NAME);
		createEAttribute(contactFormEClass, CONTACT_FORM__MAIL);
		createEAttribute(contactFormEClass, CONTACT_FORM__SUBJECT);
		createEAttribute(contactFormEClass, CONTACT_FORM__MESSAGE);
		createEAttribute(contactFormEClass, CONTACT_FORM__COPY);
		createEReference(contactFormEClass, CONTACT_FORM__RECIPIENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		GenericModelPackage theGenericModelPackage = (GenericModelPackage)EPackage.Registry.INSTANCE.getEPackage(GenericModelPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		contactFormEClass.getESuperTypes().add(theGenericModelPackage.getContentEntity());

		// Initialize classes and features; add operations and parameters
		initEClass(userEClass, User.class, "User", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUser_Uid(), ecorePackage.getEInt(), "uid", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Langcode(), ecorePackage.getEString(), "langcode", null, 0, -1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Preferred_langcode(), ecorePackage.getEString(), "preferred_langcode", null, 0, -1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Preferred_admin_langcode(), ecorePackage.getEString(), "preferred_admin_langcode", null, 0, -1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Name(), ecorePackage.getEString(), "name", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Pass(), ecorePackage.getEString(), "pass", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Mail(), ecorePackage.getEString(), "mail", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Timezone(), ecorePackage.getEString(), "timezone", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Status(), ecorePackage.getEBoolean(), "status", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Changed(), ecorePackage.getEDate(), "changed", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Access(), ecorePackage.getEDate(), "access", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Login(), ecorePackage.getEDate(), "login", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Init(), ecorePackage.getEString(), "init", "Email Used for inital creation", 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Created(), ecorePackage.getEDate(), "created", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Default_langcode(), ecorePackage.getEString(), "default_langcode", null, 0, -1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUser_Roles(), this.getRoles(), null, "roles", null, 0, -1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rolesEClass, Roles.class, "Roles", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoles_Label(), ecorePackage.getEString(), "label", null, 0, 1, Roles.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoles_Role_code(), ecorePackage.getEString(), "role_code", null, 0, 1, Roles.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoles_Permissions(), this.getPermission(), null, "permissions", null, 0, -1, Roles.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(permissionEClass, Permission.class, "Permission", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPermission_Permission_code(), ecorePackage.getEString(), "permission_code", null, 0, 1, Permission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contactFormEClass, ContactForm.class, "ContactForm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContactForm_Langcode(), ecorePackage.getEString(), "langcode", null, 0, -1, ContactForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getContactForm_Name(), ecorePackage.getEString(), "name", null, 0, 1, ContactForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContactForm_Mail(), ecorePackage.getEString(), "mail", null, 0, 1, ContactForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContactForm_Subject(), ecorePackage.getEString(), "subject", null, 0, 1, ContactForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContactForm_Message(), ecorePackage.getEString(), "message", null, 0, 1, ContactForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContactForm_Copy(), ecorePackage.getEBoolean(), "copy", null, 0, 1, ContactForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContactForm_Recipient(), this.getUser(), null, "recipient", null, 1, 1, ContactForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //UserPackageImpl
