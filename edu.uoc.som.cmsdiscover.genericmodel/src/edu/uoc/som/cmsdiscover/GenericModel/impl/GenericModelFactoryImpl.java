/**
 */
package edu.uoc.som.cmsdiscover.GenericModel.impl;

import edu.uoc.som.cmsdiscover.GenericModel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GenericModelFactoryImpl extends EFactoryImpl implements GenericModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GenericModelFactory init() {
		try {
			GenericModelFactory theGenericModelFactory = (GenericModelFactory)EPackage.Registry.INSTANCE.getEFactory(GenericModelPackage.eNS_URI);
			if (theGenericModelFactory != null) {
				return theGenericModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GenericModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case GenericModelPackage.CONTENT_ENTITY: return createContentEntity();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentEntity createContentEntity() {
		ContentEntityImpl contentEntity = new ContentEntityImpl();
		return contentEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericModelPackage getGenericModelPackage() {
		return (GenericModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GenericModelPackage getPackage() {
		return GenericModelPackage.eINSTANCE;
	}

} //GenericModelFactoryImpl
