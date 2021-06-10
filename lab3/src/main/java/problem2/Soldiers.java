package problem2;

import java.util.Objects;

public abstract class Soldiers extends Pieces{
  private Integer stamina;

  public Soldiers(String name, Integer age, Integer stamina) {
    super(name, age);
    this.stamina = stamina;
  }

  public Integer getStamina() {
    return stamina;
  }
  public Integer addS(Integer value){
    this.stamina += value;
    return getStamina()
  }
  public Integer decreaseS(Integer value){
    this.stamina -= value;
    return getStamina()
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Soldiers that = (Soldiers) o;
    return Objects.equals(getStamina(),that.getStamina());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getStamina());
  }

  @Override
  public String toString() {
    return "Soldiers{" +
        "stamina=" + stamina +
        '}';
  }
}
