package problem1;

import java.time.LocalDate;

public class Vegetables extends PerishableFood {

  public Vegetables(String name, double price, Integer available, Integer maxQuantity,
      LocalDate orderDate, LocalDate expirationDate) {
    super(name, price, available, maxQuantity, orderDate, expirationDate);
  }
}
