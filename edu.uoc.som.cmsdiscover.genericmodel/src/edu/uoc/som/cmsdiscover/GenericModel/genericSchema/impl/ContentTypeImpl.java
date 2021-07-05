/**
 */
package edu.uoc.som.cmsdiscover.GenericModel.genericSchema.impl;

import edu.uoc.som.cmsdiscover.GenericModel.features.moderation.State;

import edu.uoc.som.cmsdiscover.GenericModel.features.revisions.Revision;

import edu.uoc.som.cmsdiscover.GenericModel.genericSchema.ContentType;
import edu.uoc.som.cmsdiscover.GenericModel.genericSchema.GenericSchemaPackage;

import edu.uoc.som.cmsdiscover.GenericModel.impl.ContentEntityImpl;

import edu.uoc.som.cmsdiscover.GenericModel.user.User;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Content Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.impl.ContentTypeImpl#getContentId <em>Content Id</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.impl.ContentTypeImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.impl.ContentTypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.impl.ContentTypeImpl#isStatus <em>Status</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.impl.ContentTypeImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.impl.ContentTypeImpl#getChanged <em>Changed</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.impl.ContentTypeImpl#getRevision_default <em>Revision default</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.impl.ContentTypeImpl#getRevisions <em>Revisions</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.impl.ContentTypeImpl#getModeration_state <em>Moderation state</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContentTypeImpl extends ContentEntityImpl implements ContentType {
	/**
	 * The default value of the '{@link #getContentId() <em>Content Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentId()
	 * @generated
	 * @ordered
	 */
	protected static final int CONTENT_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getContentId() <em>Content Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentId()
	 * @generated
	 * @ordered
	 */
	protected int contentId = CONTENT_ID_EDEFAULT;

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
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

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
	 * The cached value of the '{@link #getRevision_default() <em>Revision default</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevision_default()
	 * @generated
	 * @ordered
	 */
	protected Revision revision_default;

	/**
	 * The cached value of the '{@link #getRevisions() <em>Revisions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevisions()
	 * @generated
	 * @ordered
	 */
	protected EList<Revision> revisions;

	/**
	 * The cached value of the '{@link #getModeration_state() <em>Moderation state</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModeration_state()
	 * @generated
	 * @ordered
	 */
	protected State moderation_state;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenericSchemaPackage.Literals.CONTENT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getContentId() {
		return contentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContentId(int newContentId) {
		int oldContentId = contentId;
		contentId = newContentId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenericSchemaPackage.CONTENT_TYPE__CONTENT_ID, oldContentId, contentId));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenericSchemaPackage.CONTENT_TYPE__UID, oldUid, uid));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GenericSchemaPackage.CONTENT_TYPE__UID, oldUid, uid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenericSchemaPackage.CONTENT_TYPE__TITLE, oldTitle, title));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GenericSchemaPackage.CONTENT_TYPE__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GenericSchemaPackage.CONTENT_TYPE__CREATED, oldCreated, created));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GenericSchemaPackage.CONTENT_TYPE__CHANGED, oldChanged, changed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Revision getRevision_default() {
		if (revision_default != null && revision_default.eIsProxy()) {
			InternalEObject oldRevision_default = (InternalEObject)revision_default;
			revision_default = (Revision)eResolveProxy(oldRevision_default);
			if (revision_default != oldRevision_default) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenericSchemaPackage.CONTENT_TYPE__REVISION_DEFAULT, oldRevision_default, revision_default));
			}
		}
		return revision_default;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Revision basicGetRevision_default() {
		return revision_default;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRevision_default(Revision newRevision_default) {
		Revision oldRevision_default = revision_default;
		revision_default = newRevision_default;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenericSchemaPackage.CONTENT_TYPE__REVISION_DEFAULT, oldRevision_default, revision_default));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Revision> getRevisions() {
		if (revisions == null) {
			revisions = new EObjectContainmentEList<Revision>(Revision.class, this, GenericSchemaPackage.CONTENT_TYPE__REVISIONS);
		}
		return revisions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getModeration_state() {
		if (moderation_state != null && moderation_state.eIsProxy()) {
			InternalEObject oldModeration_state = (InternalEObject)moderation_state;
			moderation_state = (State)eResolveProxy(oldModeration_state);
			if (moderation_state != oldModeration_state) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenericSchemaPackage.CONTENT_TYPE__MODERATION_STATE, oldModeration_state, moderation_state));
			}
		}
		return moderation_state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetModeration_state() {
		return moderation_state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModeration_state(State newModeration_state) {
		State oldModeration_state = moderation_state;
		moderation_state = newModeration_state;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenericSchemaPackage.CONTENT_TYPE__MODERATION_STATE, oldModeration_state, moderation_state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GenericSchemaPackage.CONTENT_TYPE__REVISIONS:
				return ((InternalEList<?>)getRevisions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GenericSchemaPackage.CONTENT_TYPE__CONTENT_ID:
				return getContentId();
			case GenericSchemaPackage.CONTENT_TYPE__UID:
				if (resolve) return getUid();
				return basicGetUid();
			case GenericSchemaPackage.CONTENT_TYPE__TITLE:
				return getTitle();
			case GenericSchemaPackage.CONTENT_TYPE__STATUS:
				return isStatus();
			case GenericSchemaPackage.CONTENT_TYPE__CREATED:
				return getCreated();
			case GenericSchemaPackage.CONTENT_TYPE__CHANGED:
				return getChanged();
			case GenericSchemaPackage.CONTENT_TYPE__REVISION_DEFAULT:
				if (resolve) return getRevision_default();
				return basicGetRevision_default();
			case GenericSchemaPackage.CONTENT_TYPE__REVISIONS:
				return getRevisions();
			case GenericSchemaPackage.CONTENT_TYPE__MODERATION_STATE:
				if (resolve) return getModeration_state();
				return basicGetModeration_state();
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
			case GenericSchemaPackage.CONTENT_TYPE__CONTENT_ID:
				setContentId((Integer)newValue);
				return;
			case GenericSchemaPackage.CONTENT_TYPE__UID:
				setUid((User)newValue);
				return;
			case GenericSchemaPackage.CONTENT_TYPE__TITLE:
				setTitle((String)newValue);
				return;
			case GenericSchemaPackage.CONTENT_TYPE__STATUS:
				setStatus((Boolean)newValue);
				return;
			case GenericSchemaPackage.CONTENT_TYPE__CREATED:
				setCreated((Date)newValue);
				return;
			case GenericSchemaPackage.CONTENT_TYPE__CHANGED:
				setChanged((Date)newValue);
				return;
			case GenericSchemaPackage.CONTENT_TYPE__REVISION_DEFAULT:
				setRevision_default((Revision)newValue);
				return;
			case GenericSchemaPackage.CONTENT_TYPE__REVISIONS:
				getRevisions().clear();
				getRevisions().addAll((Collection<? extends Revision>)newValue);
				return;
			case GenericSchemaPackage.CONTENT_TYPE__MODERATION_STATE:
				setModeration_state((State)newValue);
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
			case GenericSchemaPackage.CONTENT_TYPE__CONTENT_ID:
				setContentId(CONTENT_ID_EDEFAULT);
				return;
			case GenericSchemaPackage.CONTENT_TYPE__UID:
				setUid((User)null);
				return;
			case GenericSchemaPackage.CONTENT_TYPE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case GenericSchemaPackage.CONTENT_TYPE__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case GenericSchemaPackage.CONTENT_TYPE__CREATED:
				setCreated(CREATED_EDEFAULT);
				return;
			case GenericSchemaPackage.CONTENT_TYPE__CHANGED:
				setChanged(CHANGED_EDEFAULT);
				return;
			case GenericSchemaPackage.CONTENT_TYPE__REVISION_DEFAULT:
				setRevision_default((Revision)null);
				return;
			case GenericSchemaPackage.CONTENT_TYPE__REVISIONS:
				getRevisions().clear();
				return;
			case GenericSchemaPackage.CONTENT_TYPE__MODERATION_STATE:
				setModeration_state((State)null);
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
			case GenericSchemaPackage.CONTENT_TYPE__CONTENT_ID:
				return contentId != CONTENT_ID_EDEFAULT;
			case GenericSchemaPackage.CONTENT_TYPE__UID:
				return uid != null;
			case GenericSchemaPackage.CONTENT_TYPE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case GenericSchemaPackage.CONTENT_TYPE__STATUS:
				return status != STATUS_EDEFAULT;
			case GenericSchemaPackage.CONTENT_TYPE__CREATED:
				return CREATED_EDEFAULT == null ? created != null : !CREATED_EDEFAULT.equals(created);
			case GenericSchemaPackage.CONTENT_TYPE__CHANGED:
				return CHANGED_EDEFAULT == null ? changed != null : !CHANGED_EDEFAULT.equals(changed);
			case GenericSchemaPackage.CONTENT_TYPE__REVISION_DEFAULT:
				return revision_default != null;
			case GenericSchemaPackage.CONTENT_TYPE__REVISIONS:
				return revisions != null && !revisions.isEmpty();
			case GenericSchemaPackage.CONTENT_TYPE__MODERATION_STATE:
				return moderation_state != null;
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
		result.append(" (contentId: ");
		result.append(contentId);
		result.append(", title: ");
		result.append(title);
		result.append(", status: ");
		result.append(status);
		result.append(", created: ");
		result.append(created);
		result.append(", changed: ");
		result.append(changed);
		result.append(')');
		return result.toString();
	}

} //ContentTypeImpl
