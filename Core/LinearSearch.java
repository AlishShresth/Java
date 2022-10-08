import java.util.Scanner;

public class LinearSearch {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n;
    System.out.println("Enter size of array: ");
    n = sc.nextInt();
    int a[] = new int[n];
    System.out.println("Enter elements of array:");
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    int key;
    System.out.println("Enter value to search: ");
    key = sc.nextInt();
    for (int i = 0; i < n; i++) {
      if (a[i] == key) {
        System.out.println(key + " found at index " + i);
        System.exit(1);
      }
    }
    System.out.println(key + " not found!");
  }
}
