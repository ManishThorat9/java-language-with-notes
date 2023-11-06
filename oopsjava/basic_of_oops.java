package oopsjava;

public class basic_of_oops {

  public static class Main {
    int x = 5;

    public static void main(String[] args) {
      /*
       * So, a class is a template for objects, and an object is an instance of a
       * class.
       * When the individual objects are created, they inherit all the variables and
       * methods from the class.
       */
      Main object = new Main();
      System.out.println("Value of x in Object: " + object.x); // Value of x in Object: 5

    }
  }
}