package ua.hillel.mariana.lesson6;

public class WhileTest {

  public static void main(String[] args) {

    // print numbers from 10 to 0
    // только четные

    int count = 10;
    while(count > 0) {
      if (count % 2 == 0) {
        System.out.println(count);
      }
      count--;
    }
  }

}
