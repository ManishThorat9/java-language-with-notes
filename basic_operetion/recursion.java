public class recursion {
  public static void main(String[] args) {
    // hiitorecursion();  
    hiitorecursion(4);
  }
  /*
   * Recursion is when method called it self
   */

  private static void hiitorecursion() {
    System.out.println("hi");
    hiitorecursion();
  }

  private static void hiitorecursion(int a) {
    System.out.println("hi");
    if (a <= 1) {     // if this condition is hit then complier is return to main funtion itself  
      return;
    }
    hiitorecursion(a - 1);
  }
}
