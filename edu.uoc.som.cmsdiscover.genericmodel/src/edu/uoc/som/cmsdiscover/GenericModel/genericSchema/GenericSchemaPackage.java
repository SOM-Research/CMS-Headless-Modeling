/**
 */
package edu.uoc.som.cmsdiscover.GenericModel.genericSchema;

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
 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.GenericSchemaFactory
 * @model kind="package"
 * @generated
 */
public interface GenericSchemaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "genericSchema";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://edu.uoc.som.cmsdiscoverer.genericmodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "genericschema";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GenericSchemaPackage eINSTANCE = edu.uoc.som.cmsdiscover.GenericModel.genericSchema.impl.GenericSchemaPackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.impl.CommentImpl <em>Comment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.impl.CommentImpl
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.impl.GenericSchemaPackageImpl#getComment()
	 * @generated
	 */
	int COMMENT = 0;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__UUID = GenericModelPackage.CONTENT_ENTITY__UUID;

	/**
	 * The feature id for the '<em><b>Cid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__CID = GenericModelPackage.CONTENT_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__SUBJECT = GenericModelPackage.CONTENT_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__NAME = GenericModelPackage.CONTENT_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Mail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__MAIL = GenericModelPackage.CONTENT_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__HOSTNAME = GenericModelPackage.CONTENT_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__CREATED = GenericModelPackage.CONTENT_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__CHANGED = GenericModelPackage.CONTENT_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Thread</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__THREAD = GenericModelPackage.CONTENT_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__UID = GenericModelPackage.CONTENT_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Pid</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__PID = GenericModelPackage.CONTENT_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Entity id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__ENTITY_ID = GenericModelPackage.CONTENT_ENTITY_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_FEATURE_COUNT = GenericModelPackage.CONTENT_ENTITY_FEATURE_COUNT + 11;

	/**
	 * The meta object id for the '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.impl.FileImpl <em>File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.impl.FileImpl
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.impl.GenericSchemaPackageImpl#getFile()
	 * @generated
	 */
	int FILE = 1;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__UUID = GenericModelPackage.CONTENT_ENTITY__UUID;

	/**
	 * The feature id for the '<em><b>Fid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__FID = GenericModelPackage.CONTENT_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Langcode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__LANGCODE = GenericModelPackage.CONTENT_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__UID = GenericModelPackage.CONTENT_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__FILENAME = GenericModelPackage.CONTENT_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__URI = GenericModelPackage.CONTENT_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Filemime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__FILEMIME = GenericModelPackage.CONTENT_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Filesize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__FILESIZE = GenericModelPackage.CONTENT_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__STATUS = GenericModelPackage.CONTENT_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__CREATED = GenericModelPackage.CONTENT_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__CHANGED = GenericModelPackage.CONTENT_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FEATURE_COUNT = GenericModelPackage.CONTENT_ENTITY_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.impl.MediaImpl <em>Media</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.impl.MediaImpl
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.impl.GenericSchemaPackageImpl#getMedia()
	 * @generated
	 */
	int MEDIA = 2;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA__UUID = GenericModelPackage.CONTENT_ENTITY__UUID;

	/**
	 * The feature id for the '<em><b>Mid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA__MID = GenericModelPackage.CONTENT_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Vid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA__VID = GenericModelPackage.CONTENT_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA__NAME = GenericModelPackage.CONTENT_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA__UID = GenericModelPackage.CONTENT_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA__STATUS = GenericModelPackage.CONTENT_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA__CREATED = GenericModelPackage.CONTENT_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA__CHANGED = GenericModelPackage.CONTENT_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Thumbnail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA__THUMBNAIL = GenericModelPackage.CONTENT_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>File reference</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA__FILE_REFERENCE = GenericModelPackage.CONTENT_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Revision default</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA__REVISION_DEFAULT = GenericModelPackage.CONTENT_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Revisions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA__REVISIONS = GenericModelPackage.CONTENT_ENTITY_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Media</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_FEATURE_COUNT = GenericModelPackage.CONTENT_ENTITY_FEATURE_COUNT + 11;

	/**
	 * The meta object id for the '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.impl.BlockImpl <em>Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.impl.BlockImpl
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.impl.GenericSchemaPackageImpl#getBlock()
	 * @generated
	 */
	int BLOCK = 3;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__UUID = GenericModelPackage.CONTENT_ENTITY__UUID;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__ID = GenericModelPackage.CONTENT_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Vid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__VID = GenericModelPackage.CONTENT_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__STATUS = GenericModelPackage.CONTENT_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__CHANGED = GenericModelPackage.CONTENT_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Reusable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__REUSABLE = GenericModelPackage.CONTENT_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Revision default</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__REVISION_DEFAULT = GenericModelPackage.CONTENT_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Revisions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__REVISIONS = GenericModelPackage.CONTENT_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FEATURE_COUNT = GenericModelPackage.CONTENT_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.impl.ContentTypeImpl <em>Content Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.impl.ContentTypeImpl
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.impl.GenericSchemaPackageImpl#getContentType()
	 * @generated
	 */
	int CONTENT_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_TYPE__UUID = GenericModelPackage.CONTENT_ENTITY__UUID;

	/**
	 * The feature id for the '<em><b>Content Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_TYPE__CONTENT_ID = GenericModelPackage.CONTENT_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_TYPE__UID = GenericModelPackage.CONTENT_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_TYPE__TITLE = GenericModelPackage.CONTENT_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_TYPE__STATUS = GenericModelPackage.CONTENT_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_TYPE__CREATED = GenericModelPackage.CONTENT_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_TYPE__CHANGED = GenericModelPackage.CONTENT_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Revision default</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_TYPE__REVISION_DEFAULT = GenericModelPackage.CONTENT_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Revisions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_TYPE__REVISIONS = GenericModelPackage.CONTENT_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Moderation state</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_TYPE__MODERATION_STATE = GenericModelPackage.CONTENT_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Content Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_TYPE_FEATURE_COUNT = GenericModelPackage.CONTENT_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.impl.TaxonomyImpl <em>Taxonomy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.impl.TaxonomyImpl
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.impl.GenericSchemaPackageImpl#getTaxonomy()
	 * @generated
	 */
	int TAXONOMY = 5;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAXONOMY__UUID = GenericModelPackage.CONTENT_ENTITY__UUID;

	/**
	 * The feature id for the '<em><b>Tid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAXONOMY__TID = GenericModelPackage.CONTENT_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Vid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAXONOMY__VID = GenericModelPackage.CONTENT_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAXONOMY__NAME = GenericModelPackage.CONTENT_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAXONOMY__DESCRIPTION = GenericModelPackage.CONTENT_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAXONOMY__PARENT = GenericModelPackage.CONTENT_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAXONOMY__CHANGED = GenericModelPackage.CONTENT_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Revision default</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAXONOMY__REVISION_DEFAULT = GenericModelPackage.CONTENT_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Revisions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAXONOMY__REVISIONS = GenericModelPackage.CONTENT_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Taxonomy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAXONOMY_FEATURE_COUNT = GenericModelPackage.CONTENT_ENTITY_FEATURE_COUNT + 8;


	/**
	 * Returns the meta object for class '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Comment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comment</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Comment
	 * @generated
	 */
	EClass getComment();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Comment#getCid <em>Cid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cid</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Comment#getCid()
	 * @see #getComment()
	 * @generated
	 */
	EAttribute getComment_Cid();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Comment#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subject</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Comment#getSubject()
	 * @see #getComment()
	 * @generated
	 */
	EAttribute getComment_Subject();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Comment#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Comment#getName()
	 * @see #getComment()
	 * @generated
	 */
	EAttribute getComment_Name();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Comment#getMail <em>Mail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mail</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Comment#getMail()
	 * @see #getComment()
	 * @generated
	 */
	EAttribute getComment_Mail();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Comment#getHostname <em>Hostname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hostname</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Comment#getHostname()
	 * @see #getComment()
	 * @generated
	 */
	EAttribute getComment_Hostname();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Comment#getCreated <em>Created</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Comment#getCreated()
	 * @see #getComment()
	 * @generated
	 */
	EAttribute getComment_Created();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Comment#getChanged <em>Changed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Changed</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Comment#getChanged()
	 * @see #getComment()
	 * @generated
	 */
	EAttribute getComment_Changed();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Comment#getThread <em>Thread</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thread</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Comment#getThread()
	 * @see #getComment()
	 * @generated
	 */
	EAttribute getComment_Thread();

	/**
	 * Returns the meta object for the reference '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Comment#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Uid</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Comment#getUid()
	 * @see #getComment()
	 * @generated
	 */
	EReference getComment_Uid();

	/**
	 * Returns the meta object for the reference '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Comment#getPid <em>Pid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pid</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Comment#getPid()
	 * @see #getComment()
	 * @generated
	 */
	EReference getComment_Pid();

	/**
	 * Returns the meta object for the reference '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Comment#getEntity_id <em>Entity id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity id</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Comment#getEntity_id()
	 * @see #getComment()
	 * @generated
	 */
	EReference getComment_Entity_id();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.File
	 * @generated
	 */
	EClass getFile();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.File#getFid <em>Fid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fid</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.File#getFid()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Fid();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.File#getLangcode <em>Langcode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Langcode</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.File#getLangcode()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Langcode();

	/**
	 * Returns the meta object for the reference '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.File#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Uid</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.File#getUid()
	 * @see #getFile()
	 * @generated
	 */
	EReference getFile_Uid();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.File#getFilename <em>Filename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filename</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.File#getFilename()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Filename();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.File#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.File#getUri()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Uri();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.File#getFilemime <em>Filemime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filemime</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.File#getFilemime()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Filemime();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.File#getFilesize <em>Filesize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filesize</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.File#getFilesize()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Filesize();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.File#isStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.File#isStatus()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Status();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.File#getCreated <em>Created</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.File#getCreated()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Created();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.File#getChanged <em>Changed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Changed</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.File#getChanged()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Changed();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Media <em>Media</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Media</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Media
	 * @generated
	 */
	EClass getMedia();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Media#getMid <em>Mid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mid</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Media#getMid()
	 * @see #getMedia()
	 * @generated
	 */
	EAttribute getMedia_Mid();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Media#getVid <em>Vid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vid</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Media#getVid()
	 * @see #getMedia()
	 * @generated
	 */
	EAttribute getMedia_Vid();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Media#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Media#getName()
	 * @see #getMedia()
	 * @generated
	 */
	EAttribute getMedia_Name();

	/**
	 * Returns the meta object for the reference '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Media#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Uid</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Media#getUid()
	 * @see #getMedia()
	 * @generated
	 */
	EReference getMedia_Uid();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Media#isStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Media#isStatus()
	 * @see #getMedia()
	 * @generated
	 */
	EAttribute getMedia_Status();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Media#getCreated <em>Created</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Media#getCreated()
	 * @see #getMedia()
	 * @generated
	 */
	EAttribute getMedia_Created();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Media#getChanged <em>Changed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Changed</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Media#getChanged()
	 * @see #getMedia()
	 * @generated
	 */
	EAttribute getMedia_Changed();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Media#getThumbnail <em>Thumbnail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thumbnail</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Media#getThumbnail()
	 * @see #getMedia()
	 * @generated
	 */
	EAttribute getMedia_Thumbnail();

	/**
	 * Returns the meta object for the reference list '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Media#getFile_reference <em>File reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>File reference</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Media#getFile_reference()
	 * @see #getMedia()
	 * @generated
	 */
	EReference getMedia_File_reference();

	/**
	 * Returns the meta object for the reference '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Media#getRevision_default <em>Revision default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Revision default</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Media#getRevision_default()
	 * @see #getMedia()
	 * @generated
	 */
	EReference getMedia_Revision_default();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Media#getRevisions <em>Revisions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Revisions</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Media#getRevisions()
	 * @see #getMedia()
	 * @generated
	 */
	EReference getMedia_Revisions();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Block
	 * @generated
	 */
	EClass getBlock();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Block#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Block#getId()
	 * @see #getBlock()
	 * @generated
	 */
	EAttribute getBlock_Id();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Block#getVid <em>Vid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vid</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Block#getVid()
	 * @see #getBlock()
	 * @generated
	 */
	EAttribute getBlock_Vid();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Block#isStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Block#isStatus()
	 * @see #getBlock()
	 * @generated
	 */
	EAttribute getBlock_Status();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Block#getChanged <em>Changed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Changed</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Block#getChanged()
	 * @see #getBlock()
	 * @generated
	 */
	EAttribute getBlock_Changed();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Block#isReusable <em>Reusable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reusable</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Block#isReusable()
	 * @see #getBlock()
	 * @generated
	 */
	EAttribute getBlock_Reusable();

	/**
	 * Returns the meta object for the reference '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Block#getRevision_default <em>Revision default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Revision default</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Block#getRevision_default()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Revision_default();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Block#getRevisions <em>Revisions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Revisions</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Block#getRevisions()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Revisions();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.ContentType <em>Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content Type</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.ContentType
	 * @generated
	 */
	EClass getContentType();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.ContentType#getContentId <em>Content Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Id</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.ContentType#getContentId()
	 * @see #getContentType()
	 * @generated
	 */
	EAttribute getContentType_ContentId();

	/**
	 * Returns the meta object for the reference '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.ContentType#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Uid</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.ContentType#getUid()
	 * @see #getContentType()
	 * @generated
	 */
	EReference getContentType_Uid();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.ContentType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.ContentType#getTitle()
	 * @see #getContentType()
	 * @generated
	 */
	EAttribute getContentType_Title();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.ContentType#isStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.ContentType#isStatus()
	 * @see #getContentType()
	 * @generated
	 */
	EAttribute getContentType_Status();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.ContentType#getCreated <em>Created</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.ContentType#getCreated()
	 * @see #getContentType()
	 * @generated
	 */
	EAttribute getContentType_Created();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.ContentType#getChanged <em>Changed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Changed</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.ContentType#getChanged()
	 * @see #getContentType()
	 * @generated
	 */
	EAttribute getContentType_Changed();

	/**
	 * Returns the meta object for the reference '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.ContentType#getRevision_default <em>Revision default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Revision default</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.ContentType#getRevision_default()
	 * @see #getContentType()
	 * @generated
	 */
	EReference getContentType_Revision_default();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.ContentType#getRevisions <em>Revisions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Revisions</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.ContentType#getRevisions()
	 * @see #getContentType()
	 * @generated
	 */
	EReference getContentType_Revisions();

	/**
	 * Returns the meta object for the reference '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.ContentType#getModeration_state <em>Moderation state</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Moderation state</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.ContentType#getModeration_state()
	 * @see #getContentType()
	 * @generated
	 */
	EReference getContentType_Moderation_state();

	/**
	 * Returns the meta object for class '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Taxonomy <em>Taxonomy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Taxonomy</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Taxonomy
	 * @generated
	 */
	EClass getTaxonomy();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Taxonomy#getTid <em>Tid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tid</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Taxonomy#getTid()
	 * @see #getTaxonomy()
	 * @generated
	 */
	EAttribute getTaxonomy_Tid();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Taxonomy#getVid <em>Vid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vid</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Taxonomy#getVid()
	 * @see #getTaxonomy()
	 * @generated
	 */
	EAttribute getTaxonomy_Vid();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Taxonomy#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Taxonomy#getName()
	 * @see #getTaxonomy()
	 * @generated
	 */
	EAttribute getTaxonomy_Name();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Taxonomy#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Taxonomy#getDescription()
	 * @see #getTaxonomy()
	 * @generated
	 */
	EAttribute getTaxonomy_Description();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Taxonomy#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parent</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Taxonomy#getParent()
	 * @see #getTaxonomy()
	 * @generated
	 */
	EAttribute getTaxonomy_Parent();

	/**
	 * Returns the meta object for the attribute '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Taxonomy#getChanged <em>Changed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Changed</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Taxonomy#getChanged()
	 * @see #getTaxonomy()
	 * @generated
	 */
	EAttribute getTaxonomy_Changed();

	/**
	 * Returns the meta object for the reference '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Taxonomy#getRevision_default <em>Revision default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Revision default</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Taxonomy#getRevision_default()
	 * @see #getTaxonomy()
	 * @generated
	 */
	EReference getTaxonomy_Revision_default();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Taxonomy#getRevisions <em>Revisions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Revisions</em>'.
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Taxonomy#getRevisions()
	 * @see #getTaxonomy()
	 * @generated
	 */
	EReference getTaxonomy_Revisions();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GenericSchemaFactory getGenericSchemaFactory();

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
		 * The meta object literal for the '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.impl.CommentImpl <em>Comment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.impl.CommentImpl
		 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.impl.GenericSchemaPackageImpl#getComment()
		 * @generated
		 */
		EClass COMMENT = eINSTANCE.getComment();

		/**
		 * The meta object literal for the '<em><b>Cid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENT__CID = eINSTANCE.getComment_Cid();

		/**
		 * The meta object literal for the '<em><b>Subject</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENT__SUBJECT = eINSTANCE.getComment_Subject();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENT__NAME = eINSTANCE.getComment_Name();

		/**
		 * The meta object literal for the '<em><b>Mail</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENT__MAIL = eINSTANCE.getComment_Mail();

		/**
		 * The meta object literal for the '<em><b>Hostname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENT__HOSTNAME = eINSTANCE.getComment_Hostname();

		/**
		 * The meta object literal for the '<em><b>Created</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENT__CREATED = eINSTANCE.getComment_Created();

		/**
		 * The meta object literal for the '<em><b>Changed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENT__CHANGED = eINSTANCE.getComment_Changed();

		/**
		 * The meta object literal for the '<em><b>Thread</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENT__THREAD = eINSTANCE.getComment_Thread();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMENT__UID = eINSTANCE.getComment_Uid();

		/**
		 * The meta object literal for the '<em><b>Pid</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMENT__PID = eINSTANCE.getComment_Pid();

		/**
		 * The meta object literal for the '<em><b>Entity id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMENT__ENTITY_ID = eINSTANCE.getComment_Entity_id();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.impl.FileImpl <em>File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.impl.FileImpl
		 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.impl.GenericSchemaPackageImpl#getFile()
		 * @generated
		 */
		EClass FILE = eINSTANCE.getFile();

		/**
		 * The meta object literal for the '<em><b>Fid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__FID = eINSTANCE.getFile_Fid();

		/**
		 * The meta object literal for the '<em><b>Langcode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__LANGCODE = eINSTANCE.getFile_Langcode();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE__UID = eINSTANCE.getFile_Uid();

		/**
		 * The meta object literal for the '<em><b>Filename</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__FILENAME = eINSTANCE.getFile_Filename();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__URI = eINSTANCE.getFile_Uri();

		/**
		 * The meta object literal for the '<em><b>Filemime</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__FILEMIME = eINSTANCE.getFile_Filemime();

		/**
		 * The meta object literal for the '<em><b>Filesize</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__FILESIZE = eINSTANCE.getFile_Filesize();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__STATUS = eINSTANCE.getFile_Status();

		/**
		 * The meta object literal for the '<em><b>Created</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__CREATED = eINSTANCE.getFile_Created();

		/**
		 * The meta object literal for the '<em><b>Changed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__CHANGED = eINSTANCE.getFile_Changed();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.impl.MediaImpl <em>Media</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.impl.MediaImpl
		 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.impl.GenericSchemaPackageImpl#getMedia()
		 * @generated
		 */
		EClass MEDIA = eINSTANCE.getMedia();

		/**
		 * The meta object literal for the '<em><b>Mid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIA__MID = eINSTANCE.getMedia_Mid();

		/**
		 * The meta object literal for the '<em><b>Vid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIA__VID = eINSTANCE.getMedia_Vid();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIA__NAME = eINSTANCE.getMedia_Name();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEDIA__UID = eINSTANCE.getMedia_Uid();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIA__STATUS = eINSTANCE.getMedia_Status();

		/**
		 * The meta object literal for the '<em><b>Created</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIA__CREATED = eINSTANCE.getMedia_Created();

		/**
		 * The meta object literal for the '<em><b>Changed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIA__CHANGED = eINSTANCE.getMedia_Changed();

		/**
		 * The meta object literal for the '<em><b>Thumbnail</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIA__THUMBNAIL = eINSTANCE.getMedia_Thumbnail();

		/**
		 * The meta object literal for the '<em><b>File reference</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEDIA__FILE_REFERENCE = eINSTANCE.getMedia_File_reference();

		/**
		 * The meta object literal for the '<em><b>Revision default</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEDIA__REVISION_DEFAULT = eINSTANCE.getMedia_Revision_default();

		/**
		 * The meta object literal for the '<em><b>Revisions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEDIA__REVISIONS = eINSTANCE.getMedia_Revisions();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.impl.BlockImpl <em>Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.impl.BlockImpl
		 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.impl.GenericSchemaPackageImpl#getBlock()
		 * @generated
		 */
		EClass BLOCK = eINSTANCE.getBlock();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK__ID = eINSTANCE.getBlock_Id();

		/**
		 * The meta object literal for the '<em><b>Vid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK__VID = eINSTANCE.getBlock_Vid();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK__STATUS = eINSTANCE.getBlock_Status();

		/**
		 * The meta object literal for the '<em><b>Changed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK__CHANGED = eINSTANCE.getBlock_Changed();

		/**
		 * The meta object literal for the '<em><b>Reusable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK__REUSABLE = eINSTANCE.getBlock_Reusable();

		/**
		 * The meta object literal for the '<em><b>Revision default</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__REVISION_DEFAULT = eINSTANCE.getBlock_Revision_default();

		/**
		 * The meta object literal for the '<em><b>Revisions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__REVISIONS = eINSTANCE.getBlock_Revisions();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.impl.ContentTypeImpl <em>Content Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.impl.ContentTypeImpl
		 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.impl.GenericSchemaPackageImpl#getContentType()
		 * @generated
		 */
		EClass CONTENT_TYPE = eINSTANCE.getContentType();

		/**
		 * The meta object literal for the '<em><b>Content Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_TYPE__CONTENT_ID = eINSTANCE.getContentType_ContentId();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_TYPE__UID = eINSTANCE.getContentType_Uid();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_TYPE__TITLE = eINSTANCE.getContentType_Title();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_TYPE__STATUS = eINSTANCE.getContentType_Status();

		/**
		 * The meta object literal for the '<em><b>Created</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_TYPE__CREATED = eINSTANCE.getContentType_Created();

		/**
		 * The meta object literal for the '<em><b>Changed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_TYPE__CHANGED = eINSTANCE.getContentType_Changed();

		/**
		 * The meta object literal for the '<em><b>Revision default</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_TYPE__REVISION_DEFAULT = eINSTANCE.getContentType_Revision_default();

		/**
		 * The meta object literal for the '<em><b>Revisions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_TYPE__REVISIONS = eINSTANCE.getContentType_Revisions();

		/**
		 * The meta object literal for the '<em><b>Moderation state</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT_TYPE__MODERATION_STATE = eINSTANCE.getContentType_Moderation_state();

		/**
		 * The meta object literal for the '{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.impl.TaxonomyImpl <em>Taxonomy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.impl.TaxonomyImpl
		 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.impl.GenericSchemaPackageImpl#getTaxonomy()
		 * @generated
		 */
		EClass TAXONOMY = eINSTANCE.getTaxonomy();

		/**
		 * The meta object literal for the '<em><b>Tid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAXONOMY__TID = eINSTANCE.getTaxonomy_Tid();

		/**
		 * The meta object literal for the '<em><b>Vid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAXONOMY__VID = eINSTANCE.getTaxonomy_Vid();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAXONOMY__NAME = eINSTANCE.getTaxonomy_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAXONOMY__DESCRIPTION = eINSTANCE.getTaxonomy_Description();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAXONOMY__PARENT = eINSTANCE.getTaxonomy_Parent();

		/**
		 * The meta object literal for the '<em><b>Changed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAXONOMY__CHANGED = eINSTANCE.getTaxonomy_Changed();

		/**
		 * The meta object literal for the '<em><b>Revision default</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAXONOMY__REVISION_DEFAULT = eINSTANCE.getTaxonomy_Revision_default();

		/**
		 * The meta object literal for the '<em><b>Revisions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAXONOMY__REVISIONS = eINSTANCE.getTaxonomy_Revisions();

	}

} //GenericSchemaPackage
