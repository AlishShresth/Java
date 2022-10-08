import p1.A;

class A {
  private int x;
  private int y;

  void setdata(int x1, int y1) {
    x = x1;
    y = y1;
  }

  void display() {
    System.out.println(x + "\t" + y);
  }
}

public class ClassWithMemberMethods {
  public static void main(String[] args) {
    A a1 = new A();
    A a2 = new A();
    // a1.x = 10; error as x is private
    a1.setdata(10, 20);
    a2.setdata(5, 7);
    a1.display();
    a2.display();
  }
}
