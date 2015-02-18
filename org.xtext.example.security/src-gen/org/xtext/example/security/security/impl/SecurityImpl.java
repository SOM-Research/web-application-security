/**
 */
package org.xtext.example.security.security.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.security.security.Security;
import org.xtext.example.security.security.SecurityConstraint;
import org.xtext.example.security.security.SecurityPackage;
import org.xtext.example.security.security.SecurityRole;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Security</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.security.security.impl.SecurityImpl#getRole <em>Role</em>}</li>
 *   <li>{@link org.xtext.example.security.security.impl.SecurityImpl#getConstraint <em>Constraint</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SecurityImpl extends MinimalEObjectImpl.Container implements Security
{
  /**
   * The cached value of the '{@link #getRole() <em>Role</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRole()
   * @generated
   * @ordered
   */
  protected EList<SecurityRole> role;

  /**
   * The cached value of the '{@link #getConstraint() <em>Constraint</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstraint()
   * @generated
   * @ordered
   */
  protected EList<SecurityConstraint> constraint;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SecurityImpl()
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
    return SecurityPackage.Literals.SECURITY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SecurityRole> getRole()
  {
    if (role == null)
    {
      role = new EObjectContainmentEList<SecurityRole>(SecurityRole.class, this, SecurityPackage.SECURITY__ROLE);
    }
    return role;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SecurityConstraint> getConstraint()
  {
    if (constraint == null)
    {
      constraint = new EObjectContainmentEList<SecurityConstraint>(SecurityConstraint.class, this, SecurityPackage.SECURITY__CONSTRAINT);
    }
    return constraint;
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
      case SecurityPackage.SECURITY__ROLE:
        return ((InternalEList<?>)getRole()).basicRemove(otherEnd, msgs);
      case SecurityPackage.SECURITY__CONSTRAINT:
        return ((InternalEList<?>)getConstraint()).basicRemove(otherEnd, msgs);
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
      case SecurityPackage.SECURITY__ROLE:
        return getRole();
      case SecurityPackage.SECURITY__CONSTRAINT:
        return getConstraint();
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
      case SecurityPackage.SECURITY__ROLE:
        getRole().clear();
        getRole().addAll((Collection<? extends SecurityRole>)newValue);
        return;
      case SecurityPackage.SECURITY__CONSTRAINT:
        getConstraint().clear();
        getConstraint().addAll((Collection<? extends SecurityConstraint>)newValue);
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
      case SecurityPackage.SECURITY__ROLE:
        getRole().clear();
        return;
      case SecurityPackage.SECURITY__CONSTRAINT:
        getConstraint().clear();
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
      case SecurityPackage.SECURITY__ROLE:
        return role != null && !role.isEmpty();
      case SecurityPackage.SECURITY__CONSTRAINT:
        return constraint != null && !constraint.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SecurityImpl
