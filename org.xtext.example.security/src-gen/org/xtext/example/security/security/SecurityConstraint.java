/**
 */
package org.xtext.example.security.security;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.security.security.SecurityConstraint#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.xtext.example.security.security.SecurityConstraint#getWebResourceCollection <em>Web Resource Collection</em>}</li>
 *   <li>{@link org.xtext.example.security.security.SecurityConstraint#getAuthConstraint <em>Auth Constraint</em>}</li>
 *   <li>{@link org.xtext.example.security.security.SecurityConstraint#getUserDataConstraint <em>User Data Constraint</em>}</li>
 *   <li>{@link org.xtext.example.security.security.SecurityConstraint#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.security.security.SecurityPackage#getSecurityConstraint()
 * @model
 * @generated
 */
public interface SecurityConstraint extends EObject
{
  /**
   * Returns the value of the '<em><b>Display Name</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.security.security.DisplayName}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Display Name</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Display Name</em>' containment reference list.
   * @see org.xtext.example.security.security.SecurityPackage#getSecurityConstraint_DisplayName()
   * @model containment="true"
   * @generated
   */
  EList<DisplayName> getDisplayName();

  /**
   * Returns the value of the '<em><b>Web Resource Collection</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.security.security.WebResourceCollection}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Web Resource Collection</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Web Resource Collection</em>' containment reference list.
   * @see org.xtext.example.security.security.SecurityPackage#getSecurityConstraint_WebResourceCollection()
   * @model containment="true"
   * @generated
   */
  EList<WebResourceCollection> getWebResourceCollection();

  /**
   * Returns the value of the '<em><b>Auth Constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Auth Constraint</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Auth Constraint</em>' containment reference.
   * @see #setAuthConstraint(AuthConstraint)
   * @see org.xtext.example.security.security.SecurityPackage#getSecurityConstraint_AuthConstraint()
   * @model containment="true"
   * @generated
   */
  AuthConstraint getAuthConstraint();

  /**
   * Sets the value of the '{@link org.xtext.example.security.security.SecurityConstraint#getAuthConstraint <em>Auth Constraint</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Auth Constraint</em>' containment reference.
   * @see #getAuthConstraint()
   * @generated
   */
  void setAuthConstraint(AuthConstraint value);

  /**
   * Returns the value of the '<em><b>User Data Constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>User Data Constraint</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>User Data Constraint</em>' containment reference.
   * @see #setUserDataConstraint(UserDataConstraint)
   * @see org.xtext.example.security.security.SecurityPackage#getSecurityConstraint_UserDataConstraint()
   * @model containment="true"
   * @generated
   */
  UserDataConstraint getUserDataConstraint();

  /**
   * Sets the value of the '{@link org.xtext.example.security.security.SecurityConstraint#getUserDataConstraint <em>User Data Constraint</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>User Data Constraint</em>' containment reference.
   * @see #getUserDataConstraint()
   * @generated
   */
  void setUserDataConstraint(UserDataConstraint value);

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
   * @see org.xtext.example.security.security.SecurityPackage#getSecurityConstraint_Id()
   * @model containment="true"
   * @generated
   */
  Identifier getId();

  /**
   * Sets the value of the '{@link org.xtext.example.security.security.SecurityConstraint#getId <em>Id</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' containment reference.
   * @see #getId()
   * @generated
   */
  void setId(Identifier value);

} // SecurityConstraint
