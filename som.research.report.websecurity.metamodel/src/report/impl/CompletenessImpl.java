/**
 */
package report.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import report.Completeness;
import report.ReportPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Completeness</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link report.impl.CompletenessImpl#getMissedMethod <em>Missed Method</em>}</li>
 *   <li>{@link report.impl.CompletenessImpl#getSecurityConstraint <em>Security Constraint</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompletenessImpl extends AnomalyImpl implements Completeness {
	/**
	 * The cached value of the '{@link #getMissedMethod() <em>Missed Method</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMissedMethod()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> missedMethod;

	/**
	 * The cached value of the '{@link #getSecurityConstraint() <em>Security Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityConstraint()
	 * @generated
	 * @ordered
	 */
	protected EObject securityConstraint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompletenessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReportPackage.Literals.COMPLETENESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getMissedMethod() {
		if (missedMethod == null) {
			missedMethod = new EObjectResolvingEList<EObject>(EObject.class, this, ReportPackage.COMPLETENESS__MISSED_METHOD);
		}
		return missedMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getSecurityConstraint() {
		if (securityConstraint != null && securityConstraint.eIsProxy()) {
			InternalEObject oldSecurityConstraint = (InternalEObject)securityConstraint;
			securityConstraint = eResolveProxy(oldSecurityConstraint);
			if (securityConstraint != oldSecurityConstraint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReportPackage.COMPLETENESS__SECURITY_CONSTRAINT, oldSecurityConstraint, securityConstraint));
			}
		}
		return securityConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetSecurityConstraint() {
		return securityConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurityConstraint(EObject newSecurityConstraint) {
		EObject oldSecurityConstraint = securityConstraint;
		securityConstraint = newSecurityConstraint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportPackage.COMPLETENESS__SECURITY_CONSTRAINT, oldSecurityConstraint, securityConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReportPackage.COMPLETENESS__MISSED_METHOD:
				return getMissedMethod();
			case ReportPackage.COMPLETENESS__SECURITY_CONSTRAINT:
				if (resolve) return getSecurityConstraint();
				return basicGetSecurityConstraint();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ReportPackage.COMPLETENESS__MISSED_METHOD:
				getMissedMethod().clear();
				getMissedMethod().addAll((Collection<? extends EObject>)newValue);
				return;
			case ReportPackage.COMPLETENESS__SECURITY_CONSTRAINT:
				setSecurityConstraint((EObject)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case ReportPackage.COMPLETENESS__MISSED_METHOD:
				getMissedMethod().clear();
				return;
			case ReportPackage.COMPLETENESS__SECURITY_CONSTRAINT:
				setSecurityConstraint((EObject)null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ReportPackage.COMPLETENESS__MISSED_METHOD:
				return missedMethod != null && !missedMethod.isEmpty();
			case ReportPackage.COMPLETENESS__SECURITY_CONSTRAINT:
				return securityConstraint != null;
		}
		return super.eIsSet(featureID);
	}

} //CompletenessImpl
