package ua.hillel.mariana.lesson7;

import java.util.Arrays;

public class ArrayTricks {

  public static void main(String[] args) {

    int[] numbers = {10, 2, 35, 4, 5};

    for (int number : numbers) {
      System.out.print(number + " ");
    }

    System.out.println();
    System.out.println("Arrays.toString");

    System.out.println(Arrays.toString(numbers));

    Arrays.sort(numbers);
    System.out.println(Arrays.toString(numbers));



  }


}
