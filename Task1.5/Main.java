package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * start point of the program
 */
public class Main {
  private static int AMOUNT_NUMBERS = 3;

  /**
   * enter three number
   *
   * @param args command line argument
   */
  public static void main(String[] args) {
    System.out.println("Please, enter three number: ");
    try {
      doPow(enterNumbers());
    } catch (InputMismatchException e) {
      System.out.println("It is not number.");
    }
  }

  /**
   * enter three number
   *
   * @return array with three numbers
   */
  public static double[] enterNumbers() {
    Scanner scanner = new Scanner(System.in);
    double[] numbers = new double[AMOUNT_NUMBERS];
    for (int i = 0; i < AMOUNT_NUMBERS; i++) {
      numbers[i] = scanner.nextDouble();
    }
    return numbers;
  }

  /**
   * Output the number to the second power, if is positive
   * and if is negative number to the fourth power
   *
   * @param numbers array with three numbers
   */
  public static void doPow(double[] numbers) {
    for (int i = 0; i < AMOUNT_NUMBERS; i++) {
      System.out.println((numbers[i] < 0) ? Math.pow(numbers[i], 4) : Math.pow(numbers[i], 2));
    }
  }
}
