/**
 */
package org.xtext.anomaly.report.report.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.xtext.anomaly.report.report.Anomaly;
import org.xtext.anomaly.report.report.Completeness;
import org.xtext.anomaly.report.report.Reachability;
import org.xtext.anomaly.report.report.Redundancy;
import org.xtext.anomaly.report.report.Report;
import org.xtext.anomaly.report.report.ReportFactory;
import org.xtext.anomaly.report.report.ReportPackage;
import org.xtext.anomaly.report.report.Shadowing;
import org.xtext.anomaly.report.report.Syntactical;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReportPackageImpl extends EPackageImpl implements ReportPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass reportEClass = null;

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
  private EClass shadowingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass completenessEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass redundancyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass syntacticalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass reachabilityEClass = null;

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
   * @see org.xtext.anomaly.report.report.ReportPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private ReportPackageImpl()
  {
    super(eNS_URI, ReportFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link ReportPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static ReportPackage init()
  {
    if (isInited) return (ReportPackage)EPackage.Registry.INSTANCE.getEPackage(ReportPackage.eNS_URI);

    // Obtain or create and register package
    ReportPackageImpl theReportPackage = (ReportPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ReportPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ReportPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theReportPackage.createPackageContents();

    // Initialize created meta-data
    theReportPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theReportPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(ReportPackage.eNS_URI, theReportPackage);
    return theReportPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReport()
  {
    return reportEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReport_Anomalies()
  {
    return (EReference)reportEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAnomaly()
  {
    return anomalyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAnomaly_Description()
  {
    return (EAttribute)anomalyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getShadowing()
  {
    return shadowingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getShadowing_Shadowing()
  {
    return (EReference)shadowingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getShadowing_Shadowed()
  {
    return (EReference)shadowingEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCompleteness()
  {
    return completenessEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCompleteness_MissedMethod()
  {
    return (EReference)completenessEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCompleteness_SecurityConstraint()
  {
    return (EReference)completenessEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRedundancy()
  {
    return redundancyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRedundancy_Containing()
  {
    return (EReference)redundancyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRedundancy_Contained()
  {
    return (EReference)redundancyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSyntactical()
  {
    return syntacticalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSyntactical_MissedRoles()
  {
    return (EReference)syntacticalEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReachability()
  {
    return reachabilityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReachability_UnreachableResources()
  {
    return (EReference)reachabilityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReportFactory getReportFactory()
  {
    return (ReportFactory)getEFactoryInstance();
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
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    reportEClass = createEClass(REPORT);
    createEReference(reportEClass, REPORT__ANOMALIES);

    anomalyEClass = createEClass(ANOMALY);
    createEAttribute(anomalyEClass, ANOMALY__DESCRIPTION);

    shadowingEClass = createEClass(SHADOWING);
    createEReference(shadowingEClass, SHADOWING__SHADOWING);
    createEReference(shadowingEClass, SHADOWING__SHADOWED);

    completenessEClass = createEClass(COMPLETENESS);
    createEReference(completenessEClass, COMPLETENESS__MISSED_METHOD);
    createEReference(completenessEClass, COMPLETENESS__SECURITY_CONSTRAINT);

    redundancyEClass = createEClass(REDUNDANCY);
    createEReference(redundancyEClass, REDUNDANCY__CONTAINING);
    createEReference(redundancyEClass, REDUNDANCY__CONTAINED);

    syntacticalEClass = createEClass(SYNTACTICAL);
    createEReference(syntacticalEClass, SYNTACTICAL__MISSED_ROLES);

    reachabilityEClass = createEClass(REACHABILITY);
    createEReference(reachabilityEClass, REACHABILITY__UNREACHABLE_RESOURCES);
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
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    shadowingEClass.getESuperTypes().add(this.getAnomaly());
    completenessEClass.getESuperTypes().add(this.getAnomaly());
    redundancyEClass.getESuperTypes().add(this.getAnomaly());
    syntacticalEClass.getESuperTypes().add(this.getAnomaly());
    reachabilityEClass.getESuperTypes().add(this.getAnomaly());

    // Initialize classes and features; add operations and parameters
    initEClass(reportEClass, Report.class, "Report", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getReport_Anomalies(), this.getAnomaly(), null, "anomalies", null, 0, -1, Report.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(anomalyEClass, Anomaly.class, "Anomaly", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAnomaly_Description(), ecorePackage.getEString(), "description", null, 0, 1, Anomaly.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(shadowingEClass, Shadowing.class, "Shadowing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getShadowing_Shadowing(), ecorePackage.getEObject(), null, "shadowing", null, 0, 1, Shadowing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getShadowing_Shadowed(), ecorePackage.getEObject(), null, "shadowed", null, 0, 1, Shadowing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(completenessEClass, Completeness.class, "Completeness", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCompleteness_MissedMethod(), ecorePackage.getEObject(), null, "missedMethod", null, 0, -1, Completeness.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCompleteness_SecurityConstraint(), ecorePackage.getEObject(), null, "securityConstraint", null, 0, 1, Completeness.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(redundancyEClass, Redundancy.class, "Redundancy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRedundancy_Containing(), ecorePackage.getEObject(), null, "containing", null, 0, 1, Redundancy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRedundancy_Contained(), ecorePackage.getEObject(), null, "contained", null, 0, 1, Redundancy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(syntacticalEClass, Syntactical.class, "Syntactical", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSyntactical_MissedRoles(), ecorePackage.getEObject(), null, "missedRoles", null, 0, -1, Syntactical.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(reachabilityEClass, Reachability.class, "Reachability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getReachability_UnreachableResources(), ecorePackage.getEObject(), null, "unreachableResources", null, 0, -1, Reachability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //ReportPackageImpl
