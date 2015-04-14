/**
 */
package anomalies.tests;

import anomalies.AnomaliesFactory;
import anomalies.ResourceReachability;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Resource Reachability</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResourceReachabilityTest extends AnomalyTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ResourceReachabilityTest.class);
	}

	/**
	 * Constructs a new Resource Reachability test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceReachabilityTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Resource Reachability test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ResourceReachability getFixture() {
		return (ResourceReachability)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AnomaliesFactory.eINSTANCE.createResourceReachability());
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

} //ResourceReachabilityTest
