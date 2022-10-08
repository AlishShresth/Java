public class VariableLengthArguments {
  static void show(int... x) {
    for (int a : x) {
      System.out.print(a + " ");

    }
    System.out.println();
  }

  static void showList(int start,String... s) {
    for (int i = 0; i < s.length; i++) {
      System.out.println((i + 1) + " " + s[i]);
    }

  }

  public static void main(String[] args) {
    showList(10,"Alish", "Arpan", "Abhinav");
    show();
    show(10);
    show(10, 20, 30);
    show(new int[] { 10, 20, 30, 40, 50, 60 });
  }
}
