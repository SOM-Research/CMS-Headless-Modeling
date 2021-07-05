/**
 */
package edu.uoc.som.cmsdiscover.GenericModel.genericSchema.impl;

import edu.uoc.som.cmsdiscover.GenericModel.genericSchema.*;

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
public class GenericSchemaFactoryImpl extends EFactoryImpl implements GenericSchemaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GenericSchemaFactory init() {
		try {
			GenericSchemaFactory theGenericSchemaFactory = (GenericSchemaFactory)EPackage.Registry.INSTANCE.getEFactory(GenericSchemaPackage.eNS_URI);
			if (theGenericSchemaFactory != null) {
				return theGenericSchemaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GenericSchemaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericSchemaFactoryImpl() {
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
			case GenericSchemaPackage.COMMENT: return createComment();
			case GenericSchemaPackage.FILE: return createFile();
			case GenericSchemaPackage.MEDIA: return createMedia();
			case GenericSchemaPackage.BLOCK: return createBlock();
			case GenericSchemaPackage.CONTENT_TYPE: return createContentType();
			case GenericSchemaPackage.TAXONOMY: return createTaxonomy();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comment createComment() {
		CommentImpl comment = new CommentImpl();
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File createFile() {
		FileImpl file = new FileImpl();
		return file;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Media createMedia() {
		MediaImpl media = new MediaImpl();
		return media;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block createBlock() {
		BlockImpl block = new BlockImpl();
		return block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentType createContentType() {
		ContentTypeImpl contentType = new ContentTypeImpl();
		return contentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Taxonomy createTaxonomy() {
		TaxonomyImpl taxonomy = new TaxonomyImpl();
		return taxonomy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericSchemaPackage getGenericSchemaPackage() {
		return (GenericSchemaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GenericSchemaPackage getPackage() {
		return GenericSchemaPackage.eINSTANCE;
	}

} //GenericSchemaFactoryImpl
