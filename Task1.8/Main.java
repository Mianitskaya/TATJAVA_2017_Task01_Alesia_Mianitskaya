import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * start point of the program,
 * count sum integer array's elements multiple of K
 */
public class Main {
  private static int N = 5;
  private static int K = 2;

  /**
   * print sum integer array's elements multiple of K
   *
   * @param args command line argument
   */
  public static void main(String[] args) {
    try {
      System.out.println("Sum elements multiple of " + K + ": " + countSum(enterArray()));
    } catch (InputMismatchException e) {
      System.out.println("It is not integer number.");
    }

  }

  /**
   * enter array's elements
   *
   * @return array
   */
  public static int[] enterArray() {
    System.out.println("Please, enter " + N + " integer array's elements: ");
    Scanner scanner = new Scanner(System.in);
    int[] array = new int[N];
    for (int i = 0; i < N; i++) {
      array[i] = scanner.nextInt();
    }
    return array;
  }

  /**
   * count sum integer array's elements multiple of K
   *
   * @param array - array with N integer numbers
   * @return sum
   */
  public static int countSum(int array[]) {
    int sumElements = 0;
    for (int i = 0; i < array.length; i++) {
      if (array[i] % K == 0) {
        sumElements += array[i];
      }
    }
    return sumElements;
  }
}
