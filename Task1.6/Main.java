package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Start point of the program
 */
public class Main {
  private static int AMOUNT_NUMBERS = 3;

  /**
   * count and print sum minimum and maximum number of three
   *
   * @param args command line argument
   */
  public static void main(String[] args) {
    System.out.println("Please, enter three number: ");
    try {
      double[] numbers = enterNumbers();
      System.out.println("Sum max and min is: " + (findMin(numbers) + findMax(numbers)));
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
   * find minimum element in array
   *
   * @param numbers array contains three numbers
   * @return minimum element
   */
  public static double findMin(double[] numbers) {
    double minValue = numbers[0];
    for (int i = 1; i < numbers.length; i++) {
      if (numbers[i] < minValue) {
        minValue = numbers[i];
      }
    }
    return minValue;
  }

  /**
   * find maximum element in array
   *
   * @param numbers array contains three numbers
   * @return maximum element
   */
  public static double findMax(double[] numbers) {
    double maxValue = numbers[0];
    for (int i = 1; i < numbers.length; i++) {
      if (numbers[i] > maxValue) {
        maxValue = numbers[i];
      }
    }
    return maxValue;
  }
}
