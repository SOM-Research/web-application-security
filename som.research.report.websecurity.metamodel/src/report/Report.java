/**
 */
package report;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Report</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link report.Report#getAnomalies <em>Anomalies</em>}</li>
 * </ul>
 * </p>
 *
 * @see report.ReportPackage#getReport()
 * @model
 * @generated
 */
public interface Report extends EObject {
	/**
	 * Returns the value of the '<em><b>Anomalies</b></em>' containment reference list.
	 * The list contents are of type {@link report.Anomaly}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Anomalies</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anomalies</em>' containment reference list.
	 * @see report.ReportPackage#getReport_Anomalies()
	 * @model containment="true"
	 * @generated
	 */
	EList<Anomaly> getAnomalies();

} // Report
