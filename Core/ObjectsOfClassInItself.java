public class ObjectsOfClassInItself {
  private int x;
  private int y;

  void setdata(int x1, int y1) {
    x = x1;
    y = y1;

  }

  void display() {
    System.out.println(x + "\t" + y);
  }

  public static void main(String[] args) {
    ObjectsOfClassInItself a1 = new ObjectsOfClassInItself();
    ObjectsOfClassInItself a2 = new ObjectsOfClassInItself();
    a1.setdata(10, 20);
    a2.setdata(5, 7);
    a1.display();
    a2.display();

  }
}
