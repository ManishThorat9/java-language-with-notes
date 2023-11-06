public class datatype {
  public static void main(String1[] args) {
    // int myNum7 = 5; // Integer (whole number)
    // float myFloatNum = 5.99f; // Floating point number
    // char myLetter = 'D'; // Character
    // boolean myBool = true; // Boolean
    // java.lang.String myText = "Hello"; // String

    /*
     * Data Type Size Description
     * byte 1 byte Stores whole numbers from -128 to 127
     * short 2 bytes Stores whole numbers from -32,768 to 32,767
     * int 4 bytes Stores whole numbers from -2,147,483,648 to 2,147,483,647
     * long 8 bytes Stores whole numbers from -9,223,372,036,854,775,808 to
     * 9,223,372,036,854,775,807
     * float 4 bytes Stores fractional numbers. Sufficient for storing 6 to 7
     * decimal digits
     * double 8 bytes Stores fractional numbers. Sufficient for storing 15 decimal
     * digits
     * boolean 1 bit Stores true or false values
     * char 2 bytes Stores a single character/letter or ASCII values
     * 
     */

    byte myNum3 = 100;
    System.out.println(myNum3);

    short myNum1 = 5000;
    System.out.println(myNum1);

    int myNum2 = 100000;
    System.out.println(myNum2);

    long myNum4 = 15000000000L;
    System.out.println(myNum4);

    float myNum5 = 5.75f;
    System.out.println(myNum5);

    double myNum6 = 19.99d;
    System.out.println(myNum6);

    boolean isJavaFun = true;
    System.out.println(isJavaFun);

    char myGrade = 'B';
    System.out.println(myGrade);

    char myVar1 = 65, myVar2 = 66, myVar3 = 67;
    System.out.println(myVar1);
    System.out.println(myVar2);
    System.out.println(myVar3);

    String greeting = "Hello World";
    System.out.println(greeting);

    /*
     * Widening Casting (automatically) - converting a smaller type to a larger type
     * size
     * byte -> short -> char -> int -> long -> float -> double
     * 
     * Narrowing Casting (manually) - converting a larger type to a smaller size
     * type
     * double -> float -> long -> int -> char -> short -> byte
     */

    int myInt = 9;
    double myDouble = myInt; // Automatic casting: int to double

    System.out.println(myInt); // Outputs 9
    System.out.println(myDouble); // Outputs 9.0

    double myDouble1 = 9.78d;
    int myInt2 = (int) myDouble; // Manual casting: double to int

    System.out.println(myDouble1); // Outputs 9.78
    System.out.println(myInt2); // Outputs 9

  }
}
