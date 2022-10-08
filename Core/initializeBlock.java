class A {
  int x;
  static int y;
  { // Initialize block to initilize instance variables
    x = 10;

  }
  static { // static block to initialize static variables
    y = 5;
  }
}

public class initializeBlock {
  public static void main(String[] args) {
    A a1 = new A();
    System.out.println(a1.x + " " + a1.y);
  }
}
