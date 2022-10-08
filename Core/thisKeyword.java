public class thisKeyword {
  private int x;
  private int y;

  void setdata(int x, int y) {
    this.x = x;// this.x is the class member and x is local variable
    this.y = y;
  }

  void display() {
    System.out.println(x + "\t" + y);

  }

  public static void main(String[] args) {
    thisKeyword a1 = new thisKeyword();
    a1.setdata(10, 20);
    a1.display();
  }
}
