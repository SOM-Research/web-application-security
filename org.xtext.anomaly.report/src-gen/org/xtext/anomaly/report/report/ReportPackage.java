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
   * The meta object id for the '{@link org.xtext.anomaly.report.report.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.anomaly.report.report.impl.ModelImpl
   * @see org.xtext.anomaly.report.report.impl.ReportPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Anomalies</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__ANOMALIES = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

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
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANOMALY__NAME = 0;

  /**
   * The feature id for the '<em><b>Descr</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANOMALY__DESCR = 1;

  /**
   * The number of structural features of the '<em>Anomaly</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANOMALY_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link org.xtext.anomaly.report.report.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.xtext.anomaly.report.report.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.anomaly.report.report.Model#getAnomalies <em>Anomalies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Anomalies</em>'.
   * @see org.xtext.anomaly.report.report.Model#getAnomalies()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Anomalies();

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
   * Returns the meta object for the attribute '{@link org.xtext.anomaly.report.report.Anomaly#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.anomaly.report.report.Anomaly#getName()
   * @see #getAnomaly()
   * @generated
   */
  EAttribute getAnomaly_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.anomaly.report.report.Anomaly#getDescr <em>Descr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Descr</em>'.
   * @see org.xtext.anomaly.report.report.Anomaly#getDescr()
   * @see #getAnomaly()
   * @generated
   */
  EAttribute getAnomaly_Descr();

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
     * The meta object literal for the '{@link org.xtext.anomaly.report.report.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.anomaly.report.report.impl.ModelImpl
     * @see org.xtext.anomaly.report.report.impl.ReportPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Anomalies</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__ANOMALIES = eINSTANCE.getModel_Anomalies();

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
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ANOMALY__NAME = eINSTANCE.getAnomaly_Name();

    /**
     * The meta object literal for the '<em><b>Descr</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ANOMALY__DESCR = eINSTANCE.getAnomaly_Descr();

  }

} //ReportPackage
