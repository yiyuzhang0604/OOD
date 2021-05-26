package problem1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NameTest {
  private String expectedFirst;
  private String expectedMiddle;
  private String expectedLast;
  private Name testName;

  @Before
  public void setUp() throws Exception {
    expectedFirst = "Briana";
    expectedMiddle = "Nini";
    expectedLast = "Zhang";
    testName = new Name(expectedFirst, expectedMiddle,expectedLast);
  }

  @Test
  public void getFirstName() {
    assertEquals(testName.getFirstName(), expectedFirst);
  }
  @Test
  public void getMiddleName() {
    assertEquals(testName.getMiddleName(), expectedMiddle);
  }

  @Test
  public void getLastName() {
    assertEquals(testName.getLastName(), expectedLast);
  }
}