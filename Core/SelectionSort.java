import java.util.Scanner;

public class SelectionSort {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n;
    System.out.println("Enter size of array");
    n = sc.nextInt();
    int arr[] = new int[n];
    // array input
    for (int i = 0; i < n; i++) {
      System.out.println("Enter element " + (i + 1) + " ");
      arr[i] = sc.nextInt();
    }
    // sorting
    for (int i = 0; i < n - 1; i++) {
      for (int j = i + 1; j < n; j++) {
        if (arr[i] > arr[j]) {
          int t = arr[i];
          arr[i] = arr[j];
          arr[j] = t;
        }
      }
    }
    // output
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
