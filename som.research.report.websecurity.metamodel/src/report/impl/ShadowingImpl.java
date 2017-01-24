/**
 */
package report.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import report.ReportPackage;
import report.Shadowing;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shadowing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link report.impl.ShadowingImpl#getShadowing <em>Shadowing</em>}</li>
 *   <li>{@link report.impl.ShadowingImpl#getShadowed <em>Shadowed</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ShadowingImpl extends AnomalyImpl implements Shadowing {
	/**
	 * The cached value of the '{@link #getShadowing() <em>Shadowing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShadowing()
	 * @generated
	 * @ordered
	 */
	protected EObject shadowing;

	/**
	 * The cached value of the '{@link #getShadowed() <em>Shadowed</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShadowed()
	 * @generated
	 * @ordered
	 */
	protected EObject shadowed;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShadowingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReportPackage.Literals.SHADOWING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getShadowing() {
		if (shadowing != null && shadowing.eIsProxy()) {
			InternalEObject oldShadowing = (InternalEObject)shadowing;
			shadowing = eResolveProxy(oldShadowing);
			if (shadowing != oldShadowing) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReportPackage.SHADOWING__SHADOWING, oldShadowing, shadowing));
			}
		}
		return shadowing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetShadowing() {
		return shadowing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShadowing(EObject newShadowing) {
		EObject oldShadowing = shadowing;
		shadowing = newShadowing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportPackage.SHADOWING__SHADOWING, oldShadowing, shadowing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getShadowed() {
		if (shadowed != null && shadowed.eIsProxy()) {
			InternalEObject oldShadowed = (InternalEObject)shadowed;
			shadowed = eResolveProxy(oldShadowed);
			if (shadowed != oldShadowed) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReportPackage.SHADOWING__SHADOWED, oldShadowed, shadowed));
			}
		}
		return shadowed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetShadowed() {
		return shadowed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShadowed(EObject newShadowed) {
		EObject oldShadowed = shadowed;
		shadowed = newShadowed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportPackage.SHADOWING__SHADOWED, oldShadowed, shadowed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReportPackage.SHADOWING__SHADOWING:
				if (resolve) return getShadowing();
				return basicGetShadowing();
			case ReportPackage.SHADOWING__SHADOWED:
				if (resolve) return getShadowed();
				return basicGetShadowed();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ReportPackage.SHADOWING__SHADOWING:
				setShadowing((EObject)newValue);
				return;
			case ReportPackage.SHADOWING__SHADOWED:
				setShadowed((EObject)newValue);
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
			case ReportPackage.SHADOWING__SHADOWING:
				setShadowing((EObject)null);
				return;
			case ReportPackage.SHADOWING__SHADOWED:
				setShadowed((EObject)null);
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
			case ReportPackage.SHADOWING__SHADOWING:
				return shadowing != null;
			case ReportPackage.SHADOWING__SHADOWED:
				return shadowed != null;
		}
		return super.eIsSet(featureID);
	}

} //ShadowingImpl
