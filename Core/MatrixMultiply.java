import java.util.Scanner;
public class MatrixMultiply {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int r1, c1;
    System.out.println("Enter number of rows of first matrix: ");
    r1 = sc.nextInt();
    System.out.println("Enter number of column of first matrix: ");
    c1 = sc.nextInt();
    int r2, c2;
    System.out.println("Enter number of rows of second matrix: ");
    r2 = sc.nextInt();
    System.out.println("Enter number of column of second matrix: ");
    c2 = sc.nextInt();
    if (c1 != r2) {
      System.out.println("Cannot multiply");
      System.exit(1);
    }
    int m1[][] = new int[r1][c1];
    for (int i = 0; i < r1; i++) {
      for (int j = 0; j < c1; j++) {
        m1[i][j] = sc.nextInt();
      }
    }
    int m2[][] = new int[r2][c2];
    for (int i = 0; i < r2; i++) {
      for (int j = 0; j < c2; j++) {
        m2[i][j] = sc.nextInt();
      }
    }
    int m3[][] = new int[r1][c2];
    for (int i = 0; i < r1; i++) {
      for (int j = 0; j < c2; j++) {
        for(int k=0;k<c1;k++){
          m3[i][j] = m1[i][k] * m2[k][j];
        }
      }
    }
  }
}
