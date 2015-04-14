/**
 */
package anomalies.impl;

import anomalies.*;

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
public class AnomaliesFactoryImpl extends EFactoryImpl implements AnomaliesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AnomaliesFactory init() {
		try {
			AnomaliesFactory theAnomaliesFactory = (AnomaliesFactory)EPackage.Registry.INSTANCE.getEFactory(AnomaliesPackage.eNS_URI);
			if (theAnomaliesFactory != null) {
				return theAnomaliesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AnomaliesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnomaliesFactoryImpl() {
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
			case AnomaliesPackage.UNPROTECTED_METHOD: return createUnprotectedMethod();
			case AnomaliesPackage.CONSTRAINT_REDUNDANCY: return createConstraintRedundancy();
			case AnomaliesPackage.UNDECLARED_ROLE: return createUndeclaredRole();
			case AnomaliesPackage.RULE_SHADOWING: return createRuleShadowing();
			case AnomaliesPackage.RESOURCE_REACHABILITY: return createResourceReachability();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnprotectedMethod createUnprotectedMethod() {
		UnprotectedMethodImpl unprotectedMethod = new UnprotectedMethodImpl();
		return unprotectedMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintRedundancy createConstraintRedundancy() {
		ConstraintRedundancyImpl constraintRedundancy = new ConstraintRedundancyImpl();
		return constraintRedundancy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UndeclaredRole createUndeclaredRole() {
		UndeclaredRoleImpl undeclaredRole = new UndeclaredRoleImpl();
		return undeclaredRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleShadowing createRuleShadowing() {
		RuleShadowingImpl ruleShadowing = new RuleShadowingImpl();
		return ruleShadowing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceReachability createResourceReachability() {
		ResourceReachabilityImpl resourceReachability = new ResourceReachabilityImpl();
		return resourceReachability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnomaliesPackage getAnomaliesPackage() {
		return (AnomaliesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AnomaliesPackage getPackage() {
		return AnomaliesPackage.eINSTANCE;
	}

} //AnomaliesFactoryImpl
