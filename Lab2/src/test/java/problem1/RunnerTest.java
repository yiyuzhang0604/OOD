package problem1;

import static org.junit.Assert.*;

import java.util.Objects;
import org.junit.Test;

public class RunnerTest {
  private String expectedFirst;
  private String expectedMiddle;
  private String expectedLast;
  private Name testName;
  private Double expectedHeight;
  private Double expectedWeight;
  private String expectedLeague;
  private Double expectedBest5K;
  private Double expectedBestHalf;
  private String expectedFavEvent;
  private Runner testRunner;

  @org.junit.Before
  public void setUp() throws Exception {
    expectedFirst = "Briana";
    expectedMiddle = "Nini";
    expectedLast = "Zhang";
    testName = new Name(expectedFirst,expectedMiddle,expectedLast);
    expectedHeight = 5.0;
    expectedWeight = 110.8;
    expectedLeague = "Bambi";
    expectedBest5K = 653.2;
    expectedBestHalf = 1346.9;
    expectedFavEvent = "Color run";
    testRunner = new Runner(testName,expectedHeight,expectedWeight,
                            expectedLeague,expectedBest5K,expectedBestHalf,expectedFavEvent);
  }

  @org.junit.Test
  public void getBest5K() {
    assertEquals(expectedBest5K, testRunner.getBest5K());
  }

  @org.junit.Test
  public void getBestHalf() {
    assertEquals(expectedBestHalf, testRunner.getBestHalf());
  }

  @org.junit.Test
  public void getFavEvent() {
    assertEquals(expectedFavEvent, testRunner.getFavEvent());
  }
  @Test
  public void equalsReflexivity(){
    assertTrue(testRunner.equals(testRunner));
  }

  @Test
  public void equalsReflexivity2(){
    Runner testRunner2 = new Runner(new Name("Kyle","Mid",
                                      "Zhang"),155.9, 45.8,"League",
                                      89.8, 123.5, "happy");
    assertFalse(testRunner.equals(testRunner2));
  }
  @Test
  public void equalsDifferentDataType(){
    assertFalse(testRunner.equals(testName));
  }
  @Test
  public void equalsSameFields(){
    Runner testRunner2 = new Runner(testName,expectedHeight,expectedWeight,
                                    expectedLeague,expectedBest5K,expectedBestHalf,expectedFavEvent);
    assertTrue(testRunner.equals(testRunner2));
  }
  @Test
  public void equalsNotSame5K(){
    Runner testRunner2 = new Runner(testName,expectedHeight,expectedWeight,
                                    expectedLeague,33.0,expectedBestHalf,expectedFavEvent);
    assertFalse(testRunner.equals(testRunner2));
  }

  @Test
  public void equalsNotSameHalf(){
    Runner testRunner2 = new Runner(testName,expectedHeight,expectedWeight,
                                    expectedLeague,expectedBest5K,908.8,expectedFavEvent);
    assertFalse(testRunner.equals(testRunner2));
  }

  @Test
  public void equalsNotSameEvent(){
    Runner testRunner2 = new Runner(testName,expectedHeight,expectedWeight,
                                    expectedLeague,expectedBest5K,expectedBestHalf,"Happy Run");
    assertFalse(testRunner.equals(testRunner2));
  }
  @Test
  public void hashCodeSame(){
    int hash = Objects.hash(expectedBest5K,expectedBestHalf,expectedFavEvent);
    assertEquals(hash, testRunner.hashCode());
  }
  @Test
  public void testToString(){
    String expectedString = "Runner{" +
        "best5K=" + expectedBest5K +
        ", bestHalf=" + expectedBestHalf +
        ", favEvent='" + expectedFavEvent + '\'' +
        '}';
    assertEquals(expectedString, testRunner.toString());

  }
}