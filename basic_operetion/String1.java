
public class String1 {
  public static void main(String[] args) {
    String greeting = "Hello";
    System.out.println(greeting.toUpperCase());
    System.out.println(greeting.toLowerCase());
    String txt = "Please locate where 'locate' occurs!";
    System.out.println(txt.indexOf("where"));
    System.out.println(greeting + " " + txt);
    System.out.println(greeting.compareTo("Hello"));
    System.out.println(greeting.concat("manish"));
    System.out.println(greeting.concat(greeting));

  }
}
