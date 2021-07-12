/**
 */
package edu.uoc.som.cmsdiscover.GenericModel.user;

import edu.uoc.som.cmsdiscover.GenericModel.GenericModelPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see edu.uoc.som.cmsdiscover.GenericModel.user.UserFactory
 * @model kind="package"
 * @generated
 */
public interface UserPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "user";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://user";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "user";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UserPackage eINSTANCE = edu.uoc.som.cmsdiscover.GenericModel.user.impl.UserPackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.uoc.som.cmsdiscover.GenericModel.user.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.cmsdiscover.GenericModel.user.impl.UserImpl
	 * @see edu.uoc.som.cmsdiscover.GenericModel.user.impl.UserPackageImpl#getUser()
	 * @generated
	 */
	int USER = 0;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__UID = 0;

	/**
	 * The feature id for the '<em><b>Langcode</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__LANGCODE = 1;

	/**
	 * The feature id for the '<em><b>Preferred langcode</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__PREFERRED_LANGCODE = 2;

	/**
	 * The feature id for the '<em><b>Preferred admin langcode</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__PREFERRED_ADMIN_LANGCODE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__NAME = 4;

	/**
	 * The feature id for the '<em><b>Pass</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__PASS = 5;

	/**
	 * The feature id for the '<em><b>Mail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__MAIL = 6;

	/**
	 * The feature id for the '<em><b>Timezone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__TIMEZONE = 7;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__STATUS = 8;

	/**
	 * The feature id for the '<em><b>Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__CHANGED = 9;

	/**
	 * The feature id for the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__ACCESS = 10;

	/**
	 * The feature id for the '<em><b>Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__LOGIN = 11;

	/**
	 * The feature id for the '<em><b>Init</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__INIT = 12;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__CREATED = 13;

	/**
	 * The feature id for the '<em><b>Default langcode</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__DEFAULT_LANGCODE = 14;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__ROLES = 15;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = 16;

	/**
	 * The meta object id for the '{@link edu.uoc.som.cmsdiscover.GenericModel.user.impl.RolesImpl <em>Roles</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.cmsdiscover.GenericModel.user.impl.RolesImpl
	 * @see edu.uoc.som.cmsdiscover.GenericModel.user.impl.UserPackageImpl#getRoles()
	 * @generated
	 */
	int ROLES = 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLES__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Role code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLES__ROLE_CODE = 1;

	/**
	 * The feature id for the '<em><b>Permissions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLES__PERMISSIONS = 2;

	/**
	 * The number of structural features of the '<em>Roles</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLES_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link edu.uoc.som.cmsdiscover.GenericModel.user.impl.PermissionImpl <em>Permission</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.cmsdiscover.GenericModel.user.impl.PermissionImpl
	 * @see edu.uoc.som.cmsdiscover.GenericModel.user.impl.UserPackageImpl#getPermission()
	 * @generated
	 */
	int PERMISSION = 2;

	/**
	 * The feature id for the '<em><b>Permission code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION__PERMISSION_CODE = 0;

	/**
	 * The number of structural features of the '<em>Permission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link edu.uoc.som.cmsdiscover.GenericModel.user.impl.ContactFormImpl <em>Contact Form</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.cmsdiscover.GenericModel.user.impl.ContactFormImpl
	 * @see edu.uoc.som.cmsdiscover.GenericModel.user.impl.UserPackageImpl#getContactForm()
	 * @generated
	 */
	int CONTACT_FORM = 3;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_FORM__UUID = GenericModelPackage.CONTENT_ENTITY__UUID;

	/**
	 * The feature id for the '<em><b>Langcode</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_FORM__LANGCODE = GenericModelPackage.CONTENT_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_FORM__NAME = GenericModelPackage.CONTENT_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Mail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_FORM__MAIL = GenericModelPackage.CONTENT_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_FORM__SUBJECT = GenericModelPackage.CONTENT_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_FORM__MESSAGE = GenericModelPackage.CONTENT_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Copy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_FORM__COPY = GenericModelPackage.CONTENT_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Recipient</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_FORM__RECIPIENT = GenericModelPackage.CONTENT_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Contact Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_FORM_FEATURE_COUNT = GenericModelPackage.CONTENT_ENTITY_FEATURE_COUNT + 7;


	/**
	 * Returns the meta object for class '{@link edu.uoc.som.cmsdiscover.GenericModel.user.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.user.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.cmsdiscover.GenericModel.user.User#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.user.User#getUid()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Uid();

	/**
	 * Returns the meta object for the attribute list '{@link edu.uoc.som.cmsdiscover.GenericModel.user.User#getLangcode <em>Langcode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Langcode</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.user.User#getLangcode()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Langcode();

	/**
	 * Returns the meta object for the attribute list '{@link edu.uoc.som.cmsdiscover.GenericModel.user.User#getPreferred_langcode <em>Preferred langcode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Preferred langcode</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.user.User#getPreferred_langcode()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Preferred_langcode();

	/**
	 * Returns the meta object for the attribute list '{@link edu.uoc.som.cmsdiscover.GenericModel.user.User#getPreferred_admin_langcode <em>Preferred admin langcode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Preferred admin langcode</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.user.User#getPreferred_admin_langcode()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Preferred_admin_langcode();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.cmsdiscover.GenericModel.user.User#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.user.User#getName()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Name();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.cmsdiscover.GenericModel.user.User#getPass <em>Pass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pass</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.user.User#getPass()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Pass();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.cmsdiscover.GenericModel.user.User#getMail <em>Mail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mail</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.user.User#getMail()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Mail();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.cmsdiscover.GenericModel.user.User#getTimezone <em>Timezone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timezone</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.user.User#getTimezone()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Timezone();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.cmsdiscover.GenericModel.user.User#isStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.user.User#isStatus()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Status();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.cmsdiscover.GenericModel.user.User#getChanged <em>Changed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Changed</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.user.User#getChanged()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Changed();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.cmsdiscover.GenericModel.user.User#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.user.User#getAccess()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Access();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.cmsdiscover.GenericModel.user.User#getLogin <em>Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Login</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.user.User#getLogin()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Login();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.cmsdiscover.GenericModel.user.User#getInit <em>Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Init</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.user.User#getInit()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Init();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.cmsdiscover.GenericModel.user.User#getCreated <em>Created</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.user.User#getCreated()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Created();

	/**
	 * Returns the meta object for the attribute list '{@link edu.uoc.som.cmsdiscover.GenericModel.user.User#getDefault_langcode <em>Default langcode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Default langcode</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.user.User#getDefault_langcode()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Default_langcode();

	/**
	 * Returns the meta object for the reference list '{@link edu.uoc.som.cmsdiscover.GenericModel.user.User#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Roles</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.user.User#getRoles()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Roles();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.cmsdiscover.GenericModel.user.Roles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Roles</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.user.Roles
	 * @generated
	 */
	EClass getRoles();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.cmsdiscover.GenericModel.user.Roles#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.user.Roles#getLabel()
	 * @see #getRoles()
	 * @generated
	 */
	EAttribute getRoles_Label();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.cmsdiscover.GenericModel.user.Roles#getRole_code <em>Role code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role code</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.user.Roles#getRole_code()
	 * @see #getRoles()
	 * @generated
	 */
	EAttribute getRoles_Role_code();

	/**
	 * Returns the meta object for the reference list '{@link edu.uoc.som.cmsdiscover.GenericModel.user.Roles#getPermissions <em>Permissions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Permissions</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.user.Roles#getPermissions()
	 * @see #getRoles()
	 * @generated
	 */
	EReference getRoles_Permissions();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.cmsdiscover.GenericModel.user.Permission <em>Permission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Permission</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.user.Permission
	 * @generated
	 */
	EClass getPermission();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.cmsdiscover.GenericModel.user.Permission#getPermission_code <em>Permission code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Permission code</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.user.Permission#getPermission_code()
	 * @see #getPermission()
	 * @generated
	 */
	EAttribute getPermission_Permission_code();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.cmsdiscover.GenericModel.user.ContactForm <em>Contact Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contact Form</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.user.ContactForm
	 * @generated
	 */
	EClass getContactForm();

	/**
	 * Returns the meta object for the attribute list '{@link edu.uoc.som.cmsdiscover.GenericModel.user.ContactForm#getLangcode <em>Langcode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Langcode</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.user.ContactForm#getLangcode()
	 * @see #getContactForm()
	 * @generated
	 */
	EAttribute getContactForm_Langcode();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.cmsdiscover.GenericModel.user.ContactForm#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.user.ContactForm#getName()
	 * @see #getContactForm()
	 * @generated
	 */
	EAttribute getContactForm_Name();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.cmsdiscover.GenericModel.user.ContactForm#getMail <em>Mail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mail</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.user.ContactForm#getMail()
	 * @see #getContactForm()
	 * @generated
	 */
	EAttribute getContactForm_Mail();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.cmsdiscover.GenericModel.user.ContactForm#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subject</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.user.ContactForm#getSubject()
	 * @see #getContactForm()
	 * @generated
	 */
	EAttribute getContactForm_Subject();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.cmsdiscover.GenericModel.user.ContactForm#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.user.ContactForm#getMessage()
	 * @see #getContactForm()
	 * @generated
	 */
	EAttribute getContactForm_Message();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.cmsdiscover.GenericModel.user.ContactForm#isCopy <em>Copy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Copy</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.user.ContactForm#isCopy()
	 * @see #getContactForm()
	 * @generated
	 */
	EAttribute getContactForm_Copy();

	/**
	 * Returns the meta object for the reference '{@link edu.uoc.som.cmsdiscover.GenericModel.user.ContactForm#getRecipient <em>Recipient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Recipient</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.user.ContactForm#getRecipient()
	 * @see #getContactForm()
	 * @generated
	 */
	EReference getContactForm_Recipient();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UserFactory getUserFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link edu.uoc.som.cmsdiscover.GenericModel.user.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.cmsdiscover.GenericModel.user.impl.UserImpl
		 * @see edu.uoc.som.cmsdiscover.GenericModel.user.impl.UserPackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__UID = eINSTANCE.getUser_Uid();

		/**
		 * The meta object literal for the '<em><b>Langcode</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__LANGCODE = eINSTANCE.getUser_Langcode();

		/**
		 * The meta object literal for the '<em><b>Preferred langcode</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__PREFERRED_LANGCODE = eINSTANCE.getUser_Preferred_langcode();

		/**
		 * The meta object literal for the '<em><b>Preferred admin langcode</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__PREFERRED_ADMIN_LANGCODE = eINSTANCE.getUser_Preferred_admin_langcode();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__NAME = eINSTANCE.getUser_Name();

		/**
		 * The meta object literal for the '<em><b>Pass</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__PASS = eINSTANCE.getUser_Pass();

		/**
		 * The meta object literal for the '<em><b>Mail</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__MAIL = eINSTANCE.getUser_Mail();

		/**
		 * The meta object literal for the '<em><b>Timezone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__TIMEZONE = eINSTANCE.getUser_Timezone();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__STATUS = eINSTANCE.getUser_Status();

		/**
		 * The meta object literal for the '<em><b>Changed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__CHANGED = eINSTANCE.getUser_Changed();

		/**
		 * The meta object literal for the '<em><b>Access</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__ACCESS = eINSTANCE.getUser_Access();

		/**
		 * The meta object literal for the '<em><b>Login</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__LOGIN = eINSTANCE.getUser_Login();

		/**
		 * The meta object literal for the '<em><b>Init</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__INIT = eINSTANCE.getUser_Init();

		/**
		 * The meta object literal for the '<em><b>Created</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__CREATED = eINSTANCE.getUser_Created();

		/**
		 * The meta object literal for the '<em><b>Default langcode</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__DEFAULT_LANGCODE = eINSTANCE.getUser_Default_langcode();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__ROLES = eINSTANCE.getUser_Roles();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.cmsdiscover.GenericModel.user.impl.RolesImpl <em>Roles</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.cmsdiscover.GenericModel.user.impl.RolesImpl
		 * @see edu.uoc.som.cmsdiscover.GenericModel.user.impl.UserPackageImpl#getRoles()
		 * @generated
		 */
		EClass ROLES = eINSTANCE.getRoles();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLES__LABEL = eINSTANCE.getRoles_Label();

		/**
		 * The meta object literal for the '<em><b>Role code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLES__ROLE_CODE = eINSTANCE.getRoles_Role_code();

		/**
		 * The meta object literal for the '<em><b>Permissions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLES__PERMISSIONS = eINSTANCE.getRoles_Permissions();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.cmsdiscover.GenericModel.user.impl.PermissionImpl <em>Permission</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.cmsdiscover.GenericModel.user.impl.PermissionImpl
		 * @see edu.uoc.som.cmsdiscover.GenericModel.user.impl.UserPackageImpl#getPermission()
		 * @generated
		 */
		EClass PERMISSION = eINSTANCE.getPermission();

		/**
		 * The meta object literal for the '<em><b>Permission code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERMISSION__PERMISSION_CODE = eINSTANCE.getPermission_Permission_code();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.cmsdiscover.GenericModel.user.impl.ContactFormImpl <em>Contact Form</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.cmsdiscover.GenericModel.user.impl.ContactFormImpl
		 * @see edu.uoc.som.cmsdiscover.GenericModel.user.impl.UserPackageImpl#getContactForm()
		 * @generated
		 */
		EClass CONTACT_FORM = eINSTANCE.getContactForm();

		/**
		 * The meta object literal for the '<em><b>Langcode</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT_FORM__LANGCODE = eINSTANCE.getContactForm_Langcode();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT_FORM__NAME = eINSTANCE.getContactForm_Name();

		/**
		 * The meta object literal for the '<em><b>Mail</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT_FORM__MAIL = eINSTANCE.getContactForm_Mail();

		/**
		 * The meta object literal for the '<em><b>Subject</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT_FORM__SUBJECT = eINSTANCE.getContactForm_Subject();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT_FORM__MESSAGE = eINSTANCE.getContactForm_Message();

		/**
		 * The meta object literal for the '<em><b>Copy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT_FORM__COPY = eINSTANCE.getContactForm_Copy();

		/**
		 * The meta object literal for the '<em><b>Recipient</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTACT_FORM__RECIPIENT = eINSTANCE.getContactForm_Recipient();

	}

} //UserPackage
