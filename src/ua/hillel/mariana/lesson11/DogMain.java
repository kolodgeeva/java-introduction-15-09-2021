package ua.hillel.mariana.lesson11;

public class DogMain {

  public static void main(String[] args) {

    Dog dog = new Dog();
    dog.run();

    System.out.println(dog.name);
    System.out.println(dog.age);

    dog.name = "Bobik";
    dog.age = 3;

    System.out.println(dog.name);
    System.out.println(dog.age);

    Dog dog2 = dog;

    System.out.println(dog);
    System.out.println(dog2);

    Dog dog3 = new Dog();

    System.out.println(dog3);

    dog2.name = "Sharik";

    System.out.println("dog name: " + dog.name);
    System.out.println("dog2 name: " + dog2.name);

  }

}
