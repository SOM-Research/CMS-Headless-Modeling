/**
 */
package edu.uoc.som.cmsdiscover.GenericModel.genericSchema.impl;

import edu.uoc.som.cmsdiscover.GenericModel.features.revisions.Revision;

import edu.uoc.som.cmsdiscover.GenericModel.genericSchema.File;
import edu.uoc.som.cmsdiscover.GenericModel.genericSchema.GenericSchemaPackage;
import edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Media;

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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Media</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.impl.MediaImpl#getMid <em>Mid</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.impl.MediaImpl#getVid <em>Vid</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.impl.MediaImpl#getName <em>Name</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.impl.MediaImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.impl.MediaImpl#isStatus <em>Status</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.impl.MediaImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.impl.MediaImpl#getChanged <em>Changed</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.impl.MediaImpl#getThumbnail <em>Thumbnail</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.impl.MediaImpl#getFile_reference <em>File reference</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.impl.MediaImpl#getRevision_default <em>Revision default</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.impl.MediaImpl#getRevisions <em>Revisions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MediaImpl extends ContentEntityImpl implements Media {
	/**
	 * The default value of the '{@link #getMid() <em>Mid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMid()
	 * @generated
	 * @ordered
	 */
	protected static final int MID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMid() <em>Mid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMid()
	 * @generated
	 * @ordered
	 */
	protected int mid = MID_EDEFAULT;

	/**
	 * The default value of the '{@link #getVid() <em>Vid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVid()
	 * @generated
	 * @ordered
	 */
	protected static final int VID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getVid() <em>Vid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVid()
	 * @generated
	 * @ordered
	 */
	protected int vid = VID_EDEFAULT;

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
	 * The cached value of the '{@link #getUid() <em>Uid</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUid()
	 * @generated
	 * @ordered
	 */
	protected User uid;

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
	 * The default value of the '{@link #getThumbnail() <em>Thumbnail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThumbnail()
	 * @generated
	 * @ordered
	 */
	protected static final Object THUMBNAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThumbnail() <em>Thumbnail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThumbnail()
	 * @generated
	 * @ordered
	 */
	protected Object thumbnail = THUMBNAIL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFile_reference() <em>File reference</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFile_reference()
	 * @generated
	 * @ordered
	 */
	protected EList<File> file_reference;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MediaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenericSchemaPackage.Literals.MEDIA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMid() {
		return mid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMid(int newMid) {
		int oldMid = mid;
		mid = newMid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenericSchemaPackage.MEDIA__MID, oldMid, mid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getVid() {
		return vid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVid(int newVid) {
		int oldVid = vid;
		vid = newVid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenericSchemaPackage.MEDIA__VID, oldVid, vid));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GenericSchemaPackage.MEDIA__NAME, oldName, name));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenericSchemaPackage.MEDIA__UID, oldUid, uid));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GenericSchemaPackage.MEDIA__UID, oldUid, uid));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GenericSchemaPackage.MEDIA__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GenericSchemaPackage.MEDIA__CREATED, oldCreated, created));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GenericSchemaPackage.MEDIA__CHANGED, oldChanged, changed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getThumbnail() {
		return thumbnail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThumbnail(Object newThumbnail) {
		Object oldThumbnail = thumbnail;
		thumbnail = newThumbnail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenericSchemaPackage.MEDIA__THUMBNAIL, oldThumbnail, thumbnail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<File> getFile_reference() {
		if (file_reference == null) {
			file_reference = new EObjectResolvingEList<File>(File.class, this, GenericSchemaPackage.MEDIA__FILE_REFERENCE);
		}
		return file_reference;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenericSchemaPackage.MEDIA__REVISION_DEFAULT, oldRevision_default, revision_default));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GenericSchemaPackage.MEDIA__REVISION_DEFAULT, oldRevision_default, revision_default));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Revision> getRevisions() {
		if (revisions == null) {
			revisions = new EObjectContainmentEList<Revision>(Revision.class, this, GenericSchemaPackage.MEDIA__REVISIONS);
		}
		return revisions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GenericSchemaPackage.MEDIA__REVISIONS:
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
			case GenericSchemaPackage.MEDIA__MID:
				return getMid();
			case GenericSchemaPackage.MEDIA__VID:
				return getVid();
			case GenericSchemaPackage.MEDIA__NAME:
				return getName();
			case GenericSchemaPackage.MEDIA__UID:
				if (resolve) return getUid();
				return basicGetUid();
			case GenericSchemaPackage.MEDIA__STATUS:
				return isStatus();
			case GenericSchemaPackage.MEDIA__CREATED:
				return getCreated();
			case GenericSchemaPackage.MEDIA__CHANGED:
				return getChanged();
			case GenericSchemaPackage.MEDIA__THUMBNAIL:
				return getThumbnail();
			case GenericSchemaPackage.MEDIA__FILE_REFERENCE:
				return getFile_reference();
			case GenericSchemaPackage.MEDIA__REVISION_DEFAULT:
				if (resolve) return getRevision_default();
				return basicGetRevision_default();
			case GenericSchemaPackage.MEDIA__REVISIONS:
				return getRevisions();
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
			case GenericSchemaPackage.MEDIA__MID:
				setMid((Integer)newValue);
				return;
			case GenericSchemaPackage.MEDIA__VID:
				setVid((Integer)newValue);
				return;
			case GenericSchemaPackage.MEDIA__NAME:
				setName((String)newValue);
				return;
			case GenericSchemaPackage.MEDIA__UID:
				setUid((User)newValue);
				return;
			case GenericSchemaPackage.MEDIA__STATUS:
				setStatus((Boolean)newValue);
				return;
			case GenericSchemaPackage.MEDIA__CREATED:
				setCreated((Date)newValue);
				return;
			case GenericSchemaPackage.MEDIA__CHANGED:
				setChanged((Date)newValue);
				return;
			case GenericSchemaPackage.MEDIA__THUMBNAIL:
				setThumbnail(newValue);
				return;
			case GenericSchemaPackage.MEDIA__FILE_REFERENCE:
				getFile_reference().clear();
				getFile_reference().addAll((Collection<? extends File>)newValue);
				return;
			case GenericSchemaPackage.MEDIA__REVISION_DEFAULT:
				setRevision_default((Revision)newValue);
				return;
			case GenericSchemaPackage.MEDIA__REVISIONS:
				getRevisions().clear();
				getRevisions().addAll((Collection<? extends Revision>)newValue);
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
			case GenericSchemaPackage.MEDIA__MID:
				setMid(MID_EDEFAULT);
				return;
			case GenericSchemaPackage.MEDIA__VID:
				setVid(VID_EDEFAULT);
				return;
			case GenericSchemaPackage.MEDIA__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GenericSchemaPackage.MEDIA__UID:
				setUid((User)null);
				return;
			case GenericSchemaPackage.MEDIA__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case GenericSchemaPackage.MEDIA__CREATED:
				setCreated(CREATED_EDEFAULT);
				return;
			case GenericSchemaPackage.MEDIA__CHANGED:
				setChanged(CHANGED_EDEFAULT);
				return;
			case GenericSchemaPackage.MEDIA__THUMBNAIL:
				setThumbnail(THUMBNAIL_EDEFAULT);
				return;
			case GenericSchemaPackage.MEDIA__FILE_REFERENCE:
				getFile_reference().clear();
				return;
			case GenericSchemaPackage.MEDIA__REVISION_DEFAULT:
				setRevision_default((Revision)null);
				return;
			case GenericSchemaPackage.MEDIA__REVISIONS:
				getRevisions().clear();
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
			case GenericSchemaPackage.MEDIA__MID:
				return mid != MID_EDEFAULT;
			case GenericSchemaPackage.MEDIA__VID:
				return vid != VID_EDEFAULT;
			case GenericSchemaPackage.MEDIA__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GenericSchemaPackage.MEDIA__UID:
				return uid != null;
			case GenericSchemaPackage.MEDIA__STATUS:
				return status != STATUS_EDEFAULT;
			case GenericSchemaPackage.MEDIA__CREATED:
				return CREATED_EDEFAULT == null ? created != null : !CREATED_EDEFAULT.equals(created);
			case GenericSchemaPackage.MEDIA__CHANGED:
				return CHANGED_EDEFAULT == null ? changed != null : !CHANGED_EDEFAULT.equals(changed);
			case GenericSchemaPackage.MEDIA__THUMBNAIL:
				return THUMBNAIL_EDEFAULT == null ? thumbnail != null : !THUMBNAIL_EDEFAULT.equals(thumbnail);
			case GenericSchemaPackage.MEDIA__FILE_REFERENCE:
				return file_reference != null && !file_reference.isEmpty();
			case GenericSchemaPackage.MEDIA__REVISION_DEFAULT:
				return revision_default != null;
			case GenericSchemaPackage.MEDIA__REVISIONS:
				return revisions != null && !revisions.isEmpty();
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
		result.append(" (mid: ");
		result.append(mid);
		result.append(", vid: ");
		result.append(vid);
		result.append(", name: ");
		result.append(name);
		result.append(", status: ");
		result.append(status);
		result.append(", created: ");
		result.append(created);
		result.append(", changed: ");
		result.append(changed);
		result.append(", thumbnail: ");
		result.append(thumbnail);
		result.append(')');
		return result.toString();
	}

} //MediaImpl
