import java.util.Random;

public class RandomTest {
  public static void main(String[] args) {
    Random r1 = new Random();
    for (int i = 1; i < 10; i++) {
      System.out.println(Math.abs(r1.nextInt()));
    }
  }

}
