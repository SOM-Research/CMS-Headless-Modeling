/**
 */
package edu.uoc.som.cmsdiscover.GenericModel.genericSchema;

import edu.uoc.som.cmsdiscover.GenericModel.ContentEntity;

import edu.uoc.som.cmsdiscover.GenericModel.features.moderation.State;

import edu.uoc.som.cmsdiscover.GenericModel.features.revisions.Revision;

import edu.uoc.som.cmsdiscover.GenericModel.user.User;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Content Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.ContentType#getContentId <em>Content Id</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.ContentType#getUid <em>Uid</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.ContentType#getTitle <em>Title</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.ContentType#isStatus <em>Status</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.ContentType#getCreated <em>Created</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.ContentType#getChanged <em>Changed</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.ContentType#getRevision_default <em>Revision default</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.ContentType#getRevisions <em>Revisions</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.ContentType#getModeration_state <em>Moderation state</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.GenericSchemaPackage#getContentType()
 * @model
 * @generated
 */
public interface ContentType extends ContentEntity {
	/**
	 * Returns the value of the '<em><b>Content Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Id</em>' attribute.
	 * @see #setContentId(int)
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.GenericSchemaPackage#getContentType_ContentId()
	 * @model
	 * @generated
	 */
	int getContentId();

	/**
	 * Sets the value of the '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.ContentType#getContentId <em>Content Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Id</em>' attribute.
	 * @see #getContentId()
	 * @generated
	 */
	void setContentId(int value);

	/**
	 * Returns the value of the '<em><b>Uid</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uid</em>' reference.
	 * @see #setUid(User)
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.GenericSchemaPackage#getContentType_Uid()
	 * @model required="true"
	 * @generated
	 */
	User getUid();

	/**
	 * Sets the value of the '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.ContentType#getUid <em>Uid</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uid</em>' reference.
	 * @see #getUid()
	 * @generated
	 */
	void setUid(User value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.GenericSchemaPackage#getContentType_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.ContentType#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see #setStatus(boolean)
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.GenericSchemaPackage#getContentType_Status()
	 * @model
	 * @generated
	 */
	boolean isStatus();

	/**
	 * Sets the value of the '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.ContentType#isStatus <em>Status</em>}' attribute.
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
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.GenericSchemaPackage#getContentType_Created()
	 * @model
	 * @generated
	 */
	Date getCreated();

	/**
	 * Sets the value of the '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.ContentType#getCreated <em>Created</em>}' attribute.
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
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.GenericSchemaPackage#getContentType_Changed()
	 * @model
	 * @generated
	 */
	Date getChanged();

	/**
	 * Sets the value of the '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.ContentType#getChanged <em>Changed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Changed</em>' attribute.
	 * @see #getChanged()
	 * @generated
	 */
	void setChanged(Date value);

	/**
	 * Returns the value of the '<em><b>Revision default</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revision default</em>' reference.
	 * @see #setRevision_default(Revision)
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.GenericSchemaPackage#getContentType_Revision_default()
	 * @model required="true"
	 * @generated
	 */
	Revision getRevision_default();

	/**
	 * Sets the value of the '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.ContentType#getRevision_default <em>Revision default</em>}' reference.
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
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.GenericSchemaPackage#getContentType_Revisions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Revision> getRevisions();

	/**
	 * Returns the value of the '<em><b>Moderation state</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moderation state</em>' reference.
	 * @see #setModeration_state(State)
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.GenericSchemaPackage#getContentType_Moderation_state()
	 * @model required="true"
	 * @generated
	 */
	State getModeration_state();

	/**
	 * Sets the value of the '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.ContentType#getModeration_state <em>Moderation state</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Moderation state</em>' reference.
	 * @see #getModeration_state()
	 * @generated
	 */
	void setModeration_state(State value);

} // ContentType
