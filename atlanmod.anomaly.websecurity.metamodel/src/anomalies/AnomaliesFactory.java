/**
 */
package anomalies;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see anomalies.AnomaliesPackage
 * @generated
 */
public interface AnomaliesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AnomaliesFactory eINSTANCE = anomalies.impl.AnomaliesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Unprotected Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unprotected Method</em>'.
	 * @generated
	 */
	UnprotectedMethod createUnprotectedMethod();

	/**
	 * Returns a new object of class '<em>Constraint Redundancy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constraint Redundancy</em>'.
	 * @generated
	 */
	ConstraintRedundancy createConstraintRedundancy();

	/**
	 * Returns a new object of class '<em>Undeclared Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Undeclared Role</em>'.
	 * @generated
	 */
	UndeclaredRole createUndeclaredRole();

	/**
	 * Returns a new object of class '<em>Rule Shadowing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rule Shadowing</em>'.
	 * @generated
	 */
	RuleShadowing createRuleShadowing();

	/**
	 * Returns a new object of class '<em>Resource Reachability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Reachability</em>'.
	 * @generated
	 */
	ResourceReachability createResourceReachability();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AnomaliesPackage getAnomaliesPackage();

} //AnomaliesFactory
