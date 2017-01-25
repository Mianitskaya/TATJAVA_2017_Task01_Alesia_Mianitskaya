package com.epam;


import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * start point of the program
 * count value of function on the interval [a, b] with step - h
 * accuracy of calculation of the argument 1 degree
 */
public class Main {
  /**
   * enter left, right edges and step
   *
   * @param args command line argument
   */
  public static void main(String[] args) {
    try {
      System.out.println("Please, enter left, right edges and step to degrees, " +
                          "\naccuracy of calculation of the argument 1 degree: ");
      double a = enterA();
      double b = enterB();
      double h = enterStep();
      if (checkData(a, b, h)) {
        getResult(a, b, h);
      } else {
        System.out.println("It is not valid data.");
      }
    } catch (InputMismatchException e) {
      System.out.println("It is not valid data.");
    }
  }

  /**
   * enter left edge
   *
   * @return left edge
   */
  public static double enterA() {
    Scanner scanner = new Scanner(System.in);
    return scanner.nextDouble();
  }

  /**
   * enter right edge
   *
   * @return right edge
   */
  public static double enterB() {
    Scanner scanner = new Scanner(System.in);
    return scanner.nextDouble();
  }

  /**
   * enter step for calculating argument of function
   *
   * @return step
   */
  public static double enterStep() {
    Scanner scanner = new Scanner(System.in);
    return scanner.nextDouble();
  }

  /**
   * count and print value of function on the interval [a, b] with step - h
   *
   * @param a left edge
   * @param b right edge
   * @param h step
   */
  public static void getResult(double a, double b, double h) {
    System.out.println("Argument Function");
    while (a <= b) {
      double functionValue = Math.pow(Math.sin(Math.toRadians(a)), 2) - Math.cos(Math.toRadians(2 * a));
      System.out.println(a + "     " + functionValue);
      a = Math.round(a + h);
    }
  }

  /**
   * check entered data on [a, b] is interval and h is step
   *
   * @param a left edge
   * @param b right edge
   * @param h step
   * @return true if [a, b] is interval and h is step, otherwise false
   */
  public static boolean checkData(double a, double b, double h) {
    return b > a && h < b;
  }
}
