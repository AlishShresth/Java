import java.util.Scanner;

class Complex {
  private int real, imag;

  Complex() {
    real = imag = 0;
  }

  Complex(int real, int imag) {
    this.real = real;
    this.imag = imag;
  }

  void getdata() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter real: ");
    real = sc.nextInt();
    System.out.println("Enter imag:");
    imag = sc.nextInt();
  }

  void display() {
    if (imag >= 0)
      System.out.println(real + "+" + imag + "i");
    else
      System.out.println(real + "-" + imag + "i");

  }

  Complex sum(Complex c) {
    Complex t = new Complex();
    t.real = real + c.real;
    t.imag = imag + c.imag;
    return t;
  }

  Complex mult(Complex c) {
    Complex t = new Complex();
    t.real = real * c.real - imag * c.real;
    t.imag = real * c.imag + imag * c.real;
    return t;
  }
}

public class example5_8 {
  public static void main(String[] args) {
    Complex c1 = new Complex();
    Complex c2 = new Complex();
    Complex c3 = null, c4 = null;
    c1.getdata();
    c2.getdata();
    c3 = c1.sum(c2);
    System.out.print("Sum is ");
    c3.display();
    c4 = c1.mult(c2);
    System.out.print("Product is ");
    c4.display();

  }
}
