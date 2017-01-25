import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Start point of the program
 */
public class Main {
  /**
   * create matrix for filling
   *
   * @param args command line argument
   */
  public static void main(String[] args) {
    try {
      int n = enterOrder();
      if (checkEven(n)) {
        int[][] matrix = new int[n][n];
        fillMatrix(matrix);
        printMatrix(matrix);
      } else {
        System.out.println("It is not even number.");
      }
    } catch (InputMismatchException e) {
      System.out.println("It is not number.");
    }
  }

  /**
   * enter order matrix
   *
   * @return order matrix
   */
  public static int enterOrder() {
    System.out.println("Please, enter even order matrix: ");
    Scanner scanner = new Scanner(System.in);
    return scanner.nextInt();
  }

  /**
   * check order matrix is even or not
   *
   * @param n - order matrix
   * @return true if order is even, otherwise false
   */
  public static boolean checkEven(int n) {
    return n % 2 == 0;
  }

  /**
   * fill specified matrix
   *
   * @param matrix - matrix for filling
   */
  public static int[][] fillMatrix(int[][] matrix) {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix.length; j++) {
        if (i % 2 == 0) {
          matrix[i][j] = j + 1;
        } else {
          matrix[i][j] = matrix.length - j;
        }
      }
    }
    return matrix;
  }

  /**
   * print matrix on console
   *
   * @param matrix - matrix for printing
   */
  public static void printMatrix(int matrix[][]) {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix.length; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.print("\n");
    }
  }
}
