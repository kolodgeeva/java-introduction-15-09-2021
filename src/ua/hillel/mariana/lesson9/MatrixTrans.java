package ua.hillel.mariana.lesson9;

public class MatrixTrans {

  public static void main(String[] args) {

    int[][] original = {{6, 4, 24}, {1, -9, 8}};
    int[][] target = new int[3][2];

    for (int i = 0; i < original.length; i++) {
      for (int j = 0; j < original[i].length; j++) {
        target[j][i] = original[i][j];
        System.out.print(target[j][i] + " ");
      }
      System.out.println();
    }
  }

}
