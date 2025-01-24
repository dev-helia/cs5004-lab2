package distance;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

/**
 * Test class for the Physics utility class.
 */
public class PhysicsTest {

  @Test
  public void testVelocity() {
    // Instantiate points
    Point3D one = new Point3D(1, 1, 1); // Point at (1, 1, 1)
    Point3D two = new Point3D(1, 4, 5); // Point at (1, 4, 5)

    // Test correct usage of velocity
    assertEquals(5.0, Physics.velocity(one, two, 1), 0.1); // Expected velocity = 5.0

    // Test invalid elapsedTime (should throw exception)
    assertThrows(
            IllegalArgumentException.class,
            () -> Physics.velocity(one, two, 0) // Invalid elapsedTime = 0
    );
  }
}
