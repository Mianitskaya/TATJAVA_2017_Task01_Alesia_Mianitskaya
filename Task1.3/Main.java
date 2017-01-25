package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * count area and perimeter of the right triangle
 */
public class Main {
  /**
   * start point of the program
   * output area and perimeter of the right triangle
   *
   * @param args command line argument
   */
  public static void main(String[] args) {
    try {
      double[] cathetus = enterCathetus();
      RightTriangle rightTriangle = new RightTriangle(cathetus[0], cathetus[1]);
      if (rightTriangle.checkCathetus(cathetus[0], cathetus[1])){
        System.out.println("Area is: " + rightTriangle.getArea());
        System.out.println("Perimeter is: " + rightTriangle.getPerimeter());
      } else {
        System.out.println("Both cathetus have to be positive.");
      }
    } catch (InputMismatchException e) {
      System.out.println("It is not numbers.");
    }
  }

  /**
   * enter cathetus of right triangle
   *
   * @return cathetus of right triangle
   */
  public static double[] enterCathetus() {
    System.out.println("Please, enter two cathetus: ");
    double[] cathetus = new double[2];
    Scanner scanner = new Scanner(System.in);
    cathetus[0] = scanner.nextDouble();
    cathetus[1] = scanner.nextDouble();
    return cathetus;
  }
}
