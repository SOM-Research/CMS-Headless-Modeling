/**
 */
package edu.uoc.som.cmsdiscover.GenericModel.genericSchema.impl;

import edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Comment;
import edu.uoc.som.cmsdiscover.GenericModel.genericSchema.ContentType;
import edu.uoc.som.cmsdiscover.GenericModel.genericSchema.GenericSchemaPackage;

import edu.uoc.som.cmsdiscover.GenericModel.impl.ContentEntityImpl;

import edu.uoc.som.cmsdiscover.GenericModel.user.User;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.impl.CommentImpl#getCid <em>Cid</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.impl.CommentImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.impl.CommentImpl#getName <em>Name</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.impl.CommentImpl#getMail <em>Mail</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.impl.CommentImpl#getHostname <em>Hostname</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.impl.CommentImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.impl.CommentImpl#getChanged <em>Changed</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.impl.CommentImpl#getThread <em>Thread</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.impl.CommentImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.impl.CommentImpl#getPid <em>Pid</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.impl.CommentImpl#getEntity_id <em>Entity id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommentImpl extends ContentEntityImpl implements Comment {
	/**
	 * The default value of the '{@link #getCid() <em>Cid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCid()
	 * @generated
	 * @ordered
	 */
	protected static final int CID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCid() <em>Cid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCid()
	 * @generated
	 * @ordered
	 */
	protected int cid = CID_EDEFAULT;

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
	 * The default value of the '{@link #getHostname() <em>Hostname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostname()
	 * @generated
	 * @ordered
	 */
	protected static final String HOSTNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHostname() <em>Hostname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostname()
	 * @generated
	 * @ordered
	 */
	protected String hostname = HOSTNAME_EDEFAULT;

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
	 * The default value of the '{@link #getThread() <em>Thread</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThread()
	 * @generated
	 * @ordered
	 */
	protected static final String THREAD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThread() <em>Thread</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThread()
	 * @generated
	 * @ordered
	 */
	protected String thread = THREAD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUid() <em>Uid</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUid()
	 * @generated
	 * @ordered
	 */
	protected User uid;

	/**
	 * The cached value of the '{@link #getPid() <em>Pid</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPid()
	 * @generated
	 * @ordered
	 */
	protected Comment pid;

	/**
	 * The cached value of the '{@link #getEntity_id() <em>Entity id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntity_id()
	 * @generated
	 * @ordered
	 */
	protected ContentType entity_id;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenericSchemaPackage.Literals.COMMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCid() {
		return cid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCid(int newCid) {
		int oldCid = cid;
		cid = newCid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenericSchemaPackage.COMMENT__CID, oldCid, cid));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GenericSchemaPackage.COMMENT__SUBJECT, oldSubject, subject));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GenericSchemaPackage.COMMENT__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GenericSchemaPackage.COMMENT__MAIL, oldMail, mail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHostname() {
		return hostname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostname(String newHostname) {
		String oldHostname = hostname;
		hostname = newHostname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenericSchemaPackage.COMMENT__HOSTNAME, oldHostname, hostname));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GenericSchemaPackage.COMMENT__CREATED, oldCreated, created));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GenericSchemaPackage.COMMENT__CHANGED, oldChanged, changed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getThread() {
		return thread;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThread(String newThread) {
		String oldThread = thread;
		thread = newThread;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenericSchemaPackage.COMMENT__THREAD, oldThread, thread));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User getUid() {
		if (uid != null && uid.eIsProxy()) {
			InternalEObject oldUid = (InternalEObject)uid;
			uid = (User)eResolveProxy(oldUid);
			if (uid != oldUid) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenericSchemaPackage.COMMENT__UID, oldUid, uid));
			}
		}
		return uid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User basicGetUid() {
		return uid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUid(User newUid) {
		User oldUid = uid;
		uid = newUid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenericSchemaPackage.COMMENT__UID, oldUid, uid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comment getPid() {
		if (pid != null && pid.eIsProxy()) {
			InternalEObject oldPid = (InternalEObject)pid;
			pid = (Comment)eResolveProxy(oldPid);
			if (pid != oldPid) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenericSchemaPackage.COMMENT__PID, oldPid, pid));
			}
		}
		return pid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comment basicGetPid() {
		return pid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPid(Comment newPid) {
		Comment oldPid = pid;
		pid = newPid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenericSchemaPackage.COMMENT__PID, oldPid, pid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentType getEntity_id() {
		if (entity_id != null && entity_id.eIsProxy()) {
			InternalEObject oldEntity_id = (InternalEObject)entity_id;
			entity_id = (ContentType)eResolveProxy(oldEntity_id);
			if (entity_id != oldEntity_id) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenericSchemaPackage.COMMENT__ENTITY_ID, oldEntity_id, entity_id));
			}
		}
		return entity_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentType basicGetEntity_id() {
		return entity_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntity_id(ContentType newEntity_id) {
		ContentType oldEntity_id = entity_id;
		entity_id = newEntity_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenericSchemaPackage.COMMENT__ENTITY_ID, oldEntity_id, entity_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GenericSchemaPackage.COMMENT__CID:
				return getCid();
			case GenericSchemaPackage.COMMENT__SUBJECT:
				return getSubject();
			case GenericSchemaPackage.COMMENT__NAME:
				return getName();
			case GenericSchemaPackage.COMMENT__MAIL:
				return getMail();
			case GenericSchemaPackage.COMMENT__HOSTNAME:
				return getHostname();
			case GenericSchemaPackage.COMMENT__CREATED:
				return getCreated();
			case GenericSchemaPackage.COMMENT__CHANGED:
				return getChanged();
			case GenericSchemaPackage.COMMENT__THREAD:
				return getThread();
			case GenericSchemaPackage.COMMENT__UID:
				if (resolve) return getUid();
				return basicGetUid();
			case GenericSchemaPackage.COMMENT__PID:
				if (resolve) return getPid();
				return basicGetPid();
			case GenericSchemaPackage.COMMENT__ENTITY_ID:
				if (resolve) return getEntity_id();
				return basicGetEntity_id();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GenericSchemaPackage.COMMENT__CID:
				setCid((Integer)newValue);
				return;
			case GenericSchemaPackage.COMMENT__SUBJECT:
				setSubject((String)newValue);
				return;
			case GenericSchemaPackage.COMMENT__NAME:
				setName((String)newValue);
				return;
			case GenericSchemaPackage.COMMENT__MAIL:
				setMail((String)newValue);
				return;
			case GenericSchemaPackage.COMMENT__HOSTNAME:
				setHostname((String)newValue);
				return;
			case GenericSchemaPackage.COMMENT__CREATED:
				setCreated((Date)newValue);
				return;
			case GenericSchemaPackage.COMMENT__CHANGED:
				setChanged((Date)newValue);
				return;
			case GenericSchemaPackage.COMMENT__THREAD:
				setThread((String)newValue);
				return;
			case GenericSchemaPackage.COMMENT__UID:
				setUid((User)newValue);
				return;
			case GenericSchemaPackage.COMMENT__PID:
				setPid((Comment)newValue);
				return;
			case GenericSchemaPackage.COMMENT__ENTITY_ID:
				setEntity_id((ContentType)newValue);
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
			case GenericSchemaPackage.COMMENT__CID:
				setCid(CID_EDEFAULT);
				return;
			case GenericSchemaPackage.COMMENT__SUBJECT:
				setSubject(SUBJECT_EDEFAULT);
				return;
			case GenericSchemaPackage.COMMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GenericSchemaPackage.COMMENT__MAIL:
				setMail(MAIL_EDEFAULT);
				return;
			case GenericSchemaPackage.COMMENT__HOSTNAME:
				setHostname(HOSTNAME_EDEFAULT);
				return;
			case GenericSchemaPackage.COMMENT__CREATED:
				setCreated(CREATED_EDEFAULT);
				return;
			case GenericSchemaPackage.COMMENT__CHANGED:
				setChanged(CHANGED_EDEFAULT);
				return;
			case GenericSchemaPackage.COMMENT__THREAD:
				setThread(THREAD_EDEFAULT);
				return;
			case GenericSchemaPackage.COMMENT__UID:
				setUid((User)null);
				return;
			case GenericSchemaPackage.COMMENT__PID:
				setPid((Comment)null);
				return;
			case GenericSchemaPackage.COMMENT__ENTITY_ID:
				setEntity_id((ContentType)null);
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
			case GenericSchemaPackage.COMMENT__CID:
				return cid != CID_EDEFAULT;
			case GenericSchemaPackage.COMMENT__SUBJECT:
				return SUBJECT_EDEFAULT == null ? subject != null : !SUBJECT_EDEFAULT.equals(subject);
			case GenericSchemaPackage.COMMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GenericSchemaPackage.COMMENT__MAIL:
				return MAIL_EDEFAULT == null ? mail != null : !MAIL_EDEFAULT.equals(mail);
			case GenericSchemaPackage.COMMENT__HOSTNAME:
				return HOSTNAME_EDEFAULT == null ? hostname != null : !HOSTNAME_EDEFAULT.equals(hostname);
			case GenericSchemaPackage.COMMENT__CREATED:
				return CREATED_EDEFAULT == null ? created != null : !CREATED_EDEFAULT.equals(created);
			case GenericSchemaPackage.COMMENT__CHANGED:
				return CHANGED_EDEFAULT == null ? changed != null : !CHANGED_EDEFAULT.equals(changed);
			case GenericSchemaPackage.COMMENT__THREAD:
				return THREAD_EDEFAULT == null ? thread != null : !THREAD_EDEFAULT.equals(thread);
			case GenericSchemaPackage.COMMENT__UID:
				return uid != null;
			case GenericSchemaPackage.COMMENT__PID:
				return pid != null;
			case GenericSchemaPackage.COMMENT__ENTITY_ID:
				return entity_id != null;
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
		result.append(" (cid: ");
		result.append(cid);
		result.append(", subject: ");
		result.append(subject);
		result.append(", name: ");
		result.append(name);
		result.append(", mail: ");
		result.append(mail);
		result.append(", hostname: ");
		result.append(hostname);
		result.append(", created: ");
		result.append(created);
		result.append(", changed: ");
		result.append(changed);
		result.append(", thread: ");
		result.append(thread);
		result.append(')');
		return result.toString();
	}

} //CommentImpl
