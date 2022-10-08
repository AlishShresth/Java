import java.util.Scanner;

public class StringBufferr {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string: ");
    StringBuffer sb1 = new StringBuffer(sc.next());
    // Sorting
    for (int i = 0; i < sb1.length() - 1; i++) {
      for (int j = i + 1; j < sb1.length(); j++) {
        if (sb1.charAt(i) > sb1.charAt(j)) {
          char t = sb1.charAt(i);
          sb1.setCharAt(i, sb1.charAt(j));
          sb1.setCharAt(j, t);
        }
      }
    }
    System.out.println(sb1);
  }
}
