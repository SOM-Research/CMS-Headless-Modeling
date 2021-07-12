/**
 */
package edu.uoc.som.cmsdiscover.GenericModel.user.impl;

import edu.uoc.som.cmsdiscover.GenericModel.impl.ContentEntityImpl;

import edu.uoc.som.cmsdiscover.GenericModel.user.ContactForm;
import edu.uoc.som.cmsdiscover.GenericModel.user.User;
import edu.uoc.som.cmsdiscover.GenericModel.user.UserPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contact Form</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.user.impl.ContactFormImpl#getLangcode <em>Langcode</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.user.impl.ContactFormImpl#getName <em>Name</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.user.impl.ContactFormImpl#getMail <em>Mail</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.user.impl.ContactFormImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.user.impl.ContactFormImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.user.impl.ContactFormImpl#isCopy <em>Copy</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.user.impl.ContactFormImpl#getRecipient <em>Recipient</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContactFormImpl extends ContentEntityImpl implements ContactForm {
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
	 * The default value of the '{@link #getSubject() <em>Subject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBJECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected String subject = SUBJECT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected String message = MESSAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #isCopy() <em>Copy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCopy()
	 * @generated
	 * @ordered
	 */
	protected static final boolean COPY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCopy() <em>Copy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCopy()
	 * @generated
	 * @ordered
	 */
	protected boolean copy = COPY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRecipient() <em>Recipient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecipient()
	 * @generated
	 * @ordered
	 */
	protected User recipient;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContactFormImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UserPackage.Literals.CONTACT_FORM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getLangcode() {
		if (langcode == null) {
			langcode = new EDataTypeUniqueEList<String>(String.class, this, UserPackage.CONTACT_FORM__LANGCODE);
		}
		return langcode;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UserPackage.CONTACT_FORM__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UserPackage.CONTACT_FORM__MAIL, oldMail, mail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubject() {
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubject(String newSubject) {
		String oldSubject = subject;
		subject = newSubject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UserPackage.CONTACT_FORM__SUBJECT, oldSubject, subject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessage(String newMessage) {
		String oldMessage = message;
		message = newMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UserPackage.CONTACT_FORM__MESSAGE, oldMessage, message));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCopy() {
		return copy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCopy(boolean newCopy) {
		boolean oldCopy = copy;
		copy = newCopy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UserPackage.CONTACT_FORM__COPY, oldCopy, copy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User getRecipient() {
		if (recipient != null && recipient.eIsProxy()) {
			InternalEObject oldRecipient = (InternalEObject)recipient;
			recipient = (User)eResolveProxy(oldRecipient);
			if (recipient != oldRecipient) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UserPackage.CONTACT_FORM__RECIPIENT, oldRecipient, recipient));
			}
		}
		return recipient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User basicGetRecipient() {
		return recipient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecipient(User newRecipient) {
		User oldRecipient = recipient;
		recipient = newRecipient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UserPackage.CONTACT_FORM__RECIPIENT, oldRecipient, recipient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UserPackage.CONTACT_FORM__LANGCODE:
				return getLangcode();
			case UserPackage.CONTACT_FORM__NAME:
				return getName();
			case UserPackage.CONTACT_FORM__MAIL:
				return getMail();
			case UserPackage.CONTACT_FORM__SUBJECT:
				return getSubject();
			case UserPackage.CONTACT_FORM__MESSAGE:
				return getMessage();
			case UserPackage.CONTACT_FORM__COPY:
				return isCopy();
			case UserPackage.CONTACT_FORM__RECIPIENT:
				if (resolve) return getRecipient();
				return basicGetRecipient();
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
			case UserPackage.CONTACT_FORM__LANGCODE:
				getLangcode().clear();
				getLangcode().addAll((Collection<? extends String>)newValue);
				return;
			case UserPackage.CONTACT_FORM__NAME:
				setName((String)newValue);
				return;
			case UserPackage.CONTACT_FORM__MAIL:
				setMail((String)newValue);
				return;
			case UserPackage.CONTACT_FORM__SUBJECT:
				setSubject((String)newValue);
				return;
			case UserPackage.CONTACT_FORM__MESSAGE:
				setMessage((String)newValue);
				return;
			case UserPackage.CONTACT_FORM__COPY:
				setCopy((Boolean)newValue);
				return;
			case UserPackage.CONTACT_FORM__RECIPIENT:
				setRecipient((User)newValue);
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
			case UserPackage.CONTACT_FORM__LANGCODE:
				getLangcode().clear();
				return;
			case UserPackage.CONTACT_FORM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UserPackage.CONTACT_FORM__MAIL:
				setMail(MAIL_EDEFAULT);
				return;
			case UserPackage.CONTACT_FORM__SUBJECT:
				setSubject(SUBJECT_EDEFAULT);
				return;
			case UserPackage.CONTACT_FORM__MESSAGE:
				setMessage(MESSAGE_EDEFAULT);
				return;
			case UserPackage.CONTACT_FORM__COPY:
				setCopy(COPY_EDEFAULT);
				return;
			case UserPackage.CONTACT_FORM__RECIPIENT:
				setRecipient((User)null);
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
			case UserPackage.CONTACT_FORM__LANGCODE:
				return langcode != null && !langcode.isEmpty();
			case UserPackage.CONTACT_FORM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UserPackage.CONTACT_FORM__MAIL:
				return MAIL_EDEFAULT == null ? mail != null : !MAIL_EDEFAULT.equals(mail);
			case UserPackage.CONTACT_FORM__SUBJECT:
				return SUBJECT_EDEFAULT == null ? subject != null : !SUBJECT_EDEFAULT.equals(subject);
			case UserPackage.CONTACT_FORM__MESSAGE:
				return MESSAGE_EDEFAULT == null ? message != null : !MESSAGE_EDEFAULT.equals(message);
			case UserPackage.CONTACT_FORM__COPY:
				return copy != COPY_EDEFAULT;
			case UserPackage.CONTACT_FORM__RECIPIENT:
				return recipient != null;
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
		result.append(" (langcode: ");
		result.append(langcode);
		result.append(", name: ");
		result.append(name);
		result.append(", mail: ");
		result.append(mail);
		result.append(", subject: ");
		result.append(subject);
		result.append(", message: ");
		result.append(message);
		result.append(", copy: ");
		result.append(copy);
		result.append(')');
		return result.toString();
	}

} //ContactFormImpl
