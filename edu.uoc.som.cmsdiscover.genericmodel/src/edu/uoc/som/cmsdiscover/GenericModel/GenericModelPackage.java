/**
 */
package edu.uoc.som.cmsdiscover.GenericModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see edu.uoc.som.cmsdiscover.GenericModel.GenericModelFactory
 * @model kind="package"
 * @generated
 */
public interface GenericModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "GenericModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://edu.uoc.som.genericmodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "GenericModel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GenericModelPackage eINSTANCE = edu.uoc.som.cmsdiscover.GenericModel.impl.GenericModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.uoc.som.cmsdiscover.GenericModel.impl.ContentEntityImpl <em>Content Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.cmsdiscover.GenericModel.impl.ContentEntityImpl
	 * @see edu.uoc.som.cmsdiscover.GenericModel.impl.GenericModelPackageImpl#getContentEntity()
	 * @generated
	 */
	int CONTENT_ENTITY = 0;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ENTITY__UUID = 0;

	/**
	 * The number of structural features of the '<em>Content Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ENTITY_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link edu.uoc.som.cmsdiscover.GenericModel.ContentEntity <em>Content Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content Entity</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.ContentEntity
	 * @generated
	 */
	EClass getContentEntity();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.cmsdiscover.GenericModel.ContentEntity#getUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuid</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.ContentEntity#getUuid()
	 * @see #getContentEntity()
	 * @generated
	 */
	EAttribute getContentEntity_Uuid();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GenericModelFactory getGenericModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link edu.uoc.som.cmsdiscover.GenericModel.impl.ContentEntityImpl <em>Content Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.cmsdiscover.GenericModel.impl.ContentEntityImpl
		 * @see edu.uoc.som.cmsdiscover.GenericModel.impl.GenericModelPackageImpl#getContentEntity()
		 * @generated
		 */
		EClass CONTENT_ENTITY = eINSTANCE.getContentEntity();

		/**
		 * The meta object literal for the '<em><b>Uuid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_ENTITY__UUID = eINSTANCE.getContentEntity_Uuid();

	}

} //GenericModelPackage
