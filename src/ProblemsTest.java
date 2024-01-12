import static org.junit.Assert.*;

import org.junit.Test;

public class ProblemsTest {
  @Test
  public void testM3or5() {
    Problems problem = new Problems();
    String result = problem.m3or5();
    assertEquals("Answer: 233168", result);
  }
}