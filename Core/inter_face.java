interface Math_function {
  void display(int x);
}

class Sqrt implements Math_function {
  public void display(int x) {
    System.out.println("sqrt of x = " + Math.sqrt(x));
  }
}

class Log implements Math_function {
  public void display(int x) {
    System.out.println("log of x = " + Math.log(x));
  }
}

public class inter_face {
  public static void main(String[] args) {
    Math_function f1 = new Sqrt();
    Math_function f2 = new Log();
    f1.display(27);
    f2.display(3);
    Math_function f3;
    f3 = f1; // polymorphism (assign the reference)
    f3.display(30);
    f3 = f2;// polymorphism
    f3.display(5);
  }

}
