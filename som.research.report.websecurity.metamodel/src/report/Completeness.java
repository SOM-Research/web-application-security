/**
 */
package report;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Completeness</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link report.Completeness#getMissedMethod <em>Missed Method</em>}</li>
 *   <li>{@link report.Completeness#getSecurityConstraint <em>Security Constraint</em>}</li>
 * </ul>
 * </p>
 *
 * @see report.ReportPackage#getCompleteness()
 * @model
 * @generated
 */
public interface Completeness extends Anomaly {
	/**
	 * Returns the value of the '<em><b>Missed Method</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Missed Method</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Missed Method</em>' reference list.
	 * @see report.ReportPackage#getCompleteness_MissedMethod()
	 * @model
	 * @generated
	 */
	EList<EObject> getMissedMethod();

	/**
	 * Returns the value of the '<em><b>Security Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security Constraint</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Constraint</em>' reference.
	 * @see #setSecurityConstraint(EObject)
	 * @see report.ReportPackage#getCompleteness_SecurityConstraint()
	 * @model required="true"
	 * @generated
	 */
	EObject getSecurityConstraint();

	/**
	 * Sets the value of the '{@link report.Completeness#getSecurityConstraint <em>Security Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Constraint</em>' reference.
	 * @see #getSecurityConstraint()
	 * @generated
	 */
	void setSecurityConstraint(EObject value);

} // Completeness
