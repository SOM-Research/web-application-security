/**
 */
package report.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import report.ReportPackage;
import report.Syntactical;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Syntactical</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link report.impl.SyntacticalImpl#getMissedRoles <em>Missed Roles</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SyntacticalImpl extends AnomalyImpl implements Syntactical {
	/**
	 * The cached value of the '{@link #getMissedRoles() <em>Missed Roles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMissedRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> missedRoles;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SyntacticalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReportPackage.Literals.SYNTACTICAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getMissedRoles() {
		if (missedRoles == null) {
			missedRoles = new EObjectResolvingEList<EObject>(EObject.class, this, ReportPackage.SYNTACTICAL__MISSED_ROLES);
		}
		return missedRoles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReportPackage.SYNTACTICAL__MISSED_ROLES:
				return getMissedRoles();
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
			case ReportPackage.SYNTACTICAL__MISSED_ROLES:
				getMissedRoles().clear();
				getMissedRoles().addAll((Collection<? extends EObject>)newValue);
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
			case ReportPackage.SYNTACTICAL__MISSED_ROLES:
				getMissedRoles().clear();
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
			case ReportPackage.SYNTACTICAL__MISSED_ROLES:
				return missedRoles != null && !missedRoles.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SyntacticalImpl
