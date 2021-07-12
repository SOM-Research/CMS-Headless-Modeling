/**
 */
package edu.uoc.som.cmsdiscover.GenericModel.genericSchema.impl;

import edu.uoc.som.cmsdiscover.GenericModel.features.revisions.Revision;

import edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Block;
import edu.uoc.som.cmsdiscover.GenericModel.genericSchema.GenericSchemaPackage;

import edu.uoc.som.cmsdiscover.GenericModel.impl.ContentEntityImpl;

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
 * An implementation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.impl.BlockImpl#getId <em>Id</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.impl.BlockImpl#getVid <em>Vid</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.impl.BlockImpl#isStatus <em>Status</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.impl.BlockImpl#getChanged <em>Changed</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.impl.BlockImpl#isReusable <em>Reusable</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.impl.BlockImpl#getRevision_default <em>Revision default</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.impl.BlockImpl#getRevisions <em>Revisions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BlockImpl extends ContentEntityImpl implements Block {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

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
	 * The default value of the '{@link #isReusable() <em>Reusable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReusable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REUSABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReusable() <em>Reusable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReusable()
	 * @generated
	 * @ordered
	 */
	protected boolean reusable = REUSABLE_EDEFAULT;

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
	protected BlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenericSchemaPackage.Literals.BLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenericSchemaPackage.BLOCK__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GenericSchemaPackage.BLOCK__VID, oldVid, vid));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GenericSchemaPackage.BLOCK__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GenericSchemaPackage.BLOCK__CHANGED, oldChanged, changed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReusable() {
		return reusable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReusable(boolean newReusable) {
		boolean oldReusable = reusable;
		reusable = newReusable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenericSchemaPackage.BLOCK__REUSABLE, oldReusable, reusable));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenericSchemaPackage.BLOCK__REVISION_DEFAULT, oldRevision_default, revision_default));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GenericSchemaPackage.BLOCK__REVISION_DEFAULT, oldRevision_default, revision_default));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Revision> getRevisions() {
		if (revisions == null) {
			revisions = new EObjectContainmentEList<Revision>(Revision.class, this, GenericSchemaPackage.BLOCK__REVISIONS);
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
			case GenericSchemaPackage.BLOCK__REVISIONS:
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
			case GenericSchemaPackage.BLOCK__ID:
				return getId();
			case GenericSchemaPackage.BLOCK__VID:
				return getVid();
			case GenericSchemaPackage.BLOCK__STATUS:
				return isStatus();
			case GenericSchemaPackage.BLOCK__CHANGED:
				return getChanged();
			case GenericSchemaPackage.BLOCK__REUSABLE:
				return isReusable();
			case GenericSchemaPackage.BLOCK__REVISION_DEFAULT:
				if (resolve) return getRevision_default();
				return basicGetRevision_default();
			case GenericSchemaPackage.BLOCK__REVISIONS:
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
			case GenericSchemaPackage.BLOCK__ID:
				setId((Integer)newValue);
				return;
			case GenericSchemaPackage.BLOCK__VID:
				setVid((Integer)newValue);
				return;
			case GenericSchemaPackage.BLOCK__STATUS:
				setStatus((Boolean)newValue);
				return;
			case GenericSchemaPackage.BLOCK__CHANGED:
				setChanged((Date)newValue);
				return;
			case GenericSchemaPackage.BLOCK__REUSABLE:
				setReusable((Boolean)newValue);
				return;
			case GenericSchemaPackage.BLOCK__REVISION_DEFAULT:
				setRevision_default((Revision)newValue);
				return;
			case GenericSchemaPackage.BLOCK__REVISIONS:
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
			case GenericSchemaPackage.BLOCK__ID:
				setId(ID_EDEFAULT);
				return;
			case GenericSchemaPackage.BLOCK__VID:
				setVid(VID_EDEFAULT);
				return;
			case GenericSchemaPackage.BLOCK__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case GenericSchemaPackage.BLOCK__CHANGED:
				setChanged(CHANGED_EDEFAULT);
				return;
			case GenericSchemaPackage.BLOCK__REUSABLE:
				setReusable(REUSABLE_EDEFAULT);
				return;
			case GenericSchemaPackage.BLOCK__REVISION_DEFAULT:
				setRevision_default((Revision)null);
				return;
			case GenericSchemaPackage.BLOCK__REVISIONS:
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
			case GenericSchemaPackage.BLOCK__ID:
				return id != ID_EDEFAULT;
			case GenericSchemaPackage.BLOCK__VID:
				return vid != VID_EDEFAULT;
			case GenericSchemaPackage.BLOCK__STATUS:
				return status != STATUS_EDEFAULT;
			case GenericSchemaPackage.BLOCK__CHANGED:
				return CHANGED_EDEFAULT == null ? changed != null : !CHANGED_EDEFAULT.equals(changed);
			case GenericSchemaPackage.BLOCK__REUSABLE:
				return reusable != REUSABLE_EDEFAULT;
			case GenericSchemaPackage.BLOCK__REVISION_DEFAULT:
				return revision_default != null;
			case GenericSchemaPackage.BLOCK__REVISIONS:
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
		result.append(" (id: ");
		result.append(id);
		result.append(", vid: ");
		result.append(vid);
		result.append(", status: ");
		result.append(status);
		result.append(", changed: ");
		result.append(changed);
		result.append(", reusable: ");
		result.append(reusable);
		result.append(')');
		return result.toString();
	}

} //BlockImpl
