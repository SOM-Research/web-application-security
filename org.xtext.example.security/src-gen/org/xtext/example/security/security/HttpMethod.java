/**
 */
package org.xtext.example.security.security;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Http Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.security.security.HttpMethod#isOmission <em>Omission</em>}</li>
 *   <li>{@link org.xtext.example.security.security.HttpMethod#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.security.security.SecurityPackage#getHttpMethod()
 * @model
 * @generated
 */
public interface HttpMethod extends EObject
{
  /**
   * Returns the value of the '<em><b>Omission</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Omission</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Omission</em>' attribute.
   * @see #setOmission(boolean)
   * @see org.xtext.example.security.security.SecurityPackage#getHttpMethod_Omission()
   * @model
   * @generated
   */
  boolean isOmission();

  /**
   * Sets the value of the '{@link org.xtext.example.security.security.HttpMethod#isOmission <em>Omission</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Omission</em>' attribute.
   * @see #isOmission()
   * @generated
   */
  void setOmission(boolean value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.security.security.SecurityPackage#getHttpMethod_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.security.security.HttpMethod#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // HttpMethod
