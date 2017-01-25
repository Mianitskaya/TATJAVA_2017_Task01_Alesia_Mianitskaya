package mypackage;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * count value of expression
 */
public class Main {

  private final static int TOTAL_NUMBERS = 3;

  /**
   * start point of the program
   *  print value of the expression
   *
   * @param args command line argument
   */
  public static void main(String[] args) {
    try {
      double[] numbers = enterNumbers();
      if (validate(numbers)) {
        System.out.println("Result is: " + countExpression(numbers));
      } else {
        System.out.println("Numbers are not valid for expression.");
      }
    } catch (InputMismatchException e) {
      System.out.println("It is not number.");
    }
  }

  /**
   * enter three numbers
   *
   * @return array contains three numbers
   */
  public static double[] enterNumbers() {
    double[] numbers = new double[TOTAL_NUMBERS];
    System.out.println("Please, enter three numbers: ");
    Scanner scanner = new Scanner(System.in);
    for (int i = 0; i < TOTAL_NUMBERS; i++) {
      numbers[i] = scanner.nextDouble();
    }
    return numbers;
  }

  /**
   * count value of expression
   *
   * @param numbers - array contains numbers
   * @return value of expression
   */
  public static double countExpression(double numbers[]) {
    double firstPart = (numbers[1] + Math.sqrt(Math.pow(numbers[1], 2) + 4 * numbers[0] * numbers[2])) / (2 * numbers[0]);
    double secondPart = Math.pow(numbers[0], 3) * numbers[2] - Math.pow(numbers[1], -2);
    return firstPart - secondPart;
  }

  /**
   * validate numbers for specified expression
   *
   * @param numbers - array contains numbers
   * @return true if numbers are valid, otherwise false
   */
  public static boolean validate(double[] numbers) {
    return !Double.isInfinite(1 / numbers[0]) && (Math.pow(numbers[1], 2) + 4 * numbers[0] * numbers[2]) > 0;
  }
}
