package ua.hillel.mariana.lesson5;

import java.util.Scanner;

public class Employee {

  public static final int MONTH_IN_YEAR = 12;

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int salary = scanner.nextInt();
    int experience = scanner.nextInt();

    int total = salary * MONTH_IN_YEAR;
    if (experience >= 5) {
      //total = total + 100;
      total += 100;
    }

    System.out.println("you will get " + total + "$");
  }

}
