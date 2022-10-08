public class LabeledContinue {
  public static void main(String[] args) {
    outer: for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 5; j++) {
        if (j > i) {
          System.out.println();
          continue outer;
        }
        System.out.print("\t" + (i * j));
      }
    }
  }
}
