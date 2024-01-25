// This two things needed to be imported
import static org.junit.Assert.*;
import org.junit.*;
//import org.junit.Test;


public class ProblemsTest {
  @Test
  public void testM3or5() {
    Problems problem = new Problems();
    String actual = problem.m3or5();
    assertEquals("Final answer isn't correct.", "Answer: 233168", actual);
  }

  @Test // this need to be here to be tested
  public void testEvenFibNum(){
    Problems problem = new Problems();
    String actual = problem.evenFibNum();
    assertEquals("Final answer isn't correct.","Answer: 4613732", actual);
  }

  @Test
  public void testIsPrime(){
    Problems problem = new Problems();

  }

  /**
   * Java documentation example
   */

  @Test
  public void testIsPalindrome (){
    Problems problem = new Problems();
    boolean actual = problem.isPalindrome(9009);
    assertTrue("This should be a palindrome", actual);
    actual = problem.isPalindrome(123);
    assertFalse("This should NOT be a palindrome", actual);
    actual = problem.isPalindrome(646);
    assertTrue("This should be a palindrome", actual);
    actual = problem.isPalindrome(-151);
    assertFalse("This should NOT be a palindrome", actual);
  }


}