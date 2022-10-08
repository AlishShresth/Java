public class CommandLineArraySort {
  public static void main(String[] args) {
    int n = args.length;
    int a[] = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = Integer.parseInt(args[i]);
    }
    for (int i = 0; i < n - 1; i++) {
      for (int j = i; j < n; j++) {
        if (a[i] > a[j]) {
          int t = a[i];
          a[i] = a[j];
          a[j] = t;
        }
      }
    }
    for (int i = 0; i < n; i++) {
      System.out.print(a[i] + " ");
    }
  }
}
