package ua.hillel.mariana.lesson3;

public class MathOperations {

  public static void main(String[] args) {

    float a = 19;
    float b = 6;

    float c = a + b;
    System.out.println("a + b = " + c);

    System.out.println("a - b = " + (a - b));
    System.out.println("a / b = " + (a / b));
    System.out.println("a * b = " + (a * b));
    System.out.println("a % b = " + (a % b));

    a = a + 1;
    System.out.println("a = a + 1: " + a);

    System.out.println("a++: " + a++);
    System.out.println("after a++: " + a);

    System.out.println("++a: " + ++a);

    b = b - 1;
    System.out.println("b = b - 1: " + b);

    System.out.println("b--: " + b--);
    System.out.println("after b--: " + b);

    System.out.println("--" + --b);


  }

}
