package ua.hillel.mariana.lesson11;

public class MethodTest {

  public static void main(String[] args) {

    int n = 10;

    System.out.println("number in main " + n);

    testPrimitive(n);

    System.out.println("number in main after method call " + n);

    Dog dog = new Dog();
    dog.name = "Ted";

    System.out.println("dog in main " + dog.name);

    testObject(dog);

    System.out.println("dog in main after method call " + dog.name);

  }


  public static void testPrimitive(int number) {

    System.out.println("number in method " + number);

    number *= 2;

    System.out.println("number in method after modification " + number);

  }

  public static void testObject(Dog dog) {

    System.out.println("dog in method " + dog.name);

    dog.name = dog.name + " new";

    System.out.println("dog in method after modification " + dog.name);

  }

}
