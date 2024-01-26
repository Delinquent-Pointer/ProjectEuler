// This two things needed to be imported
import static org.junit.Assert.*;
import org.junit.*; //import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ProblemsTest {

  @Test(timeout = 100)
  public void testM3or5() {
    Problems problem = new Problems();
    String actual = problem.m3or5();
    assertEquals("Final answer isn't correct.", "Answer: 233168", actual);
  }

  @Test(timeout = 100)// this need to be here to be tested
  public void testEvenFibNum() {
    Problems problem = new Problems();
    String actual = problem.evenFibNum();
    assertEquals("Final answer isn't correct.", "Answer: 4613732", actual);
  }

//  @Test
//  public void testIsPrime() {
//    Problems problem = new Problems();
//
//  }

  /**
   * Java documentation example
   */

  @Test(timeout = 5)
  public void palindrome_WithPalindromeNumber_ShouldReturnTrue() {
    Problems problem = new Problems();

    boolean result = problem.isPalindrome(636);

    assertTrue("This should be a palindrome", result);
  }

  @Test(timeout = 5)
  public void palindrome_WithNonPalindromeNumber_ShouldReturnFalse() {
    Problems problem = new Problems();

    boolean result = problem.isPalindrome(123);

    assertFalse("This should NOT be a palindrome", result);
  }

  @Test(timeout = 5)
  public void palindrome_WithNegativeNumber_ShouldReturnFalse() {
    Problems problem = new Problems();

    boolean result = problem.isPalindrome(-151);

    assertFalse("This should NOT be a palindrome", result);
  }

  @ParameterizedTest
  @ValueSource(ints = {98089, 161})
  void palindrome_ShouldReturnTrue(int number) {
    Problems result = new Problems();
    assertTrue("This should be a palindrome", result.isPalindrome(number));
  }

}