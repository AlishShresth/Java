class A {
  int x;
  static int y;
}

public class staticVariable {
  public static void main(String[] args) {
    A a1 = new A();
    A a2 = new A();
    A a3 = new A();
    a1.x = 10;
    a1.y = 20;
    a2.x = 11;
    a2.y = 21;
    a3.x = 12;
    a3.y = 22;
    System.out.println(a1.x + "\t" + a1.y);
    System.out.println(a2.x + "\t" + a2.y);
    System.out.println(a2.x + "\t" + a2.y);
  }
}
