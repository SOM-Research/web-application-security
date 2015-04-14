/**
 */
package anomalies;

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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see anomalies.AnomaliesFactory
 * @model kind="package"
 * @generated
 */
public interface AnomaliesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "anomalies";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://atlanmod.sec.anomalies.org";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "anomalies";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AnomaliesPackage eINSTANCE = anomalies.impl.AnomaliesPackageImpl.init();

	/**
	 * The meta object id for the '{@link anomalies.impl.AnomalyImpl <em>Anomaly</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see anomalies.impl.AnomalyImpl
	 * @see anomalies.impl.AnomaliesPackageImpl#getAnomaly()
	 * @generated
	 */
	int ANOMALY = 0;

	/**
	 * The feature id for the '<em><b>Trace</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANOMALY__TRACE = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANOMALY__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Anomaly</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANOMALY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Anomaly</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANOMALY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link anomalies.impl.UnprotectedMethodImpl <em>Unprotected Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see anomalies.impl.UnprotectedMethodImpl
	 * @see anomalies.impl.AnomaliesPackageImpl#getUnprotectedMethod()
	 * @generated
	 */
	int UNPROTECTED_METHOD = 1;

	/**
	 * The feature id for the '<em><b>Trace</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNPROTECTED_METHOD__TRACE = ANOMALY__TRACE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNPROTECTED_METHOD__DESCRIPTION = ANOMALY__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Unprotected Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNPROTECTED_METHOD_FEATURE_COUNT = ANOMALY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Unprotected Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNPROTECTED_METHOD_OPERATION_COUNT = ANOMALY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link anomalies.impl.ConstraintRedundancyImpl <em>Constraint Redundancy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see anomalies.impl.ConstraintRedundancyImpl
	 * @see anomalies.impl.AnomaliesPackageImpl#getConstraintRedundancy()
	 * @generated
	 */
	int CONSTRAINT_REDUNDANCY = 2;

	/**
	 * The feature id for the '<em><b>Trace</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_REDUNDANCY__TRACE = ANOMALY__TRACE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_REDUNDANCY__DESCRIPTION = ANOMALY__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Constraint Redundancy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_REDUNDANCY_FEATURE_COUNT = ANOMALY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Constraint Redundancy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_REDUNDANCY_OPERATION_COUNT = ANOMALY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link anomalies.impl.UndeclaredRoleImpl <em>Undeclared Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see anomalies.impl.UndeclaredRoleImpl
	 * @see anomalies.impl.AnomaliesPackageImpl#getUndeclaredRole()
	 * @generated
	 */
	int UNDECLARED_ROLE = 3;

	/**
	 * The feature id for the '<em><b>Trace</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDECLARED_ROLE__TRACE = ANOMALY__TRACE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDECLARED_ROLE__DESCRIPTION = ANOMALY__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Undeclared Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDECLARED_ROLE_FEATURE_COUNT = ANOMALY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Undeclared Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDECLARED_ROLE_OPERATION_COUNT = ANOMALY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link anomalies.impl.RuleShadowingImpl <em>Rule Shadowing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see anomalies.impl.RuleShadowingImpl
	 * @see anomalies.impl.AnomaliesPackageImpl#getRuleShadowing()
	 * @generated
	 */
	int RULE_SHADOWING = 4;

	/**
	 * The feature id for the '<em><b>Trace</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_SHADOWING__TRACE = ANOMALY__TRACE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_SHADOWING__DESCRIPTION = ANOMALY__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Rule Shadowing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_SHADOWING_FEATURE_COUNT = ANOMALY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Rule Shadowing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_SHADOWING_OPERATION_COUNT = ANOMALY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link anomalies.impl.ResourceReachabilityImpl <em>Resource Reachability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see anomalies.impl.ResourceReachabilityImpl
	 * @see anomalies.impl.AnomaliesPackageImpl#getResourceReachability()
	 * @generated
	 */
	int RESOURCE_REACHABILITY = 5;

	/**
	 * The feature id for the '<em><b>Trace</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REACHABILITY__TRACE = ANOMALY__TRACE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REACHABILITY__DESCRIPTION = ANOMALY__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Resource Reachability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REACHABILITY_FEATURE_COUNT = ANOMALY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Resource Reachability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REACHABILITY_OPERATION_COUNT = ANOMALY_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link anomalies.Anomaly <em>Anomaly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Anomaly</em>'.
	 * @see anomalies.Anomaly
	 * @generated
	 */
	EClass getAnomaly();

	/**
	 * Returns the meta object for the reference list '{@link anomalies.Anomaly#getTrace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Trace</em>'.
	 * @see anomalies.Anomaly#getTrace()
	 * @see #getAnomaly()
	 * @generated
	 */
	EReference getAnomaly_Trace();

	/**
	 * Returns the meta object for the attribute '{@link anomalies.Anomaly#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see anomalies.Anomaly#getDescription()
	 * @see #getAnomaly()
	 * @generated
	 */
	EAttribute getAnomaly_Description();

	/**
	 * Returns the meta object for class '{@link anomalies.UnprotectedMethod <em>Unprotected Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unprotected Method</em>'.
	 * @see anomalies.UnprotectedMethod
	 * @generated
	 */
	EClass getUnprotectedMethod();

	/**
	 * Returns the meta object for class '{@link anomalies.ConstraintRedundancy <em>Constraint Redundancy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint Redundancy</em>'.
	 * @see anomalies.ConstraintRedundancy
	 * @generated
	 */
	EClass getConstraintRedundancy();

	/**
	 * Returns the meta object for class '{@link anomalies.UndeclaredRole <em>Undeclared Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Undeclared Role</em>'.
	 * @see anomalies.UndeclaredRole
	 * @generated
	 */
	EClass getUndeclaredRole();

	/**
	 * Returns the meta object for class '{@link anomalies.RuleShadowing <em>Rule Shadowing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Shadowing</em>'.
	 * @see anomalies.RuleShadowing
	 * @generated
	 */
	EClass getRuleShadowing();

	/**
	 * Returns the meta object for class '{@link anomalies.ResourceReachability <em>Resource Reachability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Reachability</em>'.
	 * @see anomalies.ResourceReachability
	 * @generated
	 */
	EClass getResourceReachability();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AnomaliesFactory getAnomaliesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link anomalies.impl.AnomalyImpl <em>Anomaly</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see anomalies.impl.AnomalyImpl
		 * @see anomalies.impl.AnomaliesPackageImpl#getAnomaly()
		 * @generated
		 */
		EClass ANOMALY = eINSTANCE.getAnomaly();

		/**
		 * The meta object literal for the '<em><b>Trace</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANOMALY__TRACE = eINSTANCE.getAnomaly_Trace();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANOMALY__DESCRIPTION = eINSTANCE.getAnomaly_Description();

		/**
		 * The meta object literal for the '{@link anomalies.impl.UnprotectedMethodImpl <em>Unprotected Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see anomalies.impl.UnprotectedMethodImpl
		 * @see anomalies.impl.AnomaliesPackageImpl#getUnprotectedMethod()
		 * @generated
		 */
		EClass UNPROTECTED_METHOD = eINSTANCE.getUnprotectedMethod();

		/**
		 * The meta object literal for the '{@link anomalies.impl.ConstraintRedundancyImpl <em>Constraint Redundancy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see anomalies.impl.ConstraintRedundancyImpl
		 * @see anomalies.impl.AnomaliesPackageImpl#getConstraintRedundancy()
		 * @generated
		 */
		EClass CONSTRAINT_REDUNDANCY = eINSTANCE.getConstraintRedundancy();

		/**
		 * The meta object literal for the '{@link anomalies.impl.UndeclaredRoleImpl <em>Undeclared Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see anomalies.impl.UndeclaredRoleImpl
		 * @see anomalies.impl.AnomaliesPackageImpl#getUndeclaredRole()
		 * @generated
		 */
		EClass UNDECLARED_ROLE = eINSTANCE.getUndeclaredRole();

		/**
		 * The meta object literal for the '{@link anomalies.impl.RuleShadowingImpl <em>Rule Shadowing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see anomalies.impl.RuleShadowingImpl
		 * @see anomalies.impl.AnomaliesPackageImpl#getRuleShadowing()
		 * @generated
		 */
		EClass RULE_SHADOWING = eINSTANCE.getRuleShadowing();

		/**
		 * The meta object literal for the '{@link anomalies.impl.ResourceReachabilityImpl <em>Resource Reachability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see anomalies.impl.ResourceReachabilityImpl
		 * @see anomalies.impl.AnomaliesPackageImpl#getResourceReachability()
		 * @generated
		 */
		EClass RESOURCE_REACHABILITY = eINSTANCE.getResourceReachability();

	}

} //AnomaliesPackage
