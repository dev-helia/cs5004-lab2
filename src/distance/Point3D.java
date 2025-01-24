package distance;

/**
 * The Point3D class represents a point in 3D space.
 * This is an immutable class; all fields are final and there are no setter methods.
 */
public class Point3D {
  // Coordinates in 3D space, immutable
  private final int x;
  private final int y;
  private final int z;

  /**
   * Default constructor: initializes the point at the origin (0, 0, 0).
   */
  public Point3D() {
    x = 0;
    y = 0;
    z = 0;
  }

  /**
   * Parameterized constructor: initializes the point with given x, y, and z coordinates.
   * @param x the x-coordinate
   * @param y the y-coordinate
   * @param z the z-coordinate
   */
  public Point3D(int x, int y, int z) {
    this.x = x;
    this.y = y;
    this.z = z;
  }

  /**
   * Copy constructor: creates a new point identical to the given point.
   * @param p another Point3D object
   */
  public Point3D(Point3D p) {
    this.x = p.x;
    this.y = p.y;
    this.z = p.z;
  }

  /**
   * Calculates the Euclidean distance from this point to another point.
   * Formula: sqrt((x2 - x1)^2 + (y2 - y1)^2 + (z2 - z1)^2)
   * @param other the destination point
   * @return the distance between the two points
   */
  public double distanceTo(Point3D other) {
    double dx = x - other.x; // Difference in x-coordinates
    double dy = y - other.y; // Difference in y-coordinates
    double dz = z - other.z; // Difference in z-coordinates
    return Math.sqrt(dx * dx + dy * dy + dz * dz); // Return the Euclidean distance
  }

  /**
   * Gets the x-coordinate.
   * @return the x-coordinate of this point
   */
  public int getX() {
    return x;
  }

  /**
   * Gets the y-coordinate.
   * @return the y-coordinate of this point
   */
  public int getY() {
    return y;
  }

  /**
   * Gets the z-coordinate.
   * @return the z-coordinate of this point
   */
  public int getZ() {
    return z;
  }

  /**
   * Compares this point with another object for equality.
   * @param obj another object to compare
   * @return true if the given object is a Point3D with the same x, y, and z values
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true; // If same object, return true
    if (obj == null || getClass() != obj.getClass()) return false; // Check class type
    Point3D point3D = (Point3D) obj; // Cast to Point3D
    return x == point3D.x && y == point3D.y && z == point3D.z; // Compare coordinates
  }

  /**
   * Generates a hash code for this point.
   * Uses a prime number (31) for better hash distribution.
   * @return the hash code of this point
   */
  @Override
  public int hashCode() {
    int result = 17; // Initial non-zero value
    result = 31 * result + x; // Include x-coordinate
    result = 31 * result + y; // Include y-coordinate
    result = 31 * result + z; // Include z-coordinate
    return result; // Return final hash code
  }
}
