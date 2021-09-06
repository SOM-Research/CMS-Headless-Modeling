/**
 */
package edu.uoc.som.cmsdiscover.GenericModel.user.impl;

import edu.uoc.som.cmsdiscover.GenericModel.impl.ContentEntityImpl;
import edu.uoc.som.cmsdiscover.GenericModel.user.Roles;
import edu.uoc.som.cmsdiscover.GenericModel.user.User;
import edu.uoc.som.cmsdiscover.GenericModel.user.UserPackage;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.user.impl.UserImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.user.impl.UserImpl#getLangcode <em>Langcode</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.user.impl.UserImpl#getPreferred_langcode <em>Preferred langcode</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.user.impl.UserImpl#getPreferred_admin_langcode <em>Preferred admin langcode</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.user.impl.UserImpl#getName <em>Name</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.user.impl.UserImpl#getPass <em>Pass</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.user.impl.UserImpl#getMail <em>Mail</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.user.impl.UserImpl#getTimezone <em>Timezone</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.user.impl.UserImpl#isStatus <em>Status</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.user.impl.UserImpl#getChanged <em>Changed</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.user.impl.UserImpl#getAccess <em>Access</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.user.impl.UserImpl#getLogin <em>Login</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.user.impl.UserImpl#getInit <em>Init</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.user.impl.UserImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.user.impl.UserImpl#getDefault_langcode <em>Default langcode</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.user.impl.UserImpl#getRoles <em>Roles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserImpl extends ContentEntityImpl implements User {
	/**
	 * The default value of the '{@link #getUid() <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUid()
	 * @generated
	 * @ordered
	 */
	protected static final int UID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getUid() <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUid()
	 * @generated
	 * @ordered
	 */
	protected int uid = UID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLangcode() <em>Langcode</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLangcode()
	 * @generated
	 * @ordered
	 */
	protected EList<String> langcode;

	/**
	 * The cached value of the '{@link #getPreferred_langcode() <em>Preferred langcode</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreferred_langcode()
	 * @generated
	 * @ordered
	 */
	protected EList<String> preferred_langcode;

	/**
	 * The cached value of the '{@link #getPreferred_admin_langcode() <em>Preferred admin langcode</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreferred_admin_langcode()
	 * @generated
	 * @ordered
	 */
	protected EList<String> preferred_admin_langcode;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPass() <em>Pass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPass()
	 * @generated
	 * @ordered
	 */
	protected static final String PASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPass() <em>Pass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPass()
	 * @generated
	 * @ordered
	 */
	protected String pass = PASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMail() <em>Mail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMail()
	 * @generated
	 * @ordered
	 */
	protected static final String MAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMail() <em>Mail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMail()
	 * @generated
	 * @ordered
	 */
	protected String mail = MAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimezone() <em>Timezone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimezone()
	 * @generated
	 * @ordered
	 */
	protected static final String TIMEZONE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimezone() <em>Timezone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimezone()
	 * @generated
	 * @ordered
	 */
	protected String timezone = TIMEZONE_EDEFAULT;

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
	 * The default value of the '{@link #getChanged() <em>Changed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChanged()
	 * @generated
	 * @ordered
	 */
	protected static final Date CHANGED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChanged() <em>Changed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChanged()
	 * @generated
	 * @ordered
	 */
	protected Date changed = CHANGED_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccess() <em>Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccess()
	 * @generated
	 * @ordered
	 */
	protected static final Date ACCESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccess() <em>Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccess()
	 * @generated
	 * @ordered
	 */
	protected Date access = ACCESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLogin() <em>Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogin()
	 * @generated
	 * @ordered
	 */
	protected static final Date LOGIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLogin() <em>Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogin()
	 * @generated
	 * @ordered
	 */
	protected Date login = LOGIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getInit() <em>Init</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInit()
	 * @generated
	 * @ordered
	 */
	protected static final String INIT_EDEFAULT = "Email Used for inital creation";

	/**
	 * The cached value of the '{@link #getInit() <em>Init</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInit()
	 * @generated
	 * @ordered
	 */
	protected String init = INIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreated() <em>Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreated()
	 * @generated
	 * @ordered
	 */
	protected static final Date CREATED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreated() <em>Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreated()
	 * @generated
	 * @ordered
	 */
	protected Date created = CREATED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDefault_langcode() <em>Default langcode</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault_langcode()
	 * @generated
	 * @ordered
	 */
	protected EList<String> default_langcode;

	/**
	 * The cached value of the '{@link #getRoles() <em>Roles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<Roles> roles;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UserPackage.Literals.USER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getUid() {
		return uid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUid(int newUid) {
		int oldUid = uid;
		uid = newUid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UserPackage.USER__UID, oldUid, uid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getLangcode() {
		if (langcode == null) {
			langcode = new EDataTypeUniqueEList<String>(String.class, this, UserPackage.USER__LANGCODE);
		}
		return langcode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getPreferred_langcode() {
		if (preferred_langcode == null) {
			preferred_langcode = new EDataTypeUniqueEList<String>(String.class, this, UserPackage.USER__PREFERRED_LANGCODE);
		}
		return preferred_langcode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getPreferred_admin_langcode() {
		if (preferred_admin_langcode == null) {
			preferred_admin_langcode = new EDataTypeUniqueEList<String>(String.class, this, UserPackage.USER__PREFERRED_ADMIN_LANGCODE);
		}
		return preferred_admin_langcode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UserPackage.USER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPass() {
		return pass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPass(String newPass) {
		String oldPass = pass;
		pass = newPass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UserPackage.USER__PASS, oldPass, pass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMail() {
		return mail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMail(String newMail) {
		String oldMail = mail;
		mail = newMail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UserPackage.USER__MAIL, oldMail, mail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTimezone() {
		return timezone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimezone(String newTimezone) {
		String oldTimezone = timezone;
		timezone = newTimezone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UserPackage.USER__TIMEZONE, oldTimezone, timezone));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UserPackage.USER__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getChanged() {
		return changed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChanged(Date newChanged) {
		Date oldChanged = changed;
		changed = newChanged;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UserPackage.USER__CHANGED, oldChanged, changed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getAccess() {
		return access;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccess(Date newAccess) {
		Date oldAccess = access;
		access = newAccess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UserPackage.USER__ACCESS, oldAccess, access));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getLogin() {
		return login;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogin(Date newLogin) {
		Date oldLogin = login;
		login = newLogin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UserPackage.USER__LOGIN, oldLogin, login));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInit() {
		return init;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInit(String newInit) {
		String oldInit = init;
		init = newInit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UserPackage.USER__INIT, oldInit, init));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getCreated() {
		return created;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreated(Date newCreated) {
		Date oldCreated = created;
		created = newCreated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UserPackage.USER__CREATED, oldCreated, created));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getDefault_langcode() {
		if (default_langcode == null) {
			default_langcode = new EDataTypeUniqueEList<String>(String.class, this, UserPackage.USER__DEFAULT_LANGCODE);
		}
		return default_langcode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Roles> getRoles() {
		if (roles == null) {
			roles = new EObjectResolvingEList<Roles>(Roles.class, this, UserPackage.USER__ROLES);
		}
		return roles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UserPackage.USER__UID:
				return getUid();
			case UserPackage.USER__LANGCODE:
				return getLangcode();
			case UserPackage.USER__PREFERRED_LANGCODE:
				return getPreferred_langcode();
			case UserPackage.USER__PREFERRED_ADMIN_LANGCODE:
				return getPreferred_admin_langcode();
			case UserPackage.USER__NAME:
				return getName();
			case UserPackage.USER__PASS:
				return getPass();
			case UserPackage.USER__MAIL:
				return getMail();
			case UserPackage.USER__TIMEZONE:
				return getTimezone();
			case UserPackage.USER__STATUS:
				return isStatus();
			case UserPackage.USER__CHANGED:
				return getChanged();
			case UserPackage.USER__ACCESS:
				return getAccess();
			case UserPackage.USER__LOGIN:
				return getLogin();
			case UserPackage.USER__INIT:
				return getInit();
			case UserPackage.USER__CREATED:
				return getCreated();
			case UserPackage.USER__DEFAULT_LANGCODE:
				return getDefault_langcode();
			case UserPackage.USER__ROLES:
				return getRoles();
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
			case UserPackage.USER__UID:
				setUid((Integer)newValue);
				return;
			case UserPackage.USER__LANGCODE:
				getLangcode().clear();
				getLangcode().addAll((Collection<? extends String>)newValue);
				return;
			case UserPackage.USER__PREFERRED_LANGCODE:
				getPreferred_langcode().clear();
				getPreferred_langcode().addAll((Collection<? extends String>)newValue);
				return;
			case UserPackage.USER__PREFERRED_ADMIN_LANGCODE:
				getPreferred_admin_langcode().clear();
				getPreferred_admin_langcode().addAll((Collection<? extends String>)newValue);
				return;
			case UserPackage.USER__NAME:
				setName((String)newValue);
				return;
			case UserPackage.USER__PASS:
				setPass((String)newValue);
				return;
			case UserPackage.USER__MAIL:
				setMail((String)newValue);
				return;
			case UserPackage.USER__TIMEZONE:
				setTimezone((String)newValue);
				return;
			case UserPackage.USER__STATUS:
				setStatus((Boolean)newValue);
				return;
			case UserPackage.USER__CHANGED:
				setChanged((Date)newValue);
				return;
			case UserPackage.USER__ACCESS:
				setAccess((Date)newValue);
				return;
			case UserPackage.USER__LOGIN:
				setLogin((Date)newValue);
				return;
			case UserPackage.USER__INIT:
				setInit((String)newValue);
				return;
			case UserPackage.USER__CREATED:
				setCreated((Date)newValue);
				return;
			case UserPackage.USER__DEFAULT_LANGCODE:
				getDefault_langcode().clear();
				getDefault_langcode().addAll((Collection<? extends String>)newValue);
				return;
			case UserPackage.USER__ROLES:
				getRoles().clear();
				getRoles().addAll((Collection<? extends Roles>)newValue);
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
			case UserPackage.USER__UID:
				setUid(UID_EDEFAULT);
				return;
			case UserPackage.USER__LANGCODE:
				getLangcode().clear();
				return;
			case UserPackage.USER__PREFERRED_LANGCODE:
				getPreferred_langcode().clear();
				return;
			case UserPackage.USER__PREFERRED_ADMIN_LANGCODE:
				getPreferred_admin_langcode().clear();
				return;
			case UserPackage.USER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UserPackage.USER__PASS:
				setPass(PASS_EDEFAULT);
				return;
			case UserPackage.USER__MAIL:
				setMail(MAIL_EDEFAULT);
				return;
			case UserPackage.USER__TIMEZONE:
				setTimezone(TIMEZONE_EDEFAULT);
				return;
			case UserPackage.USER__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case UserPackage.USER__CHANGED:
				setChanged(CHANGED_EDEFAULT);
				return;
			case UserPackage.USER__ACCESS:
				setAccess(ACCESS_EDEFAULT);
				return;
			case UserPackage.USER__LOGIN:
				setLogin(LOGIN_EDEFAULT);
				return;
			case UserPackage.USER__INIT:
				setInit(INIT_EDEFAULT);
				return;
			case UserPackage.USER__CREATED:
				setCreated(CREATED_EDEFAULT);
				return;
			case UserPackage.USER__DEFAULT_LANGCODE:
				getDefault_langcode().clear();
				return;
			case UserPackage.USER__ROLES:
				getRoles().clear();
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
			case UserPackage.USER__UID:
				return uid != UID_EDEFAULT;
			case UserPackage.USER__LANGCODE:
				return langcode != null && !langcode.isEmpty();
			case UserPackage.USER__PREFERRED_LANGCODE:
				return preferred_langcode != null && !preferred_langcode.isEmpty();
			case UserPackage.USER__PREFERRED_ADMIN_LANGCODE:
				return preferred_admin_langcode != null && !preferred_admin_langcode.isEmpty();
			case UserPackage.USER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UserPackage.USER__PASS:
				return PASS_EDEFAULT == null ? pass != null : !PASS_EDEFAULT.equals(pass);
			case UserPackage.USER__MAIL:
				return MAIL_EDEFAULT == null ? mail != null : !MAIL_EDEFAULT.equals(mail);
			case UserPackage.USER__TIMEZONE:
				return TIMEZONE_EDEFAULT == null ? timezone != null : !TIMEZONE_EDEFAULT.equals(timezone);
			case UserPackage.USER__STATUS:
				return status != STATUS_EDEFAULT;
			case UserPackage.USER__CHANGED:
				return CHANGED_EDEFAULT == null ? changed != null : !CHANGED_EDEFAULT.equals(changed);
			case UserPackage.USER__ACCESS:
				return ACCESS_EDEFAULT == null ? access != null : !ACCESS_EDEFAULT.equals(access);
			case UserPackage.USER__LOGIN:
				return LOGIN_EDEFAULT == null ? login != null : !LOGIN_EDEFAULT.equals(login);
			case UserPackage.USER__INIT:
				return INIT_EDEFAULT == null ? init != null : !INIT_EDEFAULT.equals(init);
			case UserPackage.USER__CREATED:
				return CREATED_EDEFAULT == null ? created != null : !CREATED_EDEFAULT.equals(created);
			case UserPackage.USER__DEFAULT_LANGCODE:
				return default_langcode != null && !default_langcode.isEmpty();
			case UserPackage.USER__ROLES:
				return roles != null && !roles.isEmpty();
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
		result.append(" (uid: ");
		result.append(uid);
		result.append(", langcode: ");
		result.append(langcode);
		result.append(", preferred_langcode: ");
		result.append(preferred_langcode);
		result.append(", preferred_admin_langcode: ");
		result.append(preferred_admin_langcode);
		result.append(", name: ");
		result.append(name);
		result.append(", pass: ");
		result.append(pass);
		result.append(", mail: ");
		result.append(mail);
		result.append(", timezone: ");
		result.append(timezone);
		result.append(", status: ");
		result.append(status);
		result.append(", changed: ");
		result.append(changed);
		result.append(", access: ");
		result.append(access);
		result.append(", login: ");
		result.append(login);
		result.append(", init: ");
		result.append(init);
		result.append(", created: ");
		result.append(created);
		result.append(", default_langcode: ");
		result.append(default_langcode);
		result.append(')');
		return result.toString();
	}

} //UserImpl
