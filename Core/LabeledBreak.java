public class LabeledBreak {
  public static void main(String[] args) {
    boolean t = true;
    first: {
      second: {
        third: {
          System.out.println("Before the break");
          if (t)
            break first;
        }
        System.out.println("This will not be executed");
      }
      System.out.println("This is after second block");
    }
  }
}
