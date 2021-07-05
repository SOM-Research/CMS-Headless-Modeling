/**
 */
package edu.uoc.som.cmsdiscover.GenericModel.features.translations;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Translation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.features.translations.Translation#getLangcode <em>Langcode</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.features.translations.Translation#getTcreated <em>Tcreated</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.cmsdiscover.GenericModel.features.translations.TranslationsPackage#getTranslation()
 * @model
 * @generated
 */
public interface Translation extends EObject {
	/**
	 * Returns the value of the '<em><b>Langcode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Langcode</em>' attribute.
	 * @see #setLangcode(String)
	 * @see edu.uoc.som.cmsdiscover.GenericModel.features.translations.TranslationsPackage#getTranslation_Langcode()
	 * @model
	 * @generated
	 */
	String getLangcode();

	/**
	 * Sets the value of the '{@link edu.uoc.som.cmsdiscover.GenericModel.features.translations.Translation#getLangcode <em>Langcode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Langcode</em>' attribute.
	 * @see #getLangcode()
	 * @generated
	 */
	void setLangcode(String value);

	/**
	 * Returns the value of the '<em><b>Tcreated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tcreated</em>' attribute.
	 * @see #setTcreated(Date)
	 * @see edu.uoc.som.cmsdiscover.GenericModel.features.translations.TranslationsPackage#getTranslation_Tcreated()
	 * @model
	 * @generated
	 */
	Date getTcreated();

	/**
	 * Sets the value of the '{@link edu.uoc.som.cmsdiscover.GenericModel.features.translations.Translation#getTcreated <em>Tcreated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tcreated</em>' attribute.
	 * @see #getTcreated()
	 * @generated
	 */
	void setTcreated(Date value);

} // Translation
