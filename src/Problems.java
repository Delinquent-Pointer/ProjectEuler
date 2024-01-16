public class Problems {

  private int problemNumber = 0;
  private final String header = "Project Euler Problem #";
  private final String answer = "Answer: ";

//  Problems (){
//    problemNumber++;
//    System.out.println(header + problemNumber);
//  }

  /**
   * problem 1
   */
  public String m3or5() {
    problemNumber++;
    System.out.println(header + problemNumber);
    int sum = 0;
    for (int curr = 1; curr < 1000; curr++) {
      if (curr % 3 == 0 || curr % 5 == 0) {
        sum += curr;
      }
    }
    return answer + sum;
  }

  /**
   * problem 2
   */
  public String evenFibNum() {
    problemNumber++;
    System.out.println(header + problemNumber);

    int sum = 0;
    int i = 0;
    while (sum <= 4000000) {
      if (fib(i) % 2 == 0) {
        sum += fib(i);
        i++;
      }
      i++;
    }

    return answer + sum;
  }

  public int fib(int num) {
    if (num <= 0) {
      return 0; // fib can't be 0 or below
    } else if (num == 1) {
      return 1;
    } else {
      return fib(num - 1) + fib(num - 2);
    }
  }

  public String largestPrimeFactor(){
    problemNumber++;
    System.out.println(header + problemNumber);


    return answer;
  }

  public boolean isPrime (int number){

    return false;
  }
}
