/**
 */
package org.xtext.anomaly.report.report;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Anomaly</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.anomaly.report.report.Anomaly#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.anomaly.report.report.Anomaly#getDescr <em>Descr</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.anomaly.report.report.ReportPackage#getAnomaly()
 * @model
 * @generated
 */
public interface Anomaly extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.anomaly.report.report.ReportPackage#getAnomaly_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.anomaly.report.report.Anomaly#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Descr</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Descr</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Descr</em>' attribute.
   * @see #setDescr(String)
   * @see org.xtext.anomaly.report.report.ReportPackage#getAnomaly_Descr()
   * @model
   * @generated
   */
  String getDescr();

  /**
   * Sets the value of the '{@link org.xtext.anomaly.report.report.Anomaly#getDescr <em>Descr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Descr</em>' attribute.
   * @see #getDescr()
   * @generated
   */
  void setDescr(String value);

} // Anomaly
