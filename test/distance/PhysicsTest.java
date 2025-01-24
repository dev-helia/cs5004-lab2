package distance;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

/**
 * Test class for the Physics class.
 * Tests the velocity calculation and exception handling.
 */
public class PhysicsTest {

  /**
   * Tests the velocity method in the Physics class.
   * Verifies correct calculation and exception handling.
   */
  @Test
  public void testVelocity() {
    // Instantiate points
    Point3D one = new Point3D(1, 1, 1);
    Point3D two = new Point3D(1, 4, 5);

    // Test correct usage
    assertEquals(5.0, Physics.velocity(one, two, 1), 0.1);

    // Test invalid elapsedTime (should throw an exception)
    assertThrows(IllegalArgumentException.class, () -> Physics.velocity(one, two, 0));
  }
}
