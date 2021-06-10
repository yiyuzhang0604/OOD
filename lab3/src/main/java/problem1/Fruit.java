package problem1;

import java.time.LocalDate;

public class Fruit extends PerishableFood {

  public Fruit(String name, double price, Integer available, Integer maxQuantity,
      LocalDate orderDate, LocalDate expirationDate) {
    super(name, price, available, maxQuantity, orderDate, expirationDate);
  }
}
