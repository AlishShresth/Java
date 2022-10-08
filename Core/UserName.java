public class UserName {
  static String userName(String email) {
    int a = email.indexOf('@');
    String name = email.substring(0, a);
    return name;
  }

  public static void main(String[] args) {
    String email = "cresthaalish@gmail.com";
    String name = userName(email);
    System.out.println(name);
  }
}
