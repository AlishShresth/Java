class A {
  int x;
  int y;
}

class ClassWithMembersOnly {
  public static void main(String args[]) {
    A a1, a2;// Reference variables
    a1 = new A();// Object creation
    a2 = new A();
    a1.x = 10;
    a1.y = 20;
    a2.x = 5;
    a2.y = 6;
    System.out.println(a1.x + "\t" + a1.y);
    System.out.println(a2.x + "\t" + a2.y);
  }
}