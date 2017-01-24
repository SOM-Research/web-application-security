/**
 */
package report;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reachability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link report.Reachability#getUnreachableResources <em>Unreachable Resources</em>}</li>
 * </ul>
 * </p>
 *
 * @see report.ReportPackage#getReachability()
 * @model
 * @generated
 */
public interface Reachability extends Anomaly {
	/**
	 * Returns the value of the '<em><b>Unreachable Resources</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unreachable Resources</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unreachable Resources</em>' reference list.
	 * @see report.ReportPackage#getReachability_UnreachableResources()
	 * @model
	 * @generated
	 */
	EList<EObject> getUnreachableResources();

} // Reachability
