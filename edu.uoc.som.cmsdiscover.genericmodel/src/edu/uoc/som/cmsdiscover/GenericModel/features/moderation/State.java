/**
 */
package edu.uoc.som.cmsdiscover.GenericModel.features.moderation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.features.moderation.State#getLabel <em>Label</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.features.moderation.State#getCode <em>Code</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.features.moderation.State#isPublished <em>Published</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.cmsdiscover.GenericModel.features.moderation.ModerationPackage#getState()
 * @model
 * @generated
 */
public interface State extends EObject {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see edu.uoc.som.cmsdiscover.GenericModel.features.moderation.ModerationPackage#getState_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link edu.uoc.som.cmsdiscover.GenericModel.features.moderation.State#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see edu.uoc.som.cmsdiscover.GenericModel.features.moderation.ModerationPackage#getState_Code()
	 * @model
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link edu.uoc.som.cmsdiscover.GenericModel.features.moderation.State#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Published</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Published</em>' attribute.
	 * @see #setPublished(boolean)
	 * @see edu.uoc.som.cmsdiscover.GenericModel.features.moderation.ModerationPackage#getState_Published()
	 * @model
	 * @generated
	 */
	boolean isPublished();

	/**
	 * Sets the value of the '{@link edu.uoc.som.cmsdiscover.GenericModel.features.moderation.State#isPublished <em>Published</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Published</em>' attribute.
	 * @see #isPublished()
	 * @generated
	 */
	void setPublished(boolean value);

} // State
