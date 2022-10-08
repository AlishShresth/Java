class Outer {
  static class Inner {
    int member_inner = 7;

    Inner() {
      // member_outer=5; error
      Outer obj = new Outer();
      obj.member_outer = 5;
      System.out.println(obj.member_outer);
    }
  }

  private int member_outer;

  void prn() {
    Inner obj = new Inner();
    System.out.println(obj.member_inner);
  }
}

public class staticNestedClass {
  public static void main(String[] args) {
    Outer out_obj = new Outer();
    out_obj.prn();
  }
}
