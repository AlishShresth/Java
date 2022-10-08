class A {
  int x;
  static int y;

  static int sum(int a, int b) {
    // y=5; no error static method can access static variable
    // x=10; error static method can't access instance variable
    // A a1=new A();
    // a1.x=10;No error as static method can access instance variable through
    // objects
    // this.x=10; error as staic method can't access this or super keyword
    int c;
    c = a + b;
    return c;

  }

  static float avg(int a, int b) {
    return (float) (a + b) / 2;
  }
}

public class staticMethod {
  public static void main(String[] args) {
    System.out.println(A.sum(5, 6));// static methods can be called through class name
    System.out.println(A.avg(5, 6));
    A a1 = new A();
    System.out.println(a1.sum(5, 6));// static methods can also be called through objects
  }
}
