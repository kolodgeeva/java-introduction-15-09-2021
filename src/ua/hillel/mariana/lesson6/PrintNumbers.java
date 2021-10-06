package ua.hillel.mariana.lesson6;

import java.util.Scanner;

public class PrintNumbers {

  public static void main(String[] args) {

    // печатать в консоль числа, которые вводит пользователь, пока он не введет слово стоп
    Scanner scanner = new Scanner(System.in);
    String input;

    // input == "стоп" так не работает, используйте метод equals
    while(!(input = scanner.nextLine()).equals("стоп")) {
      int number = Integer.parseInt(input);
      System.out.println("you input number: " + number);
    }

  }

}
