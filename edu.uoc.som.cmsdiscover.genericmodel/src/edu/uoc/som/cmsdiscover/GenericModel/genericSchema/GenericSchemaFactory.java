/**
 */
package edu.uoc.som.cmsdiscover.GenericModel.genericSchema;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.GenericSchemaPackage
 * @generated
 */
public interface GenericSchemaFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GenericSchemaFactory eINSTANCE = edu.uoc.som.cmsdiscover.GenericModel.genericSchema.impl.GenericSchemaFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Comment</em>'.
	 * @generated
	 */
	Comment createComment();

	/**
	 * Returns a new object of class '<em>File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File</em>'.
	 * @generated
	 */
	File createFile();

	/**
	 * Returns a new object of class '<em>Media</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Media</em>'.
	 * @generated
	 */
	Media createMedia();

	/**
	 * Returns a new object of class '<em>Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Block</em>'.
	 * @generated
	 */
	Block createBlock();

	/**
	 * Returns a new object of class '<em>Content Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Content Type</em>'.
	 * @generated
	 */
	ContentType createContentType();

	/**
	 * Returns a new object of class '<em>Taxonomy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Taxonomy</em>'.
	 * @generated
	 */
	Taxonomy createTaxonomy();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GenericSchemaPackage getGenericSchemaPackage();

} //GenericSchemaFactory
