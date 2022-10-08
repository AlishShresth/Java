class A {
  private int x;
  private int y;

  A() {
    x = y = 0;

  }

  A(int x1) {
    x = y = x1;
  }

  A(int x1, int y1) {
    x = x1;
    y = y1;
  }

  void display() {
    System.out.println(x + "  " + y);
  }
}

public class constructor {
  public static void main(String[] args) {
    A a1 = new A();
    a1.display();
    A a2 = new A(5);
    a2.display();
    A a3 = new A(10, 20);
    a3.display();
  }
}
