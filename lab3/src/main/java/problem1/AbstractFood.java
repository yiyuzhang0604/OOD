package problem1;

import java.util.Objects;

public abstract class AbstractFood {
  private String name;
  private double price;
  private Integer available;
  private Integer maxQuantity;

  public AbstractFood(String name, double price, Integer available, Integer maxQuantity) {
    this.name = name;
    this.price = price;
    this.available = available;
    this.maxQuantity = maxQuantity;
  }

  public String getName() {
    return name;
  }

  public double getPrice() {
    return price;
  }

  public Integer getAvailable() {
    return available;
  }

  public Integer getMaxQuantity() {
    return maxQuantity;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AbstractFood that = (AbstractFood) o;
    return Objects.equals(getName(),that.getName()) &&
        Objects.equals(getPrice(),that.getPrice()) &&
        Objects.equals(getAvailable(),that.getAvailable()) &&
        Objects.equals(getMaxQuantity(),that.getMaxQuantity());

  }

  @Override
  public int hashCode() {
    return Objects.hash(getName(),getPrice(),getAvailable(),getMaxQuantity());
  }

  @Override
  public String toString() {
    return "AbstractFood{" +
        "name='" + name + '\'' +
        ", price=" + price +
        ", available=" + available +
        ", maxQuantity=" + maxQuantity +
        '}';
  }
}
