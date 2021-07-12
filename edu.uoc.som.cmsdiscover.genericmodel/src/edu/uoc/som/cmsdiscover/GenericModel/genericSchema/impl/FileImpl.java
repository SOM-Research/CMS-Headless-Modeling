/**
 */
package edu.uoc.som.cmsdiscover.GenericModel.genericSchema.impl;

import edu.uoc.som.cmsdiscover.GenericModel.genericSchema.File;
import edu.uoc.som.cmsdiscover.GenericModel.genericSchema.GenericSchemaPackage;

import edu.uoc.som.cmsdiscover.GenericModel.impl.ContentEntityImpl;

import edu.uoc.som.cmsdiscover.GenericModel.user.User;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.impl.FileImpl#getFid <em>Fid</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.impl.FileImpl#getLangcode <em>Langcode</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.impl.FileImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.impl.FileImpl#getFilename <em>Filename</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.impl.FileImpl#getUri <em>Uri</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.impl.FileImpl#getFilemime <em>Filemime</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.impl.FileImpl#getFilesize <em>Filesize</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.impl.FileImpl#isStatus <em>Status</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.impl.FileImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link edu.uoc.som.cmsdiscover.GenericModel.genericSchema.impl.FileImpl#getChanged <em>Changed</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FileImpl extends ContentEntityImpl implements File {
	/**
	 * The default value of the '{@link #getFid() <em>Fid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFid()
	 * @generated
	 * @ordered
	 */
	protected static final int FID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFid() <em>Fid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFid()
	 * @generated
	 * @ordered
	 */
	protected int fid = FID_EDEFAULT;

	/**
	 * The default value of the '{@link #getLangcode() <em>Langcode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLangcode()
	 * @generated
	 * @ordered
	 */
	protected static final String LANGCODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLangcode() <em>Langcode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLangcode()
	 * @generated
	 * @ordered
	 */
	protected String langcode = LANGCODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUid() <em>Uid</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUid()
	 * @generated
	 * @ordered
	 */
	protected User uid;

	/**
	 * The default value of the '{@link #getFilename() <em>Filename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilename()
	 * @generated
	 * @ordered
	 */
	protected static final String FILENAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFilename() <em>Filename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilename()
	 * @generated
	 * @ordered
	 */
	protected String filename = FILENAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected static final String URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected String uri = URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getFilemime() <em>Filemime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilemime()
	 * @generated
	 * @ordered
	 */
	protected static final String FILEMIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFilemime() <em>Filemime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilemime()
	 * @generated
	 * @ordered
	 */
	protected String filemime = FILEMIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFilesize() <em>Filesize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilesize()
	 * @generated
	 * @ordered
	 */
	protected static final int FILESIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFilesize() <em>Filesize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilesize()
	 * @generated
	 * @ordered
	 */
	protected int filesize = FILESIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #isStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStatus()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STATUS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStatus()
	 * @generated
	 * @ordered
	 */
	protected boolean status = STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreated() <em>Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreated()
	 * @generated
	 * @ordered
	 */
	protected static final Date CREATED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreated() <em>Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreated()
	 * @generated
	 * @ordered
	 */
	protected Date created = CREATED_EDEFAULT;

	/**
	 * The default value of the '{@link #getChanged() <em>Changed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChanged()
	 * @generated
	 * @ordered
	 */
	protected static final Date CHANGED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChanged() <em>Changed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChanged()
	 * @generated
	 * @ordered
	 */
	protected Date changed = CHANGED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenericSchemaPackage.Literals.FILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFid() {
		return fid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFid(int newFid) {
		int oldFid = fid;
		fid = newFid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenericSchemaPackage.FILE__FID, oldFid, fid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLangcode() {
		return langcode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLangcode(String newLangcode) {
		String oldLangcode = langcode;
		langcode = newLangcode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenericSchemaPackage.FILE__LANGCODE, oldLangcode, langcode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User getUid() {
		if (uid != null && uid.eIsProxy()) {
			InternalEObject oldUid = (InternalEObject)uid;
			uid = (User)eResolveProxy(oldUid);
			if (uid != oldUid) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenericSchemaPackage.FILE__UID, oldUid, uid));
			}
		}
		return uid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User basicGetUid() {
		return uid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUid(User newUid) {
		User oldUid = uid;
		uid = newUid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenericSchemaPackage.FILE__UID, oldUid, uid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFilename() {
		return filename;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilename(String newFilename) {
		String oldFilename = filename;
		filename = newFilename;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenericSchemaPackage.FILE__FILENAME, oldFilename, filename));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUri() {
		return uri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUri(String newUri) {
		String oldUri = uri;
		uri = newUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenericSchemaPackage.FILE__URI, oldUri, uri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFilemime() {
		return filemime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilemime(String newFilemime) {
		String oldFilemime = filemime;
		filemime = newFilemime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenericSchemaPackage.FILE__FILEMIME, oldFilemime, filemime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFilesize() {
		return filesize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilesize(int newFilesize) {
		int oldFilesize = filesize;
		filesize = newFilesize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenericSchemaPackage.FILE__FILESIZE, oldFilesize, filesize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(boolean newStatus) {
		boolean oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenericSchemaPackage.FILE__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getCreated() {
		return created;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreated(Date newCreated) {
		Date oldCreated = created;
		created = newCreated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenericSchemaPackage.FILE__CREATED, oldCreated, created));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getChanged() {
		return changed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChanged(Date newChanged) {
		Date oldChanged = changed;
		changed = newChanged;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenericSchemaPackage.FILE__CHANGED, oldChanged, changed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GenericSchemaPackage.FILE__FID:
				return getFid();
			case GenericSchemaPackage.FILE__LANGCODE:
				return getLangcode();
			case GenericSchemaPackage.FILE__UID:
				if (resolve) return getUid();
				return basicGetUid();
			case GenericSchemaPackage.FILE__FILENAME:
				return getFilename();
			case GenericSchemaPackage.FILE__URI:
				return getUri();
			case GenericSchemaPackage.FILE__FILEMIME:
				return getFilemime();
			case GenericSchemaPackage.FILE__FILESIZE:
				return getFilesize();
			case GenericSchemaPackage.FILE__STATUS:
				return isStatus();
			case GenericSchemaPackage.FILE__CREATED:
				return getCreated();
			case GenericSchemaPackage.FILE__CHANGED:
				return getChanged();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GenericSchemaPackage.FILE__FID:
				setFid((Integer)newValue);
				return;
			case GenericSchemaPackage.FILE__LANGCODE:
				setLangcode((String)newValue);
				return;
			case GenericSchemaPackage.FILE__UID:
				setUid((User)newValue);
				return;
			case GenericSchemaPackage.FILE__FILENAME:
				setFilename((String)newValue);
				return;
			case GenericSchemaPackage.FILE__URI:
				setUri((String)newValue);
				return;
			case GenericSchemaPackage.FILE__FILEMIME:
				setFilemime((String)newValue);
				return;
			case GenericSchemaPackage.FILE__FILESIZE:
				setFilesize((Integer)newValue);
				return;
			case GenericSchemaPackage.FILE__STATUS:
				setStatus((Boolean)newValue);
				return;
			case GenericSchemaPackage.FILE__CREATED:
				setCreated((Date)newValue);
				return;
			case GenericSchemaPackage.FILE__CHANGED:
				setChanged((Date)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GenericSchemaPackage.FILE__FID:
				setFid(FID_EDEFAULT);
				return;
			case GenericSchemaPackage.FILE__LANGCODE:
				setLangcode(LANGCODE_EDEFAULT);
				return;
			case GenericSchemaPackage.FILE__UID:
				setUid((User)null);
				return;
			case GenericSchemaPackage.FILE__FILENAME:
				setFilename(FILENAME_EDEFAULT);
				return;
			case GenericSchemaPackage.FILE__URI:
				setUri(URI_EDEFAULT);
				return;
			case GenericSchemaPackage.FILE__FILEMIME:
				setFilemime(FILEMIME_EDEFAULT);
				return;
			case GenericSchemaPackage.FILE__FILESIZE:
				setFilesize(FILESIZE_EDEFAULT);
				return;
			case GenericSchemaPackage.FILE__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case GenericSchemaPackage.FILE__CREATED:
				setCreated(CREATED_EDEFAULT);
				return;
			case GenericSchemaPackage.FILE__CHANGED:
				setChanged(CHANGED_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GenericSchemaPackage.FILE__FID:
				return fid != FID_EDEFAULT;
			case GenericSchemaPackage.FILE__LANGCODE:
				return LANGCODE_EDEFAULT == null ? langcode != null : !LANGCODE_EDEFAULT.equals(langcode);
			case GenericSchemaPackage.FILE__UID:
				return uid != null;
			case GenericSchemaPackage.FILE__FILENAME:
				return FILENAME_EDEFAULT == null ? filename != null : !FILENAME_EDEFAULT.equals(filename);
			case GenericSchemaPackage.FILE__URI:
				return URI_EDEFAULT == null ? uri != null : !URI_EDEFAULT.equals(uri);
			case GenericSchemaPackage.FILE__FILEMIME:
				return FILEMIME_EDEFAULT == null ? filemime != null : !FILEMIME_EDEFAULT.equals(filemime);
			case GenericSchemaPackage.FILE__FILESIZE:
				return filesize != FILESIZE_EDEFAULT;
			case GenericSchemaPackage.FILE__STATUS:
				return status != STATUS_EDEFAULT;
			case GenericSchemaPackage.FILE__CREATED:
				return CREATED_EDEFAULT == null ? created != null : !CREATED_EDEFAULT.equals(created);
			case GenericSchemaPackage.FILE__CHANGED:
				return CHANGED_EDEFAULT == null ? changed != null : !CHANGED_EDEFAULT.equals(changed);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (fid: ");
		result.append(fid);
		result.append(", langcode: ");
		result.append(langcode);
		result.append(", filename: ");
		result.append(filename);
		result.append(", uri: ");
		result.append(uri);
		result.append(", filemime: ");
		result.append(filemime);
		result.append(", filesize: ");
		result.append(filesize);
		result.append(", status: ");
		result.append(status);
		result.append(", created: ");
		result.append(created);
		result.append(", changed: ");
		result.append(changed);
		result.append(')');
		return result.toString();
	}

} //FileImpl
