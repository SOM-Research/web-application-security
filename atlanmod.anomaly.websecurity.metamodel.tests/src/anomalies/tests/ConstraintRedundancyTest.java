/**
 */
package anomalies.tests;

import anomalies.AnomaliesFactory;
import anomalies.ConstraintRedundancy;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Constraint Redundancy</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConstraintRedundancyTest extends AnomalyTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ConstraintRedundancyTest.class);
	}

	/**
	 * Constructs a new Constraint Redundancy test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintRedundancyTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Constraint Redundancy test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ConstraintRedundancy getFixture() {
		return (ConstraintRedundancy)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AnomaliesFactory.eINSTANCE.createConstraintRedundancy());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //ConstraintRedundancyTest
