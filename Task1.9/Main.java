/**
 * Start point of the program
 */
public class Main {
  private static int K = 2;

  /**
   * create and fill new array from two arrays
   *
   * @param args command line argument
   */
  public static void main(String[] args) {
    int[] arrayFirst = {0, 5, 7, 8, 12};
    int[] arraySecond = {1, 3, 25, 8, 12, 89, 10};
    int[] arrayResult = fillNewArray(arrayFirst, arraySecond);
    printNewArray(arrayResult);
  }

  /**
   * print array
   *
   * @param arrayResult array for printing
   */
  private static void printNewArray(int[] arrayResult) {
    for (int i = 0; i < arrayResult.length; i++) {
      System.out.println(arrayResult[i]);
    }
  }

  /**
   * form array from two arrays, new array is
   * second array between k and k+1 elements first array
   *
   * @param arrayFirst  first array
   * @param arraySecond second array
   * @return new array
   */
  public static int[] fillNewArray(int[] arrayFirst, int[] arraySecond) {
    int[] arrayResult = new int[arrayFirst.length + arraySecond.length];
    for (int i = 0; i < K + 1; i++) {
      arrayResult[i] = arrayFirst[i];
    }
    int index = K - 1;
    for (int i = K + arraySecond.length - 1; i < arrayResult.length; i++) {
      arrayResult[i] = arrayFirst[index];
      index++;
    }
    for (int i = 0; i < arrayResult.length; i++) {
      if (i <= arraySecond.length - 1) {
        arrayResult[K + 1] = arraySecond[i];
      }
      K++;
    }
    return arrayResult;
  }
}
