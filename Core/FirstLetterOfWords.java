public class FirstLetterOfWords {
  public static void main(String[] args) {
    String s1 = "Mohan Das Karam Chand Gandhi";
    boolean flag = false;
    for (int i = 0; i < s1.length(); i++) {
      if (s1.charAt(i) == ' ')
        flag = false;
      else {
        if (flag == false) {
          flag = true;
          System.out.print(s1.charAt(i) + " ");
        }
      }
    }

  }
}
