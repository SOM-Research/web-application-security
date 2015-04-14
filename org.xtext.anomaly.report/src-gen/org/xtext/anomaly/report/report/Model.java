/**
 */
package org.xtext.anomaly.report.report;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.anomaly.report.report.Model#getAnomalies <em>Anomalies</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.anomaly.report.report.ReportPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Anomalies</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.anomaly.report.report.Anomaly}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Anomalies</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Anomalies</em>' containment reference list.
   * @see org.xtext.anomaly.report.report.ReportPackage#getModel_Anomalies()
   * @model containment="true"
   * @generated
   */
  EList<Anomaly> getAnomalies();

} // Model
