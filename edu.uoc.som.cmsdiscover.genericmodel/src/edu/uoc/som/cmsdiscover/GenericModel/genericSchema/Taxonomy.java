/**
 */
package edu.uoc.som.cmsdiscover.GenericModel.genericSchema;

import edu.uoc.som.cmsdiscover.GenericModel.ContentEntity;

import edu.uoc.som.cmsdiscover.GenericModel.features.revisions.Revision;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Taxonomy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Taxonomy#getTid <em>Tid</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Taxonomy#getVid <em>Vid</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Taxonomy#getName <em>Name</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Taxonomy#getDescription <em>Description</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Taxonomy#getParent <em>Parent</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Taxonomy#getChanged <em>Changed</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Taxonomy#getRevision_default <em>Revision default</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Taxonomy#getRevisions <em>Revisions</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.GenericSchemaPackage#getTaxonomy()
 * @model
 * @generated
 */
public interface Taxonomy extends ContentEntity {
	/**
	 * Returns the value of the '<em><b>Tid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tid</em>' attribute.
	 * @see #setTid(int)
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.GenericSchemaPackage#getTaxonomy_Tid()
	 * @model
	 * @generated
	 */
	int getTid();

	/**
	 * Sets the value of the '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Taxonomy#getTid <em>Tid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tid</em>' attribute.
	 * @see #getTid()
	 * @generated
	 */
	void setTid(int value);

	/**
	 * Returns the value of the '<em><b>Vid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vid</em>' attribute.
	 * @see #setVid(int)
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.GenericSchemaPackage#getTaxonomy_Vid()
	 * @model
	 * @generated
	 */
	int getVid();

	/**
	 * Sets the value of the '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Taxonomy#getVid <em>Vid</em>}' attribute.
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
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.GenericSchemaPackage#getTaxonomy_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Taxonomy#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.GenericSchemaPackage#getTaxonomy_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Taxonomy#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' attribute.
	 * @see #setParent(String)
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.GenericSchemaPackage#getTaxonomy_Parent()
	 * @model
	 * @generated
	 */
	String getParent();

	/**
	 * Sets the value of the '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Taxonomy#getParent <em>Parent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' attribute.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(String value);

	/**
	 * Returns the value of the '<em><b>Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Changed</em>' attribute.
	 * @see #setChanged(Date)
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.GenericSchemaPackage#getTaxonomy_Changed()
	 * @model
	 * @generated
	 */
	Date getChanged();

	/**
	 * Sets the value of the '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Taxonomy#getChanged <em>Changed</em>}' attribute.
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
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.GenericSchemaPackage#getTaxonomy_Revision_default()
	 * @model required="true"
	 * @generated
	 */
	Revision getRevision_default();

	/**
	 * Sets the value of the '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Taxonomy#getRevision_default <em>Revision default</em>}' reference.
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
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.GenericSchemaPackage#getTaxonomy_Revisions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Revision> getRevisions();

} // Taxonomy
