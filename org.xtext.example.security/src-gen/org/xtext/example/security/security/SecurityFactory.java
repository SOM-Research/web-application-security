/**
 */
package org.xtext.example.security.security;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.security.security.SecurityPackage
 * @generated
 */
public interface SecurityFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SecurityFactory eINSTANCE = org.xtext.example.security.security.impl.SecurityFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Security</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Security</em>'.
   * @generated
   */
  Security createSecurity();

  /**
   * Returns a new object of class '<em>Role</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Role</em>'.
   * @generated
   */
  SecurityRole createSecurityRole();

  /**
   * Returns a new object of class '<em>Constraint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Constraint</em>'.
   * @generated
   */
  SecurityConstraint createSecurityConstraint();

  /**
   * Returns a new object of class '<em>Identifier</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Identifier</em>'.
   * @generated
   */
  Identifier createIdentifier();

  /**
   * Returns a new object of class '<em>Display Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Display Name</em>'.
   * @generated
   */
  DisplayName createDisplayName();

  /**
   * Returns a new object of class '<em>Web Resource Collection</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Web Resource Collection</em>'.
   * @generated
   */
  WebResourceCollection createWebResourceCollection();

  /**
   * Returns a new object of class '<em>Url Pattern</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Url Pattern</em>'.
   * @generated
   */
  UrlPattern createUrlPattern();

  /**
   * Returns a new object of class '<em>Http Method</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Http Method</em>'.
   * @generated
   */
  HttpMethod createHttpMethod();

  /**
   * Returns a new object of class '<em>Auth Constraint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Auth Constraint</em>'.
   * @generated
   */
  AuthConstraint createAuthConstraint();

  /**
   * Returns a new object of class '<em>Role Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Role Name</em>'.
   * @generated
   */
  RoleName createRoleName();

  /**
   * Returns a new object of class '<em>User Data Constraint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>User Data Constraint</em>'.
   * @generated
   */
  UserDataConstraint createUserDataConstraint();

  /**
   * Returns a new object of class '<em>Transport Guarantee</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Transport Guarantee</em>'.
   * @generated
   */
  TransportGuarantee createTransportGuarantee();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  SecurityPackage getSecurityPackage();

} //SecurityFactory
