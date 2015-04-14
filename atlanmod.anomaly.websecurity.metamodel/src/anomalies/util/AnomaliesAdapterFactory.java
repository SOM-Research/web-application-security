/**
 */
package anomalies.util;

import anomalies.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see anomalies.AnomaliesPackage
 * @generated
 */
public class AnomaliesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AnomaliesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnomaliesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AnomaliesPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnomaliesSwitch<Adapter> modelSwitch =
		new AnomaliesSwitch<Adapter>() {
			@Override
			public Adapter caseAnomaly(Anomaly object) {
				return createAnomalyAdapter();
			}
			@Override
			public Adapter caseUnprotectedMethod(UnprotectedMethod object) {
				return createUnprotectedMethodAdapter();
			}
			@Override
			public Adapter caseConstraintRedundancy(ConstraintRedundancy object) {
				return createConstraintRedundancyAdapter();
			}
			@Override
			public Adapter caseUndeclaredRole(UndeclaredRole object) {
				return createUndeclaredRoleAdapter();
			}
			@Override
			public Adapter caseRuleShadowing(RuleShadowing object) {
				return createRuleShadowingAdapter();
			}
			@Override
			public Adapter caseResourceReachability(ResourceReachability object) {
				return createResourceReachabilityAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link anomalies.Anomaly <em>Anomaly</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see anomalies.Anomaly
	 * @generated
	 */
	public Adapter createAnomalyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link anomalies.UnprotectedMethod <em>Unprotected Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see anomalies.UnprotectedMethod
	 * @generated
	 */
	public Adapter createUnprotectedMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link anomalies.ConstraintRedundancy <em>Constraint Redundancy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see anomalies.ConstraintRedundancy
	 * @generated
	 */
	public Adapter createConstraintRedundancyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link anomalies.UndeclaredRole <em>Undeclared Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see anomalies.UndeclaredRole
	 * @generated
	 */
	public Adapter createUndeclaredRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link anomalies.RuleShadowing <em>Rule Shadowing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see anomalies.RuleShadowing
	 * @generated
	 */
	public Adapter createRuleShadowingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link anomalies.ResourceReachability <em>Resource Reachability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see anomalies.ResourceReachability
	 * @generated
	 */
	public Adapter createResourceReachabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //AnomaliesAdapterFactory
