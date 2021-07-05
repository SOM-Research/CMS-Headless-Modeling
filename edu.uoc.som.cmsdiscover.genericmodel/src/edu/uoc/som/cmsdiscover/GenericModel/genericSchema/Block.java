/**
 */
package edu.uoc.som.cmsdiscover.GenericModel.genericSchema;

import edu.uoc.som.cmsdiscover.GenericModel.ContentEntity;

import edu.uoc.som.cmsdiscover.GenericModel.features.revisions.Revision;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Block#getId <em>Id</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Block#getVid <em>Vid</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Block#isStatus <em>Status</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Block#getChanged <em>Changed</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Block#isReusable <em>Reusable</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Block#getRevision_default <em>Revision default</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Block#getRevisions <em>Revisions</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.GenericSchemaPackage#getBlock()
 * @model
 * @generated
 */
public interface Block extends ContentEntity {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.GenericSchemaPackage#getBlock_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Block#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Vid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vid</em>' attribute.
	 * @see #setVid(int)
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.GenericSchemaPackage#getBlock_Vid()
	 * @model
	 * @generated
	 */
	int getVid();

	/**
	 * Sets the value of the '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Block#getVid <em>Vid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vid</em>' attribute.
	 * @see #getVid()
	 * @generated
	 */
	void setVid(int value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see #setStatus(boolean)
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.GenericSchemaPackage#getBlock_Status()
	 * @model
	 * @generated
	 */
	boolean isStatus();

	/**
	 * Sets the value of the '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Block#isStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #isStatus()
	 * @generated
	 */
	void setStatus(boolean value);

	/**
	 * Returns the value of the '<em><b>Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Changed</em>' attribute.
	 * @see #setChanged(Date)
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.GenericSchemaPackage#getBlock_Changed()
	 * @model
	 * @generated
	 */
	Date getChanged();

	/**
	 * Sets the value of the '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Block#getChanged <em>Changed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Changed</em>' attribute.
	 * @see #getChanged()
	 * @generated
	 */
	void setChanged(Date value);

	/**
	 * Returns the value of the '<em><b>Reusable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reusable</em>' attribute.
	 * @see #setReusable(boolean)
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.GenericSchemaPackage#getBlock_Reusable()
	 * @model
	 * @generated
	 */
	boolean isReusable();

	/**
	 * Sets the value of the '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Block#isReusable <em>Reusable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reusable</em>' attribute.
	 * @see #isReusable()
	 * @generated
	 */
	void setReusable(boolean value);

	/**
	 * Returns the value of the '<em><b>Revision default</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revision default</em>' reference.
	 * @see #setRevision_default(Revision)
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.GenericSchemaPackage#getBlock_Revision_default()
	 * @model required="true"
	 * @generated
	 */
	Revision getRevision_default();

	/**
	 * Sets the value of the '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Block#getRevision_default <em>Revision default</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revision default</em>' reference.
	 * @see #getRevision_default()
	 * @generated
	 */
	void setRevision_default(Revision value);

	/**
	 * Returns the value of the '<em><b>Revisions</b></em>' containment reference list.
	 * The list contents are of type {@link edu.uoc.som.cmsdiscover.GenericModel.features.revisions.Revision}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revisions</em>' containment reference list.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.GenericSchemaPackage#getBlock_Revisions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Revision> getRevisions();

} // Block
