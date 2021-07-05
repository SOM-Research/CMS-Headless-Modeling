/**
 */
package edu.uoc.som.cmsdiscover.GenericModel.genericSchema.impl;

import edu.uoc.som.cmsdiscover.GenericModel.GenericModelPackage;

import edu.uoc.som.cmsdiscover.GenericModel.features.moderation.ModerationPackage;

import edu.uoc.som.cmsdiscover.GenericModel.features.moderation.impl.ModerationPackageImpl;

import edu.uoc.som.cmsdiscover.GenericModel.features.revisions.RevisionsPackage;

import edu.uoc.som.cmsdiscover.GenericModel.features.revisions.impl.RevisionsPackageImpl;

import edu.uoc.som.cmsdiscover.GenericModel.features.translations.TranslationsPackage;

import edu.uoc.som.cmsdiscover.GenericModel.features.translations.impl.TranslationsPackageImpl;

import edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Block;
import edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Comment;
import edu.uoc.som.cmsdiscover.GenericModel.genericSchema.ContentType;
import edu.uoc.som.cmsdiscover.GenericModel.genericSchema.File;
import edu.uoc.som.cmsdiscover.GenericModel.genericSchema.GenericSchemaFactory;
import edu.uoc.som.cmsdiscover.GenericModel.genericSchema.GenericSchemaPackage;
import edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Media;
import edu.uoc.som.cmsdiscover.GenericModel.genericSchema.Taxonomy;

import edu.uoc.som.cmsdiscover.GenericModel.impl.GenericModelPackageImpl;

import edu.uoc.som.cmsdiscover.GenericModel.user.UserPackage;

import edu.uoc.som.cmsdiscover.GenericModel.user.impl.UserPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GenericSchemaPackageImpl extends EPackageImpl implements GenericSchemaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mediaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taxonomyEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see edu.uoc.som.cmsdiscover.GenericModel.genericSchema.GenericSchemaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GenericSchemaPackageImpl() {
		super(eNS_URI, GenericSchemaFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link GenericSchemaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GenericSchemaPackage init() {
		if (isInited) return (GenericSchemaPackage)EPackage.Registry.INSTANCE.getEPackage(GenericSchemaPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredGenericSchemaPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		GenericSchemaPackageImpl theGenericSchemaPackage = registeredGenericSchemaPackage instanceof GenericSchemaPackageImpl ? (GenericSchemaPackageImpl)registeredGenericSchemaPackage : new GenericSchemaPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GenericModelPackage.eNS_URI);
		GenericModelPackageImpl theGenericModelPackage = (GenericModelPackageImpl)(registeredPackage instanceof GenericModelPackageImpl ? registeredPackage : GenericModelPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(UserPackage.eNS_URI);
		UserPackageImpl theUserPackage = (UserPackageImpl)(registeredPackage instanceof UserPackageImpl ? registeredPackage : UserPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ModerationPackage.eNS_URI);
		ModerationPackageImpl theModerationPackage = (ModerationPackageImpl)(registeredPackage instanceof ModerationPackageImpl ? registeredPackage : ModerationPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(RevisionsPackage.eNS_URI);
		RevisionsPackageImpl theRevisionsPackage = (RevisionsPackageImpl)(registeredPackage instanceof RevisionsPackageImpl ? registeredPackage : RevisionsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TranslationsPackage.eNS_URI);
		TranslationsPackageImpl theTranslationsPackage = (TranslationsPackageImpl)(registeredPackage instanceof TranslationsPackageImpl ? registeredPackage : TranslationsPackage.eINSTANCE);

		// Create package meta-data objects
		theGenericSchemaPackage.createPackageContents();
		theGenericModelPackage.createPackageContents();
		theUserPackage.createPackageContents();
		theModerationPackage.createPackageContents();
		theRevisionsPackage.createPackageContents();
		theTranslationsPackage.createPackageContents();

		// Initialize created meta-data
		theGenericSchemaPackage.initializePackageContents();
		theGenericModelPackage.initializePackageContents();
		theUserPackage.initializePackageContents();
		theModerationPackage.initializePackageContents();
		theRevisionsPackage.initializePackageContents();
		theTranslationsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGenericSchemaPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GenericSchemaPackage.eNS_URI, theGenericSchemaPackage);
		return theGenericSchemaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComment() {
		return commentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComment_Cid() {
		return (EAttribute)commentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComment_Subject() {
		return (EAttribute)commentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComment_Name() {
		return (EAttribute)commentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComment_Mail() {
		return (EAttribute)commentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComment_Hostname() {
		return (EAttribute)commentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComment_Created() {
		return (EAttribute)commentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComment_Changed() {
		return (EAttribute)commentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComment_Thread() {
		return (EAttribute)commentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComment_Uid() {
		return (EReference)commentEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComment_Pid() {
		return (EReference)commentEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComment_Entity_id() {
		return (EReference)commentEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFile() {
		return fileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFile_Fid() {
		return (EAttribute)fileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFile_Langcode() {
		return (EAttribute)fileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFile_Uid() {
		return (EReference)fileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFile_Filename() {
		return (EAttribute)fileEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFile_Uri() {
		return (EAttribute)fileEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFile_Filemime() {
		return (EAttribute)fileEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFile_Filesize() {
		return (EAttribute)fileEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFile_Status() {
		return (EAttribute)fileEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFile_Created() {
		return (EAttribute)fileEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFile_Changed() {
		return (EAttribute)fileEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedia() {
		return mediaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMedia_Mid() {
		return (EAttribute)mediaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMedia_Vid() {
		return (EAttribute)mediaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMedia_Name() {
		return (EAttribute)mediaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedia_Uid() {
		return (EReference)mediaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMedia_Status() {
		return (EAttribute)mediaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMedia_Created() {
		return (EAttribute)mediaEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMedia_Changed() {
		return (EAttribute)mediaEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMedia_Thumbnail() {
		return (EAttribute)mediaEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedia_File_reference() {
		return (EReference)mediaEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedia_Revision_default() {
		return (EReference)mediaEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedia_Revisions() {
		return (EReference)mediaEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlock() {
		return blockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlock_Id() {
		return (EAttribute)blockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlock_Vid() {
		return (EAttribute)blockEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlock_Status() {
		return (EAttribute)blockEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlock_Changed() {
		return (EAttribute)blockEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlock_Reusable() {
		return (EAttribute)blockEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlock_Revision_default() {
		return (EReference)blockEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlock_Revisions() {
		return (EReference)blockEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContentType() {
		return contentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContentType_ContentId() {
		return (EAttribute)contentTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContentType_Uid() {
		return (EReference)contentTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContentType_Title() {
		return (EAttribute)contentTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContentType_Status() {
		return (EAttribute)contentTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContentType_Created() {
		return (EAttribute)contentTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContentType_Changed() {
		return (EAttribute)contentTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContentType_Revision_default() {
		return (EReference)contentTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContentType_Revisions() {
		return (EReference)contentTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContentType_Moderation_state() {
		return (EReference)contentTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaxonomy() {
		return taxonomyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaxonomy_Tid() {
		return (EAttribute)taxonomyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaxonomy_Vid() {
		return (EAttribute)taxonomyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaxonomy_Name() {
		return (EAttribute)taxonomyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaxonomy_Description() {
		return (EAttribute)taxonomyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaxonomy_Parent() {
		return (EAttribute)taxonomyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaxonomy_Changed() {
		return (EAttribute)taxonomyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaxonomy_Revision_default() {
		return (EReference)taxonomyEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaxonomy_Revisions() {
		return (EReference)taxonomyEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericSchemaFactory getGenericSchemaFactory() {
		return (GenericSchemaFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		commentEClass = createEClass(COMMENT);
		createEAttribute(commentEClass, COMMENT__CID);
		createEAttribute(commentEClass, COMMENT__SUBJECT);
		createEAttribute(commentEClass, COMMENT__NAME);
		createEAttribute(commentEClass, COMMENT__MAIL);
		createEAttribute(commentEClass, COMMENT__HOSTNAME);
		createEAttribute(commentEClass, COMMENT__CREATED);
		createEAttribute(commentEClass, COMMENT__CHANGED);
		createEAttribute(commentEClass, COMMENT__THREAD);
		createEReference(commentEClass, COMMENT__UID);
		createEReference(commentEClass, COMMENT__PID);
		createEReference(commentEClass, COMMENT__ENTITY_ID);

		fileEClass = createEClass(FILE);
		createEAttribute(fileEClass, FILE__FID);
		createEAttribute(fileEClass, FILE__LANGCODE);
		createEReference(fileEClass, FILE__UID);
		createEAttribute(fileEClass, FILE__FILENAME);
		createEAttribute(fileEClass, FILE__URI);
		createEAttribute(fileEClass, FILE__FILEMIME);
		createEAttribute(fileEClass, FILE__FILESIZE);
		createEAttribute(fileEClass, FILE__STATUS);
		createEAttribute(fileEClass, FILE__CREATED);
		createEAttribute(fileEClass, FILE__CHANGED);

		mediaEClass = createEClass(MEDIA);
		createEAttribute(mediaEClass, MEDIA__MID);
		createEAttribute(mediaEClass, MEDIA__VID);
		createEAttribute(mediaEClass, MEDIA__NAME);
		createEReference(mediaEClass, MEDIA__UID);
		createEAttribute(mediaEClass, MEDIA__STATUS);
		createEAttribute(mediaEClass, MEDIA__CREATED);
		createEAttribute(mediaEClass, MEDIA__CHANGED);
		createEAttribute(mediaEClass, MEDIA__THUMBNAIL);
		createEReference(mediaEClass, MEDIA__FILE_REFERENCE);
		createEReference(mediaEClass, MEDIA__REVISION_DEFAULT);
		createEReference(mediaEClass, MEDIA__REVISIONS);

		blockEClass = createEClass(BLOCK);
		createEAttribute(blockEClass, BLOCK__ID);
		createEAttribute(blockEClass, BLOCK__VID);
		createEAttribute(blockEClass, BLOCK__STATUS);
		createEAttribute(blockEClass, BLOCK__CHANGED);
		createEAttribute(blockEClass, BLOCK__REUSABLE);
		createEReference(blockEClass, BLOCK__REVISION_DEFAULT);
		createEReference(blockEClass, BLOCK__REVISIONS);

		contentTypeEClass = createEClass(CONTENT_TYPE);
		createEAttribute(contentTypeEClass, CONTENT_TYPE__CONTENT_ID);
		createEReference(contentTypeEClass, CONTENT_TYPE__UID);
		createEAttribute(contentTypeEClass, CONTENT_TYPE__TITLE);
		createEAttribute(contentTypeEClass, CONTENT_TYPE__STATUS);
		createEAttribute(contentTypeEClass, CONTENT_TYPE__CREATED);
		createEAttribute(contentTypeEClass, CONTENT_TYPE__CHANGED);
		createEReference(contentTypeEClass, CONTENT_TYPE__REVISION_DEFAULT);
		createEReference(contentTypeEClass, CONTENT_TYPE__REVISIONS);
		createEReference(contentTypeEClass, CONTENT_TYPE__MODERATION_STATE);

		taxonomyEClass = createEClass(TAXONOMY);
		createEAttribute(taxonomyEClass, TAXONOMY__TID);
		createEAttribute(taxonomyEClass, TAXONOMY__VID);
		createEAttribute(taxonomyEClass, TAXONOMY__NAME);
		createEAttribute(taxonomyEClass, TAXONOMY__DESCRIPTION);
		createEAttribute(taxonomyEClass, TAXONOMY__PARENT);
		createEAttribute(taxonomyEClass, TAXONOMY__CHANGED);
		createEReference(taxonomyEClass, TAXONOMY__REVISION_DEFAULT);
		createEReference(taxonomyEClass, TAXONOMY__REVISIONS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		GenericModelPackage theGenericModelPackage = (GenericModelPackage)EPackage.Registry.INSTANCE.getEPackage(GenericModelPackage.eNS_URI);
		UserPackage theUserPackage = (UserPackage)EPackage.Registry.INSTANCE.getEPackage(UserPackage.eNS_URI);
		RevisionsPackage theRevisionsPackage = (RevisionsPackage)EPackage.Registry.INSTANCE.getEPackage(RevisionsPackage.eNS_URI);
		ModerationPackage theModerationPackage = (ModerationPackage)EPackage.Registry.INSTANCE.getEPackage(ModerationPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		commentEClass.getESuperTypes().add(theGenericModelPackage.getContentEntity());
		fileEClass.getESuperTypes().add(theGenericModelPackage.getContentEntity());
		mediaEClass.getESuperTypes().add(theGenericModelPackage.getContentEntity());
		blockEClass.getESuperTypes().add(theGenericModelPackage.getContentEntity());
		contentTypeEClass.getESuperTypes().add(theGenericModelPackage.getContentEntity());
		taxonomyEClass.getESuperTypes().add(theGenericModelPackage.getContentEntity());

		// Initialize classes and features; add operations and parameters
		initEClass(commentEClass, Comment.class, "Comment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComment_Cid(), ecorePackage.getEInt(), "cid", null, 0, 1, Comment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComment_Subject(), ecorePackage.getEString(), "subject", null, 0, 1, Comment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComment_Name(), ecorePackage.getEString(), "name", null, 0, 1, Comment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComment_Mail(), ecorePackage.getEString(), "mail", null, 0, 1, Comment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComment_Hostname(), ecorePackage.getEString(), "hostname", null, 0, 1, Comment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComment_Created(), ecorePackage.getEDate(), "created", null, 0, 1, Comment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComment_Changed(), ecorePackage.getEDate(), "changed", null, 0, 1, Comment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComment_Thread(), ecorePackage.getEString(), "thread", null, 0, 1, Comment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComment_Uid(), theUserPackage.getUser(), null, "uid", null, 1, 1, Comment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComment_Pid(), this.getComment(), null, "pid", null, 1, 1, Comment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComment_Entity_id(), this.getContentType(), null, "entity_id", null, 1, 1, Comment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fileEClass, File.class, "File", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFile_Fid(), ecorePackage.getEInt(), "fid", null, 0, 1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFile_Langcode(), ecorePackage.getEString(), "langcode", null, 0, 1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFile_Uid(), theUserPackage.getUser(), null, "uid", null, 1, 1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFile_Filename(), ecorePackage.getEString(), "filename", null, 0, 1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFile_Uri(), ecorePackage.getEString(), "uri", null, 0, 1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFile_Filemime(), ecorePackage.getEString(), "filemime", null, 0, 1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFile_Filesize(), ecorePackage.getEInt(), "filesize", null, 0, 1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFile_Status(), ecorePackage.getEBoolean(), "status", null, 0, 1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFile_Created(), ecorePackage.getEDate(), "created", null, 0, 1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFile_Changed(), ecorePackage.getEDate(), "changed", null, 0, 1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mediaEClass, Media.class, "Media", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMedia_Mid(), ecorePackage.getEInt(), "mid", null, 0, 1, Media.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMedia_Vid(), ecorePackage.getEInt(), "vid", null, 0, 1, Media.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMedia_Name(), ecorePackage.getEString(), "name", null, 0, 1, Media.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMedia_Uid(), theUserPackage.getUser(), null, "uid", null, 1, 1, Media.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMedia_Status(), ecorePackage.getEBoolean(), "status", null, 0, 1, Media.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMedia_Created(), ecorePackage.getEDate(), "created", null, 0, 1, Media.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMedia_Changed(), ecorePackage.getEDate(), "changed", null, 0, 1, Media.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMedia_Thumbnail(), ecorePackage.getEJavaObject(), "thumbnail", null, 0, 1, Media.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMedia_File_reference(), this.getFile(), null, "file_reference", null, 0, -1, Media.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMedia_Revision_default(), theRevisionsPackage.getRevision(), null, "revision_default", null, 1, 1, Media.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMedia_Revisions(), theRevisionsPackage.getRevision(), null, "revisions", null, 1, -1, Media.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(blockEClass, Block.class, "Block", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBlock_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBlock_Vid(), ecorePackage.getEInt(), "vid", null, 0, 1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBlock_Status(), ecorePackage.getEBoolean(), "status", null, 0, 1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBlock_Changed(), ecorePackage.getEDate(), "changed", null, 0, 1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBlock_Reusable(), ecorePackage.getEBoolean(), "reusable", null, 0, 1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBlock_Revision_default(), theRevisionsPackage.getRevision(), null, "revision_default", null, 1, 1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBlock_Revisions(), theRevisionsPackage.getRevision(), null, "revisions", null, 1, -1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contentTypeEClass, ContentType.class, "ContentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContentType_ContentId(), ecorePackage.getEInt(), "contentId", null, 0, 1, ContentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContentType_Uid(), theUserPackage.getUser(), null, "uid", null, 1, 1, ContentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContentType_Title(), ecorePackage.getEString(), "title", null, 0, 1, ContentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContentType_Status(), ecorePackage.getEBoolean(), "status", null, 0, 1, ContentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContentType_Created(), ecorePackage.getEDate(), "created", null, 0, 1, ContentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContentType_Changed(), ecorePackage.getEDate(), "changed", null, 0, 1, ContentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContentType_Revision_default(), theRevisionsPackage.getRevision(), null, "revision_default", null, 1, 1, ContentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContentType_Revisions(), theRevisionsPackage.getRevision(), null, "revisions", null, 1, -1, ContentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContentType_Moderation_state(), theModerationPackage.getState(), null, "moderation_state", null, 1, 1, ContentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taxonomyEClass, Taxonomy.class, "Taxonomy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTaxonomy_Tid(), ecorePackage.getEInt(), "tid", null, 0, 1, Taxonomy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaxonomy_Vid(), ecorePackage.getEInt(), "vid", null, 0, 1, Taxonomy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaxonomy_Name(), ecorePackage.getEString(), "name", null, 0, 1, Taxonomy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaxonomy_Description(), ecorePackage.getEString(), "description", null, 0, 1, Taxonomy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaxonomy_Parent(), ecorePackage.getEString(), "parent", null, 0, 1, Taxonomy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaxonomy_Changed(), ecorePackage.getEDate(), "changed", null, 0, 1, Taxonomy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaxonomy_Revision_default(), theRevisionsPackage.getRevision(), null, "revision_default", null, 1, 1, Taxonomy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaxonomy_Revisions(), theRevisionsPackage.getRevision(), null, "revisions", null, 1, -1, Taxonomy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //GenericSchemaPackageImpl
