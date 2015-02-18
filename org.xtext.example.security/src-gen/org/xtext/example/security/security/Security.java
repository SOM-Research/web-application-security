/**
 */
package org.xtext.example.security.security;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Security</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.security.security.Security#getRole <em>Role</em>}</li>
 *   <li>{@link org.xtext.example.security.security.Security#getConstraint <em>Constraint</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.security.security.SecurityPackage#getSecurity()
 * @model
 * @generated
 */
public interface Security extends EObject
{
  /**
   * Returns the value of the '<em><b>Role</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.security.security.SecurityRole}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Role</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Role</em>' containment reference list.
   * @see org.xtext.example.security.security.SecurityPackage#getSecurity_Role()
   * @model containment="true"
   * @generated
   */
  EList<SecurityRole> getRole();

  /**
   * Returns the value of the '<em><b>Constraint</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.security.security.SecurityConstraint}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constraint</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constraint</em>' containment reference list.
   * @see org.xtext.example.security.security.SecurityPackage#getSecurity_Constraint()
   * @model containment="true"
   * @generated
   */
  EList<SecurityConstraint> getConstraint();

} // Security
