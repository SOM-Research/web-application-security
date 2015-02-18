/**
 */
package org.xtext.example.security.security;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Auth Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.security.security.AuthConstraint#getRoleName <em>Role Name</em>}</li>
 *   <li>{@link org.xtext.example.security.security.AuthConstraint#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.security.security.SecurityPackage#getAuthConstraint()
 * @model
 * @generated
 */
public interface AuthConstraint extends EObject
{
  /**
   * Returns the value of the '<em><b>Role Name</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.security.security.RoleName}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Role Name</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Role Name</em>' containment reference list.
   * @see org.xtext.example.security.security.SecurityPackage#getAuthConstraint_RoleName()
   * @model containment="true"
   * @generated
   */
  EList<RoleName> getRoleName();

  /**
   * Returns the value of the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' containment reference.
   * @see #setId(Identifier)
   * @see org.xtext.example.security.security.SecurityPackage#getAuthConstraint_Id()
   * @model containment="true"
   * @generated
   */
  Identifier getId();

  /**
   * Sets the value of the '{@link org.xtext.example.security.security.AuthConstraint#getId <em>Id</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' containment reference.
   * @see #getId()
   * @generated
   */
  void setId(Identifier value);

} // AuthConstraint
