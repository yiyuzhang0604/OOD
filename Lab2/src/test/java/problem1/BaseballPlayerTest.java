package problem1;

import static org.junit.Assert.*;

import java.util.Objects;
import org.junit.Before;
import org.junit.Test;

public class BaseballPlayerTest {
  private String expectedFirst;
  private String expectedMiddle;
  private String expectedLast;
  private Name testName;
  private Double expectedHeight;
  private Double expectedWeight;
  private String expectedLeague;
  private String expectedTeam;
  private Double expectedAvgBat;
  private Integer expectedHomeRun;
  private BaseballPlayer testPlayer;

  @Before
  public void setUp() throws Exception {
    expectedFirst = "Briana";
    expectedMiddle = "Nini";
    expectedLast = "Zhang";
    testName = new Name(expectedFirst,expectedMiddle,expectedLast);
    expectedHeight = 5.0;
    expectedWeight = 110.8;
    expectedLeague = "Bambi";
    expectedTeam = "Ninibu";
    expectedAvgBat = 34.2;
    expectedHomeRun = 3;
    testPlayer = new BaseballPlayer(testName, expectedHeight, expectedWeight,expectedLeague,
                                    expectedTeam,expectedAvgBat,expectedHomeRun);
  }

  @Test
  public void getTeam() {
    assertEquals(expectedTeam, testPlayer.getTeam());

  }

  @Test
  public void getAvgBat() {
    assertEquals(expectedAvgBat, testPlayer.getAvgBat());
  }

  @Test
  public void getHomeRun() {
    assertEquals(expectedHomeRun, testPlayer.getHomeRun());
  }
  @Test
  public void equalsReflexivity(){
    assertTrue(testPlayer.equals(testPlayer));
  }

  @Test
  public void equalsReflexivity2(){
    BaseballPlayer testPlayer2 = new BaseballPlayer(new Name("Kyle","Mid",
                                                    "Zhang"),155.9, 45.8,"League",
                                              "nini",56.8, 2);
    assertFalse(testPlayer.equals(testPlayer2));
  }
  @Test
  public void equalsDifferentDataType(){
    assertFalse(testPlayer.equals(testName));
  }
  @Test
  public void equalsSameFields(){
    BaseballPlayer testPlayer2 = new BaseballPlayer(testName, expectedHeight, expectedWeight,expectedLeague,
        expectedTeam,expectedAvgBat,expectedHomeRun);
    assertTrue(testPlayer.equals(testPlayer2));
  }
  @Test
  public void equalsNotSameTeam(){
    BaseballPlayer testPlayer2 = new BaseballPlayer(testName, expectedHeight, expectedWeight,expectedLeague,
        "Rock",expectedAvgBat,expectedHomeRun);
    assertFalse(testPlayer.equals(testPlayer2));
  }

  @Test
  public void equalsNotSameBat(){
    BaseballPlayer testPlayer2 = new BaseballPlayer(testName, expectedHeight, expectedWeight,expectedLeague,
        expectedTeam,32.0,expectedHomeRun);
    assertFalse(testPlayer.equals(testPlayer2));
  }

  @Test
  public void equalsNotSameHomeRun(){
    BaseballPlayer testPlayer2 = new BaseballPlayer(testName, expectedHeight, expectedWeight,expectedLeague,
        expectedTeam,expectedAvgBat,4);
    assertFalse(testPlayer.equals(testPlayer2));
  }
  @Test
  public void hashCodeSame(){
    int hash = Objects.hash(expectedTeam,expectedAvgBat,expectedHomeRun);
    assertEquals(hash, testPlayer.hashCode());
  }
  @Test
  public void testToString(){
    String expectedString = "BaseballPlayer{" +
        "team='" + expectedTeam + '\'' +
        ", avgBat=" + expectedAvgBat +
        ", homeRun=" + expectedHomeRun +
        '}';
    assertEquals(expectedString, testPlayer.toString());

  }

}