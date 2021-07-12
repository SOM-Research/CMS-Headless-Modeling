/**
 */
package edu.uoc.som.cmsdiscover.GenericModel.features.moderation.impl;

import edu.uoc.som.cmsdiscover.GenericModel.features.moderation.*;

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
public class ModerationFactoryImpl extends EFactoryImpl implements ModerationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModerationFactory init() {
		try {
			ModerationFactory theModerationFactory = (ModerationFactory)EPackage.Registry.INSTANCE.getEFactory(ModerationPackage.eNS_URI);
			if (theModerationFactory != null) {
				return theModerationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ModerationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModerationFactoryImpl() {
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
			case ModerationPackage.STATE: return createState();
			case ModerationPackage.TRANSITION: return createTransition();
			case ModerationPackage.MODERATION_WORKFLOW: return createModerationWorkflow();
			case ModerationPackage.MODERABLE_ENTITY: return createModerableEntity();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State createState() {
		StateImpl state = new StateImpl();
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModerationWorkflow createModerationWorkflow() {
		ModerationWorkflowImpl moderationWorkflow = new ModerationWorkflowImpl();
		return moderationWorkflow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModerableEntity createModerableEntity() {
		ModerableEntityImpl moderableEntity = new ModerableEntityImpl();
		return moderableEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModerationPackage getModerationPackage() {
		return (ModerationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ModerationPackage getPackage() {
		return ModerationPackage.eINSTANCE;
	}

} //ModerationFactoryImpl
