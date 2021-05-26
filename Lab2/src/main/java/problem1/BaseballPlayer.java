package problem1;

import com.sun.tools.javac.util.BasicDiagnosticFormatter.BasicConfiguration.BasicFormatKind;
import java.util.Objects;

/**
 * BaseballPlayer class object is a subclass of athlete, with additional information such as team,
 * avgBat and homeRun;
 */
public class BaseballPlayer extends Athlete {
  private String team;
  private Double avgBat;
  private Integer homeRun;

  /**
   * Constructs a BaseballPlayer class object with provided parameters
   * @param athletesName - name
   * @param height- height
   * @param weight - weight
   * @param league - league
   * @param team - tame name
   * @param avgBat - average batting
   * @param homeRun - season home run
   * @return a new BaseballPlayer object
   */

  public BaseballPlayer(Name athletesName, Double height, Double weight, String league,
      String team, Double avgBat, Integer homeRun) {
    super(athletesName, height, weight, league);
    this.team = team;
    this.avgBat = avgBat;
    this.homeRun = homeRun;
  }

  public String getTeam() {
    return team;
  }

  public Double getAvgBat() {
    return avgBat;
  }

  public Integer getHomeRun() {
    return homeRun;
  }
  @Override
  public boolean equals(Object obj) {
    if(this == obj) return true;
    if(!(obj instanceof BaseballPlayer)) return false;
    BaseballPlayer player = (BaseballPlayer) obj;
    return Objects.equals(getAvgBat(), player.getAvgBat()) &&
        Objects.equals(getTeam(), player.getTeam()) &&
        Objects.equals(getHomeRun(), player.getHomeRun());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getTeam(),getAvgBat(),getHomeRun());
  }

  @Override
  public String toString() {
    return "BaseballPlayer{" +
        "team='" + team + '\'' +
        ", avgBat=" + avgBat +
        ", homeRun=" + homeRun +
        '}';
  }
}
