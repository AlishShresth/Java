public class ErrorHandling2 {
  public static void main(String args[]) {
    int a = 10, b = 2, c = 2, d;
    try {
      System.out.println("Before Exception ");
      d = a / (b - c);
      System.out.println("This Will Not Print");
    } catch (ArithmeticException e) {
      System.out.println("After Exception");
      System.out.println("Error: Division by Zero");
    }
  }
}
