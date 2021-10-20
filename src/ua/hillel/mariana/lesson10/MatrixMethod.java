package ua.hillel.mariana.lesson10;

public class MatrixMethod {


  public static void main(String[] args) {

    // create matrix n * m
    // create method for create matrix, create matrix
    // create method for printing matrix, print matrix

    int[][] matrix = createMatrix(3, 5);

    printMatrix(matrix);

  }

  public static int[][] createMatrix(int n, int m) {

    int[][] matrix = new int[n][m];

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        matrix[i][j] = i + j;
      }
    }
    return matrix;
  }

  public static void printMatrix(int[][] matrix) {
    for (int[] ints : matrix) {
      for (int anInt : ints) {
        System.out.print(anInt + " ");
      }
      System.out.println();
    }
  }

}
