package ua.hillel.mariana.lesson11;

public class DogComparator {

  public static void main(String[] args) {

    Dog dog1 = new Dog("Knopa");
    Dog dog2 = dog1;
    Dog dog3 = new Dog("Nitshe", 20);
    Dog dog4 = new Dog("Knopa");

    System.out.println(dog1);
    System.out.println(dog2);
    System.out.println(dog3);
    System.out.println(dog4);

    compare(dog1, dog2, "dog1 == dog2: Links are equal", "dog1.equals(dog2): Values are equal");
    compare(dog1, dog3, "dog1 == dog3: Links are equal", "dog1.equals(dog3): Values are equal");
    compare(dog1, dog4, "dog1 == dog4: Links are equal", "dog1.equals(dog4): Values are equal");

  }

  private static void compare(Dog dog1, Dog dog2, String s, String s2) {
    if (dog1 == dog2) {
      System.out.println(s);
    }

    if (dog1.equals(dog2)) {
      System.out.println(s2);
    }
  }

}
