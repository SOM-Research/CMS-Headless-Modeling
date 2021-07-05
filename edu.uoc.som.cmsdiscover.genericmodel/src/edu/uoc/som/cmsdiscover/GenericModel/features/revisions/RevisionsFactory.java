/**
 */
package edu.uoc.som.cmsdiscover.GenericModel.features.revisions;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see edu.uoc.som.cmsdiscover.GenericModel.features.revisions.RevisionsPackage
 * @generated
 */
public interface RevisionsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RevisionsFactory eINSTANCE = edu.uoc.som.cmsdiscover.GenericModel.features.revisions.impl.RevisionsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Revision</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Revision</em>'.
	 * @generated
	 */
	Revision createRevision();

	/**
	 * Returns a new object of class '<em>Revisionable Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Revisionable Entity</em>'.
	 * @generated
	 */
	RevisionableEntity createRevisionableEntity();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RevisionsPackage getRevisionsPackage();

} //RevisionsFactory
