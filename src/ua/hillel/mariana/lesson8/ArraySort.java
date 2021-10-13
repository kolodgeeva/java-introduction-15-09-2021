package ua.hillel.mariana.lesson8;

import java.util.Arrays;

public class ArraySort {

  public static void main(String[] args) {

    int[] numbers = new int[1000000];

    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = (int) (Math.random() * 100);
    }

    long start, end;

    start = System.currentTimeMillis();

    for (int i = 0; i < numbers.length; i++) {
      for (int j = 1; j < numbers.length - i; j++) {
        if (numbers[j - 1] > numbers[j]) {
          int temp = numbers[j - 1];
          numbers[j - 1] = numbers[j];
          numbers[j] = temp;
        }
      }
    }

    end = System.currentTimeMillis();

    System.out.println("Duration: " + (end - start));
    //System.out.println(Arrays.toString(numbers));

  }

}
