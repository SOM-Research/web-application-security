/**
 */
package org.xtext.anomaly.report.report.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.anomaly.report.report.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReportFactoryImpl extends EFactoryImpl implements ReportFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ReportFactory init()
  {
    try
    {
      ReportFactory theReportFactory = (ReportFactory)EPackage.Registry.INSTANCE.getEFactory(ReportPackage.eNS_URI);
      if (theReportFactory != null)
      {
        return theReportFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ReportFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReportFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case ReportPackage.REPORT: return createReport();
      case ReportPackage.ANOMALY: return createAnomaly();
      case ReportPackage.SHADOWING: return createShadowing();
      case ReportPackage.COMPLETENESS: return createCompleteness();
      case ReportPackage.REDUNDANCY: return createRedundancy();
      case ReportPackage.SYNTACTICAL: return createSyntactical();
      case ReportPackage.REACHABILITY: return createReachability();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Report createReport()
  {
    ReportImpl report = new ReportImpl();
    return report;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Anomaly createAnomaly()
  {
    AnomalyImpl anomaly = new AnomalyImpl();
    return anomaly;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Shadowing createShadowing()
  {
    ShadowingImpl shadowing = new ShadowingImpl();
    return shadowing;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Completeness createCompleteness()
  {
    CompletenessImpl completeness = new CompletenessImpl();
    return completeness;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Redundancy createRedundancy()
  {
    RedundancyImpl redundancy = new RedundancyImpl();
    return redundancy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Syntactical createSyntactical()
  {
    SyntacticalImpl syntactical = new SyntacticalImpl();
    return syntactical;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Reachability createReachability()
  {
    ReachabilityImpl reachability = new ReachabilityImpl();
    return reachability;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReportPackage getReportPackage()
  {
    return (ReportPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ReportPackage getPackage()
  {
    return ReportPackage.eINSTANCE;
  }

} //ReportFactoryImpl
