import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Problems {

  private int problemNumber = 0;
  private final String header = "Project Euler Problem #";
  private final String answer = "Answer: ";

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

  public String largestPrimeFactor() {
    problemNumber++;
    System.out.println(header + problemNumber);

    return answer;
  }

  public boolean isPrime(int number) {

    return false;
  }

  /**
   * problem 4 start with 999 x 999 = largest number possible if product answer is not palindrome
   * then keep using pop() to find the largest
   * <p>
   * This is just fun brute forcing an answer
   */

  public String largestPalindromeProduct() {
    problemNumber++;
    System.out.println(header + problemNumber);

    // method starts here
    HashMap<Integer, String> results = new HashMap<>();

    for (int i = 100; i <= 999; i++) {
      for (int j = i; j <= 999; j++) {
        int product = i * j;
        if (isPalindrome(product)) {
          results.put(product, i + "," + j + "," + product);
        }
      }
    }

    Entry<Integer, String> findMax = null;
    for (Entry<Integer, String> entry : results.entrySet()) {
      if (findMax == null || entry.getKey() > findMax.getKey()) {
        findMax = entry;
      }
    }

    assert findMax != null;
    return findMax.getValue();
  }

  public boolean isPalindrome(int number) {
    String checkNumber = Integer.toString(number);
    String reversed = new StringBuilder(checkNumber).reverse().toString();
    return checkNumber.equals(reversed);
  }
} // END OF CLASS
