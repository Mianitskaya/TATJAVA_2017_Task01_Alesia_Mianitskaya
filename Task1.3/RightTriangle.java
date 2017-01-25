package com.company;

/**
 * class right triangle
 */
public class RightTriangle {
  private double firstCathetus;
  private double secondCathetus;

  /**
   * constructor of the class
   *
   * @param firstValue  - value of the first cathetus
   * @param secondValue - value of the second cathetus
   */
  public RightTriangle(double firstValue, double secondValue) {
    firstCathetus = firstValue;
    secondCathetus = secondValue;
  }

  /**
   * count area of the triangle
   *
   * @return value of the area
   */
  public double getArea() {
    return (firstCathetus * secondCathetus) / 2;
  }

  /**
   * count perimeter of the triangle
   *
   * @return value of the perimeter
   */
  public double getPerimeter() {
    double hypotenuse = Math.sqrt(Math.pow(firstCathetus, 2) + Math.pow(secondCathetus, 2));
    return firstCathetus + secondCathetus + hypotenuse;
  }

  /**
   * check cathetus for positivity
   *
   * @param firstValue  - value of the first cathetus
   * @param secondValue - value of the second cathetus
   * @return true if both cathetus more than zero, other wise false
   */
  public boolean checkCathetus(double firstValue, double secondValue) {
    return firstValue > 0 && secondValue > 0;
  }
}
