/**
 */
package edu.uoc.som.cmsdiscover.GenericModel.user;

import edu.uoc.som.cmsdiscover.GenericModel.ContentEntity;
import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.user.User#getUid <em>Uid</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.user.User#getLangcode <em>Langcode</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.user.User#getPreferred_langcode <em>Preferred langcode</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.user.User#getPreferred_admin_langcode <em>Preferred admin langcode</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.user.User#getName <em>Name</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.user.User#getPass <em>Pass</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.user.User#getMail <em>Mail</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.user.User#getTimezone <em>Timezone</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.user.User#isStatus <em>Status</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.user.User#getChanged <em>Changed</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.user.User#getAccess <em>Access</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.user.User#getLogin <em>Login</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.user.User#getInit <em>Init</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.user.User#getCreated <em>Created</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.user.User#getDefault_langcode <em>Default langcode</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.user.User#getRoles <em>Roles</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.cmsdiscover.GenericModel.user.UserPackage#getUser()
 * @model
 * @generated
 */
public interface User extends ContentEntity {
	/**
	 * Returns the value of the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uid</em>' attribute.
	 * @see #setUid(int)
	 * @see edu.uoc.som.cmsdiscover.GenericModel.user.UserPackage#getUser_Uid()
	 * @model
	 * @generated
	 */
	int getUid();

	/**
	 * Sets the value of the '{@link edu.uoc.som.cmsdiscover.GenericModel.user.User#getUid <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uid</em>' attribute.
	 * @see #getUid()
	 * @generated
	 */
	void setUid(int value);

	/**
	 * Returns the value of the '<em><b>Langcode</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Langcode</em>' attribute list.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.user.UserPackage#getUser_Langcode()
	 * @model
	 * @generated
	 */
	EList<String> getLangcode();

	/**
	 * Returns the value of the '<em><b>Preferred langcode</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preferred langcode</em>' attribute list.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.user.UserPackage#getUser_Preferred_langcode()
	 * @model
	 * @generated
	 */
	EList<String> getPreferred_langcode();

	/**
	 * Returns the value of the '<em><b>Preferred admin langcode</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preferred admin langcode</em>' attribute list.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.user.UserPackage#getUser_Preferred_admin_langcode()
	 * @model
	 * @generated
	 */
	EList<String> getPreferred_admin_langcode();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see edu.uoc.som.cmsdiscover.GenericModel.user.UserPackage#getUser_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link edu.uoc.som.cmsdiscover.GenericModel.user.User#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Pass</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pass</em>' attribute.
	 * @see #setPass(String)
	 * @see edu.uoc.som.cmsdiscover.GenericModel.user.UserPackage#getUser_Pass()
	 * @model
	 * @generated
	 */
	String getPass();

	/**
	 * Sets the value of the '{@link edu.uoc.som.cmsdiscover.GenericModel.user.User#getPass <em>Pass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pass</em>' attribute.
	 * @see #getPass()
	 * @generated
	 */
	void setPass(String value);

	/**
	 * Returns the value of the '<em><b>Mail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mail</em>' attribute.
	 * @see #setMail(String)
	 * @see edu.uoc.som.cmsdiscover.GenericModel.user.UserPackage#getUser_Mail()
	 * @model
	 * @generated
	 */
	String getMail();

	/**
	 * Sets the value of the '{@link edu.uoc.som.cmsdiscover.GenericModel.user.User#getMail <em>Mail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mail</em>' attribute.
	 * @see #getMail()
	 * @generated
	 */
	void setMail(String value);

	/**
	 * Returns the value of the '<em><b>Timezone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timezone</em>' attribute.
	 * @see #setTimezone(String)
	 * @see edu.uoc.som.cmsdiscover.GenericModel.user.UserPackage#getUser_Timezone()
	 * @model
	 * @generated
	 */
	String getTimezone();

	/**
	 * Sets the value of the '{@link edu.uoc.som.cmsdiscover.GenericModel.user.User#getTimezone <em>Timezone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timezone</em>' attribute.
	 * @see #getTimezone()
	 * @generated
	 */
	void setTimezone(String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see #setStatus(boolean)
	 * @see edu.uoc.som.cmsdiscover.GenericModel.user.UserPackage#getUser_Status()
	 * @model
	 * @generated
	 */
	boolean isStatus();

	/**
	 * Sets the value of the '{@link edu.uoc.som.cmsdiscover.GenericModel.user.User#isStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #isStatus()
	 * @generated
	 */
	void setStatus(boolean value);

	/**
	 * Returns the value of the '<em><b>Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Changed</em>' attribute.
	 * @see #setChanged(Date)
	 * @see edu.uoc.som.cmsdiscover.GenericModel.user.UserPackage#getUser_Changed()
	 * @model
	 * @generated
	 */
	Date getChanged();

	/**
	 * Sets the value of the '{@link edu.uoc.som.cmsdiscover.GenericModel.user.User#getChanged <em>Changed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Changed</em>' attribute.
	 * @see #getChanged()
	 * @generated
	 */
	void setChanged(Date value);

	/**
	 * Returns the value of the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access</em>' attribute.
	 * @see #setAccess(Date)
	 * @see edu.uoc.som.cmsdiscover.GenericModel.user.UserPackage#getUser_Access()
	 * @model
	 * @generated
	 */
	Date getAccess();

	/**
	 * Sets the value of the '{@link edu.uoc.som.cmsdiscover.GenericModel.user.User#getAccess <em>Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access</em>' attribute.
	 * @see #getAccess()
	 * @generated
	 */
	void setAccess(Date value);

	/**
	 * Returns the value of the '<em><b>Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Login</em>' attribute.
	 * @see #setLogin(Date)
	 * @see edu.uoc.som.cmsdiscover.GenericModel.user.UserPackage#getUser_Login()
	 * @model
	 * @generated
	 */
	Date getLogin();

	/**
	 * Sets the value of the '{@link edu.uoc.som.cmsdiscover.GenericModel.user.User#getLogin <em>Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Login</em>' attribute.
	 * @see #getLogin()
	 * @generated
	 */
	void setLogin(Date value);

	/**
	 * Returns the value of the '<em><b>Init</b></em>' attribute.
	 * The default value is <code>"Email Used for inital creation"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init</em>' attribute.
	 * @see #setInit(String)
	 * @see edu.uoc.som.cmsdiscover.GenericModel.user.UserPackage#getUser_Init()
	 * @model default="Email Used for inital creation"
	 * @generated
	 */
	String getInit();

	/**
	 * Sets the value of the '{@link edu.uoc.som.cmsdiscover.GenericModel.user.User#getInit <em>Init</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init</em>' attribute.
	 * @see #getInit()
	 * @generated
	 */
	void setInit(String value);

	/**
	 * Returns the value of the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created</em>' attribute.
	 * @see #setCreated(Date)
	 * @see edu.uoc.som.cmsdiscover.GenericModel.user.UserPackage#getUser_Created()
	 * @model
	 * @generated
	 */
	Date getCreated();

	/**
	 * Sets the value of the '{@link edu.uoc.som.cmsdiscover.GenericModel.user.User#getCreated <em>Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created</em>' attribute.
	 * @see #getCreated()
	 * @generated
	 */
	void setCreated(Date value);

	/**
	 * Returns the value of the '<em><b>Default langcode</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default langcode</em>' attribute list.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.user.UserPackage#getUser_Default_langcode()
	 * @model
	 * @generated
	 */
	EList<String> getDefault_langcode();

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' reference list.
	 * The list contents are of type {@link edu.uoc.som.cmsdiscover.GenericModel.user.Roles}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' reference list.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.user.UserPackage#getUser_Roles()
	 * @model
	 * @generated
	 */
	EList<Roles> getRoles();

} // User
