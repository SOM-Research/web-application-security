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

import org.xtext.example.security.security.AuthConstraint;
import org.xtext.example.security.security.DisplayName;
import org.xtext.example.security.security.Identifier;
import org.xtext.example.security.security.SecurityConstraint;
import org.xtext.example.security.security.SecurityPackage;
import org.xtext.example.security.security.UserDataConstraint;
import org.xtext.example.security.security.WebResourceCollection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.security.security.impl.SecurityConstraintImpl#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.xtext.example.security.security.impl.SecurityConstraintImpl#getWebResourceCollection <em>Web Resource Collection</em>}</li>
 *   <li>{@link org.xtext.example.security.security.impl.SecurityConstraintImpl#getAuthConstraint <em>Auth Constraint</em>}</li>
 *   <li>{@link org.xtext.example.security.security.impl.SecurityConstraintImpl#getUserDataConstraint <em>User Data Constraint</em>}</li>
 *   <li>{@link org.xtext.example.security.security.impl.SecurityConstraintImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SecurityConstraintImpl extends MinimalEObjectImpl.Container implements SecurityConstraint
{
  /**
   * The cached value of the '{@link #getDisplayName() <em>Display Name</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDisplayName()
   * @generated
   * @ordered
   */
  protected EList<DisplayName> displayName;

  /**
   * The cached value of the '{@link #getWebResourceCollection() <em>Web Resource Collection</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWebResourceCollection()
   * @generated
   * @ordered
   */
  protected EList<WebResourceCollection> webResourceCollection;

  /**
   * The cached value of the '{@link #getAuthConstraint() <em>Auth Constraint</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAuthConstraint()
   * @generated
   * @ordered
   */
  protected AuthConstraint authConstraint;

  /**
   * The cached value of the '{@link #getUserDataConstraint() <em>User Data Constraint</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUserDataConstraint()
   * @generated
   * @ordered
   */
  protected UserDataConstraint userDataConstraint;

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
  protected SecurityConstraintImpl()
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
    return SecurityPackage.Literals.SECURITY_CONSTRAINT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DisplayName> getDisplayName()
  {
    if (displayName == null)
    {
      displayName = new EObjectContainmentEList<DisplayName>(DisplayName.class, this, SecurityPackage.SECURITY_CONSTRAINT__DISPLAY_NAME);
    }
    return displayName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<WebResourceCollection> getWebResourceCollection()
  {
    if (webResourceCollection == null)
    {
      webResourceCollection = new EObjectContainmentEList<WebResourceCollection>(WebResourceCollection.class, this, SecurityPackage.SECURITY_CONSTRAINT__WEB_RESOURCE_COLLECTION);
    }
    return webResourceCollection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AuthConstraint getAuthConstraint()
  {
    return authConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAuthConstraint(AuthConstraint newAuthConstraint, NotificationChain msgs)
  {
    AuthConstraint oldAuthConstraint = authConstraint;
    authConstraint = newAuthConstraint;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SecurityPackage.SECURITY_CONSTRAINT__AUTH_CONSTRAINT, oldAuthConstraint, newAuthConstraint);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAuthConstraint(AuthConstraint newAuthConstraint)
  {
    if (newAuthConstraint != authConstraint)
    {
      NotificationChain msgs = null;
      if (authConstraint != null)
        msgs = ((InternalEObject)authConstraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SecurityPackage.SECURITY_CONSTRAINT__AUTH_CONSTRAINT, null, msgs);
      if (newAuthConstraint != null)
        msgs = ((InternalEObject)newAuthConstraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SecurityPackage.SECURITY_CONSTRAINT__AUTH_CONSTRAINT, null, msgs);
      msgs = basicSetAuthConstraint(newAuthConstraint, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.SECURITY_CONSTRAINT__AUTH_CONSTRAINT, newAuthConstraint, newAuthConstraint));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UserDataConstraint getUserDataConstraint()
  {
    return userDataConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUserDataConstraint(UserDataConstraint newUserDataConstraint, NotificationChain msgs)
  {
    UserDataConstraint oldUserDataConstraint = userDataConstraint;
    userDataConstraint = newUserDataConstraint;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SecurityPackage.SECURITY_CONSTRAINT__USER_DATA_CONSTRAINT, oldUserDataConstraint, newUserDataConstraint);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUserDataConstraint(UserDataConstraint newUserDataConstraint)
  {
    if (newUserDataConstraint != userDataConstraint)
    {
      NotificationChain msgs = null;
      if (userDataConstraint != null)
        msgs = ((InternalEObject)userDataConstraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SecurityPackage.SECURITY_CONSTRAINT__USER_DATA_CONSTRAINT, null, msgs);
      if (newUserDataConstraint != null)
        msgs = ((InternalEObject)newUserDataConstraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SecurityPackage.SECURITY_CONSTRAINT__USER_DATA_CONSTRAINT, null, msgs);
      msgs = basicSetUserDataConstraint(newUserDataConstraint, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.SECURITY_CONSTRAINT__USER_DATA_CONSTRAINT, newUserDataConstraint, newUserDataConstraint));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SecurityPackage.SECURITY_CONSTRAINT__ID, oldId, newId);
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
        msgs = ((InternalEObject)id).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SecurityPackage.SECURITY_CONSTRAINT__ID, null, msgs);
      if (newId != null)
        msgs = ((InternalEObject)newId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SecurityPackage.SECURITY_CONSTRAINT__ID, null, msgs);
      msgs = basicSetId(newId, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.SECURITY_CONSTRAINT__ID, newId, newId));
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
      case SecurityPackage.SECURITY_CONSTRAINT__DISPLAY_NAME:
        return ((InternalEList<?>)getDisplayName()).basicRemove(otherEnd, msgs);
      case SecurityPackage.SECURITY_CONSTRAINT__WEB_RESOURCE_COLLECTION:
        return ((InternalEList<?>)getWebResourceCollection()).basicRemove(otherEnd, msgs);
      case SecurityPackage.SECURITY_CONSTRAINT__AUTH_CONSTRAINT:
        return basicSetAuthConstraint(null, msgs);
      case SecurityPackage.SECURITY_CONSTRAINT__USER_DATA_CONSTRAINT:
        return basicSetUserDataConstraint(null, msgs);
      case SecurityPackage.SECURITY_CONSTRAINT__ID:
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
      case SecurityPackage.SECURITY_CONSTRAINT__DISPLAY_NAME:
        return getDisplayName();
      case SecurityPackage.SECURITY_CONSTRAINT__WEB_RESOURCE_COLLECTION:
        return getWebResourceCollection();
      case SecurityPackage.SECURITY_CONSTRAINT__AUTH_CONSTRAINT:
        return getAuthConstraint();
      case SecurityPackage.SECURITY_CONSTRAINT__USER_DATA_CONSTRAINT:
        return getUserDataConstraint();
      case SecurityPackage.SECURITY_CONSTRAINT__ID:
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
      case SecurityPackage.SECURITY_CONSTRAINT__DISPLAY_NAME:
        getDisplayName().clear();
        getDisplayName().addAll((Collection<? extends DisplayName>)newValue);
        return;
      case SecurityPackage.SECURITY_CONSTRAINT__WEB_RESOURCE_COLLECTION:
        getWebResourceCollection().clear();
        getWebResourceCollection().addAll((Collection<? extends WebResourceCollection>)newValue);
        return;
      case SecurityPackage.SECURITY_CONSTRAINT__AUTH_CONSTRAINT:
        setAuthConstraint((AuthConstraint)newValue);
        return;
      case SecurityPackage.SECURITY_CONSTRAINT__USER_DATA_CONSTRAINT:
        setUserDataConstraint((UserDataConstraint)newValue);
        return;
      case SecurityPackage.SECURITY_CONSTRAINT__ID:
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
      case SecurityPackage.SECURITY_CONSTRAINT__DISPLAY_NAME:
        getDisplayName().clear();
        return;
      case SecurityPackage.SECURITY_CONSTRAINT__WEB_RESOURCE_COLLECTION:
        getWebResourceCollection().clear();
        return;
      case SecurityPackage.SECURITY_CONSTRAINT__AUTH_CONSTRAINT:
        setAuthConstraint((AuthConstraint)null);
        return;
      case SecurityPackage.SECURITY_CONSTRAINT__USER_DATA_CONSTRAINT:
        setUserDataConstraint((UserDataConstraint)null);
        return;
      case SecurityPackage.SECURITY_CONSTRAINT__ID:
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
      case SecurityPackage.SECURITY_CONSTRAINT__DISPLAY_NAME:
        return displayName != null && !displayName.isEmpty();
      case SecurityPackage.SECURITY_CONSTRAINT__WEB_RESOURCE_COLLECTION:
        return webResourceCollection != null && !webResourceCollection.isEmpty();
      case SecurityPackage.SECURITY_CONSTRAINT__AUTH_CONSTRAINT:
        return authConstraint != null;
      case SecurityPackage.SECURITY_CONSTRAINT__USER_DATA_CONSTRAINT:
        return userDataConstraint != null;
      case SecurityPackage.SECURITY_CONSTRAINT__ID:
        return id != null;
    }
    return super.eIsSet(featureID);
  }

} //SecurityConstraintImpl
