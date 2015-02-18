/**
 */
package org.xtext.example.security.security.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.security.security.Identifier;
import org.xtext.example.security.security.SecurityPackage;
import org.xtext.example.security.security.TransportGuarantee;
import org.xtext.example.security.security.UserDataConstraint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Data Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.security.security.impl.UserDataConstraintImpl#getTransportGuarantee <em>Transport Guarantee</em>}</li>
 *   <li>{@link org.xtext.example.security.security.impl.UserDataConstraintImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UserDataConstraintImpl extends MinimalEObjectImpl.Container implements UserDataConstraint
{
  /**
   * The cached value of the '{@link #getTransportGuarantee() <em>Transport Guarantee</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTransportGuarantee()
   * @generated
   * @ordered
   */
  protected TransportGuarantee transportGuarantee;

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
  protected UserDataConstraintImpl()
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
    return SecurityPackage.Literals.USER_DATA_CONSTRAINT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TransportGuarantee getTransportGuarantee()
  {
    return transportGuarantee;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTransportGuarantee(TransportGuarantee newTransportGuarantee, NotificationChain msgs)
  {
    TransportGuarantee oldTransportGuarantee = transportGuarantee;
    transportGuarantee = newTransportGuarantee;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SecurityPackage.USER_DATA_CONSTRAINT__TRANSPORT_GUARANTEE, oldTransportGuarantee, newTransportGuarantee);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTransportGuarantee(TransportGuarantee newTransportGuarantee)
  {
    if (newTransportGuarantee != transportGuarantee)
    {
      NotificationChain msgs = null;
      if (transportGuarantee != null)
        msgs = ((InternalEObject)transportGuarantee).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SecurityPackage.USER_DATA_CONSTRAINT__TRANSPORT_GUARANTEE, null, msgs);
      if (newTransportGuarantee != null)
        msgs = ((InternalEObject)newTransportGuarantee).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SecurityPackage.USER_DATA_CONSTRAINT__TRANSPORT_GUARANTEE, null, msgs);
      msgs = basicSetTransportGuarantee(newTransportGuarantee, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.USER_DATA_CONSTRAINT__TRANSPORT_GUARANTEE, newTransportGuarantee, newTransportGuarantee));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SecurityPackage.USER_DATA_CONSTRAINT__ID, oldId, newId);
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
        msgs = ((InternalEObject)id).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SecurityPackage.USER_DATA_CONSTRAINT__ID, null, msgs);
      if (newId != null)
        msgs = ((InternalEObject)newId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SecurityPackage.USER_DATA_CONSTRAINT__ID, null, msgs);
      msgs = basicSetId(newId, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.USER_DATA_CONSTRAINT__ID, newId, newId));
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
      case SecurityPackage.USER_DATA_CONSTRAINT__TRANSPORT_GUARANTEE:
        return basicSetTransportGuarantee(null, msgs);
      case SecurityPackage.USER_DATA_CONSTRAINT__ID:
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
      case SecurityPackage.USER_DATA_CONSTRAINT__TRANSPORT_GUARANTEE:
        return getTransportGuarantee();
      case SecurityPackage.USER_DATA_CONSTRAINT__ID:
        return getId();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SecurityPackage.USER_DATA_CONSTRAINT__TRANSPORT_GUARANTEE:
        setTransportGuarantee((TransportGuarantee)newValue);
        return;
      case SecurityPackage.USER_DATA_CONSTRAINT__ID:
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
      case SecurityPackage.USER_DATA_CONSTRAINT__TRANSPORT_GUARANTEE:
        setTransportGuarantee((TransportGuarantee)null);
        return;
      case SecurityPackage.USER_DATA_CONSTRAINT__ID:
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
      case SecurityPackage.USER_DATA_CONSTRAINT__TRANSPORT_GUARANTEE:
        return transportGuarantee != null;
      case SecurityPackage.USER_DATA_CONSTRAINT__ID:
        return id != null;
    }
    return super.eIsSet(featureID);
  }

} //UserDataConstraintImpl
