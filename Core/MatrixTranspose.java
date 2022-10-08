import java.util.Scanner;

public class MatrixTranspose {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int row, column;
    System.out.println("Enter number of rows: ");
    row = sc.nextInt();
    System.out.println("Enter number of columns: ");
    column = sc.nextInt();
    int arr[][] = new int[row][column];
    // input
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < column; j++) {
        arr[i][j] = sc.nextInt();
      }
    }
    // transpose
    for (int i = 0; i < column; i++) {
      for (int j = 0; j < row; j++) {
        System.out.print(arr[j][i] + "  ");
      }
      System.out.println();
    }
  }
}
