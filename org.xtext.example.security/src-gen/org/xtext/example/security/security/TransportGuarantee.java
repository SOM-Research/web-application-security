/**
 */
package org.xtext.example.security.security;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transport Guarantee</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.security.security.TransportGuarantee#getRestriction <em>Restriction</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.security.security.SecurityPackage#getTransportGuarantee()
 * @model
 * @generated
 */
public interface TransportGuarantee extends EObject
{
  /**
   * Returns the value of the '<em><b>Restriction</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.example.security.security.RestrictionType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Restriction</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Restriction</em>' attribute.
   * @see org.xtext.example.security.security.RestrictionType
   * @see #setRestriction(RestrictionType)
   * @see org.xtext.example.security.security.SecurityPackage#getTransportGuarantee_Restriction()
   * @model
   * @generated
   */
  RestrictionType getRestriction();

  /**
   * Sets the value of the '{@link org.xtext.example.security.security.TransportGuarantee#getRestriction <em>Restriction</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Restriction</em>' attribute.
   * @see org.xtext.example.security.security.RestrictionType
   * @see #getRestriction()
   * @generated
   */
  void setRestriction(RestrictionType value);

} // TransportGuarantee
