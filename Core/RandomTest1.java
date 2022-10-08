//Program to print any 10 random numbers using class Random of package java.util without using import statement

public class RandomTest1 {
  public static void main(String[] args) {
    java.util.Random r1 = new java.util.Random();
    for (int i = 1; i <= 10; i++) {
      System.out.println(Math.abs(r1.nextInt()));
    }
  }
}
