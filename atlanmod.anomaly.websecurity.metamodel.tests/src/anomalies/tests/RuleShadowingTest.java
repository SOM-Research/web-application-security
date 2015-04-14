/**
 */
package anomalies.tests;

import anomalies.AnomaliesFactory;
import anomalies.RuleShadowing;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Rule Shadowing</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RuleShadowingTest extends AnomalyTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RuleShadowingTest.class);
	}

	/**
	 * Constructs a new Rule Shadowing test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleShadowingTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Rule Shadowing test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RuleShadowing getFixture() {
		return (RuleShadowing)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AnomaliesFactory.eINSTANCE.createRuleShadowing());
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

} //RuleShadowingTest
