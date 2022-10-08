class A {
  private int x, y;

  A() {
    x = y = 0;
  }

  A(int x1, int y1) {
    x = x1;
    y = y1;
  }
}

public class ToString {
  public static void main(String[] args) {
    A a1 = new A(5, 6);
    System.out.println(a1);// toString() of Object class is called
    String s1 = "Object a1 is " + a1; // concat object with string
    // again toString() is called
    System.out.println(s1);

  }
}
