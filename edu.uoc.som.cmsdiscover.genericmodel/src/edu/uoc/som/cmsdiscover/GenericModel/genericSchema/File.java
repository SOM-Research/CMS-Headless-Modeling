/**
 */
package edu.uoc.som.cmsdiscover.GenericModel.genericSchema;

import edu.uoc.som.cmsdiscover.GenericModel.ContentEntity;

import edu.uoc.som.cmsdiscover.GenericModel.user.User;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.File#getFid <em>Fid</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.File#getLangcode <em>Langcode</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.File#getUid <em>Uid</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.File#getFilename <em>Filename</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.File#getUri <em>Uri</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.File#getFilemime <em>Filemime</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.File#getFilesize <em>Filesize</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.File#isStatus <em>Status</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.File#getCreated <em>Created</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.File#getChanged <em>Changed</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.GenericSchemaPackage#getFile()
 * @model
 * @generated
 */
public interface File extends ContentEntity {
	/**
	 * Returns the value of the '<em><b>Fid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fid</em>' attribute.
	 * @see #setFid(int)
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.GenericSchemaPackage#getFile_Fid()
	 * @model
	 * @generated
	 */
	int getFid();

	/**
	 * Sets the value of the '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.File#getFid <em>Fid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fid</em>' attribute.
	 * @see #getFid()
	 * @generated
	 */
	void setFid(int value);

	/**
	 * Returns the value of the '<em><b>Langcode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Langcode</em>' attribute.
	 * @see #setLangcode(String)
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.GenericSchemaPackage#getFile_Langcode()
	 * @model
	 * @generated
	 */
	String getLangcode();

	/**
	 * Sets the value of the '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.File#getLangcode <em>Langcode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Langcode</em>' attribute.
	 * @see #getLangcode()
	 * @generated
	 */
	void setLangcode(String value);

	/**
	 * Returns the value of the '<em><b>Uid</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uid</em>' reference.
	 * @see #setUid(User)
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.GenericSchemaPackage#getFile_Uid()
	 * @model required="true"
	 * @generated
	 */
	User getUid();

	/**
	 * Sets the value of the '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.File#getUid <em>Uid</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uid</em>' reference.
	 * @see #getUid()
	 * @generated
	 */
	void setUid(User value);

	/**
	 * Returns the value of the '<em><b>Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filename</em>' attribute.
	 * @see #setFilename(String)
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.GenericSchemaPackage#getFile_Filename()
	 * @model unique="false"
	 * @generated
	 */
	String getFilename();

	/**
	 * Sets the value of the '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.File#getFilename <em>Filename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filename</em>' attribute.
	 * @see #getFilename()
	 * @generated
	 */
	void setFilename(String value);

	/**
	 * Returns the value of the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri</em>' attribute.
	 * @see #setUri(String)
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.GenericSchemaPackage#getFile_Uri()
	 * @model
	 * @generated
	 */
	String getUri();

	/**
	 * Sets the value of the '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.File#getUri <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' attribute.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(String value);

	/**
	 * Returns the value of the '<em><b>Filemime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filemime</em>' attribute.
	 * @see #setFilemime(String)
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.GenericSchemaPackage#getFile_Filemime()
	 * @model
	 * @generated
	 */
	String getFilemime();

	/**
	 * Sets the value of the '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.File#getFilemime <em>Filemime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filemime</em>' attribute.
	 * @see #getFilemime()
	 * @generated
	 */
	void setFilemime(String value);

	/**
	 * Returns the value of the '<em><b>Filesize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filesize</em>' attribute.
	 * @see #setFilesize(int)
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.GenericSchemaPackage#getFile_Filesize()
	 * @model
	 * @generated
	 */
	int getFilesize();

	/**
	 * Sets the value of the '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.File#getFilesize <em>Filesize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filesize</em>' attribute.
	 * @see #getFilesize()
	 * @generated
	 */
	void setFilesize(int value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see #setStatus(boolean)
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.GenericSchemaPackage#getFile_Status()
	 * @model
	 * @generated
	 */
	boolean isStatus();

	/**
	 * Sets the value of the '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.File#isStatus <em>Status</em>}' attribute.
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
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.GenericSchemaPackage#getFile_Created()
	 * @model
	 * @generated
	 */
	Date getCreated();

	/**
	 * Sets the value of the '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.File#getCreated <em>Created</em>}' attribute.
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
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.GenericSchemaPackage#getFile_Changed()
	 * @model
	 * @generated
	 */
	Date getChanged();

	/**
	 * Sets the value of the '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.File#getChanged <em>Changed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Changed</em>' attribute.
	 * @see #getChanged()
	 * @generated
	 */
	void setChanged(Date value);

} // File
