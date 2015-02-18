/**
 */
package org.xtext.example.security.security.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.xtext.example.security.security.AuthConstraint;
import org.xtext.example.security.security.DisplayName;
import org.xtext.example.security.security.HttpMethod;
import org.xtext.example.security.security.Identifier;
import org.xtext.example.security.security.RestrictionType;
import org.xtext.example.security.security.RoleName;
import org.xtext.example.security.security.Security;
import org.xtext.example.security.security.SecurityConstraint;
import org.xtext.example.security.security.SecurityFactory;
import org.xtext.example.security.security.SecurityPackage;
import org.xtext.example.security.security.SecurityRole;
import org.xtext.example.security.security.TransportGuarantee;
import org.xtext.example.security.security.UrlPattern;
import org.xtext.example.security.security.UserDataConstraint;
import org.xtext.example.security.security.WebResourceCollection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SecurityPackageImpl extends EPackageImpl implements SecurityPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass securityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass securityRoleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass securityConstraintEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass identifierEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass displayNameEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass webResourceCollectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass urlPatternEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass httpMethodEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass authConstraintEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass roleNameEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass userDataConstraintEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass transportGuaranteeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum restrictionTypeEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.xtext.example.security.security.SecurityPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private SecurityPackageImpl()
  {
    super(eNS_URI, SecurityFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link SecurityPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static SecurityPackage init()
  {
    if (isInited) return (SecurityPackage)EPackage.Registry.INSTANCE.getEPackage(SecurityPackage.eNS_URI);

    // Obtain or create and register package
    SecurityPackageImpl theSecurityPackage = (SecurityPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SecurityPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SecurityPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theSecurityPackage.createPackageContents();

    // Initialize created meta-data
    theSecurityPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theSecurityPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(SecurityPackage.eNS_URI, theSecurityPackage);
    return theSecurityPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSecurity()
  {
    return securityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSecurity_Role()
  {
    return (EReference)securityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSecurity_Constraint()
  {
    return (EReference)securityEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSecurityRole()
  {
    return securityRoleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSecurityRole_Name()
  {
    return (EAttribute)securityRoleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSecurityConstraint()
  {
    return securityConstraintEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSecurityConstraint_DisplayName()
  {
    return (EReference)securityConstraintEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSecurityConstraint_WebResourceCollection()
  {
    return (EReference)securityConstraintEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSecurityConstraint_AuthConstraint()
  {
    return (EReference)securityConstraintEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSecurityConstraint_UserDataConstraint()
  {
    return (EReference)securityConstraintEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSecurityConstraint_Id()
  {
    return (EReference)securityConstraintEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIdentifier()
  {
    return identifierEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIdentifier_Name()
  {
    return (EAttribute)identifierEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDisplayName()
  {
    return displayNameEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDisplayName_Value()
  {
    return (EAttribute)displayNameEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWebResourceCollection()
  {
    return webResourceCollectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWebResourceCollection_WebResourceName()
  {
    return (EAttribute)webResourceCollectionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWebResourceCollection_UrlPattern()
  {
    return (EReference)webResourceCollectionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWebResourceCollection_HttpMethod()
  {
    return (EReference)webResourceCollectionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWebResourceCollection_Id()
  {
    return (EReference)webResourceCollectionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUrlPattern()
  {
    return urlPatternEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUrlPattern_Value()
  {
    return (EAttribute)urlPatternEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHttpMethod()
  {
    return httpMethodEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHttpMethod_Omission()
  {
    return (EAttribute)httpMethodEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHttpMethod_Name()
  {
    return (EAttribute)httpMethodEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAuthConstraint()
  {
    return authConstraintEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAuthConstraint_RoleName()
  {
    return (EReference)authConstraintEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAuthConstraint_Id()
  {
    return (EReference)authConstraintEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRoleName()
  {
    return roleNameEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRoleName_Name()
  {
    return (EReference)roleNameEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUserDataConstraint()
  {
    return userDataConstraintEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUserDataConstraint_TransportGuarantee()
  {
    return (EReference)userDataConstraintEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUserDataConstraint_Id()
  {
    return (EReference)userDataConstraintEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTransportGuarantee()
  {
    return transportGuaranteeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTransportGuarantee_Restriction()
  {
    return (EAttribute)transportGuaranteeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getRestrictionType()
  {
    return restrictionTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SecurityFactory getSecurityFactory()
  {
    return (SecurityFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    securityEClass = createEClass(SECURITY);
    createEReference(securityEClass, SECURITY__ROLE);
    createEReference(securityEClass, SECURITY__CONSTRAINT);

    securityRoleEClass = createEClass(SECURITY_ROLE);
    createEAttribute(securityRoleEClass, SECURITY_ROLE__NAME);

    securityConstraintEClass = createEClass(SECURITY_CONSTRAINT);
    createEReference(securityConstraintEClass, SECURITY_CONSTRAINT__DISPLAY_NAME);
    createEReference(securityConstraintEClass, SECURITY_CONSTRAINT__WEB_RESOURCE_COLLECTION);
    createEReference(securityConstraintEClass, SECURITY_CONSTRAINT__AUTH_CONSTRAINT);
    createEReference(securityConstraintEClass, SECURITY_CONSTRAINT__USER_DATA_CONSTRAINT);
    createEReference(securityConstraintEClass, SECURITY_CONSTRAINT__ID);

    identifierEClass = createEClass(IDENTIFIER);
    createEAttribute(identifierEClass, IDENTIFIER__NAME);

    displayNameEClass = createEClass(DISPLAY_NAME);
    createEAttribute(displayNameEClass, DISPLAY_NAME__VALUE);

    webResourceCollectionEClass = createEClass(WEB_RESOURCE_COLLECTION);
    createEAttribute(webResourceCollectionEClass, WEB_RESOURCE_COLLECTION__WEB_RESOURCE_NAME);
    createEReference(webResourceCollectionEClass, WEB_RESOURCE_COLLECTION__URL_PATTERN);
    createEReference(webResourceCollectionEClass, WEB_RESOURCE_COLLECTION__HTTP_METHOD);
    createEReference(webResourceCollectionEClass, WEB_RESOURCE_COLLECTION__ID);

    urlPatternEClass = createEClass(URL_PATTERN);
    createEAttribute(urlPatternEClass, URL_PATTERN__VALUE);

    httpMethodEClass = createEClass(HTTP_METHOD);
    createEAttribute(httpMethodEClass, HTTP_METHOD__OMISSION);
    createEAttribute(httpMethodEClass, HTTP_METHOD__NAME);

    authConstraintEClass = createEClass(AUTH_CONSTRAINT);
    createEReference(authConstraintEClass, AUTH_CONSTRAINT__ROLE_NAME);
    createEReference(authConstraintEClass, AUTH_CONSTRAINT__ID);

    roleNameEClass = createEClass(ROLE_NAME);
    createEReference(roleNameEClass, ROLE_NAME__NAME);

    userDataConstraintEClass = createEClass(USER_DATA_CONSTRAINT);
    createEReference(userDataConstraintEClass, USER_DATA_CONSTRAINT__TRANSPORT_GUARANTEE);
    createEReference(userDataConstraintEClass, USER_DATA_CONSTRAINT__ID);

    transportGuaranteeEClass = createEClass(TRANSPORT_GUARANTEE);
    createEAttribute(transportGuaranteeEClass, TRANSPORT_GUARANTEE__RESTRICTION);

    // Create enums
    restrictionTypeEEnum = createEEnum(RESTRICTION_TYPE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(securityEClass, Security.class, "Security", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSecurity_Role(), this.getSecurityRole(), null, "role", null, 0, -1, Security.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSecurity_Constraint(), this.getSecurityConstraint(), null, "constraint", null, 0, -1, Security.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(securityRoleEClass, SecurityRole.class, "SecurityRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSecurityRole_Name(), ecorePackage.getEString(), "name", null, 0, 1, SecurityRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(securityConstraintEClass, SecurityConstraint.class, "SecurityConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSecurityConstraint_DisplayName(), this.getDisplayName(), null, "displayName", null, 0, -1, SecurityConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSecurityConstraint_WebResourceCollection(), this.getWebResourceCollection(), null, "webResourceCollection", null, 0, -1, SecurityConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSecurityConstraint_AuthConstraint(), this.getAuthConstraint(), null, "authConstraint", null, 0, 1, SecurityConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSecurityConstraint_UserDataConstraint(), this.getUserDataConstraint(), null, "userDataConstraint", null, 0, 1, SecurityConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSecurityConstraint_Id(), this.getIdentifier(), null, "id", null, 0, 1, SecurityConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(identifierEClass, Identifier.class, "Identifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIdentifier_Name(), ecorePackage.getEString(), "name", null, 0, 1, Identifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(displayNameEClass, DisplayName.class, "DisplayName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDisplayName_Value(), ecorePackage.getEString(), "value", null, 0, 1, DisplayName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(webResourceCollectionEClass, WebResourceCollection.class, "WebResourceCollection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getWebResourceCollection_WebResourceName(), ecorePackage.getEString(), "webResourceName", null, 0, 1, WebResourceCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWebResourceCollection_UrlPattern(), this.getUrlPattern(), null, "urlPattern", null, 0, -1, WebResourceCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWebResourceCollection_HttpMethod(), this.getHttpMethod(), null, "httpMethod", null, 0, -1, WebResourceCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWebResourceCollection_Id(), this.getIdentifier(), null, "id", null, 0, 1, WebResourceCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(urlPatternEClass, UrlPattern.class, "UrlPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUrlPattern_Value(), ecorePackage.getEString(), "value", null, 0, 1, UrlPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(httpMethodEClass, HttpMethod.class, "HttpMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getHttpMethod_Omission(), ecorePackage.getEBoolean(), "omission", null, 0, 1, HttpMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getHttpMethod_Name(), ecorePackage.getEString(), "name", null, 0, 1, HttpMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(authConstraintEClass, AuthConstraint.class, "AuthConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAuthConstraint_RoleName(), this.getRoleName(), null, "roleName", null, 0, -1, AuthConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAuthConstraint_Id(), this.getIdentifier(), null, "id", null, 0, 1, AuthConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(roleNameEClass, RoleName.class, "RoleName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRoleName_Name(), this.getSecurityRole(), null, "name", null, 0, 1, RoleName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(userDataConstraintEClass, UserDataConstraint.class, "UserDataConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUserDataConstraint_TransportGuarantee(), this.getTransportGuarantee(), null, "transportGuarantee", null, 0, 1, UserDataConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUserDataConstraint_Id(), this.getIdentifier(), null, "id", null, 0, 1, UserDataConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(transportGuaranteeEClass, TransportGuarantee.class, "TransportGuarantee", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTransportGuarantee_Restriction(), this.getRestrictionType(), "restriction", null, 0, 1, TransportGuarantee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(restrictionTypeEEnum, RestrictionType.class, "RestrictionType");
    addEEnumLiteral(restrictionTypeEEnum, RestrictionType.NONE);
    addEEnumLiteral(restrictionTypeEEnum, RestrictionType.INTEGRAL);
    addEEnumLiteral(restrictionTypeEEnum, RestrictionType.CONFIDENTIAL);

    // Create resource
    createResource(eNS_URI);
  }

} //SecurityPackageImpl
