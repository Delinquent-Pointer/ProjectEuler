// This two things needed to be imported
import static org.junit.Assert.*;
import org.junit.*;
//import org.junit.Test;


public class ProblemsTest {
  @Test
  public void testM3or5() {
    Problems problem = new Problems();
    String result = problem.m3or5();
    assertEquals("Answer: 233168", result);
  }

  @Test // this need to be here to be tested
  public void testEvenFibNum(){
    Problems problem = new Problems();
    String result = problem.evenFibNum();
    assertEquals("Final answer isn't correct.",result,"Answer: 4613732");
  }

  public void testIsPrime(){
    Problems problem = new Problems();

  }

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
  }
}