public class QuadraticRoots {
  public static void main(String[] args) {
    double a = 1;
    double b = 8;
    double c = 16;
    double d = Math.pow(b, 2.0) - (4.0 * a * c);
    if (d == 0) {
      double root = (-b + d) / (2 * a);
      System.out.println("Root= " + root);
    } else if (d > 0) {
      d = Math.sqrt(d);
      double r1 = ((-b) + d) / 2 * a;
      double r2 = ((-b) - d) / 2 * a;
      System.out.println("Root1: " + r1);
      System.out.println("Root2: " + r2);
    } else {
      d = Math.sqrt(Math.abs(d));
      // double r1 = ((-b) + d) / 2 * a;
      // double r2 = ((-b) - d) / 2 * a;
      System.out.println("Root1: " + (-b / (2 * a)) + "+" + (d / (2 * a)) + "i");
      System.out.println("Root2: " + (-b / (2 * a)) + "-" + (d / (2 * a)) + "i");
    }
  }

}
