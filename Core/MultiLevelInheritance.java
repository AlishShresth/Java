class A {
  private int x;

  A() {
    x = 0;
  }

  A(int x1) {
    x = x1;
  }

  void display() {
    System.out.println(x);
  }
}

class B extends A {
  private int y;

  B() {
    super();
    y = 0;
  }

  B(int x1, int y1) {
    super(x1);
    y = y1;

  }

  void display() {
    super.display();
    System.out.println(y);
  }
}

class C extends B {
  private int z;

  C() {
    super();
    z = 0;
  }

  C(int x1, int y1, int z1) {
    super(x1, y1);
    z = z1;
  }

  void display() {
    super.display();
    System.out.println(z);
  }
}

public class MultiLevelInheritance {
  public static void main(String[] args) {
    C c1 = new C();
    c1.display();
    C c2 = new C(10, 20, 30);
    c2.display();
  }
}
