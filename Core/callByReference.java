class Box {
  private int feet;
  private int inches;

  Box() {
    feet = inches = 0;
  }

  Box(int feet, int inches) {
    this.feet = feet;
    this.inches = inches;
  }

  void display() {
    System.out.println("Feet is " + feet + "\n" + "Inches is " + inches);
  }

  void swap(Box obj) {
    int t;
    t = feet;
    feet = obj.feet;
    obj.feet = t;
    t = inches;
    inches = obj.inches;
    obj.inches = t;
  }
}

public class callByReference {
  public static void main(String[] args) {
    Box b1 = new Box(5, 6);
    Box b2 = new Box(7, 4);
    b1.swap(b2);// Object is passed by reference
    b1.display();
    b2.display();
  }
}
