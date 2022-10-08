public class ErrorHandling4 {
  public static void main(String[] args) {
    try {
      int a = args.length;
      System.out.println("Before Exception");
      int b = 58 / a;
      int c[] = { 1 };
      c[47] = 100;
      System.out.println("AFter Exception");
    } catch (ArithmeticException e) {
      System.out.println("Divide by zero :" + e);

    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Array Index out of bounds :" + e);
    }
    System.out.println("AFter try/catch block");
  }
}
