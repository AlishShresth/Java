abstract class Shape {
  abstract void getdata();

  abstract void area();

  abstract void display();
}

class Circle extends Shape {
  void getdata() {
    System.out.println("getdata() of Circle");
  }

  void area() {
    System.out.println("area() of Circle");
  }

  void display() {
    System.out.println("display() of circle");
  }
}

class Rectangle extends Shape {
  void getdata() {
    System.out.println("getdata() of Rectangle");
  }

  void area() {
    System.out.println("area() of Rectangle");
  }

  void display() {
    System.out.println("display() of Rectangle");
  }
}

public class AbstractClass {
  public static void main(String[] args) {
    // super reference variable can accept sub class object
    // Dynamic binding
    Shape s[] = { new Circle(), new Rectangle() };
    for (int i = 0; i < s.length; i++) {
      s[i].getdata();
      s[i].area();
      s[i].display();
    }
  }
}
