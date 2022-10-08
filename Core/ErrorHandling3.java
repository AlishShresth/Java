public class ErrorHandling3 {
  public static void main(String[] args) {
    try {
      int a = 10, b = 2, c = 2, d;
      System.out.println("Before Exception");
      d = a / (b - c);
      System.out.println("This will not print");
    } catch (ArithmeticException e) {
      System.out.println("After Exception");
      System.out.println("error: Division by Zero");
      System.out.println(e.getMessage());
      System.out.println(e);
      e.printStackTrace();
    }
  }
}
