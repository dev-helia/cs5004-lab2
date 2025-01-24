package distance;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * Test class for the Point3D class.
 * Covers constructors, distance calculation, getters, and equality.
 */
public class Point3DTest {

  @Test
  public void testConstructor() {
    // Test default constructor
    Point3D point1 = new Point3D();
    assertEquals(0, point1.getX());
    assertEquals(0, point1.getY());
    assertEquals(0, point1.getZ());

    // Test parameterized constructor
    Point3D point2 = new Point3D(1, 2, 3);
    assertEquals(1, point2.getX());
    assertEquals(2, point2.getY());
    assertEquals(3, point2.getZ());

    // Test copy constructor
    Point3D point3 = new Point3D(4, 4, 4);
    Point3D point4 = new Point3D(point3);
    assertEquals(4, point4.getX());
    assertEquals(4, point4.getY());
    assertEquals(4, point4.getZ());
  }

  @Test
  public void testDistanceTo() {
    Point3D point1 = new Point3D(4, 1, 3);
    Point3D point2 = new Point3D(4, 4, 7);
    // Distance = sqrt((0)^2 + (3)^2 + (4)^2) = 5.0
    assertEquals(5.0, point1.distanceTo(point2), 0.01);
  }

  @Test
  public void testGetters() {
    Point3D point = new Point3D(1, 2, 3);
    assertEquals(1, point.getX());
    assertEquals(2, point.getY());
    assertEquals(3, point.getZ());
  }

  @Test
  public void testEquals() {
    // Test equality for the same coordinates
    Point3D point1 = new Point3D(1, 1, 1);
    Point3D point2 = new Point3D(1, 1, 1);
    assertTrue(point1.equals(point2));
    assertEquals(point1, point2);

    // Test inequality for different coordinates
    Point3D point3 = new Point3D(2, 2, 2);
    assertFalse(point1.equals(point3));
    assertNotEquals(point1, point3);

    // Test comparison with null
    assertFalse(point1.equals(null));

    // Test comparison with an object of a different type
    assertFalse(point1.equals("NotAPoint3D"));
  }

  @Test
  public void testHashCode() {
    // Test hashCode consistency
    Point3D point1 = new Point3D(1, 1, 1);
    Point3D point2 = new Point3D(1, 1, 1);
    assertEquals(point1.hashCode(), point2.hashCode());

    // Test hashCode difference for different coordinates
    Point3D point3 = new Point3D(2, 2, 2);
    assertNotEquals(point1.hashCode(), point3.hashCode());
  }
}
