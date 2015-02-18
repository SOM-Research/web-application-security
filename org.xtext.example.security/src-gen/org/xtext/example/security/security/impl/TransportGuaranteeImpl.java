/**
 */
package org.xtext.example.security.security.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.security.security.RestrictionType;
import org.xtext.example.security.security.SecurityPackage;
import org.xtext.example.security.security.TransportGuarantee;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transport Guarantee</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.security.security.impl.TransportGuaranteeImpl#getRestriction <em>Restriction</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransportGuaranteeImpl extends MinimalEObjectImpl.Container implements TransportGuarantee
{
  /**
   * The default value of the '{@link #getRestriction() <em>Restriction</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRestriction()
   * @generated
   * @ordered
   */
  protected static final RestrictionType RESTRICTION_EDEFAULT = RestrictionType.NONE;

  /**
   * The cached value of the '{@link #getRestriction() <em>Restriction</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRestriction()
   * @generated
   * @ordered
   */
  protected RestrictionType restriction = RESTRICTION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TransportGuaranteeImpl()
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
    return SecurityPackage.Literals.TRANSPORT_GUARANTEE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RestrictionType getRestriction()
  {
    return restriction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRestriction(RestrictionType newRestriction)
  {
    RestrictionType oldRestriction = restriction;
    restriction = newRestriction == null ? RESTRICTION_EDEFAULT : newRestriction;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.TRANSPORT_GUARANTEE__RESTRICTION, oldRestriction, restriction));
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
      case SecurityPackage.TRANSPORT_GUARANTEE__RESTRICTION:
        return getRestriction();
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
      case SecurityPackage.TRANSPORT_GUARANTEE__RESTRICTION:
        setRestriction((RestrictionType)newValue);
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
      case SecurityPackage.TRANSPORT_GUARANTEE__RESTRICTION:
        setRestriction(RESTRICTION_EDEFAULT);
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
      case SecurityPackage.TRANSPORT_GUARANTEE__RESTRICTION:
        return restriction != RESTRICTION_EDEFAULT;
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
    result.append(" (restriction: ");
    result.append(restriction);
    result.append(')');
    return result.toString();
  }

} //TransportGuaranteeImpl
