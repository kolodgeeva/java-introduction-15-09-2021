package ua.hillel.mariana.lesson7;

public class ForTest {

  public static void main(String[] args) {

    /*
     *
     **
     ***
     ****
     *****
     ******
     *******
     ********
     *********
     **********
     */

    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }


  }

}
