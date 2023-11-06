public class loops {
  public static void main(String[] args) {
    // if loop
    {
      int time = 20;
      if (time < 18) {
        System.out.println("Good day.");
      } else {
        System.out.println("Good evening.");
      }
    }

    {
      // short if loop
      int time = 20;
      String result = (time < 18) ? "Good day." : "Good evening.";
      System.out.println(result);
    }

    // Switch
    int day = 4;
    switch (day) {
      case 6:
        System.out.println("Today is Saturday");
        break;
      case 7:
        System.out.println("Today is Sunday");
        break;
      default:
        System.out.println("Looking forward to the Weekend");

        // Outputs "Looking forward to the Weekend"
    }

    // while loop
    int i = 0;
    while (i < 5) {
      System.out.println(i);
      i++;
    }
    // do while
    {
      int j = 0;
      do {
        System.out.println(j);
        j++;
      } while (j < 5);
    }


    for (int k = 0; k <= 10; k = k + 2) {
      System.out.println(k);
    }
    {
      
    for (int m = 1; m <= 2; m++) {
      System.out.println(); // Executes 2 times

      // Inner loop
      for (int j = 1; j <= 3; j++) {
        System.out.print("*"); // Executes 6 times (2 * 3)
      }
    }
  }
  String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
  for (String l : cars) {
    System.out.println(l);
  }
  



  String[] cars1 = {"Volvo", "BMW", "Ford", "Mazda"};
  for(int s = 0;s<cars.length;s++){
    System.out.println(cars1[s]);
  }
}
}
