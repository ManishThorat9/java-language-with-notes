public class method {

  public static void main(String[] args) {
    /*
     * A method is a block of code which only runs when it is called.
     * Methods are used to perform certain actions, and they are also known
     * functions.
     * Information can be passed to methods as parameter. Parameters act as
     * variables inside the method.
     * 
     */
    FirstMethod();
    ParameterMethod("Manish");
    MultiparameterMethod("Manish", 2);
    System.out.println("The power of 3 rest to 7 is "+valuereturningfmethod(3, 7));
    System.out.println(" Finding the maximum value " + methodoverloading(3, 3) + " " + methodoverloading(3,5.4) );

  }

  static void FirstMethod() { // with out parameter
    System.out.println("This is the first method");
  }

  static void ParameterMethod(String name) {
    System.out.println(name + " !Thank you for calling in main function ");
  }
  static void MultiparameterMethod(String name, int value) {
    System.out.println(name+"! Thank you for calling me "+value+" time in main function ");
  }
  /*
   * Return Values
   * The void keyword, used in the examples above, indicates that the method
   * should not return a value. If you want the method to return a value, you can
   * use a primitive data type (such as int, char, etc.) instead of void, and use
   * the return keyword inside the method:
   */
  static int valuereturningfmethod(int n,int r){
    return (int) (Math.pow(n, r)); 
  }

  /*
   * Method Overloading
   * With method overloading, multiple methods can have the same name with different parameters
   */
  static int methodoverloading(int b,int c){
      return Math.max(b,c);
  }
  static double methodoverloading(double b,double c){
      return Math.max(b,c);
  }

}
