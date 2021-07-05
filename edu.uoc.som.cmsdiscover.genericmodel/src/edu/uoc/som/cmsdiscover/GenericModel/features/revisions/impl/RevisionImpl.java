/**
 */
package edu.uoc.som.cmsdiscover.GenericModel.features.revisions.impl;

import edu.uoc.som.cmsdiscover.GenericModel.features.revisions.Revision;
import edu.uoc.som.cmsdiscover.GenericModel.features.revisions.RevisionsPackage;

import edu.uoc.som.cmsdiscover.GenericModel.user.User;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Revision</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.features.revisions.impl.RevisionImpl#getVid <em>Vid</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.features.revisions.impl.RevisionImpl#getRevision_uid <em>Revision uid</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.features.revisions.impl.RevisionImpl#getRevision_timestamp <em>Revision timestamp</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.features.revisions.impl.RevisionImpl#getRevision_log <em>Revision log</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RevisionImpl extends MinimalEObjectImpl.Container implements Revision {
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
	 * The cached value of the '{@link #getRevision_uid() <em>Revision uid</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevision_uid()
	 * @generated
	 * @ordered
	 */
	protected User revision_uid;

	/**
	 * The default value of the '{@link #getRevision_timestamp() <em>Revision timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevision_timestamp()
	 * @generated
	 * @ordered
	 */
	protected static final Date REVISION_TIMESTAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRevision_timestamp() <em>Revision timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevision_timestamp()
	 * @generated
	 * @ordered
	 */
	protected Date revision_timestamp = REVISION_TIMESTAMP_EDEFAULT;

	/**
	 * The default value of the '{@link #getRevision_log() <em>Revision log</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevision_log()
	 * @generated
	 * @ordered
	 */
	protected static final String REVISION_LOG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRevision_log() <em>Revision log</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevision_log()
	 * @generated
	 * @ordered
	 */
	protected String revision_log = REVISION_LOG_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RevisionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RevisionsPackage.Literals.REVISION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RevisionsPackage.REVISION__VID, oldVid, vid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User getRevision_uid() {
		if (revision_uid != null && revision_uid.eIsProxy()) {
			InternalEObject oldRevision_uid = (InternalEObject)revision_uid;
			revision_uid = (User)eResolveProxy(oldRevision_uid);
			if (revision_uid != oldRevision_uid) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RevisionsPackage.REVISION__REVISION_UID, oldRevision_uid, revision_uid));
			}
		}
		return revision_uid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User basicGetRevision_uid() {
		return revision_uid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRevision_uid(User newRevision_uid) {
		User oldRevision_uid = revision_uid;
		revision_uid = newRevision_uid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RevisionsPackage.REVISION__REVISION_UID, oldRevision_uid, revision_uid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getRevision_timestamp() {
		return revision_timestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRevision_timestamp(Date newRevision_timestamp) {
		Date oldRevision_timestamp = revision_timestamp;
		revision_timestamp = newRevision_timestamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RevisionsPackage.REVISION__REVISION_TIMESTAMP, oldRevision_timestamp, revision_timestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRevision_log() {
		return revision_log;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRevision_log(String newRevision_log) {
		String oldRevision_log = revision_log;
		revision_log = newRevision_log;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RevisionsPackage.REVISION__REVISION_LOG, oldRevision_log, revision_log));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RevisionsPackage.REVISION__VID:
				return getVid();
			case RevisionsPackage.REVISION__REVISION_UID:
				if (resolve) return getRevision_uid();
				return basicGetRevision_uid();
			case RevisionsPackage.REVISION__REVISION_TIMESTAMP:
				return getRevision_timestamp();
			case RevisionsPackage.REVISION__REVISION_LOG:
				return getRevision_log();
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
			case RevisionsPackage.REVISION__VID:
				setVid((Integer)newValue);
				return;
			case RevisionsPackage.REVISION__REVISION_UID:
				setRevision_uid((User)newValue);
				return;
			case RevisionsPackage.REVISION__REVISION_TIMESTAMP:
				setRevision_timestamp((Date)newValue);
				return;
			case RevisionsPackage.REVISION__REVISION_LOG:
				setRevision_log((String)newValue);
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
			case RevisionsPackage.REVISION__VID:
				setVid(VID_EDEFAULT);
				return;
			case RevisionsPackage.REVISION__REVISION_UID:
				setRevision_uid((User)null);
				return;
			case RevisionsPackage.REVISION__REVISION_TIMESTAMP:
				setRevision_timestamp(REVISION_TIMESTAMP_EDEFAULT);
				return;
			case RevisionsPackage.REVISION__REVISION_LOG:
				setRevision_log(REVISION_LOG_EDEFAULT);
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
			case RevisionsPackage.REVISION__VID:
				return vid != VID_EDEFAULT;
			case RevisionsPackage.REVISION__REVISION_UID:
				return revision_uid != null;
			case RevisionsPackage.REVISION__REVISION_TIMESTAMP:
				return REVISION_TIMESTAMP_EDEFAULT == null ? revision_timestamp != null : !REVISION_TIMESTAMP_EDEFAULT.equals(revision_timestamp);
			case RevisionsPackage.REVISION__REVISION_LOG:
				return REVISION_LOG_EDEFAULT == null ? revision_log != null : !REVISION_LOG_EDEFAULT.equals(revision_log);
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
		result.append(" (vid: ");
		result.append(vid);
		result.append(", revision_timestamp: ");
		result.append(revision_timestamp);
		result.append(", revision_log: ");
		result.append(revision_log);
		result.append(')');
		return result.toString();
	}

} //RevisionImpl
