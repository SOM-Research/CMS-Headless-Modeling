/**
 */
package edu.uoc.som.cmsdiscover.GenericModel.features.revisions;

import edu.uoc.som.cmsdiscover.GenericModel.ContentEntity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Revisionable Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.features.revisions.RevisionableEntity#getRevisions <em>Revisions</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.features.revisions.RevisionableEntity#getDefaultRevision <em>Default Revision</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.cmsdiscover.GenericModel.features.revisions.RevisionsPackage#getRevisionableEntity()
 * @model
 * @generated
 */
public interface RevisionableEntity extends ContentEntity {
	/**
	 * Returns the value of the '<em><b>Revisions</b></em>' reference list.
	 * The list contents are of type {@link edu.uoc.som.cmsdiscover.GenericModel.features.revisions.Revision}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revisions</em>' reference list.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.features.revisions.RevisionsPackage#getRevisionableEntity_Revisions()
	 * @model required="true"
	 * @generated
	 */
	EList<Revision> getRevisions();

	/**
	 * Returns the value of the '<em><b>Default Revision</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Revision</em>' reference.
	 * @see #setDefaultRevision(Revision)
	 * @see edu.uoc.som.cmsdiscover.GenericModel.features.revisions.RevisionsPackage#getRevisionableEntity_DefaultRevision()
	 * @model
	 * @generated
	 */
	Revision getDefaultRevision();

	/**
	 * Sets the value of the '{@link edu.uoc.som.cmsdiscover.GenericModel.features.revisions.RevisionableEntity#getDefaultRevision <em>Default Revision</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Revision</em>' reference.
	 * @see #getDefaultRevision()
	 * @generated
	 */
	void setDefaultRevision(Revision value);

} // RevisionableEntity
