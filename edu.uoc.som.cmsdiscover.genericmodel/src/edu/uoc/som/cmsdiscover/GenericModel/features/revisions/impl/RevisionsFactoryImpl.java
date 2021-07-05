/**
 */
package edu.uoc.som.cmsdiscover.GenericModel.features.revisions.impl;

import edu.uoc.som.cmsdiscover.GenericModel.features.revisions.*;

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
public class RevisionsFactoryImpl extends EFactoryImpl implements RevisionsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RevisionsFactory init() {
		try {
			RevisionsFactory theRevisionsFactory = (RevisionsFactory)EPackage.Registry.INSTANCE.getEFactory(RevisionsPackage.eNS_URI);
			if (theRevisionsFactory != null) {
				return theRevisionsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RevisionsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RevisionsFactoryImpl() {
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
			case RevisionsPackage.REVISION: return createRevision();
			case RevisionsPackage.REVISIONABLE_ENTITY: return createRevisionableEntity();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Revision createRevision() {
		RevisionImpl revision = new RevisionImpl();
		return revision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RevisionableEntity createRevisionableEntity() {
		RevisionableEntityImpl revisionableEntity = new RevisionableEntityImpl();
		return revisionableEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RevisionsPackage getRevisionsPackage() {
		return (RevisionsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RevisionsPackage getPackage() {
		return RevisionsPackage.eINSTANCE;
	}

} //RevisionsFactoryImpl
