package ua.hillel.mariana.lesson7;

public class ArrayTest {

  public static void main(String[] args) {

    int[] numbers = new int[10];
    numbers[1] = 50;
    System.out.println(numbers[1]);
    System.out.println(numbers[0]);

    String[] strings = new String[5];
    strings[0] = "new string";
    System.out.println("strings[0] = " + strings[0]);
    System.out.println("strings[1] = " + strings[1]);

    String[] strings2 = strings;
    System.out.println("strings2[0] = " + strings2[0]);

    strings2[0] = "brand new string";
    System.out.println("strings[0] = " + strings[0]);
    System.out.println("strings2[0] = " + strings2[0]);

    System.out.println("strings link " + strings);
    System.out.println("strings2 link " + strings2);



  }

}
