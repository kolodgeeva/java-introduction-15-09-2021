package ua.hillel.mariana.lesson5;

import java.util.Scanner;

public class SwitchTest {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int monthNumber = scanner.nextInt();

    switch (monthNumber) {
      case 1:
      case 2:
        System.out.println("Winter");
        break;
      case 3:
      case 4:
      case 5:
        System.out.println("Spring");
        break;
      default:
        System.out.println("I don't know such season");
    }



  }

}
