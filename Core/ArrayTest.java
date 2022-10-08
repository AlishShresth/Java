public class ArrayTest {
  static void update(int brr[]) {
    brr[0] = 25;
  }

  public static void main(String[] args) {
    int arr[] = { 2, 3, 43, 5, 56 };
    update(arr);
    System.out.println(java.util.Arrays.toString(arr));
  }
}