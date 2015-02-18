/**
 */
package org.xtext.example.security.security.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.example.security.security.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SecurityFactoryImpl extends EFactoryImpl implements SecurityFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SecurityFactory init()
  {
    try
    {
      SecurityFactory theSecurityFactory = (SecurityFactory)EPackage.Registry.INSTANCE.getEFactory(SecurityPackage.eNS_URI);
      if (theSecurityFactory != null)
      {
        return theSecurityFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SecurityFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SecurityFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case SecurityPackage.SECURITY: return createSecurity();
      case SecurityPackage.SECURITY_ROLE: return createSecurityRole();
      case SecurityPackage.SECURITY_CONSTRAINT: return createSecurityConstraint();
      case SecurityPackage.IDENTIFIER: return createIdentifier();
      case SecurityPackage.DISPLAY_NAME: return createDisplayName();
      case SecurityPackage.WEB_RESOURCE_COLLECTION: return createWebResourceCollection();
      case SecurityPackage.URL_PATTERN: return createUrlPattern();
      case SecurityPackage.HTTP_METHOD: return createHttpMethod();
      case SecurityPackage.AUTH_CONSTRAINT: return createAuthConstraint();
      case SecurityPackage.ROLE_NAME: return createRoleName();
      case SecurityPackage.USER_DATA_CONSTRAINT: return createUserDataConstraint();
      case SecurityPackage.TRANSPORT_GUARANTEE: return createTransportGuarantee();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case SecurityPackage.RESTRICTION_TYPE:
        return createRestrictionTypeFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case SecurityPackage.RESTRICTION_TYPE:
        return convertRestrictionTypeToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Security createSecurity()
  {
    SecurityImpl security = new SecurityImpl();
    return security;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SecurityRole createSecurityRole()
  {
    SecurityRoleImpl securityRole = new SecurityRoleImpl();
    return securityRole;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SecurityConstraint createSecurityConstraint()
  {
    SecurityConstraintImpl securityConstraint = new SecurityConstraintImpl();
    return securityConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Identifier createIdentifier()
  {
    IdentifierImpl identifier = new IdentifierImpl();
    return identifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DisplayName createDisplayName()
  {
    DisplayNameImpl displayName = new DisplayNameImpl();
    return displayName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WebResourceCollection createWebResourceCollection()
  {
    WebResourceCollectionImpl webResourceCollection = new WebResourceCollectionImpl();
    return webResourceCollection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UrlPattern createUrlPattern()
  {
    UrlPatternImpl urlPattern = new UrlPatternImpl();
    return urlPattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HttpMethod createHttpMethod()
  {
    HttpMethodImpl httpMethod = new HttpMethodImpl();
    return httpMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AuthConstraint createAuthConstraint()
  {
    AuthConstraintImpl authConstraint = new AuthConstraintImpl();
    return authConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RoleName createRoleName()
  {
    RoleNameImpl roleName = new RoleNameImpl();
    return roleName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UserDataConstraint createUserDataConstraint()
  {
    UserDataConstraintImpl userDataConstraint = new UserDataConstraintImpl();
    return userDataConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TransportGuarantee createTransportGuarantee()
  {
    TransportGuaranteeImpl transportGuarantee = new TransportGuaranteeImpl();
    return transportGuarantee;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RestrictionType createRestrictionTypeFromString(EDataType eDataType, String initialValue)
  {
    RestrictionType result = RestrictionType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertRestrictionTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SecurityPackage getSecurityPackage()
  {
    return (SecurityPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SecurityPackage getPackage()
  {
    return SecurityPackage.eINSTANCE;
  }

} //SecurityFactoryImpl
