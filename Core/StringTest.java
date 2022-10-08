import java.util.*;

public class StringTest {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s1, s2;
    System.out.println("Enter a string");
    s1 = sc.next();
    System.out.println("Enter string to search");
    s2 = sc.next();
    int ans = s1.indexOf(s2);
    if (ans == -1)
      System.out.println("Not Found");
    else
      System.out.println("found at pos " + ans);
  }
}
