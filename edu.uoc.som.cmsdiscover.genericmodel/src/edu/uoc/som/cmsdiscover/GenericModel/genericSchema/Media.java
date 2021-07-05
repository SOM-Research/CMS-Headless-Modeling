/**
 */
package edu.uoc.som.cmsdiscover.GenericModel.genericSchema;

import edu.uoc.som.cmsdiscover.GenericModel.ContentEntity;

import edu.uoc.som.cmsdiscover.GenericModel.features.revisions.Revision;

import edu.uoc.som.cmsdiscover.GenericModel.user.User;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Media</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Media#getMid <em>Mid</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Media#getVid <em>Vid</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Media#getName <em>Name</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Media#getUid <em>Uid</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Media#isStatus <em>Status</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Media#getCreated <em>Created</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Media#getChanged <em>Changed</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Media#getThumbnail <em>Thumbnail</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Media#getFile_reference <em>File reference</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Media#getRevision_default <em>Revision default</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Media#getRevisions <em>Revisions</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.GenericSchemaPackage#getMedia()
 * @model
 * @generated
 */
public interface Media extends ContentEntity {
	/**
	 * Returns the value of the '<em><b>Mid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mid</em>' attribute.
	 * @see #setMid(int)
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.GenericSchemaPackage#getMedia_Mid()
	 * @model
	 * @generated
	 */
	int getMid();

	/**
	 * Sets the value of the '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Media#getMid <em>Mid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mid</em>' attribute.
	 * @see #getMid()
	 * @generated
	 */
	void setMid(int value);

	/**
	 * Returns the value of the '<em><b>Vid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vid</em>' attribute.
	 * @see #setVid(int)
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.GenericSchemaPackage#getMedia_Vid()
	 * @model
	 * @generated
	 */
	int getVid();

	/**
	 * Sets the value of the '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Media#getVid <em>Vid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vid</em>' attribute.
	 * @see #getVid()
	 * @generated
	 */
	void setVid(int value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.GenericSchemaPackage#getMedia_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Media#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Uid</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uid</em>' reference.
	 * @see #setUid(User)
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.GenericSchemaPackage#getMedia_Uid()
	 * @model required="true"
	 * @generated
	 */
	User getUid();

	/**
	 * Sets the value of the '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Media#getUid <em>Uid</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uid</em>' reference.
	 * @see #getUid()
	 * @generated
	 */
	void setUid(User value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see #setStatus(boolean)
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.GenericSchemaPackage#getMedia_Status()
	 * @model
	 * @generated
	 */
	boolean isStatus();

	/**
	 * Sets the value of the '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Media#isStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #isStatus()
	 * @generated
	 */
	void setStatus(boolean value);

	/**
	 * Returns the value of the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created</em>' attribute.
	 * @see #setCreated(Date)
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.GenericSchemaPackage#getMedia_Created()
	 * @model
	 * @generated
	 */
	Date getCreated();

	/**
	 * Sets the value of the '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Media#getCreated <em>Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created</em>' attribute.
	 * @see #getCreated()
	 * @generated
	 */
	void setCreated(Date value);

	/**
	 * Returns the value of the '<em><b>Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Changed</em>' attribute.
	 * @see #setChanged(Date)
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.GenericSchemaPackage#getMedia_Changed()
	 * @model
	 * @generated
	 */
	Date getChanged();

	/**
	 * Sets the value of the '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Media#getChanged <em>Changed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Changed</em>' attribute.
	 * @see #getChanged()
	 * @generated
	 */
	void setChanged(Date value);

	/**
	 * Returns the value of the '<em><b>Thumbnail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thumbnail</em>' attribute.
	 * @see #setThumbnail(Object)
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.GenericSchemaPackage#getMedia_Thumbnail()
	 * @model
	 * @generated
	 */
	Object getThumbnail();

	/**
	 * Sets the value of the '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Media#getThumbnail <em>Thumbnail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thumbnail</em>' attribute.
	 * @see #getThumbnail()
	 * @generated
	 */
	void setThumbnail(Object value);

	/**
	 * Returns the value of the '<em><b>File reference</b></em>' reference list.
	 * The list contents are of type {@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.File}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File reference</em>' reference list.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.GenericSchemaPackage#getMedia_File_reference()
	 * @model
	 * @generated
	 */
	EList<File> getFile_reference();

	/**
	 * Returns the value of the '<em><b>Revision default</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revision default</em>' reference.
	 * @see #setRevision_default(Revision)
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.GenericSchemaPackage#getMedia_Revision_default()
	 * @model required="true"
	 * @generated
	 */
	Revision getRevision_default();

	/**
	 * Sets the value of the '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Media#getRevision_default <em>Revision default</em>}' reference.
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
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.GenericSchemaPackage#getMedia_Revisions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Revision> getRevisions();

} // Media
