/**
 */
package org.xtext.example.security.security;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Data Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.security.security.UserDataConstraint#getTransportGuarantee <em>Transport Guarantee</em>}</li>
 *   <li>{@link org.xtext.example.security.security.UserDataConstraint#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.security.security.SecurityPackage#getUserDataConstraint()
 * @model
 * @generated
 */
public interface UserDataConstraint extends EObject
{
  /**
   * Returns the value of the '<em><b>Transport Guarantee</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Transport Guarantee</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Transport Guarantee</em>' containment reference.
   * @see #setTransportGuarantee(TransportGuarantee)
   * @see org.xtext.example.security.security.SecurityPackage#getUserDataConstraint_TransportGuarantee()
   * @model containment="true"
   * @generated
   */
  TransportGuarantee getTransportGuarantee();

  /**
   * Sets the value of the '{@link org.xtext.example.security.security.UserDataConstraint#getTransportGuarantee <em>Transport Guarantee</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Transport Guarantee</em>' containment reference.
   * @see #getTransportGuarantee()
   * @generated
   */
  void setTransportGuarantee(TransportGuarantee value);

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
   * @see org.xtext.example.security.security.SecurityPackage#getUserDataConstraint_Id()
   * @model containment="true"
   * @generated
   */
  Identifier getId();

  /**
   * Sets the value of the '{@link org.xtext.example.security.security.UserDataConstraint#getId <em>Id</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' containment reference.
   * @see #getId()
   * @generated
   */
  void setId(Identifier value);

} // UserDataConstraint
