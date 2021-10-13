package ua.hillel.mariana.lesson8;

import java.util.Arrays;

public class BinarySearch {

  public static void main(String[] args) {
    int[] numbers = {4, 6, 2, 5, 10, 1, 65, 43, 8, 34};
    int key = 5;
    Arrays.sort(numbers);
    System.out.println(Arrays.toString(numbers));
    int low = 0;
    int high = numbers.length - 1;
    while(low <= high) {
      int mid = (low + high) / 2;
      if (numbers[mid] < key) {
        low = mid + 1;
      } else if (numbers[mid] > key) {
        high = mid - 1;
      } else {
        System.out.println(mid);
        break;
      }
    }
  }
}
