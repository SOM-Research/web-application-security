/**
 */
package report.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import report.Redundancy;
import report.ReportPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Redundancy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link report.impl.RedundancyImpl#getContaining <em>Containing</em>}</li>
 *   <li>{@link report.impl.RedundancyImpl#getContained <em>Contained</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RedundancyImpl extends AnomalyImpl implements Redundancy {
	/**
	 * The cached value of the '{@link #getContaining() <em>Containing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContaining()
	 * @generated
	 * @ordered
	 */
	protected EObject containing;

	/**
	 * The cached value of the '{@link #getContained() <em>Contained</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContained()
	 * @generated
	 * @ordered
	 */
	protected EObject contained;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RedundancyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReportPackage.Literals.REDUNDANCY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getContaining() {
		if (containing != null && containing.eIsProxy()) {
			InternalEObject oldContaining = (InternalEObject)containing;
			containing = eResolveProxy(oldContaining);
			if (containing != oldContaining) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReportPackage.REDUNDANCY__CONTAINING, oldContaining, containing));
			}
		}
		return containing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetContaining() {
		return containing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContaining(EObject newContaining) {
		EObject oldContaining = containing;
		containing = newContaining;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportPackage.REDUNDANCY__CONTAINING, oldContaining, containing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getContained() {
		if (contained != null && contained.eIsProxy()) {
			InternalEObject oldContained = (InternalEObject)contained;
			contained = eResolveProxy(oldContained);
			if (contained != oldContained) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReportPackage.REDUNDANCY__CONTAINED, oldContained, contained));
			}
		}
		return contained;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetContained() {
		return contained;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContained(EObject newContained) {
		EObject oldContained = contained;
		contained = newContained;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportPackage.REDUNDANCY__CONTAINED, oldContained, contained));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReportPackage.REDUNDANCY__CONTAINING:
				if (resolve) return getContaining();
				return basicGetContaining();
			case ReportPackage.REDUNDANCY__CONTAINED:
				if (resolve) return getContained();
				return basicGetContained();
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
			case ReportPackage.REDUNDANCY__CONTAINING:
				setContaining((EObject)newValue);
				return;
			case ReportPackage.REDUNDANCY__CONTAINED:
				setContained((EObject)newValue);
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
			case ReportPackage.REDUNDANCY__CONTAINING:
				setContaining((EObject)null);
				return;
			case ReportPackage.REDUNDANCY__CONTAINED:
				setContained((EObject)null);
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
			case ReportPackage.REDUNDANCY__CONTAINING:
				return containing != null;
			case ReportPackage.REDUNDANCY__CONTAINED:
				return contained != null;
		}
		return super.eIsSet(featureID);
	}

} //RedundancyImpl
