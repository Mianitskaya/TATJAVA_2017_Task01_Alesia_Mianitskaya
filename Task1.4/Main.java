package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Start point of the program
 */
public class Main {

  /**
   * print true if coordinates (x,y) belong to the area
   * otherwise false
   *
   * @param args command line argument
   */
  public static void main(String[] args) {
    System.out.println("Please, enter coordinates: ");
    try {
      double x = enterX();
      double y = enterY();
      System.out.println(findPoint(x, y));
    } catch (InputMismatchException e) {
      System.out.println("Wrong data.");
    }
  }

  /**
   * enter x - coordinate
   *
   * @return x
   */
  public static double enterX() {
    Scanner scanner = new Scanner(System.in);
    return scanner.nextDouble();
  }

  /**
   * enter y - coordinate
   *
   * @return y
   */
  public static double enterY() {
    Scanner scanner = new Scanner(System.in);
    return scanner.nextDouble();
  }

  /**
   * find point with coordinate (x,y) to the area
   *
   * @param x x - coordinate
   * @param y y - coordinate
   * @return true if point (x, y) belong to the area
   * otherwise false
   */
  public static boolean findPoint(double x, double y) {
    boolean foundInFirstArea = (x <= 2 && x >= -2) && (y >= 0 && y <= 4);
    boolean foundInSecondArea = (x <= 4 && x >= -4) && (y >= -3 && y <= 0);
    return (foundInFirstArea || foundInSecondArea);
  }
}
