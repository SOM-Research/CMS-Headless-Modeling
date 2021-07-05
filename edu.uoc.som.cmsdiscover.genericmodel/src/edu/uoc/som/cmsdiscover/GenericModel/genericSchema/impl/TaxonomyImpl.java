/**
 */
package edu.uoc.som.cmsdiscover.GenericModel.genericSchema.impl;

import edu.uoc.som.cmsdiscover.GenericModel.features.revisions.Revision;

import edu.uoc.som.cmsdiscover.GenericModel.genericSchema.GenericSchemaPackage;
import edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Taxonomy;

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
 * An implementation of the model object '<em><b>Taxonomy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.impl.TaxonomyImpl#getTid <em>Tid</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.impl.TaxonomyImpl#getVid <em>Vid</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.impl.TaxonomyImpl#getName <em>Name</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.impl.TaxonomyImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.impl.TaxonomyImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.impl.TaxonomyImpl#getChanged <em>Changed</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.impl.TaxonomyImpl#getRevision_default <em>Revision default</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.impl.TaxonomyImpl#getRevisions <em>Revisions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaxonomyImpl extends ContentEntityImpl implements Taxonomy {
	/**
	 * The default value of the '{@link #getTid() <em>Tid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTid()
	 * @generated
	 * @ordered
	 */
	protected static final int TID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTid() <em>Tid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTid()
	 * @generated
	 * @ordered
	 */
	protected int tid = TID_EDEFAULT;

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
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getParent() <em>Parent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected static final String PARENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected String parent = PARENT_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaxonomyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenericSchemaPackage.Literals.TAXONOMY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTid() {
		return tid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTid(int newTid) {
		int oldTid = tid;
		tid = newTid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenericSchemaPackage.TAXONOMY__TID, oldTid, tid));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GenericSchemaPackage.TAXONOMY__VID, oldVid, vid));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GenericSchemaPackage.TAXONOMY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenericSchemaPackage.TAXONOMY__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParent() {
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(String newParent) {
		String oldParent = parent;
		parent = newParent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenericSchemaPackage.TAXONOMY__PARENT, oldParent, parent));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GenericSchemaPackage.TAXONOMY__CHANGED, oldChanged, changed));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenericSchemaPackage.TAXONOMY__REVISION_DEFAULT, oldRevision_default, revision_default));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GenericSchemaPackage.TAXONOMY__REVISION_DEFAULT, oldRevision_default, revision_default));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Revision> getRevisions() {
		if (revisions == null) {
			revisions = new EObjectContainmentEList<Revision>(Revision.class, this, GenericSchemaPackage.TAXONOMY__REVISIONS);
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
			case GenericSchemaPackage.TAXONOMY__REVISIONS:
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
			case GenericSchemaPackage.TAXONOMY__TID:
				return getTid();
			case GenericSchemaPackage.TAXONOMY__VID:
				return getVid();
			case GenericSchemaPackage.TAXONOMY__NAME:
				return getName();
			case GenericSchemaPackage.TAXONOMY__DESCRIPTION:
				return getDescription();
			case GenericSchemaPackage.TAXONOMY__PARENT:
				return getParent();
			case GenericSchemaPackage.TAXONOMY__CHANGED:
				return getChanged();
			case GenericSchemaPackage.TAXONOMY__REVISION_DEFAULT:
				if (resolve) return getRevision_default();
				return basicGetRevision_default();
			case GenericSchemaPackage.TAXONOMY__REVISIONS:
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
			case GenericSchemaPackage.TAXONOMY__TID:
				setTid((Integer)newValue);
				return;
			case GenericSchemaPackage.TAXONOMY__VID:
				setVid((Integer)newValue);
				return;
			case GenericSchemaPackage.TAXONOMY__NAME:
				setName((String)newValue);
				return;
			case GenericSchemaPackage.TAXONOMY__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case GenericSchemaPackage.TAXONOMY__PARENT:
				setParent((String)newValue);
				return;
			case GenericSchemaPackage.TAXONOMY__CHANGED:
				setChanged((Date)newValue);
				return;
			case GenericSchemaPackage.TAXONOMY__REVISION_DEFAULT:
				setRevision_default((Revision)newValue);
				return;
			case GenericSchemaPackage.TAXONOMY__REVISIONS:
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
			case GenericSchemaPackage.TAXONOMY__TID:
				setTid(TID_EDEFAULT);
				return;
			case GenericSchemaPackage.TAXONOMY__VID:
				setVid(VID_EDEFAULT);
				return;
			case GenericSchemaPackage.TAXONOMY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GenericSchemaPackage.TAXONOMY__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case GenericSchemaPackage.TAXONOMY__PARENT:
				setParent(PARENT_EDEFAULT);
				return;
			case GenericSchemaPackage.TAXONOMY__CHANGED:
				setChanged(CHANGED_EDEFAULT);
				return;
			case GenericSchemaPackage.TAXONOMY__REVISION_DEFAULT:
				setRevision_default((Revision)null);
				return;
			case GenericSchemaPackage.TAXONOMY__REVISIONS:
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
			case GenericSchemaPackage.TAXONOMY__TID:
				return tid != TID_EDEFAULT;
			case GenericSchemaPackage.TAXONOMY__VID:
				return vid != VID_EDEFAULT;
			case GenericSchemaPackage.TAXONOMY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GenericSchemaPackage.TAXONOMY__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case GenericSchemaPackage.TAXONOMY__PARENT:
				return PARENT_EDEFAULT == null ? parent != null : !PARENT_EDEFAULT.equals(parent);
			case GenericSchemaPackage.TAXONOMY__CHANGED:
				return CHANGED_EDEFAULT == null ? changed != null : !CHANGED_EDEFAULT.equals(changed);
			case GenericSchemaPackage.TAXONOMY__REVISION_DEFAULT:
				return revision_default != null;
			case GenericSchemaPackage.TAXONOMY__REVISIONS:
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
		result.append(" (tid: ");
		result.append(tid);
		result.append(", vid: ");
		result.append(vid);
		result.append(", name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(", parent: ");
		result.append(parent);
		result.append(", changed: ");
		result.append(changed);
		result.append(')');
		return result.toString();
	}

} //TaxonomyImpl
