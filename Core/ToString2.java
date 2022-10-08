class A {
  private int x, y;

  A() {
    x = y = 0;
  }

  A(int x1, int y1) {
    x = x1;
    y = y1;
  }

  public String toString() {
    return (x + "," + y);
  }
}

public class ToString2 {
  public static void main(String[] args) {
    A a1 = new A(5, 6);
    System.out.println(a1);
    String s1 = "Object a1 is " + a1;
    System.out.println(s1);
  }
}
