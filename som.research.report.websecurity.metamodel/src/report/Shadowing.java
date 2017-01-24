/**
 */
package report;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shadowing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link report.Shadowing#getShadowing <em>Shadowing</em>}</li>
 *   <li>{@link report.Shadowing#getShadowed <em>Shadowed</em>}</li>
 * </ul>
 * </p>
 *
 * @see report.ReportPackage#getShadowing()
 * @model
 * @generated
 */
public interface Shadowing extends Anomaly {
	/**
	 * Returns the value of the '<em><b>Shadowing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shadowing</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shadowing</em>' reference.
	 * @see #setShadowing(EObject)
	 * @see report.ReportPackage#getShadowing_Shadowing()
	 * @model required="true"
	 * @generated
	 */
	EObject getShadowing();

	/**
	 * Sets the value of the '{@link report.Shadowing#getShadowing <em>Shadowing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shadowing</em>' reference.
	 * @see #getShadowing()
	 * @generated
	 */
	void setShadowing(EObject value);

	/**
	 * Returns the value of the '<em><b>Shadowed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shadowed</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shadowed</em>' reference.
	 * @see #setShadowed(EObject)
	 * @see report.ReportPackage#getShadowing_Shadowed()
	 * @model required="true"
	 * @generated
	 */
	EObject getShadowed();

	/**
	 * Sets the value of the '{@link report.Shadowing#getShadowed <em>Shadowed</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shadowed</em>' reference.
	 * @see #getShadowed()
	 * @generated
	 */
	void setShadowed(EObject value);

} // Shadowing
