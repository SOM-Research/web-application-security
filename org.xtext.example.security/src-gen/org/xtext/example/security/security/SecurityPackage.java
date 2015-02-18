/**
 */
package org.xtext.example.security.security;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.example.security.security.SecurityFactory
 * @model kind="package"
 * @generated
 */
public interface SecurityPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "security";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/example/security/Security";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "security";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SecurityPackage eINSTANCE = org.xtext.example.security.security.impl.SecurityPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.example.security.security.impl.SecurityImpl <em>Security</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.security.security.impl.SecurityImpl
   * @see org.xtext.example.security.security.impl.SecurityPackageImpl#getSecurity()
   * @generated
   */
  int SECURITY = 0;

  /**
   * The feature id for the '<em><b>Role</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECURITY__ROLE = 0;

  /**
   * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECURITY__CONSTRAINT = 1;

  /**
   * The number of structural features of the '<em>Security</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECURITY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.security.security.impl.SecurityRoleImpl <em>Role</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.security.security.impl.SecurityRoleImpl
   * @see org.xtext.example.security.security.impl.SecurityPackageImpl#getSecurityRole()
   * @generated
   */
  int SECURITY_ROLE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECURITY_ROLE__NAME = 0;

  /**
   * The number of structural features of the '<em>Role</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECURITY_ROLE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.security.security.impl.SecurityConstraintImpl <em>Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.security.security.impl.SecurityConstraintImpl
   * @see org.xtext.example.security.security.impl.SecurityPackageImpl#getSecurityConstraint()
   * @generated
   */
  int SECURITY_CONSTRAINT = 2;

  /**
   * The feature id for the '<em><b>Display Name</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECURITY_CONSTRAINT__DISPLAY_NAME = 0;

  /**
   * The feature id for the '<em><b>Web Resource Collection</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECURITY_CONSTRAINT__WEB_RESOURCE_COLLECTION = 1;

  /**
   * The feature id for the '<em><b>Auth Constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECURITY_CONSTRAINT__AUTH_CONSTRAINT = 2;

  /**
   * The feature id for the '<em><b>User Data Constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECURITY_CONSTRAINT__USER_DATA_CONSTRAINT = 3;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECURITY_CONSTRAINT__ID = 4;

  /**
   * The number of structural features of the '<em>Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECURITY_CONSTRAINT_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.xtext.example.security.security.impl.IdentifierImpl <em>Identifier</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.security.security.impl.IdentifierImpl
   * @see org.xtext.example.security.security.impl.SecurityPackageImpl#getIdentifier()
   * @generated
   */
  int IDENTIFIER = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTIFIER__NAME = 0;

  /**
   * The number of structural features of the '<em>Identifier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTIFIER_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.security.security.impl.DisplayNameImpl <em>Display Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.security.security.impl.DisplayNameImpl
   * @see org.xtext.example.security.security.impl.SecurityPackageImpl#getDisplayName()
   * @generated
   */
  int DISPLAY_NAME = 4;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISPLAY_NAME__VALUE = 0;

  /**
   * The number of structural features of the '<em>Display Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISPLAY_NAME_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.security.security.impl.WebResourceCollectionImpl <em>Web Resource Collection</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.security.security.impl.WebResourceCollectionImpl
   * @see org.xtext.example.security.security.impl.SecurityPackageImpl#getWebResourceCollection()
   * @generated
   */
  int WEB_RESOURCE_COLLECTION = 5;

  /**
   * The feature id for the '<em><b>Web Resource Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEB_RESOURCE_COLLECTION__WEB_RESOURCE_NAME = 0;

  /**
   * The feature id for the '<em><b>Url Pattern</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEB_RESOURCE_COLLECTION__URL_PATTERN = 1;

  /**
   * The feature id for the '<em><b>Http Method</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEB_RESOURCE_COLLECTION__HTTP_METHOD = 2;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEB_RESOURCE_COLLECTION__ID = 3;

  /**
   * The number of structural features of the '<em>Web Resource Collection</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEB_RESOURCE_COLLECTION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.example.security.security.impl.UrlPatternImpl <em>Url Pattern</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.security.security.impl.UrlPatternImpl
   * @see org.xtext.example.security.security.impl.SecurityPackageImpl#getUrlPattern()
   * @generated
   */
  int URL_PATTERN = 6;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int URL_PATTERN__VALUE = 0;

  /**
   * The number of structural features of the '<em>Url Pattern</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int URL_PATTERN_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.security.security.impl.HttpMethodImpl <em>Http Method</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.security.security.impl.HttpMethodImpl
   * @see org.xtext.example.security.security.impl.SecurityPackageImpl#getHttpMethod()
   * @generated
   */
  int HTTP_METHOD = 7;

  /**
   * The feature id for the '<em><b>Omission</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HTTP_METHOD__OMISSION = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HTTP_METHOD__NAME = 1;

  /**
   * The number of structural features of the '<em>Http Method</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HTTP_METHOD_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.security.security.impl.AuthConstraintImpl <em>Auth Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.security.security.impl.AuthConstraintImpl
   * @see org.xtext.example.security.security.impl.SecurityPackageImpl#getAuthConstraint()
   * @generated
   */
  int AUTH_CONSTRAINT = 8;

  /**
   * The feature id for the '<em><b>Role Name</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUTH_CONSTRAINT__ROLE_NAME = 0;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUTH_CONSTRAINT__ID = 1;

  /**
   * The number of structural features of the '<em>Auth Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUTH_CONSTRAINT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.security.security.impl.RoleNameImpl <em>Role Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.security.security.impl.RoleNameImpl
   * @see org.xtext.example.security.security.impl.SecurityPackageImpl#getRoleName()
   * @generated
   */
  int ROLE_NAME = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_NAME__NAME = 0;

  /**
   * The number of structural features of the '<em>Role Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_NAME_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.security.security.impl.UserDataConstraintImpl <em>User Data Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.security.security.impl.UserDataConstraintImpl
   * @see org.xtext.example.security.security.impl.SecurityPackageImpl#getUserDataConstraint()
   * @generated
   */
  int USER_DATA_CONSTRAINT = 10;

  /**
   * The feature id for the '<em><b>Transport Guarantee</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER_DATA_CONSTRAINT__TRANSPORT_GUARANTEE = 0;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER_DATA_CONSTRAINT__ID = 1;

  /**
   * The number of structural features of the '<em>User Data Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USER_DATA_CONSTRAINT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.security.security.impl.TransportGuaranteeImpl <em>Transport Guarantee</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.security.security.impl.TransportGuaranteeImpl
   * @see org.xtext.example.security.security.impl.SecurityPackageImpl#getTransportGuarantee()
   * @generated
   */
  int TRANSPORT_GUARANTEE = 11;

  /**
   * The feature id for the '<em><b>Restriction</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSPORT_GUARANTEE__RESTRICTION = 0;

  /**
   * The number of structural features of the '<em>Transport Guarantee</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSPORT_GUARANTEE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.security.security.RestrictionType <em>Restriction Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.security.security.RestrictionType
   * @see org.xtext.example.security.security.impl.SecurityPackageImpl#getRestrictionType()
   * @generated
   */
  int RESTRICTION_TYPE = 12;


  /**
   * Returns the meta object for class '{@link org.xtext.example.security.security.Security <em>Security</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Security</em>'.
   * @see org.xtext.example.security.security.Security
   * @generated
   */
  EClass getSecurity();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.security.security.Security#getRole <em>Role</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Role</em>'.
   * @see org.xtext.example.security.security.Security#getRole()
   * @see #getSecurity()
   * @generated
   */
  EReference getSecurity_Role();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.security.security.Security#getConstraint <em>Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Constraint</em>'.
   * @see org.xtext.example.security.security.Security#getConstraint()
   * @see #getSecurity()
   * @generated
   */
  EReference getSecurity_Constraint();

  /**
   * Returns the meta object for class '{@link org.xtext.example.security.security.SecurityRole <em>Role</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Role</em>'.
   * @see org.xtext.example.security.security.SecurityRole
   * @generated
   */
  EClass getSecurityRole();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.security.security.SecurityRole#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.security.security.SecurityRole#getName()
   * @see #getSecurityRole()
   * @generated
   */
  EAttribute getSecurityRole_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.example.security.security.SecurityConstraint <em>Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constraint</em>'.
   * @see org.xtext.example.security.security.SecurityConstraint
   * @generated
   */
  EClass getSecurityConstraint();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.security.security.SecurityConstraint#getDisplayName <em>Display Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Display Name</em>'.
   * @see org.xtext.example.security.security.SecurityConstraint#getDisplayName()
   * @see #getSecurityConstraint()
   * @generated
   */
  EReference getSecurityConstraint_DisplayName();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.security.security.SecurityConstraint#getWebResourceCollection <em>Web Resource Collection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Web Resource Collection</em>'.
   * @see org.xtext.example.security.security.SecurityConstraint#getWebResourceCollection()
   * @see #getSecurityConstraint()
   * @generated
   */
  EReference getSecurityConstraint_WebResourceCollection();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.security.security.SecurityConstraint#getAuthConstraint <em>Auth Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Auth Constraint</em>'.
   * @see org.xtext.example.security.security.SecurityConstraint#getAuthConstraint()
   * @see #getSecurityConstraint()
   * @generated
   */
  EReference getSecurityConstraint_AuthConstraint();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.security.security.SecurityConstraint#getUserDataConstraint <em>User Data Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>User Data Constraint</em>'.
   * @see org.xtext.example.security.security.SecurityConstraint#getUserDataConstraint()
   * @see #getSecurityConstraint()
   * @generated
   */
  EReference getSecurityConstraint_UserDataConstraint();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.security.security.SecurityConstraint#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Id</em>'.
   * @see org.xtext.example.security.security.SecurityConstraint#getId()
   * @see #getSecurityConstraint()
   * @generated
   */
  EReference getSecurityConstraint_Id();

  /**
   * Returns the meta object for class '{@link org.xtext.example.security.security.Identifier <em>Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Identifier</em>'.
   * @see org.xtext.example.security.security.Identifier
   * @generated
   */
  EClass getIdentifier();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.security.security.Identifier#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.security.security.Identifier#getName()
   * @see #getIdentifier()
   * @generated
   */
  EAttribute getIdentifier_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.example.security.security.DisplayName <em>Display Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Display Name</em>'.
   * @see org.xtext.example.security.security.DisplayName
   * @generated
   */
  EClass getDisplayName();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.security.security.DisplayName#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.example.security.security.DisplayName#getValue()
   * @see #getDisplayName()
   * @generated
   */
  EAttribute getDisplayName_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.example.security.security.WebResourceCollection <em>Web Resource Collection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Web Resource Collection</em>'.
   * @see org.xtext.example.security.security.WebResourceCollection
   * @generated
   */
  EClass getWebResourceCollection();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.security.security.WebResourceCollection#getWebResourceName <em>Web Resource Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Web Resource Name</em>'.
   * @see org.xtext.example.security.security.WebResourceCollection#getWebResourceName()
   * @see #getWebResourceCollection()
   * @generated
   */
  EAttribute getWebResourceCollection_WebResourceName();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.security.security.WebResourceCollection#getUrlPattern <em>Url Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Url Pattern</em>'.
   * @see org.xtext.example.security.security.WebResourceCollection#getUrlPattern()
   * @see #getWebResourceCollection()
   * @generated
   */
  EReference getWebResourceCollection_UrlPattern();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.security.security.WebResourceCollection#getHttpMethod <em>Http Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Http Method</em>'.
   * @see org.xtext.example.security.security.WebResourceCollection#getHttpMethod()
   * @see #getWebResourceCollection()
   * @generated
   */
  EReference getWebResourceCollection_HttpMethod();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.security.security.WebResourceCollection#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Id</em>'.
   * @see org.xtext.example.security.security.WebResourceCollection#getId()
   * @see #getWebResourceCollection()
   * @generated
   */
  EReference getWebResourceCollection_Id();

  /**
   * Returns the meta object for class '{@link org.xtext.example.security.security.UrlPattern <em>Url Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Url Pattern</em>'.
   * @see org.xtext.example.security.security.UrlPattern
   * @generated
   */
  EClass getUrlPattern();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.security.security.UrlPattern#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.example.security.security.UrlPattern#getValue()
   * @see #getUrlPattern()
   * @generated
   */
  EAttribute getUrlPattern_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.example.security.security.HttpMethod <em>Http Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Http Method</em>'.
   * @see org.xtext.example.security.security.HttpMethod
   * @generated
   */
  EClass getHttpMethod();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.security.security.HttpMethod#isOmission <em>Omission</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Omission</em>'.
   * @see org.xtext.example.security.security.HttpMethod#isOmission()
   * @see #getHttpMethod()
   * @generated
   */
  EAttribute getHttpMethod_Omission();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.security.security.HttpMethod#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.security.security.HttpMethod#getName()
   * @see #getHttpMethod()
   * @generated
   */
  EAttribute getHttpMethod_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.example.security.security.AuthConstraint <em>Auth Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Auth Constraint</em>'.
   * @see org.xtext.example.security.security.AuthConstraint
   * @generated
   */
  EClass getAuthConstraint();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.security.security.AuthConstraint#getRoleName <em>Role Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Role Name</em>'.
   * @see org.xtext.example.security.security.AuthConstraint#getRoleName()
   * @see #getAuthConstraint()
   * @generated
   */
  EReference getAuthConstraint_RoleName();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.security.security.AuthConstraint#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Id</em>'.
   * @see org.xtext.example.security.security.AuthConstraint#getId()
   * @see #getAuthConstraint()
   * @generated
   */
  EReference getAuthConstraint_Id();

  /**
   * Returns the meta object for class '{@link org.xtext.example.security.security.RoleName <em>Role Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Role Name</em>'.
   * @see org.xtext.example.security.security.RoleName
   * @generated
   */
  EClass getRoleName();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.security.security.RoleName#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Name</em>'.
   * @see org.xtext.example.security.security.RoleName#getName()
   * @see #getRoleName()
   * @generated
   */
  EReference getRoleName_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.example.security.security.UserDataConstraint <em>User Data Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>User Data Constraint</em>'.
   * @see org.xtext.example.security.security.UserDataConstraint
   * @generated
   */
  EClass getUserDataConstraint();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.security.security.UserDataConstraint#getTransportGuarantee <em>Transport Guarantee</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Transport Guarantee</em>'.
   * @see org.xtext.example.security.security.UserDataConstraint#getTransportGuarantee()
   * @see #getUserDataConstraint()
   * @generated
   */
  EReference getUserDataConstraint_TransportGuarantee();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.security.security.UserDataConstraint#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Id</em>'.
   * @see org.xtext.example.security.security.UserDataConstraint#getId()
   * @see #getUserDataConstraint()
   * @generated
   */
  EReference getUserDataConstraint_Id();

  /**
   * Returns the meta object for class '{@link org.xtext.example.security.security.TransportGuarantee <em>Transport Guarantee</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transport Guarantee</em>'.
   * @see org.xtext.example.security.security.TransportGuarantee
   * @generated
   */
  EClass getTransportGuarantee();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.security.security.TransportGuarantee#getRestriction <em>Restriction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Restriction</em>'.
   * @see org.xtext.example.security.security.TransportGuarantee#getRestriction()
   * @see #getTransportGuarantee()
   * @generated
   */
  EAttribute getTransportGuarantee_Restriction();

  /**
   * Returns the meta object for enum '{@link org.xtext.example.security.security.RestrictionType <em>Restriction Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Restriction Type</em>'.
   * @see org.xtext.example.security.security.RestrictionType
   * @generated
   */
  EEnum getRestrictionType();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SecurityFactory getSecurityFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.example.security.security.impl.SecurityImpl <em>Security</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.security.security.impl.SecurityImpl
     * @see org.xtext.example.security.security.impl.SecurityPackageImpl#getSecurity()
     * @generated
     */
    EClass SECURITY = eINSTANCE.getSecurity();

    /**
     * The meta object literal for the '<em><b>Role</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SECURITY__ROLE = eINSTANCE.getSecurity_Role();

    /**
     * The meta object literal for the '<em><b>Constraint</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SECURITY__CONSTRAINT = eINSTANCE.getSecurity_Constraint();

    /**
     * The meta object literal for the '{@link org.xtext.example.security.security.impl.SecurityRoleImpl <em>Role</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.security.security.impl.SecurityRoleImpl
     * @see org.xtext.example.security.security.impl.SecurityPackageImpl#getSecurityRole()
     * @generated
     */
    EClass SECURITY_ROLE = eINSTANCE.getSecurityRole();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SECURITY_ROLE__NAME = eINSTANCE.getSecurityRole_Name();

    /**
     * The meta object literal for the '{@link org.xtext.example.security.security.impl.SecurityConstraintImpl <em>Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.security.security.impl.SecurityConstraintImpl
     * @see org.xtext.example.security.security.impl.SecurityPackageImpl#getSecurityConstraint()
     * @generated
     */
    EClass SECURITY_CONSTRAINT = eINSTANCE.getSecurityConstraint();

    /**
     * The meta object literal for the '<em><b>Display Name</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SECURITY_CONSTRAINT__DISPLAY_NAME = eINSTANCE.getSecurityConstraint_DisplayName();

    /**
     * The meta object literal for the '<em><b>Web Resource Collection</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SECURITY_CONSTRAINT__WEB_RESOURCE_COLLECTION = eINSTANCE.getSecurityConstraint_WebResourceCollection();

    /**
     * The meta object literal for the '<em><b>Auth Constraint</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SECURITY_CONSTRAINT__AUTH_CONSTRAINT = eINSTANCE.getSecurityConstraint_AuthConstraint();

    /**
     * The meta object literal for the '<em><b>User Data Constraint</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SECURITY_CONSTRAINT__USER_DATA_CONSTRAINT = eINSTANCE.getSecurityConstraint_UserDataConstraint();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SECURITY_CONSTRAINT__ID = eINSTANCE.getSecurityConstraint_Id();

    /**
     * The meta object literal for the '{@link org.xtext.example.security.security.impl.IdentifierImpl <em>Identifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.security.security.impl.IdentifierImpl
     * @see org.xtext.example.security.security.impl.SecurityPackageImpl#getIdentifier()
     * @generated
     */
    EClass IDENTIFIER = eINSTANCE.getIdentifier();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IDENTIFIER__NAME = eINSTANCE.getIdentifier_Name();

    /**
     * The meta object literal for the '{@link org.xtext.example.security.security.impl.DisplayNameImpl <em>Display Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.security.security.impl.DisplayNameImpl
     * @see org.xtext.example.security.security.impl.SecurityPackageImpl#getDisplayName()
     * @generated
     */
    EClass DISPLAY_NAME = eINSTANCE.getDisplayName();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DISPLAY_NAME__VALUE = eINSTANCE.getDisplayName_Value();

    /**
     * The meta object literal for the '{@link org.xtext.example.security.security.impl.WebResourceCollectionImpl <em>Web Resource Collection</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.security.security.impl.WebResourceCollectionImpl
     * @see org.xtext.example.security.security.impl.SecurityPackageImpl#getWebResourceCollection()
     * @generated
     */
    EClass WEB_RESOURCE_COLLECTION = eINSTANCE.getWebResourceCollection();

    /**
     * The meta object literal for the '<em><b>Web Resource Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WEB_RESOURCE_COLLECTION__WEB_RESOURCE_NAME = eINSTANCE.getWebResourceCollection_WebResourceName();

    /**
     * The meta object literal for the '<em><b>Url Pattern</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WEB_RESOURCE_COLLECTION__URL_PATTERN = eINSTANCE.getWebResourceCollection_UrlPattern();

    /**
     * The meta object literal for the '<em><b>Http Method</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WEB_RESOURCE_COLLECTION__HTTP_METHOD = eINSTANCE.getWebResourceCollection_HttpMethod();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WEB_RESOURCE_COLLECTION__ID = eINSTANCE.getWebResourceCollection_Id();

    /**
     * The meta object literal for the '{@link org.xtext.example.security.security.impl.UrlPatternImpl <em>Url Pattern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.security.security.impl.UrlPatternImpl
     * @see org.xtext.example.security.security.impl.SecurityPackageImpl#getUrlPattern()
     * @generated
     */
    EClass URL_PATTERN = eINSTANCE.getUrlPattern();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute URL_PATTERN__VALUE = eINSTANCE.getUrlPattern_Value();

    /**
     * The meta object literal for the '{@link org.xtext.example.security.security.impl.HttpMethodImpl <em>Http Method</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.security.security.impl.HttpMethodImpl
     * @see org.xtext.example.security.security.impl.SecurityPackageImpl#getHttpMethod()
     * @generated
     */
    EClass HTTP_METHOD = eINSTANCE.getHttpMethod();

    /**
     * The meta object literal for the '<em><b>Omission</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HTTP_METHOD__OMISSION = eINSTANCE.getHttpMethod_Omission();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HTTP_METHOD__NAME = eINSTANCE.getHttpMethod_Name();

    /**
     * The meta object literal for the '{@link org.xtext.example.security.security.impl.AuthConstraintImpl <em>Auth Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.security.security.impl.AuthConstraintImpl
     * @see org.xtext.example.security.security.impl.SecurityPackageImpl#getAuthConstraint()
     * @generated
     */
    EClass AUTH_CONSTRAINT = eINSTANCE.getAuthConstraint();

    /**
     * The meta object literal for the '<em><b>Role Name</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AUTH_CONSTRAINT__ROLE_NAME = eINSTANCE.getAuthConstraint_RoleName();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AUTH_CONSTRAINT__ID = eINSTANCE.getAuthConstraint_Id();

    /**
     * The meta object literal for the '{@link org.xtext.example.security.security.impl.RoleNameImpl <em>Role Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.security.security.impl.RoleNameImpl
     * @see org.xtext.example.security.security.impl.SecurityPackageImpl#getRoleName()
     * @generated
     */
    EClass ROLE_NAME = eINSTANCE.getRoleName();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROLE_NAME__NAME = eINSTANCE.getRoleName_Name();

    /**
     * The meta object literal for the '{@link org.xtext.example.security.security.impl.UserDataConstraintImpl <em>User Data Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.security.security.impl.UserDataConstraintImpl
     * @see org.xtext.example.security.security.impl.SecurityPackageImpl#getUserDataConstraint()
     * @generated
     */
    EClass USER_DATA_CONSTRAINT = eINSTANCE.getUserDataConstraint();

    /**
     * The meta object literal for the '<em><b>Transport Guarantee</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference USER_DATA_CONSTRAINT__TRANSPORT_GUARANTEE = eINSTANCE.getUserDataConstraint_TransportGuarantee();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference USER_DATA_CONSTRAINT__ID = eINSTANCE.getUserDataConstraint_Id();

    /**
     * The meta object literal for the '{@link org.xtext.example.security.security.impl.TransportGuaranteeImpl <em>Transport Guarantee</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.security.security.impl.TransportGuaranteeImpl
     * @see org.xtext.example.security.security.impl.SecurityPackageImpl#getTransportGuarantee()
     * @generated
     */
    EClass TRANSPORT_GUARANTEE = eINSTANCE.getTransportGuarantee();

    /**
     * The meta object literal for the '<em><b>Restriction</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSPORT_GUARANTEE__RESTRICTION = eINSTANCE.getTransportGuarantee_Restriction();

    /**
     * The meta object literal for the '{@link org.xtext.example.security.security.RestrictionType <em>Restriction Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.security.security.RestrictionType
     * @see org.xtext.example.security.security.impl.SecurityPackageImpl#getRestrictionType()
     * @generated
     */
    EEnum RESTRICTION_TYPE = eINSTANCE.getRestrictionType();

  }

} //SecurityPackage
