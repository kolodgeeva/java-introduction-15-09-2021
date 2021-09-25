package ua.hillel.mariana.lesson3;

public class TypeCasting {

  public static void main(String[] args) {

    int intNumber = 1000;
    long longNumber = 100;
   /* System.out.println("longNumber before auto casting: " + longNumber);

    longNumber = intNumber;
    System.out.println("longNumber after auto casting: " + longNumber);*/

    byte byteNumber = 127;
    short shortNumber = 130;
    /*System.out.println("shortNumber before auto casting: " + shortNumber);

    shortNumber = byteNumber;
    System.out.println("shortNumber after auto casting: " + shortNumber);*/

    System.out.println("byteNumber before manual casting: " + byteNumber);

    byteNumber = (byte) shortNumber;
    System.out.println("byteNumber after manual casting: " + byteNumber);


    /*
    a * b
    a / b
    a - b
    a + b
     */



  }

}
