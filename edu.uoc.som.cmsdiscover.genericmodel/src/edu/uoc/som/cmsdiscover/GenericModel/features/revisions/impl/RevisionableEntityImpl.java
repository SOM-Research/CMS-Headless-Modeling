/**
 */
package edu.uoc.som.cmsdiscover.GenericModel.features.revisions.impl;

import edu.uoc.som.cmsdiscover.GenericModel.features.revisions.Revision;
import edu.uoc.som.cmsdiscover.GenericModel.features.revisions.RevisionableEntity;
import edu.uoc.som.cmsdiscover.GenericModel.features.revisions.RevisionsPackage;

import edu.uoc.som.cmsdiscover.GenericModel.impl.ContentEntityImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Revisionable Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.features.revisions.impl.RevisionableEntityImpl#getRevisions <em>Revisions</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.features.revisions.impl.RevisionableEntityImpl#getDefaultRevision <em>Default Revision</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RevisionableEntityImpl extends ContentEntityImpl implements RevisionableEntity {
	/**
	 * The cached value of the '{@link #getRevisions() <em>Revisions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevisions()
	 * @generated
	 * @ordered
	 */
	protected EList<Revision> revisions;

	/**
	 * The cached value of the '{@link #getDefaultRevision() <em>Default Revision</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultRevision()
	 * @generated
	 * @ordered
	 */
	protected Revision defaultRevision;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RevisionableEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RevisionsPackage.Literals.REVISIONABLE_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Revision> getRevisions() {
		if (revisions == null) {
			revisions = new EObjectResolvingEList<Revision>(Revision.class, this, RevisionsPackage.REVISIONABLE_ENTITY__REVISIONS);
		}
		return revisions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Revision getDefaultRevision() {
		if (defaultRevision != null && defaultRevision.eIsProxy()) {
			InternalEObject oldDefaultRevision = (InternalEObject)defaultRevision;
			defaultRevision = (Revision)eResolveProxy(oldDefaultRevision);
			if (defaultRevision != oldDefaultRevision) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RevisionsPackage.REVISIONABLE_ENTITY__DEFAULT_REVISION, oldDefaultRevision, defaultRevision));
			}
		}
		return defaultRevision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Revision basicGetDefaultRevision() {
		return defaultRevision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultRevision(Revision newDefaultRevision) {
		Revision oldDefaultRevision = defaultRevision;
		defaultRevision = newDefaultRevision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RevisionsPackage.REVISIONABLE_ENTITY__DEFAULT_REVISION, oldDefaultRevision, defaultRevision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RevisionsPackage.REVISIONABLE_ENTITY__REVISIONS:
				return getRevisions();
			case RevisionsPackage.REVISIONABLE_ENTITY__DEFAULT_REVISION:
				if (resolve) return getDefaultRevision();
				return basicGetDefaultRevision();
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
			case RevisionsPackage.REVISIONABLE_ENTITY__REVISIONS:
				getRevisions().clear();
				getRevisions().addAll((Collection<? extends Revision>)newValue);
				return;
			case RevisionsPackage.REVISIONABLE_ENTITY__DEFAULT_REVISION:
				setDefaultRevision((Revision)newValue);
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
			case RevisionsPackage.REVISIONABLE_ENTITY__REVISIONS:
				getRevisions().clear();
				return;
			case RevisionsPackage.REVISIONABLE_ENTITY__DEFAULT_REVISION:
				setDefaultRevision((Revision)null);
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
			case RevisionsPackage.REVISIONABLE_ENTITY__REVISIONS:
				return revisions != null && !revisions.isEmpty();
			case RevisionsPackage.REVISIONABLE_ENTITY__DEFAULT_REVISION:
				return defaultRevision != null;
		}
		return super.eIsSet(featureID);
	}

} //RevisionableEntityImpl
