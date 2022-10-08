class Outer {
  class Inner {
    int member_inner = 7;

    Inner() {
      member_outer = 5;
      System.out.println(member_outer);
    }
  }

  private int member_outer;

  Outer() {
    // member_inner = 9; error
    Inner obj = new Inner();
    System.out.println(obj.member_inner);
  }
}

public class nestedClass {
  public static void main(String[] args) {
    Outer out_obj = new Outer();
  }
}
