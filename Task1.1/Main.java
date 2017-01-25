package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * start point of the program
 */
public class Main {
  /**
   * print true if sum first two digit
   * equal to sum last two digit
   * otherwise print false
   *
   * @param args command line argument
   */
  public static void main(String[] args) {
    int number = enterNumber();
    boolean check = checkDigit(number);
    if (check) {
      System.out.println(checkSum(number));
    } else {
      System.out.println("It is not four-digit number.");
    }

  }

  /**
   * enter number
   *
   * @return number if it is number, otherwise 0
   */
  public static int enterNumber() {
    try {
      System.out.println("Please enter four-digit number: ");
      Scanner scanner = new Scanner(System.in);
      int number = scanner.nextInt();
      return number;
    } catch (InputMismatchException e) {
      return 0;
    }
  }

  /**
   * check at the four-digit number
   *
   * @param number - entered number
   * @return true if number is four-digit otherwise false
   */
  public static boolean checkDigit(int number) {
    return number > 399 && number < 10000;
  }

  /**
   * check equality sum
   *
   * @param number - entered number
   * @return true if sum first two digit
   * equal to sum last two digit, otherwise false
   */
  public static boolean checkSum(int number) {
    int first = (number - (number % 1000)) / 1000;
    int second = ((number % 1000) - (number % 100)) / 100;
    int third = ((number % 100) - (number % 10)) / 10;
    int fourth = number % 10;
    return (first + second) == (third + fourth);
  }
}
