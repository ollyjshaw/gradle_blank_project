package canary;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CanaryTest {

  @Test
  public void testTestsRun(){
    assertEquals("Basic maths works", 4, 2 + 2 );
  }
}
