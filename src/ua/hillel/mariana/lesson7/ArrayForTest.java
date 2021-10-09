package ua.hillel.mariana.lesson7;

import java.util.Scanner;

public class ArrayForTest {

  public static void main(String[] args) {

    /*
    1. Пользователь вводит размер массива
    2. Вы создаете массив строк
    3. Заполняете массив строк данными, которые вводит пользователь в консоли
    4. Вывести значение массива в консоль


     */

    Scanner scanner = new Scanner(System.in);

    System.out.println("Input array size:");
    int size = scanner.nextInt();

    int[] numbers = new int[size];
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = i * 2;
    }

    for (int i = 0; i < numbers.length; i++) {
      System.out.print(numbers[i] + ", ");
    }


  }

}
