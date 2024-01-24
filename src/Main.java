public class Main {

  public static void main(String[] args) {
    Problems projectEuler = new Problems();

    System.out.println(projectEuler.m3or5());

//    for (int i = 0; i < 15; i++){
//      System.out.println(projectEuler.fib(i));
//    }

//    System.out.println(projectEuler.fib(3));

    System.out.println(projectEuler.evenFibNum());

    System.out.println(projectEuler.largestPrimeFactor());

    // Personal Notes
    var drinkSize = CupSize.LARGE;
    System.out.println(
      "You ordered coffee in " + drinkSize + " size and that is " + drinkSize.getOunces()
        + " ounces");

    // Review File IO

  }
}