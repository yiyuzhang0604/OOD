package problem2;

import java.util.Objects;
import problem1.AbstractFood;

public abstract class Pieces {
  private String name;
  private Integer age;

  public Pieces(String name, Integer age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public Integer getAge() {
    return age;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Pieces that = (Pieces) o;
    return Objects.equals(getName(),that.getName()) &&
        Objects.equals(getAge(),that.getAge());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getName(),getAge());
  }

  @Override
  public String toString() {
    return "Pieces{" +
        "name='" + name + '\'' +
        ", age=" + age +
        '}';
  }
}
