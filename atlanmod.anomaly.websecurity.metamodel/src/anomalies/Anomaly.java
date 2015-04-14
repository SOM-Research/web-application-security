/**
 */
package anomalies;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Anomaly</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link anomalies.Anomaly#getTrace <em>Trace</em>}</li>
 *   <li>{@link anomalies.Anomaly#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see anomalies.AnomaliesPackage#getAnomaly()
 * @model abstract="true"
 * @generated
 */
public interface Anomaly extends EObject {
	/**
	 * Returns the value of the '<em><b>Trace</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trace</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trace</em>' reference list.
	 * @see anomalies.AnomaliesPackage#getAnomaly_Trace()
	 * @model
	 * @generated
	 */
	EList<EObject> getTrace();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see anomalies.AnomaliesPackage#getAnomaly_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link anomalies.Anomaly#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // Anomaly
