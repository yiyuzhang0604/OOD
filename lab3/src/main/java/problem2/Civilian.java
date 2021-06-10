package problem2;

import java.util.Objects;

public abstract class Civilian extends Pieces {
  private Integer wealth;

  public Civilian(String name, Integer age, Integer wealth) {
    super(name, age);
    this.wealth = wealth;
  }

  public Integer getWealth() {
    return wealth;
  }

  public Integer addWealth(Integer value){
    this.wealth += value;
    return getWealth();
  }
  public Integer decreaseWealth(Integer value){
    this.wealth -= value;
    return getWealth();
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Civilian that = (Civilian) o;
    return Objects.equals(getWealth(),that.getWealth());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getWealth());
  }

  @Override
  public String toString() {
    return "Civilian{" +
        "wealth=" + wealth +
        '}';
  }
}
