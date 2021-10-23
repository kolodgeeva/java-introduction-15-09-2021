package ua.hillel.mariana.lesson11;

public class Dog {

  public String name;
  public int age;

  public Dog() {
    System.out.println("dog is created");
  }

  public Dog(String name) {
    this.name = name;
  }

  public Dog(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void run() {
    System.out.println(this.name + " is running");
  }

  @Override
  public String toString() {
    return "Dog: name=" + this.name + ", age=" + this.age;
  }

  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof Dog)) {
      return false;
    }
    Dog dog = (Dog) obj;
    return this.name.equals(dog.name) && this.age == dog.age;
  }
}
