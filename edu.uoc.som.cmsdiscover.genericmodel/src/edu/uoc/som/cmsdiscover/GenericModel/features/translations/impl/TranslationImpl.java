/**
 */
package edu.uoc.som.cmsdiscover.GenericModel.features.translations.impl;

import edu.uoc.som.cmsdiscover.GenericModel.features.translations.Translation;
import edu.uoc.som.cmsdiscover.GenericModel.features.translations.TranslationsPackage;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Translation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.features.translations.impl.TranslationImpl#getLangcode <em>Langcode</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.features.translations.impl.TranslationImpl#getTcreated <em>Tcreated</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TranslationImpl extends MinimalEObjectImpl.Container implements Translation {
	/**
	 * The default value of the '{@link #getLangcode() <em>Langcode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLangcode()
	 * @generated
	 * @ordered
	 */
	protected static final String LANGCODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLangcode() <em>Langcode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLangcode()
	 * @generated
	 * @ordered
	 */
	protected String langcode = LANGCODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTcreated() <em>Tcreated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTcreated()
	 * @generated
	 * @ordered
	 */
	protected static final Date TCREATED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTcreated() <em>Tcreated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTcreated()
	 * @generated
	 * @ordered
	 */
	protected Date tcreated = TCREATED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TranslationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TranslationsPackage.Literals.TRANSLATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLangcode() {
		return langcode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLangcode(String newLangcode) {
		String oldLangcode = langcode;
		langcode = newLangcode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TranslationsPackage.TRANSLATION__LANGCODE, oldLangcode, langcode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getTcreated() {
		return tcreated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTcreated(Date newTcreated) {
		Date oldTcreated = tcreated;
		tcreated = newTcreated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TranslationsPackage.TRANSLATION__TCREATED, oldTcreated, tcreated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TranslationsPackage.TRANSLATION__LANGCODE:
				return getLangcode();
			case TranslationsPackage.TRANSLATION__TCREATED:
				return getTcreated();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TranslationsPackage.TRANSLATION__LANGCODE:
				setLangcode((String)newValue);
				return;
			case TranslationsPackage.TRANSLATION__TCREATED:
				setTcreated((Date)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TranslationsPackage.TRANSLATION__LANGCODE:
				setLangcode(LANGCODE_EDEFAULT);
				return;
			case TranslationsPackage.TRANSLATION__TCREATED:
				setTcreated(TCREATED_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TranslationsPackage.TRANSLATION__LANGCODE:
				return LANGCODE_EDEFAULT == null ? langcode != null : !LANGCODE_EDEFAULT.equals(langcode);
			case TranslationsPackage.TRANSLATION__TCREATED:
				return TCREATED_EDEFAULT == null ? tcreated != null : !TCREATED_EDEFAULT.equals(tcreated);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (langcode: ");
		result.append(langcode);
		result.append(", tcreated: ");
		result.append(tcreated);
		result.append(')');
		return result.toString();
	}

} //TranslationImpl
