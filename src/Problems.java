import java.util.Stack;

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
   */

  public String largestPalindromeProduct() {
    problemNumber++;
    System.out.println(header + problemNumber);

    // method starts here
    Stack<Integer> number1 = new Stack<>();
    Stack<Integer> number2 = new Stack<>();
    for (int i = 999; i >= 100; i--) {
      number1.push(i);
      number2.push(i);
    }

    int result1 = 0, result2 = 0, product = 0;

    while (!number1.isEmpty()) {
      int i = number1.pop();
      number2.pop();

      for (int j : number2) {
        int tempProduct = i * j;
        if (product >= tempProduct) {
          break;
        }

        if (isPalindrome(tempProduct)) {
          product = tempProduct;
          result1 = i;
          result2 = j;
        }
      }
    }

    return Integer.toString(result1) + "," + Integer.toString(result2) + "," + product;
  }

  public boolean isPalindrome(int number) {
    String checkNumber = Integer.toString(number);
    String reversed = new StringBuilder(checkNumber).reverse().toString();
    return checkNumber.equals(reversed);
  }

  public <T> T add(T a, T b) {
    return add(a, b);
  }
}
