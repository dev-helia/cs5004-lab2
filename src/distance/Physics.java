package distance;

public class Physics {
  public static double velocity(Point3D one, Point3D two, double elapsedTime) {
    if (elapsedTime <= 0) {
      throw new IllegalArgumentException("Elapsed time must be greater than 0. Provided: " + elapsedTime);
    }
    double distance = one.distanceTo(two);
    return distance / elapsedTime;
  }

  public static void main(String[] args) {
    try {
      Point3D one = new Point3D();
      Point3D two = new Point3D(1, 1, 1);

      System.out.println("Displacement = " + one.distanceTo(two));

      double velocity = Physics.velocity(one, two, 0);
      System.out.println("Prof. Keith is on the move! His Velocity = " + velocity);

      velocity = Physics.velocity(one, two, 5); // 这里会抛异常
      System.out.println("Velocity = " + velocity); // 不会执行到这里
    } catch (IllegalArgumentException e) {
      System.out.println("Encountered an error: " + e.getMessage());
      return;
    }
  }
}
