package ua.hillel.mariana.lesson12;

public class PersonTest {

  public static void main(String[] args) {

    Person person = null;
    Person person1 = new Person("test", 35);

    if (person != null) {
      System.out.println(person.equals(person1));
    } else {
      System.out.println("Person does not exist");
    }

    System.out.println("person1 name: " + person1.getName());
    System.out.println("person1 age: " + person1.getAge());

    person1.setAge(36);
    person1.setName("old test");

    System.out.println("person1 name: " + person1.getName());
    System.out.println("person1 age: " + person1.getAge());

    person1.birthday();
    //Person.birthday(); doesn't work, because method is not static

    System.out.println("person1 age: " + person1.getAge());

    Person.printCount();
    //System.out.println(person1.COUNT); bad style

    Person person2 = new Person("new", 10);

    Person.printCount();

  }

}
