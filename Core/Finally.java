public class Finally {
  public static void main(String[] args) {
    int a[] = { 5, 10 };
    int b = 5;
    try {
      int x = a[2] / b - a[1];
    } catch (ArithmeticException e) {
      System.out.println("Division by zero");
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Array Index error");
    } catch (ArrayStoreException e) {
      System.out.println("Wrong Data Type");
    } finally {
      System.out.println("Always Execute");
    }
    int y = a[1] / a[0];
    System.out.println("y = " + y);
  }
}
