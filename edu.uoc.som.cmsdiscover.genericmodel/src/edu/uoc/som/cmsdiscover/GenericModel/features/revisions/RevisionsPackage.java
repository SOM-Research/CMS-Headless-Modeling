/**
 */
package edu.uoc.som.cmsdiscover.GenericModel.features.revisions;

import edu.uoc.som.cmsdiscover.GenericModel.GenericModelPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see edu.uoc.som.cmsdiscover.GenericModel.features.revisions.RevisionsFactory
 * @model kind="package"
 * @generated
 */
public interface RevisionsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "revisions";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://edu.uoc.som.cmsdiscoverer.genericmodel.features.revisions";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "revisions";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RevisionsPackage eINSTANCE = edu.uoc.som.cmsdiscover.GenericModel.features.revisions.impl.RevisionsPackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.uoc.som.cmsdiscover.GenericModel.features.revisions.impl.RevisionImpl <em>Revision</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.cmsdiscover.GenericModel.features.revisions.impl.RevisionImpl
	 * @see edu.uoc.som.cmsdiscover.GenericModel.features.revisions.impl.RevisionsPackageImpl#getRevision()
	 * @generated
	 */
	int REVISION = 0;

	/**
	 * The feature id for the '<em><b>Vid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__VID = 0;

	/**
	 * The feature id for the '<em><b>Revision uid</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__REVISION_UID = 1;

	/**
	 * The feature id for the '<em><b>Revision timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__REVISION_TIMESTAMP = 2;

	/**
	 * The feature id for the '<em><b>Revision log</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION__REVISION_LOG = 3;

	/**
	 * The number of structural features of the '<em>Revision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link edu.uoc.som.cmsdiscover.GenericModel.features.revisions.impl.RevisionableEntityImpl <em>Revisionable Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.cmsdiscover.GenericModel.features.revisions.impl.RevisionableEntityImpl
	 * @see edu.uoc.som.cmsdiscover.GenericModel.features.revisions.impl.RevisionsPackageImpl#getRevisionableEntity()
	 * @generated
	 */
	int REVISIONABLE_ENTITY = 1;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISIONABLE_ENTITY__UUID = GenericModelPackage.CONTENT_ENTITY__UUID;

	/**
	 * The feature id for the '<em><b>Revisions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISIONABLE_ENTITY__REVISIONS = GenericModelPackage.CONTENT_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default Revision</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISIONABLE_ENTITY__DEFAULT_REVISION = GenericModelPackage.CONTENT_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Revisionable Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISIONABLE_ENTITY_FEATURE_COUNT = GenericModelPackage.CONTENT_ENTITY_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link edu.uoc.som.cmsdiscover.GenericModel.features.revisions.Revision <em>Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Revision</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.features.revisions.Revision
	 * @generated
	 */
	EClass getRevision();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.cmsdiscover.GenericModel.features.revisions.Revision#getVid <em>Vid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vid</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.features.revisions.Revision#getVid()
	 * @see #getRevision()
	 * @generated
	 */
	EAttribute getRevision_Vid();

	/**
	 * Returns the meta object for the reference '{@link edu.uoc.som.cmsdiscover.GenericModel.features.revisions.Revision#getRevision_uid <em>Revision uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Revision uid</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.features.revisions.Revision#getRevision_uid()
	 * @see #getRevision()
	 * @generated
	 */
	EReference getRevision_Revision_uid();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.cmsdiscover.GenericModel.features.revisions.Revision#getRevision_timestamp <em>Revision timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Revision timestamp</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.features.revisions.Revision#getRevision_timestamp()
	 * @see #getRevision()
	 * @generated
	 */
	EAttribute getRevision_Revision_timestamp();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.cmsdiscover.GenericModel.features.revisions.Revision#getRevision_log <em>Revision log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Revision log</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.features.revisions.Revision#getRevision_log()
	 * @see #getRevision()
	 * @generated
	 */
	EAttribute getRevision_Revision_log();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.cmsdiscover.GenericModel.features.revisions.RevisionableEntity <em>Revisionable Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Revisionable Entity</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.features.revisions.RevisionableEntity
	 * @generated
	 */
	EClass getRevisionableEntity();

	/**
	 * Returns the meta object for the reference list '{@link edu.uoc.som.cmsdiscover.GenericModel.features.revisions.RevisionableEntity#getRevisions <em>Revisions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Revisions</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.features.revisions.RevisionableEntity#getRevisions()
	 * @see #getRevisionableEntity()
	 * @generated
	 */
	EReference getRevisionableEntity_Revisions();

	/**
	 * Returns the meta object for the reference '{@link edu.uoc.som.cmsdiscover.GenericModel.features.revisions.RevisionableEntity#getDefaultRevision <em>Default Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Default Revision</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.features.revisions.RevisionableEntity#getDefaultRevision()
	 * @see #getRevisionableEntity()
	 * @generated
	 */
	EReference getRevisionableEntity_DefaultRevision();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RevisionsFactory getRevisionsFactory();

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
		 * The meta object literal for the '{@link edu.uoc.som.cmsdiscover.GenericModel.features.revisions.impl.RevisionImpl <em>Revision</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.cmsdiscover.GenericModel.features.revisions.impl.RevisionImpl
		 * @see edu.uoc.som.cmsdiscover.GenericModel.features.revisions.impl.RevisionsPackageImpl#getRevision()
		 * @generated
		 */
		EClass REVISION = eINSTANCE.getRevision();

		/**
		 * The meta object literal for the '<em><b>Vid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REVISION__VID = eINSTANCE.getRevision_Vid();

		/**
		 * The meta object literal for the '<em><b>Revision uid</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REVISION__REVISION_UID = eINSTANCE.getRevision_Revision_uid();

		/**
		 * The meta object literal for the '<em><b>Revision timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REVISION__REVISION_TIMESTAMP = eINSTANCE.getRevision_Revision_timestamp();

		/**
		 * The meta object literal for the '<em><b>Revision log</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REVISION__REVISION_LOG = eINSTANCE.getRevision_Revision_log();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.cmsdiscover.GenericModel.features.revisions.impl.RevisionableEntityImpl <em>Revisionable Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.cmsdiscover.GenericModel.features.revisions.impl.RevisionableEntityImpl
		 * @see edu.uoc.som.cmsdiscover.GenericModel.features.revisions.impl.RevisionsPackageImpl#getRevisionableEntity()
		 * @generated
		 */
		EClass REVISIONABLE_ENTITY = eINSTANCE.getRevisionableEntity();

		/**
		 * The meta object literal for the '<em><b>Revisions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REVISIONABLE_ENTITY__REVISIONS = eINSTANCE.getRevisionableEntity_Revisions();

		/**
		 * The meta object literal for the '<em><b>Default Revision</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REVISIONABLE_ENTITY__DEFAULT_REVISION = eINSTANCE.getRevisionableEntity_DefaultRevision();

	}

} //RevisionsPackage
