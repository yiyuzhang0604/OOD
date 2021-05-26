package problem1;

import static org.junit.Assert.*;

import java.util.Objects;
import org.junit.Before;
import org.junit.Test;

public class AthleteTest {
  private String expectedFirst;
  private String expectedMiddle;
  private String expectedLast;
  private Name testName;
  private Double expectedHeight;
  private Double expectedWeight;
  private String expectedLeague;
  private Athlete testAthele;


  @Before
  public void setUp() throws Exception {
    expectedFirst = "Briana";
    expectedMiddle = "Nini";
    expectedLast = "Zhang";
    testName = new Name(expectedFirst,expectedMiddle,expectedLast);
    expectedHeight = 5.0;
    expectedWeight = 110.8;
    expectedLeague = "Bambi";
    testAthele = new Athlete(testName,expectedHeight,expectedWeight,expectedLeague);
  }

  @Test
  public void getAthletesName() {
    assertEquals(testAthele.getAthletesName(), testName);
  }

  @Test
  public void getHeight() {
    assertEquals(testAthele.getHeight(),expectedHeight);
  }

  @Test
  public void getWeight() {
    assertEquals(testAthele.getWeight(),expectedWeight);
  }

  @Test
  public void getLeague() {
    assertEquals(testAthele.getLeague(),expectedLeague);
  }

  @Test
  public void equalsReflexivity(){
    assertTrue(testAthele.equals(testAthele));
  }

  @Test
  public void equalsReflexivity2(){
    Athlete testAthele2 = new Athlete(new Name("Kyle","Mid", "Zhang"),
                                155.9, 45.8,"League");
    assertFalse(testAthele.equals(testAthele2));
  }
  @Test
  public void equalsDifferentDataType(){
    assertFalse(testAthele.equals(testName));
  }
  @Test
  public void equalsSameFields(){
    Athlete testAthele2 = new Athlete(testName,expectedHeight,expectedWeight,expectedLeague);
    assertTrue(testAthele.equals(testAthele2));
  }
  @Test
  public void equalsNotSameHeight(){
    Athlete testAthlete2 = new Athlete(testName,6.0, expectedWeight,expectedLeague);
    assertFalse(testAthele.equals(testAthlete2));
  }

  @Test
  public void equalsNotSameWeight(){
    Athlete testAthlete2 = new Athlete(testName,expectedHeight, 7.0,expectedLeague);
    assertFalse(testAthele.equals(testAthlete2));
  }

  @Test
  public void equalsNotSameLeague(){
    Athlete testAthlete2 = new Athlete(testName,expectedHeight, expectedWeight,"new");
    assertFalse(testAthele.equals(testAthlete2));
  }
  @Test
  public void hashCodeSame(){
    int hash = Objects.hash(testName, expectedHeight,expectedWeight, expectedLeague);
    assertEquals(hash, testAthele.hashCode());
  }
  @Test
  public void testToString(){
    String expectedString = "Athlete{" +
        "athletesName=" + testName +
        ", height=" + expectedHeight +
        ", weight=" + expectedWeight +
        ", league='" + expectedLeague + '\'' +
        '}';
    assertEquals(expectedString, testAthele.toString());

  }
}