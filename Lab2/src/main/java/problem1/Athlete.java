package problem1;

/*
 * Class Athlete contains information about an athlete, including name, height, weight and league.
 */

import java.util.Objects;

public class Athlete {
  private Name athletesName;
  private Double height;
  private Double weight;
  private String league;

  /**
   * Construct a new athlete
   * @param athletesName - object name, containing first name and last name
   * @param height - athlete's height, double
   * @param weight - athlete's weight, double
   * @param league - athlete's league, String
   * @return - Object Athlete
   */

  public Athlete(Name athletesName, Double height, Double weight, String league) {
    this.athletesName = athletesName;
    this.height = height;
    this.weight = weight;
    this.league = league;
  }

  public Name getAthletesName() {
    return athletesName;
  }

  public Double getHeight() {
    return height;
  }

  public Double getWeight() {
    return weight;
  }

  public String getLeague() {
    return league;
  }

  @Override
  public boolean equals(Object obj) {
    if(this == obj) return true;
    if(!(obj instanceof Athlete)) return false;
    Athlete athlete = (Athlete) obj;
    return Objects.equals(getAthletesName(), athlete.getAthletesName()) &&
        Objects.equals(getHeight(), athlete.getHeight()) &&
        Objects.equals(getWeight(), athlete.getWeight()) &&
        Objects.equals(getLeague(), athlete.getLeague());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getAthletesName(),getHeight(),getWeight(),getLeague());
  }

  @Override
  public String toString() {
    return "Athlete{" +
        "athletesName=" + athletesName +
        ", height=" + height +
        ", weight=" + weight +
        ", league='" + league + '\'' +
        '}';
  }
}
