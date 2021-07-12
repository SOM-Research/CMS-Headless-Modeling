/**
 */
package edu.uoc.som.cmsdiscover.GenericModel.features.revisions;

import edu.uoc.som.cmsdiscover.GenericModel.user.User;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Revision</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.features.revisions.Revision#getVid <em>Vid</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.features.revisions.Revision#getRevision_uid <em>Revision uid</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.features.revisions.Revision#getRevision_timestamp <em>Revision timestamp</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.features.revisions.Revision#getRevision_log <em>Revision log</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.cmsdiscover.GenericModel.features.revisions.RevisionsPackage#getRevision()
 * @model
 * @generated
 */
public interface Revision extends EObject {
	/**
	 * Returns the value of the '<em><b>Vid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vid</em>' attribute.
	 * @see #setVid(int)
	 * @see edu.uoc.som.cmsdiscover.GenericModel.features.revisions.RevisionsPackage#getRevision_Vid()
	 * @model
	 * @generated
	 */
	int getVid();

	/**
	 * Sets the value of the '{@link edu.uoc.som.cmsdiscover.GenericModel.features.revisions.Revision#getVid <em>Vid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vid</em>' attribute.
	 * @see #getVid()
	 * @generated
	 */
	void setVid(int value);

	/**
	 * Returns the value of the '<em><b>Revision uid</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revision uid</em>' reference.
	 * @see #setRevision_uid(User)
	 * @see edu.uoc.som.cmsdiscover.GenericModel.features.revisions.RevisionsPackage#getRevision_Revision_uid()
	 * @model
	 * @generated
	 */
	User getRevision_uid();

	/**
	 * Sets the value of the '{@link edu.uoc.som.cmsdiscover.GenericModel.features.revisions.Revision#getRevision_uid <em>Revision uid</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revision uid</em>' reference.
	 * @see #getRevision_uid()
	 * @generated
	 */
	void setRevision_uid(User value);

	/**
	 * Returns the value of the '<em><b>Revision timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revision timestamp</em>' attribute.
	 * @see #setRevision_timestamp(Date)
	 * @see edu.uoc.som.cmsdiscover.GenericModel.features.revisions.RevisionsPackage#getRevision_Revision_timestamp()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	Date getRevision_timestamp();

	/**
	 * Sets the value of the '{@link edu.uoc.som.cmsdiscover.GenericModel.features.revisions.Revision#getRevision_timestamp <em>Revision timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revision timestamp</em>' attribute.
	 * @see #getRevision_timestamp()
	 * @generated
	 */
	void setRevision_timestamp(Date value);

	/**
	 * Returns the value of the '<em><b>Revision log</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revision log</em>' attribute.
	 * @see #setRevision_log(String)
	 * @see edu.uoc.som.cmsdiscover.GenericModel.features.revisions.RevisionsPackage#getRevision_Revision_log()
	 * @model
	 * @generated
	 */
	String getRevision_log();

	/**
	 * Sets the value of the '{@link edu.uoc.som.cmsdiscover.GenericModel.features.revisions.Revision#getRevision_log <em>Revision log</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revision log</em>' attribute.
	 * @see #getRevision_log()
	 * @generated
	 */
	void setRevision_log(String value);

} // Revision
