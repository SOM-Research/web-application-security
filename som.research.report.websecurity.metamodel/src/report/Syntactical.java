/**
 */
package report;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Syntactical</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link report.Syntactical#getMissedRoles <em>Missed Roles</em>}</li>
 * </ul>
 * </p>
 *
 * @see report.ReportPackage#getSyntactical()
 * @model
 * @generated
 */
public interface Syntactical extends Anomaly {
	/**
	 * Returns the value of the '<em><b>Missed Roles</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Missed Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Missed Roles</em>' reference list.
	 * @see report.ReportPackage#getSyntactical_MissedRoles()
	 * @model
	 * @generated
	 */
	EList<EObject> getMissedRoles();

} // Syntactical
