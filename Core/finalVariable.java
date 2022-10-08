class A {
  void m1() {
    System.out.println("Inside m1()");
  }
}

public class finalVariable {
  public static void main(String[] args) {
    final int x = 10;// cannot change
    final int y;// Varialbe y not initialized so we can initilize y later
    y = 20;// Now y is initialized so after this we can't change its value
    // y =30; Error
    System.out.println(x);
    System.out.println(y);
    final A a1 = new A(); // a1 is a constant reference so we cannot assign reference of any other object
                          // in a1
    a1.m1();
    A a2 = new A();
    // a1 = a2;// error

  }
}
