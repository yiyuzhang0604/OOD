package problem1;

import java.util.Objects;

/**
 * Class Runner is a subclass of Athlete, including Athlete's attributes and additional attributes such as
 * best5K, bestHalf and favEvent
 */
public class Runner extends Athlete{
  private Double best5K;
  private Double bestHalf;
  private String favEvent;

  /**
   * Constructs a new Runner object based on provided input parameters
   * @param athletesName - Object name, including first name and last name
   * @param height - height, double
   * @param weight - weight, double
   * @param league -league, String
   * @param best5K - the time of best 5k, double
   * @param bestHalf - the time of best half-marathon, double
   * @param favEvent - the favorite running event, String
   * @return - Object Runner
   */

  public Runner(Name athletesName, Double height, Double weight, String league,
      Double best5K, Double bestHalf, String favEvent) {
    super(athletesName, height, weight, league);
    this.best5K = best5K;
    this.bestHalf = bestHalf;
    this.favEvent = favEvent;
  }

  /*
  Return the runner's best 5k time
   */
  public Double getBest5K() {
    return best5K;
  }

  /*
  return the runner's best half-marathon time
   */
  public Double getBestHalf() {
    return bestHalf;
  }

  /*
  return the runner's favorite running event
   */
  public String getFavEvent() {
    return favEvent;
  }

  @Override
  public boolean equals(Object obj) {
    if(this == obj) return true;
    if(!(obj instanceof Runner)) return false;
    Runner runner = (Runner)obj;
    return Objects.equals(getBest5K(), runner.getBest5K()) &&
        Objects.equals(getBestHalf(), runner.getBestHalf()) &&
        Objects.equals(getFavEvent(), runner.getFavEvent());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getBest5K(),getBestHalf(),getFavEvent());
  }

  @Override
  public String toString() {
    return "Runner{" +
        "best5K=" + best5K +
        ", bestHalf=" + bestHalf +
        ", favEvent='" + favEvent + '\'' +
        '}';
  }
}
