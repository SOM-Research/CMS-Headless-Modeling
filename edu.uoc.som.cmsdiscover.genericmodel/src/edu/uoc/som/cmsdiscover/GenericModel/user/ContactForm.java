/**
 */
package edu.uoc.som.cmsdiscover.GenericModel.user;

import edu.uoc.som.cmsdiscover.GenericModel.ContentEntity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contact Form</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.user.ContactForm#getLangcode <em>Langcode</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.user.ContactForm#getName <em>Name</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.user.ContactForm#getMail <em>Mail</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.user.ContactForm#getSubject <em>Subject</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.user.ContactForm#getMessage <em>Message</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.user.ContactForm#isCopy <em>Copy</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.user.ContactForm#getRecipient <em>Recipient</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.cmsdiscover.GenericModel.user.UserPackage#getContactForm()
 * @model
 * @generated
 */
public interface ContactForm extends ContentEntity {
	/**
	 * Returns the value of the '<em><b>Langcode</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Langcode</em>' attribute list.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.user.UserPackage#getContactForm_Langcode()
	 * @model ordered="false"
	 * @generated
	 */
	EList<String> getLangcode();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see edu.uoc.som.cmsdiscover.GenericModel.user.UserPackage#getContactForm_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link edu.uoc.som.cmsdiscover.GenericModel.user.ContactForm#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Mail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mail</em>' attribute.
	 * @see #setMail(String)
	 * @see edu.uoc.som.cmsdiscover.GenericModel.user.UserPackage#getContactForm_Mail()
	 * @model
	 * @generated
	 */
	String getMail();

	/**
	 * Sets the value of the '{@link edu.uoc.som.cmsdiscover.GenericModel.user.ContactForm#getMail <em>Mail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mail</em>' attribute.
	 * @see #getMail()
	 * @generated
	 */
	void setMail(String value);

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject</em>' attribute.
	 * @see #setSubject(String)
	 * @see edu.uoc.som.cmsdiscover.GenericModel.user.UserPackage#getContactForm_Subject()
	 * @model
	 * @generated
	 */
	String getSubject();

	/**
	 * Sets the value of the '{@link edu.uoc.som.cmsdiscover.GenericModel.user.ContactForm#getSubject <em>Subject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' attribute.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(String value);

	/**
	 * Returns the value of the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' attribute.
	 * @see #setMessage(String)
	 * @see edu.uoc.som.cmsdiscover.GenericModel.user.UserPackage#getContactForm_Message()
	 * @model
	 * @generated
	 */
	String getMessage();

	/**
	 * Sets the value of the '{@link edu.uoc.som.cmsdiscover.GenericModel.user.ContactForm#getMessage <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' attribute.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(String value);

	/**
	 * Returns the value of the '<em><b>Copy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Copy</em>' attribute.
	 * @see #setCopy(boolean)
	 * @see edu.uoc.som.cmsdiscover.GenericModel.user.UserPackage#getContactForm_Copy()
	 * @model
	 * @generated
	 */
	boolean isCopy();

	/**
	 * Sets the value of the '{@link edu.uoc.som.cmsdiscover.GenericModel.user.ContactForm#isCopy <em>Copy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copy</em>' attribute.
	 * @see #isCopy()
	 * @generated
	 */
	void setCopy(boolean value);

	/**
	 * Returns the value of the '<em><b>Recipient</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recipient</em>' reference.
	 * @see #setRecipient(User)
	 * @see edu.uoc.som.cmsdiscover.GenericModel.user.UserPackage#getContactForm_Recipient()
	 * @model required="true"
	 * @generated
	 */
	User getRecipient();

	/**
	 * Sets the value of the '{@link edu.uoc.som.cmsdiscover.GenericModel.user.ContactForm#getRecipient <em>Recipient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recipient</em>' reference.
	 * @see #getRecipient()
	 * @generated
	 */
	void setRecipient(User value);

} // ContactForm
