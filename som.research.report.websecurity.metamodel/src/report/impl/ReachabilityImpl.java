/**
 */
package report.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import report.Reachability;
import report.ReportPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reachability</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link report.impl.ReachabilityImpl#getUnreachableResources <em>Unreachable Resources</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReachabilityImpl extends AnomalyImpl implements Reachability {
	/**
	 * The cached value of the '{@link #getUnreachableResources() <em>Unreachable Resources</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnreachableResources()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> unreachableResources;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReachabilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReportPackage.Literals.REACHABILITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getUnreachableResources() {
		if (unreachableResources == null) {
			unreachableResources = new EObjectResolvingEList<EObject>(EObject.class, this, ReportPackage.REACHABILITY__UNREACHABLE_RESOURCES);
		}
		return unreachableResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReportPackage.REACHABILITY__UNREACHABLE_RESOURCES:
				return getUnreachableResources();
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
			case ReportPackage.REACHABILITY__UNREACHABLE_RESOURCES:
				getUnreachableResources().clear();
				getUnreachableResources().addAll((Collection<? extends EObject>)newValue);
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
			case ReportPackage.REACHABILITY__UNREACHABLE_RESOURCES:
				getUnreachableResources().clear();
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
			case ReportPackage.REACHABILITY__UNREACHABLE_RESOURCES:
				return unreachableResources != null && !unreachableResources.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ReachabilityImpl
