package distance;

public class Point3D {
  private final int x;
  private final int y;
  private final int z;

  public Point3D() {
    x = 0;
    y = 0;
    z = 0;
  }

  public Point3D(int x, int y, int z) {
    this.x = x;
    this.y = y;
    this.z = z;
  }

  public Point3D(Point3D p) {
    this.x = p.x;
    this.y = p.y;
    this.z = p.z;
  }

  public double distanceTo(Point3D other) {
    double dx = x - other.x;
    double dy = y - other.y;
    double dz = z - other.z;
    return Math.sqrt(dx * dx + dy * dy + dz * dz);
  }
  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public int getZ() {
    return z;
  }

  public boolean equals(Point3D p) {
    return x == p.x && y == p.y && z == p.z;
  }
}
