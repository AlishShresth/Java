class A {
  private int x;

  A() {
    x = 0;
  }

  A(int x1) {
    x = x1;
  }

  void display() {
    System.out.print(x);
  }
}

class B extends A {
  private int y;

  B() {
    super();
    // x=0; error as x is private
    y = 0;
  }

  B(int x1, int y1) {
    super(x1);
    // x=x1; error as x is private
    y = y1;
  }

  void display() {
    super.display();
    System.out.print(y);
  }
}

public class SingleInheritance {
  public static void main(String[] args) {
    B b1 = new B();
    b1.display();
    B b2 = new B(10, 20);
    b2.display();
  }
}
