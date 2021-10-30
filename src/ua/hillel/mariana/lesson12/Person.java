package ua.hillel.mariana.lesson12;

public class Person {

  public static int COUNT;

  private String name;
  private int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
    COUNT++;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void birthday() {
    age++;
    System.out.println("Happy birthday!");
  }

  public static void printCount() {
    System.out.println("persons: " + COUNT);
  }

}
