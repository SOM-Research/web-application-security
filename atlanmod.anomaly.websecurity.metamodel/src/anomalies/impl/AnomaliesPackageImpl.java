/**
 */
package anomalies.impl;

import anomalies.AnomaliesFactory;
import anomalies.AnomaliesPackage;
import anomalies.Anomaly;
import anomalies.ConstraintRedundancy;
import anomalies.ResourceReachability;
import anomalies.RuleShadowing;
import anomalies.UndeclaredRole;
import anomalies.UnprotectedMethod;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AnomaliesPackageImpl extends EPackageImpl implements AnomaliesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anomalyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unprotectedMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintRedundancyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass undeclaredRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleShadowingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceReachabilityEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see anomalies.AnomaliesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AnomaliesPackageImpl() {
		super(eNS_URI, AnomaliesFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link AnomaliesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AnomaliesPackage init() {
		if (isInited) return (AnomaliesPackage)EPackage.Registry.INSTANCE.getEPackage(AnomaliesPackage.eNS_URI);

		// Obtain or create and register package
		AnomaliesPackageImpl theAnomaliesPackage = (AnomaliesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AnomaliesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AnomaliesPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theAnomaliesPackage.createPackageContents();

		// Initialize created meta-data
		theAnomaliesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAnomaliesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AnomaliesPackage.eNS_URI, theAnomaliesPackage);
		return theAnomaliesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnomaly() {
		return anomalyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnomaly_Trace() {
		return (EReference)anomalyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnomaly_Description() {
		return (EAttribute)anomalyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnprotectedMethod() {
		return unprotectedMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraintRedundancy() {
		return constraintRedundancyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUndeclaredRole() {
		return undeclaredRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuleShadowing() {
		return ruleShadowingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceReachability() {
		return resourceReachabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnomaliesFactory getAnomaliesFactory() {
		return (AnomaliesFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		anomalyEClass = createEClass(ANOMALY);
		createEReference(anomalyEClass, ANOMALY__TRACE);
		createEAttribute(anomalyEClass, ANOMALY__DESCRIPTION);

		unprotectedMethodEClass = createEClass(UNPROTECTED_METHOD);

		constraintRedundancyEClass = createEClass(CONSTRAINT_REDUNDANCY);

		undeclaredRoleEClass = createEClass(UNDECLARED_ROLE);

		ruleShadowingEClass = createEClass(RULE_SHADOWING);

		resourceReachabilityEClass = createEClass(RESOURCE_REACHABILITY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		unprotectedMethodEClass.getESuperTypes().add(this.getAnomaly());
		constraintRedundancyEClass.getESuperTypes().add(this.getAnomaly());
		undeclaredRoleEClass.getESuperTypes().add(this.getAnomaly());
		ruleShadowingEClass.getESuperTypes().add(this.getAnomaly());
		resourceReachabilityEClass.getESuperTypes().add(this.getAnomaly());

		// Initialize classes, features, and operations; add parameters
		initEClass(anomalyEClass, Anomaly.class, "Anomaly", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnomaly_Trace(), ecorePackage.getEObject(), null, "trace", null, 0, -1, Anomaly.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnomaly_Description(), ecorePackage.getEString(), "description", null, 0, 1, Anomaly.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unprotectedMethodEClass, UnprotectedMethod.class, "UnprotectedMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(constraintRedundancyEClass, ConstraintRedundancy.class, "ConstraintRedundancy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(undeclaredRoleEClass, UndeclaredRole.class, "UndeclaredRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ruleShadowingEClass, RuleShadowing.class, "RuleShadowing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(resourceReachabilityEClass, ResourceReachability.class, "ResourceReachability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //AnomaliesPackageImpl
