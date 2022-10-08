public class GCD {
  int gcd(int x, int y) {
    while (x > 1 && y > 1)
      if (x == y) {
        return x;
      } else if (x > y) {
        x = x - y;
      } else if (y > x) {
        y = y - x;
      }
    return 1;
  }

  public static void main(String[] args) {
    GCD g = new GCD();
    int x = 35, y = 56;
    System.out.println(g.gcd(x, y));
  }
}
