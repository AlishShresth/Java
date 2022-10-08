public class methodOverloading {
  private int x, y;

  void setdata(int x1) {
    x = y = x1;
  }

  void setdata(int x1, int y1) {
    x = x1;
    y = y1;
  }

  void display() {
    System.out.println(x + "\t" + y);
  }

  public static void main(String[] args) {
    methodOverloading a1 = new methodOverloading();
    a1.setdata(5);
    a1.display();
    methodOverloading a2 = new methodOverloading();
    a2.setdata(10, 20);
    a2.display();
  }
}
