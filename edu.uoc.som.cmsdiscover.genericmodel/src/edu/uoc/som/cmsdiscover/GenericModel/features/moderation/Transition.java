/**
 */
package edu.uoc.som.cmsdiscover.GenericModel.features.moderation;

import edu.uoc.som.cmsdiscover.GenericModel.user.Permission;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.features.moderation.Transition#getCode <em>Code</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.features.moderation.Transition#getLabel <em>Label</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.features.moderation.Transition#getFrom <em>From</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.features.moderation.Transition#getTo <em>To</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.features.moderation.Transition#getTransition_permision <em>Transition permision</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.cmsdiscover.GenericModel.features.moderation.ModerationPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends EObject {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see edu.uoc.som.cmsdiscover.GenericModel.features.moderation.ModerationPackage#getTransition_Code()
	 * @model
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link edu.uoc.som.cmsdiscover.GenericModel.features.moderation.Transition#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see edu.uoc.som.cmsdiscover.GenericModel.features.moderation.ModerationPackage#getTransition_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link edu.uoc.som.cmsdiscover.GenericModel.features.moderation.Transition#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' reference list.
	 * The list contents are of type {@link edu.uoc.som.cmsdiscover.GenericModel.features.moderation.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference list.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.features.moderation.ModerationPackage#getTransition_From()
	 * @model
	 * @generated
	 */
	EList<State> getFrom();

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(State)
	 * @see edu.uoc.som.cmsdiscover.GenericModel.features.moderation.ModerationPackage#getTransition_To()
	 * @model
	 * @generated
	 */
	State getTo();

	/**
	 * Sets the value of the '{@link edu.uoc.som.cmsdiscover.GenericModel.features.moderation.Transition#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(State value);

	/**
	 * Returns the value of the '<em><b>Transition permision</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition permision</em>' reference.
	 * @see #setTransition_permision(Permission)
	 * @see edu.uoc.som.cmsdiscover.GenericModel.features.moderation.ModerationPackage#getTransition_Transition_permision()
	 * @model
	 * @generated
	 */
	Permission getTransition_permision();

	/**
	 * Sets the value of the '{@link edu.uoc.som.cmsdiscover.GenericModel.features.moderation.Transition#getTransition_permision <em>Transition permision</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition permision</em>' reference.
	 * @see #getTransition_permision()
	 * @generated
	 */
	void setTransition_permision(Permission value);

} // Transition
