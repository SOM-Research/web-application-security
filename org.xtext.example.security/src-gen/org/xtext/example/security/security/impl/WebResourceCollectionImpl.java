/**
 */
package org.xtext.example.security.security.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.security.security.HttpMethod;
import org.xtext.example.security.security.Identifier;
import org.xtext.example.security.security.SecurityPackage;
import org.xtext.example.security.security.UrlPattern;
import org.xtext.example.security.security.WebResourceCollection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Web Resource Collection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.security.security.impl.WebResourceCollectionImpl#getWebResourceName <em>Web Resource Name</em>}</li>
 *   <li>{@link org.xtext.example.security.security.impl.WebResourceCollectionImpl#getUrlPattern <em>Url Pattern</em>}</li>
 *   <li>{@link org.xtext.example.security.security.impl.WebResourceCollectionImpl#getHttpMethod <em>Http Method</em>}</li>
 *   <li>{@link org.xtext.example.security.security.impl.WebResourceCollectionImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WebResourceCollectionImpl extends MinimalEObjectImpl.Container implements WebResourceCollection
{
  /**
   * The default value of the '{@link #getWebResourceName() <em>Web Resource Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWebResourceName()
   * @generated
   * @ordered
   */
  protected static final String WEB_RESOURCE_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getWebResourceName() <em>Web Resource Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWebResourceName()
   * @generated
   * @ordered
   */
  protected String webResourceName = WEB_RESOURCE_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getUrlPattern() <em>Url Pattern</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUrlPattern()
   * @generated
   * @ordered
   */
  protected EList<UrlPattern> urlPattern;

  /**
   * The cached value of the '{@link #getHttpMethod() <em>Http Method</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHttpMethod()
   * @generated
   * @ordered
   */
  protected EList<HttpMethod> httpMethod;

  /**
   * The cached value of the '{@link #getId() <em>Id</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected Identifier id;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WebResourceCollectionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SecurityPackage.Literals.WEB_RESOURCE_COLLECTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getWebResourceName()
  {
    return webResourceName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWebResourceName(String newWebResourceName)
  {
    String oldWebResourceName = webResourceName;
    webResourceName = newWebResourceName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.WEB_RESOURCE_COLLECTION__WEB_RESOURCE_NAME, oldWebResourceName, webResourceName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<UrlPattern> getUrlPattern()
  {
    if (urlPattern == null)
    {
      urlPattern = new EObjectContainmentEList<UrlPattern>(UrlPattern.class, this, SecurityPackage.WEB_RESOURCE_COLLECTION__URL_PATTERN);
    }
    return urlPattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<HttpMethod> getHttpMethod()
  {
    if (httpMethod == null)
    {
      httpMethod = new EObjectContainmentEList<HttpMethod>(HttpMethod.class, this, SecurityPackage.WEB_RESOURCE_COLLECTION__HTTP_METHOD);
    }
    return httpMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Identifier getId()
  {
    return id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetId(Identifier newId, NotificationChain msgs)
  {
    Identifier oldId = id;
    id = newId;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SecurityPackage.WEB_RESOURCE_COLLECTION__ID, oldId, newId);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setId(Identifier newId)
  {
    if (newId != id)
    {
      NotificationChain msgs = null;
      if (id != null)
        msgs = ((InternalEObject)id).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SecurityPackage.WEB_RESOURCE_COLLECTION__ID, null, msgs);
      if (newId != null)
        msgs = ((InternalEObject)newId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SecurityPackage.WEB_RESOURCE_COLLECTION__ID, null, msgs);
      msgs = basicSetId(newId, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.WEB_RESOURCE_COLLECTION__ID, newId, newId));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SecurityPackage.WEB_RESOURCE_COLLECTION__URL_PATTERN:
        return ((InternalEList<?>)getUrlPattern()).basicRemove(otherEnd, msgs);
      case SecurityPackage.WEB_RESOURCE_COLLECTION__HTTP_METHOD:
        return ((InternalEList<?>)getHttpMethod()).basicRemove(otherEnd, msgs);
      case SecurityPackage.WEB_RESOURCE_COLLECTION__ID:
        return basicSetId(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SecurityPackage.WEB_RESOURCE_COLLECTION__WEB_RESOURCE_NAME:
        return getWebResourceName();
      case SecurityPackage.WEB_RESOURCE_COLLECTION__URL_PATTERN:
        return getUrlPattern();
      case SecurityPackage.WEB_RESOURCE_COLLECTION__HTTP_METHOD:
        return getHttpMethod();
      case SecurityPackage.WEB_RESOURCE_COLLECTION__ID:
        return getId();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SecurityPackage.WEB_RESOURCE_COLLECTION__WEB_RESOURCE_NAME:
        setWebResourceName((String)newValue);
        return;
      case SecurityPackage.WEB_RESOURCE_COLLECTION__URL_PATTERN:
        getUrlPattern().clear();
        getUrlPattern().addAll((Collection<? extends UrlPattern>)newValue);
        return;
      case SecurityPackage.WEB_RESOURCE_COLLECTION__HTTP_METHOD:
        getHttpMethod().clear();
        getHttpMethod().addAll((Collection<? extends HttpMethod>)newValue);
        return;
      case SecurityPackage.WEB_RESOURCE_COLLECTION__ID:
        setId((Identifier)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SecurityPackage.WEB_RESOURCE_COLLECTION__WEB_RESOURCE_NAME:
        setWebResourceName(WEB_RESOURCE_NAME_EDEFAULT);
        return;
      case SecurityPackage.WEB_RESOURCE_COLLECTION__URL_PATTERN:
        getUrlPattern().clear();
        return;
      case SecurityPackage.WEB_RESOURCE_COLLECTION__HTTP_METHOD:
        getHttpMethod().clear();
        return;
      case SecurityPackage.WEB_RESOURCE_COLLECTION__ID:
        setId((Identifier)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SecurityPackage.WEB_RESOURCE_COLLECTION__WEB_RESOURCE_NAME:
        return WEB_RESOURCE_NAME_EDEFAULT == null ? webResourceName != null : !WEB_RESOURCE_NAME_EDEFAULT.equals(webResourceName);
      case SecurityPackage.WEB_RESOURCE_COLLECTION__URL_PATTERN:
        return urlPattern != null && !urlPattern.isEmpty();
      case SecurityPackage.WEB_RESOURCE_COLLECTION__HTTP_METHOD:
        return httpMethod != null && !httpMethod.isEmpty();
      case SecurityPackage.WEB_RESOURCE_COLLECTION__ID:
        return id != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (webResourceName: ");
    result.append(webResourceName);
    result.append(')');
    return result.toString();
  }

} //WebResourceCollectionImpl
