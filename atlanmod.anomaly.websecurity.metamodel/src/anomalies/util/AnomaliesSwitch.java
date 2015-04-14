/**
 */
package anomalies.util;

import anomalies.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see anomalies.AnomaliesPackage
 * @generated
 */
public class AnomaliesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AnomaliesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnomaliesSwitch() {
		if (modelPackage == null) {
			modelPackage = AnomaliesPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case AnomaliesPackage.ANOMALY: {
				Anomaly anomaly = (Anomaly)theEObject;
				T result = caseAnomaly(anomaly);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnomaliesPackage.UNPROTECTED_METHOD: {
				UnprotectedMethod unprotectedMethod = (UnprotectedMethod)theEObject;
				T result = caseUnprotectedMethod(unprotectedMethod);
				if (result == null) result = caseAnomaly(unprotectedMethod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnomaliesPackage.CONSTRAINT_REDUNDANCY: {
				ConstraintRedundancy constraintRedundancy = (ConstraintRedundancy)theEObject;
				T result = caseConstraintRedundancy(constraintRedundancy);
				if (result == null) result = caseAnomaly(constraintRedundancy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnomaliesPackage.UNDECLARED_ROLE: {
				UndeclaredRole undeclaredRole = (UndeclaredRole)theEObject;
				T result = caseUndeclaredRole(undeclaredRole);
				if (result == null) result = caseAnomaly(undeclaredRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnomaliesPackage.RULE_SHADOWING: {
				RuleShadowing ruleShadowing = (RuleShadowing)theEObject;
				T result = caseRuleShadowing(ruleShadowing);
				if (result == null) result = caseAnomaly(ruleShadowing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AnomaliesPackage.RESOURCE_REACHABILITY: {
				ResourceReachability resourceReachability = (ResourceReachability)theEObject;
				T result = caseResourceReachability(resourceReachability);
				if (result == null) result = caseAnomaly(resourceReachability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anomaly</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anomaly</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnomaly(Anomaly object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unprotected Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unprotected Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnprotectedMethod(UnprotectedMethod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint Redundancy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint Redundancy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraintRedundancy(ConstraintRedundancy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Undeclared Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Undeclared Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUndeclaredRole(UndeclaredRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule Shadowing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule Shadowing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuleShadowing(RuleShadowing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Reachability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Reachability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceReachability(ResourceReachability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //AnomaliesSwitch
