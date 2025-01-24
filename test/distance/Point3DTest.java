package distance;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * Test class for the Point3D class.
 * Tests constructors, methods, and equality logic.
 */
public class Point3DTest {

  /**
   * Tests the constructors of the Point3D class.
   * Verifies the default, parameterized, and copy constructors.
   */
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

  /**
   * Tests the distanceTo method.
   * Verifies the Euclidean distance between two points.
   */
  @Test
  public void testDistanceTo() {
    Point3D point1 = new Point3D(4, 1, 3);
    Point3D point2 = new Point3D(4, 4, 7);
    assertEquals(5.0, point1.distanceTo(point2), 0.01);
  }

  /**
   * Tests the getter methods.
   * Verifies getX, getY, and getZ return correct coordinates.
   */
  @Test
  public void testGetters() {
    Point3D point = new Point3D(1, 2, 3);
    assertEquals(1, point.getX());
    assertEquals(2, point.getY());
    assertEquals(3, point.getZ());
  }

  /**
   * Tests the equals method.
   * Verifies equality logic for Point3D objects.
   */
  @Test
  public void testEquals() {
    Point3D point1 = new Point3D(1, 1, 1);
    Point3D point2 = new Point3D(1, 1, 1);
    assertTrue(point1.equals(point2));
    assertEquals(point1, point2);

    // Test inequality
    Point3D point3 = new Point3D(2, 2, 2);
    assertFalse(point1.equals(point3));
    assertNotEquals(point1, point3);

    // Test with null
    assertFalse(point1.equals(null));

    // Test with different type
    assertFalse(point1.equals("NotAPoint3D"));
  }

  /**
   * Tests the hashCode method.
   * Verifies consistent hash code generation for Point3D objects.
   */
  @Test
  public void testHashCode() {
    Point3D point1 = new Point3D(1, 1, 1);
    Point3D point2 = new Point3D(1, 1, 1);
    assertEquals(point1.hashCode(), point2.hashCode());

    Point3D point3 = new Point3D(2, 2, 2);
    assertNotEquals(point1.hashCode(), point3.hashCode());
  }
}
