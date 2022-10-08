class A {
  int x;

  void setX(int x1) {
    x = x1;

  }

  void displayX() {
    System.out.println(x);
  }

}

class B extends A {
  int y;

  void setY(int y1) {
    y = y1;
  }

  void displayY() {
    System.out.println(y);
  }
}

public class Inheritance {
  public static void main(String[] args) {

    A a1 = new A();// 4 bytes
    a1.setX(5);
    a1.displayX();
    B b1 = new B();// 8 bytes
    b1.setX(10);
    b1.setY(20);
    b1.displayX();
    b1.displayY();
  }
}
