public class BinarySearch {
  public static void BSearch(int a[], int key, int start, int end) {
    if (start > end) {
      System.out.println(key + " not found");
      return;
    }
    int mid = (start + end) / 2;

    if (key == a[mid]) {
      System.out.println(key + " found at index " + mid);
      return;
    } else if (key < a[mid]) {
      BSearch(a, key, start, mid - 1);
    } else {
      BSearch(a, key, mid + 1, end);
    }

  }

  public static void main(String[] args) {
    // BinarySearch bs = new BinarySearch();
    int a[] = { 1, 3, 5, 6, 8, 9 };
    BSearch(a, 1, 0, a.length - 1);
  }
}
