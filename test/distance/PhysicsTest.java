package distance;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PhysicsTest {
  @Test
  public void testVelocity() {
    // Instantiate physics
    Physics physics = new Physics();

    // Instantiate points
    Point3D one = new Point3D(1, 1, 1);
    Point3D two = new Point3D(1, 4, 5);

    // Test correct usage
    assertEquals(2.5, physics.velocity(one, two, 1), 0.1);

    // Test error elapsedTime

  }
}