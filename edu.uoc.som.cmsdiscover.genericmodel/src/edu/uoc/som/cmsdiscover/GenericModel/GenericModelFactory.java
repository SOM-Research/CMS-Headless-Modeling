/**
 */
package edu.uoc.som.cmsdiscover.GenericModel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see edu.uoc.som.cmsdiscover.GenericModel.GenericModelPackage
 * @generated
 */
public interface GenericModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GenericModelFactory eINSTANCE = edu.uoc.som.cmsdiscover.GenericModel.impl.GenericModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Content Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Content Entity</em>'.
	 * @generated
	 */
	ContentEntity createContentEntity();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GenericModelPackage getGenericModelPackage();

} //GenericModelFactory
