package ua.hillel.mariana.lesson5;


import java.util.Scanner;

public class ScannerTest {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    System.out.println("input number:");

    int number = in.nextInt();
    System.out.println("you input " + number);

    System.out.println("input string:");
    String input = in.next();
    System.out.println("you input " + input);

  }

}
