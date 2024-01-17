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

  public void testIsPrime(){
    Problems problem = new Problems();

  }

  /**
   * Class notes 1
   */

//  @Test
  public void testInformation(){
//    assertTrue();
//    assertFalse();
//    assertEquals();
//    assertSame();
//    assertNotSame();
//    assertNull();
//    assertNotNull();
//    fail("message here");
    // Timeout should be in every time for infinite loop

  }

  /**
   * Class notes 2
   */
  @Test
  public void TestDateMonthYear(){
    int year = 2024;
    int month = 12;
    int day = 32; // depends on month check what month then days associate aka leap year too
    assertFalse("Invalid year: Year cannot be less than zero", year < 0);
    assertFalse("Invalid month: month cannot be less than 1 or bigger than 12", month < 0 || month > 12);
    assertFalse("Invalid month: day cannot be less than 1 or bigger than 12", day < 0 || day > 31);
  }

}