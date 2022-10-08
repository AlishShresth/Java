class Shape {
  void getdata() {
    System.out.println("getdata() of Shape");
  }

  void area() {
    System.out.println("area() of Shape");
  }

  void display() {
    System.out.println("display() of Shape");
  }
}

class Circle extends Shape {
  void getdata() {
    System.out.println("getdata() of Circle");
  }

  void area() {
    System.out.println("area() of Circle");
  }

  void display() {
    System.out.println("display() of cirlce");
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

public class DynamicMethodBinding {
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
