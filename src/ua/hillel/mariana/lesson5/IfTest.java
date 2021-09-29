package ua.hillel.mariana.lesson5;

import java.util.Scanner;

public class IfTest {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    System.out.println("input number:");

    int number = in.nextInt();
    System.out.println("you input " + number);

    if (number == 0) {
      System.out.println(number + " == 0");
    } else if (number > 0) {
      System.out.println(number + " > 0");
    } else {
      System.out.println(number + " < 0");
    }

    if (number > 100 && number < 500) {

    }

    System.out.println("end");

  }


}
