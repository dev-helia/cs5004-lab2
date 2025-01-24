package distance;

/**
 * The Physics class provides utility methods for physical calculations.
 * This includes calculating velocity based on displacement and time.
 */
public class Physics {

  /**
   * Calculates the average velocity given two points and an elapsed time.
   * Formula: velocity = displacement / elapsedTime
   *
   * @param one the starting point (Point3D object)
   * @param two the ending point (Point3D object)
   * @param elapsedTime the time interval (must be greater than 0)
   * @return the average velocity
   * @throws IllegalArgumentException if elapsedTime is <= 0
   */
  public static double velocity(Point3D one, Point3D two, double elapsedTime) {
    // Check if the elapsed time is valid
    if (elapsedTime <= 0) {
      throw new IllegalArgumentException("Elapsed time must be greater than 0. Provided: "
              + elapsedTime);
    }
    // Calculate displacement using the distanceTo method from Point3D
    double distance = one.distanceTo(two);
    // Return the average velocity
    return distance / elapsedTime;
  }

  /**
   * Main method to test the functionality of the Physics class.
   */
  public static void main(String[] args) {
    try {
      // Create two points
      Point3D one = new Point3D(); // Default point at (0, 0, 0)
      Point3D two = new Point3D(1, 1, 1); // Point at (1, 1, 1)

      // Calculate and print the displacement between the two points
      System.out.println("Displacement = " + one.distanceTo(two));

      // First velocity calculation (valid elapsedTime)
      double velocity = Physics.velocity(one, two, 5);
      System.out.println("Prof. Keith is on the move! His Velocity = " + velocity);

      // Second velocity calculation (invalid elapsedTime, will throw an exception)
      velocity = Physics.velocity(one, two, 0); // Invalid elapsedTime
      System.out.println("Velocity = " + velocity); // This line will not execute

    } catch (IllegalArgumentException e) {
      // Handle the exception and print the error message
      System.out.println("Encountered an error: " + e.getMessage());
    }
  }
}
