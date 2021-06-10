package problem1;

import java.time.LocalDate;
import java.util.Objects;

public abstract class PerishableFood extends AbstractFood {
  private LocalDate orderDate;
  private LocalDate expirationDate;

  public PerishableFood(String name, double price, Integer available, Integer maxQuantity,
      LocalDate orderDate, LocalDate expirationDate) {
    super(name, price, available, maxQuantity);
    this.orderDate = orderDate;
    this.expirationDate = expirationDate;
  }

  public LocalDate getOrderDate() {
    return orderDate;
  }

  public LocalDate getExpirationDate() {
    return expirationDate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PerishableFood that = (PerishableFood) o;
    return Objects.equals(getOrderDate(), that.getOrderDate()) &&
        Objects.equals(getExpirationDate(),that.getExpirationDate());
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), getOrderDate(),getExpirationDate());
  }

  @Override
  public String toString() {
    return "PerishableFood{" +
        "orderDate=" + orderDate +
        ", expirationDate=" + expirationDate +
        '}';
  }
}
