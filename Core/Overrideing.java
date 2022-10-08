class A {
  int x;

  void set(int x1) {
    x = x1;

  }

  void display() {
    System.out.println(x);
  }
}

class B extends A {
  int y;

  void set(int x1, int y1) // set method of class B is not overriding set method of class A as arguments
                           // are different
  {
    set(x1);// This will call set() of class A
    y = y1;
  }

  void display() // display method of class B is overriding display method of class A
  {
    // display();//This will call display of class B
    super.display();// This will call display of class A
    System.out.println(y);
  }
}

public class Overrideing {
  public static void main(String[] args) {
    B b1 = new B();
    b1.set(10, 20);
    b1.display();

  }
}
