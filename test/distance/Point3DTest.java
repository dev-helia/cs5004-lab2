package distance;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Point3DTest {

  @Test
  public void testConstructor() {
    // Test default constructor
    Point3D point1 = new Point3D();
    assertEquals(0, point1.getX(), 0);
    assertEquals(0, point1.getY(), 0);
    assertEquals(0, point1.getZ(), 0);

    // Test complete constructor
    Point3D point2 = new Point3D(1, 2, 3);
    assertEquals(1, point2.getX(), 0);
    assertEquals(2, point2.getY(), 0);
    assertEquals(3, point2.getZ(), 0);

    // Test copy constructor
    Point3D point3 = new Point3D(4, 4, 4);
    Point3D point4 = new Point3D(point3);
    assertEquals(4, point4.getX(), 0);
    assertEquals(4, point4.getY(), 0);
    assertEquals(4, point4.getZ(), 0);
  }

  @Test
  public void testDistanceTo() {
    Point3D point1 = new Point3D(4, 1, 3);
    Point3D point2 = new Point3D(4, 4, 7);
    assertEquals(5.0, point1.distanceTo(point2),0);
  }

  @Test
  public void testGetX() {
    Point3D point1 = new Point3D(1, 1, 1);
    assertEquals(1, point1.getX(), 0);
  }

  @Test
  public void testGetY() {
    Point3D point1 = new Point3D(1, 1, 1);
    assertEquals(1, point1.getY(), 0);
  }

  @Test
  public void testGetZ() {
    Point3D point1 = new Point3D(1, 1, 1);
    assertEquals(1, point1.getZ(), 0);
  }

  @Test
  public void testEquals() {
    Point3D point1 = new Point3D(1, 1, 1);
    Point3D point2 = new Point3D(1, 1, 1);
    assertEquals(point1, point2);
  }

}
