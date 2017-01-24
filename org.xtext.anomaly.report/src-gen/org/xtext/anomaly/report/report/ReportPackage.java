/**
 */
package org.xtext.anomaly.report.report;

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
 * @see org.xtext.anomaly.report.report.ReportFactory
 * @model kind="package"
 * @generated
 */
public interface ReportPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "report";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/anomaly/report/Report";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "report";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ReportPackage eINSTANCE = org.xtext.anomaly.report.report.impl.ReportPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.anomaly.report.report.impl.ReportImpl <em>Report</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.anomaly.report.report.impl.ReportImpl
   * @see org.xtext.anomaly.report.report.impl.ReportPackageImpl#getReport()
   * @generated
   */
  int REPORT = 0;

  /**
   * The feature id for the '<em><b>Anomalies</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPORT__ANOMALIES = 0;

  /**
   * The number of structural features of the '<em>Report</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPORT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.anomaly.report.report.impl.AnomalyImpl <em>Anomaly</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.anomaly.report.report.impl.AnomalyImpl
   * @see org.xtext.anomaly.report.report.impl.ReportPackageImpl#getAnomaly()
   * @generated
   */
  int ANOMALY = 1;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANOMALY__DESCRIPTION = 0;

  /**
   * The number of structural features of the '<em>Anomaly</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANOMALY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.anomaly.report.report.impl.ShadowingImpl <em>Shadowing</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.anomaly.report.report.impl.ShadowingImpl
   * @see org.xtext.anomaly.report.report.impl.ReportPackageImpl#getShadowing()
   * @generated
   */
  int SHADOWING = 2;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHADOWING__DESCRIPTION = ANOMALY__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Shadowing</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHADOWING__SHADOWING = ANOMALY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Shadowed</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHADOWING__SHADOWED = ANOMALY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Shadowing</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHADOWING_FEATURE_COUNT = ANOMALY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.anomaly.report.report.impl.CompletenessImpl <em>Completeness</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.anomaly.report.report.impl.CompletenessImpl
   * @see org.xtext.anomaly.report.report.impl.ReportPackageImpl#getCompleteness()
   * @generated
   */
  int COMPLETENESS = 3;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLETENESS__DESCRIPTION = ANOMALY__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Missed Method</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLETENESS__MISSED_METHOD = ANOMALY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Security Constraint</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLETENESS__SECURITY_CONSTRAINT = ANOMALY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Completeness</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLETENESS_FEATURE_COUNT = ANOMALY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.anomaly.report.report.impl.RedundancyImpl <em>Redundancy</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.anomaly.report.report.impl.RedundancyImpl
   * @see org.xtext.anomaly.report.report.impl.ReportPackageImpl#getRedundancy()
   * @generated
   */
  int REDUNDANCY = 4;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REDUNDANCY__DESCRIPTION = ANOMALY__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Containing</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REDUNDANCY__CONTAINING = ANOMALY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Contained</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REDUNDANCY__CONTAINED = ANOMALY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Redundancy</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REDUNDANCY_FEATURE_COUNT = ANOMALY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.anomaly.report.report.impl.SyntacticalImpl <em>Syntactical</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.anomaly.report.report.impl.SyntacticalImpl
   * @see org.xtext.anomaly.report.report.impl.ReportPackageImpl#getSyntactical()
   * @generated
   */
  int SYNTACTICAL = 5;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYNTACTICAL__DESCRIPTION = ANOMALY__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Missed Roles</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYNTACTICAL__MISSED_ROLES = ANOMALY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Syntactical</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYNTACTICAL_FEATURE_COUNT = ANOMALY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.anomaly.report.report.impl.ReachabilityImpl <em>Reachability</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.anomaly.report.report.impl.ReachabilityImpl
   * @see org.xtext.anomaly.report.report.impl.ReportPackageImpl#getReachability()
   * @generated
   */
  int REACHABILITY = 6;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REACHABILITY__DESCRIPTION = ANOMALY__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Unreachable Resources</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REACHABILITY__UNREACHABLE_RESOURCES = ANOMALY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Reachability</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REACHABILITY_FEATURE_COUNT = ANOMALY_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link org.xtext.anomaly.report.report.Report <em>Report</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Report</em>'.
   * @see org.xtext.anomaly.report.report.Report
   * @generated
   */
  EClass getReport();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.anomaly.report.report.Report#getAnomalies <em>Anomalies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Anomalies</em>'.
   * @see org.xtext.anomaly.report.report.Report#getAnomalies()
   * @see #getReport()
   * @generated
   */
  EReference getReport_Anomalies();

  /**
   * Returns the meta object for class '{@link org.xtext.anomaly.report.report.Anomaly <em>Anomaly</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Anomaly</em>'.
   * @see org.xtext.anomaly.report.report.Anomaly
   * @generated
   */
  EClass getAnomaly();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.anomaly.report.report.Anomaly#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see org.xtext.anomaly.report.report.Anomaly#getDescription()
   * @see #getAnomaly()
   * @generated
   */
  EAttribute getAnomaly_Description();

  /**
   * Returns the meta object for class '{@link org.xtext.anomaly.report.report.Shadowing <em>Shadowing</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Shadowing</em>'.
   * @see org.xtext.anomaly.report.report.Shadowing
   * @generated
   */
  EClass getShadowing();

  /**
   * Returns the meta object for the reference '{@link org.xtext.anomaly.report.report.Shadowing#getShadowing <em>Shadowing</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Shadowing</em>'.
   * @see org.xtext.anomaly.report.report.Shadowing#getShadowing()
   * @see #getShadowing()
   * @generated
   */
  EReference getShadowing_Shadowing();

  /**
   * Returns the meta object for the reference '{@link org.xtext.anomaly.report.report.Shadowing#getShadowed <em>Shadowed</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Shadowed</em>'.
   * @see org.xtext.anomaly.report.report.Shadowing#getShadowed()
   * @see #getShadowing()
   * @generated
   */
  EReference getShadowing_Shadowed();

  /**
   * Returns the meta object for class '{@link org.xtext.anomaly.report.report.Completeness <em>Completeness</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Completeness</em>'.
   * @see org.xtext.anomaly.report.report.Completeness
   * @generated
   */
  EClass getCompleteness();

  /**
   * Returns the meta object for the reference list '{@link org.xtext.anomaly.report.report.Completeness#getMissedMethod <em>Missed Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Missed Method</em>'.
   * @see org.xtext.anomaly.report.report.Completeness#getMissedMethod()
   * @see #getCompleteness()
   * @generated
   */
  EReference getCompleteness_MissedMethod();

  /**
   * Returns the meta object for the reference '{@link org.xtext.anomaly.report.report.Completeness#getSecurityConstraint <em>Security Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Security Constraint</em>'.
   * @see org.xtext.anomaly.report.report.Completeness#getSecurityConstraint()
   * @see #getCompleteness()
   * @generated
   */
  EReference getCompleteness_SecurityConstraint();

  /**
   * Returns the meta object for class '{@link org.xtext.anomaly.report.report.Redundancy <em>Redundancy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Redundancy</em>'.
   * @see org.xtext.anomaly.report.report.Redundancy
   * @generated
   */
  EClass getRedundancy();

  /**
   * Returns the meta object for the reference '{@link org.xtext.anomaly.report.report.Redundancy#getContaining <em>Containing</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Containing</em>'.
   * @see org.xtext.anomaly.report.report.Redundancy#getContaining()
   * @see #getRedundancy()
   * @generated
   */
  EReference getRedundancy_Containing();

  /**
   * Returns the meta object for the reference '{@link org.xtext.anomaly.report.report.Redundancy#getContained <em>Contained</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Contained</em>'.
   * @see org.xtext.anomaly.report.report.Redundancy#getContained()
   * @see #getRedundancy()
   * @generated
   */
  EReference getRedundancy_Contained();

  /**
   * Returns the meta object for class '{@link org.xtext.anomaly.report.report.Syntactical <em>Syntactical</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Syntactical</em>'.
   * @see org.xtext.anomaly.report.report.Syntactical
   * @generated
   */
  EClass getSyntactical();

  /**
   * Returns the meta object for the reference list '{@link org.xtext.anomaly.report.report.Syntactical#getMissedRoles <em>Missed Roles</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Missed Roles</em>'.
   * @see org.xtext.anomaly.report.report.Syntactical#getMissedRoles()
   * @see #getSyntactical()
   * @generated
   */
  EReference getSyntactical_MissedRoles();

  /**
   * Returns the meta object for class '{@link org.xtext.anomaly.report.report.Reachability <em>Reachability</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reachability</em>'.
   * @see org.xtext.anomaly.report.report.Reachability
   * @generated
   */
  EClass getReachability();

  /**
   * Returns the meta object for the reference list '{@link org.xtext.anomaly.report.report.Reachability#getUnreachableResources <em>Unreachable Resources</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Unreachable Resources</em>'.
   * @see org.xtext.anomaly.report.report.Reachability#getUnreachableResources()
   * @see #getReachability()
   * @generated
   */
  EReference getReachability_UnreachableResources();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ReportFactory getReportFactory();

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
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.anomaly.report.report.impl.ReportImpl <em>Report</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.anomaly.report.report.impl.ReportImpl
     * @see org.xtext.anomaly.report.report.impl.ReportPackageImpl#getReport()
     * @generated
     */
    EClass REPORT = eINSTANCE.getReport();

    /**
     * The meta object literal for the '<em><b>Anomalies</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REPORT__ANOMALIES = eINSTANCE.getReport_Anomalies();

    /**
     * The meta object literal for the '{@link org.xtext.anomaly.report.report.impl.AnomalyImpl <em>Anomaly</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.anomaly.report.report.impl.AnomalyImpl
     * @see org.xtext.anomaly.report.report.impl.ReportPackageImpl#getAnomaly()
     * @generated
     */
    EClass ANOMALY = eINSTANCE.getAnomaly();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ANOMALY__DESCRIPTION = eINSTANCE.getAnomaly_Description();

    /**
     * The meta object literal for the '{@link org.xtext.anomaly.report.report.impl.ShadowingImpl <em>Shadowing</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.anomaly.report.report.impl.ShadowingImpl
     * @see org.xtext.anomaly.report.report.impl.ReportPackageImpl#getShadowing()
     * @generated
     */
    EClass SHADOWING = eINSTANCE.getShadowing();

    /**
     * The meta object literal for the '<em><b>Shadowing</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SHADOWING__SHADOWING = eINSTANCE.getShadowing_Shadowing();

    /**
     * The meta object literal for the '<em><b>Shadowed</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SHADOWING__SHADOWED = eINSTANCE.getShadowing_Shadowed();

    /**
     * The meta object literal for the '{@link org.xtext.anomaly.report.report.impl.CompletenessImpl <em>Completeness</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.anomaly.report.report.impl.CompletenessImpl
     * @see org.xtext.anomaly.report.report.impl.ReportPackageImpl#getCompleteness()
     * @generated
     */
    EClass COMPLETENESS = eINSTANCE.getCompleteness();

    /**
     * The meta object literal for the '<em><b>Missed Method</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPLETENESS__MISSED_METHOD = eINSTANCE.getCompleteness_MissedMethod();

    /**
     * The meta object literal for the '<em><b>Security Constraint</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPLETENESS__SECURITY_CONSTRAINT = eINSTANCE.getCompleteness_SecurityConstraint();

    /**
     * The meta object literal for the '{@link org.xtext.anomaly.report.report.impl.RedundancyImpl <em>Redundancy</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.anomaly.report.report.impl.RedundancyImpl
     * @see org.xtext.anomaly.report.report.impl.ReportPackageImpl#getRedundancy()
     * @generated
     */
    EClass REDUNDANCY = eINSTANCE.getRedundancy();

    /**
     * The meta object literal for the '<em><b>Containing</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REDUNDANCY__CONTAINING = eINSTANCE.getRedundancy_Containing();

    /**
     * The meta object literal for the '<em><b>Contained</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REDUNDANCY__CONTAINED = eINSTANCE.getRedundancy_Contained();

    /**
     * The meta object literal for the '{@link org.xtext.anomaly.report.report.impl.SyntacticalImpl <em>Syntactical</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.anomaly.report.report.impl.SyntacticalImpl
     * @see org.xtext.anomaly.report.report.impl.ReportPackageImpl#getSyntactical()
     * @generated
     */
    EClass SYNTACTICAL = eINSTANCE.getSyntactical();

    /**
     * The meta object literal for the '<em><b>Missed Roles</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SYNTACTICAL__MISSED_ROLES = eINSTANCE.getSyntactical_MissedRoles();

    /**
     * The meta object literal for the '{@link org.xtext.anomaly.report.report.impl.ReachabilityImpl <em>Reachability</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.anomaly.report.report.impl.ReachabilityImpl
     * @see org.xtext.anomaly.report.report.impl.ReportPackageImpl#getReachability()
     * @generated
     */
    EClass REACHABILITY = eINSTANCE.getReachability();

    /**
     * The meta object literal for the '<em><b>Unreachable Resources</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REACHABILITY__UNREACHABLE_RESOURCES = eINSTANCE.getReachability_UnreachableResources();

  }

} //ReportPackage
