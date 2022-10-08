public class WordCount {
  public static void main(String[] args) {
    String s1 = "   Mohan  Das Karam Chand Gandhi";
    boolean flag = false;
    int count = 0;
    for (int i = 0; i < s1.length(); i++) {
      if (s1.charAt(i) == ' ')
        flag = false;
      else {
        if (flag == false) {
          flag = true;
          count++;
        }
      }
    }
    System.out.println("No. of Words = " + count);
  }

}
