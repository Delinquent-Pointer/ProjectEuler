public class Problems {
  private int problemNumber = 0;
  private final String header = "Project Euler Problem #";
  private final String answer = "Answer: ";

//  Problems (){
//    problemNumber++;
//    System.out.println(header + problemNumber);
//  }

  /** problem 1 */
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
}
