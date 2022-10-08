public class SumArr {
  public static void main(String[] args) {
    int arr[] = { 10, 20, 30, 40, 50 };
    int n = arr.length, sum = 0;
    for (int i = 0; i < n; i++) {
      sum += arr[i];

    }
    System.out.println("Sum = " + sum);
  }
}
