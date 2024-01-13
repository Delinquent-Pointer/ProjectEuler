import static org.junit.Assert.*;
import org.junit.Test;

public class ProblemsTest {
  @Test
  public void testM3or5() {
    Problems problem = new Problems();
    String result = problem.m3or5();
    assertEquals("Answer: 233168", result);
  }

  @Test
  public void testEvenFibNum(){
    Problems problem = new Problems();
    String result = problem.evenFibNum();
    assertEquals("You need go back to 210!",result,"Answer: 4613732");
  }
}