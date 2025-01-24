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

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Point3D point3D = (Point3D) obj;
    return x == point3D.x && y == point3D.y && z == point3D.z;
  }

  @Override
  public int hashCode() {
    int result = 17; // 一个初始的非零值，任意选择
    result = 31 * result + x; // 31 是个常用的质数，用于生成独特的哈希值
    result = 31 * result + y;
    result = 31 * result + z;
    return result;
  }

}
