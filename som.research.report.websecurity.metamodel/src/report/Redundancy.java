/**
 */
package report;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Redundancy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link report.Redundancy#getContaining <em>Containing</em>}</li>
 *   <li>{@link report.Redundancy#getContained <em>Contained</em>}</li>
 * </ul>
 * </p>
 *
 * @see report.ReportPackage#getRedundancy()
 * @model
 * @generated
 */
public interface Redundancy extends Anomaly {
	/**
	 * Returns the value of the '<em><b>Containing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containing</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containing</em>' reference.
	 * @see #setContaining(EObject)
	 * @see report.ReportPackage#getRedundancy_Containing()
	 * @model required="true"
	 * @generated
	 */
	EObject getContaining();

	/**
	 * Sets the value of the '{@link report.Redundancy#getContaining <em>Containing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Containing</em>' reference.
	 * @see #getContaining()
	 * @generated
	 */
	void setContaining(EObject value);

	/**
	 * Returns the value of the '<em><b>Contained</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained</em>' reference.
	 * @see #setContained(EObject)
	 * @see report.ReportPackage#getRedundancy_Contained()
	 * @model required="true"
	 * @generated
	 */
	EObject getContained();

	/**
	 * Sets the value of the '{@link report.Redundancy#getContained <em>Contained</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contained</em>' reference.
	 * @see #getContained()
	 * @generated
	 */
	void setContained(EObject value);

} // Redundancy
