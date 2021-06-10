package problem1;

import static org.junit.Assert.*;

import java.time.LocalDate;
import jdk.vm.ci.meta.Local;
import org.junit.Before;
import org.junit.Test;


public class PerishableFoodTest {
  private ConcreateFood foodTest;
  private LocalDate testDate;
  private LocalDate testExp;

  @Before
  public void setUp() throws Exception {
    testDate = LocalDate.of(2021,6,4);
    testExp = LocalDate.of(2021,6,10);
    foodTest = new ConcreateFood("Beef", 2.00, 100,50,testDate,testExp);
  }

  @Test
  public void getOrderDate() {
    assertEquals(testDate,foodTest.getOrderDate());
  }

  @Test
  public void getExpirationDate() {
    assertEquals(testExp,foodTest.getExpirationDate());
  }

  @Test
  public void testEquals() {
    assertEquals(foodTest,foodTest);
    ConcreateFood f1 = new ConcreateFood("Beef", 4.00, 100,50,testDate,testExp);
    assertNotEquals(f1,foodTest);
  }

  @Test
  public void testHashCode() {
    ConcreateFood f1 = new ConcreateFood("Beef", 2.00, 100,50,testDate,testExp);
    assertEquals(f1.hashCode(),foodTest.hashCode());

  }

  @Test
  public void testToString() {
    String result = "PerishableFood{orderDate= 2021-6-4,expirationDate=2021-6-10";
    assertEquals(result,foodTest.toString());
  }
  private class ConcreateFood extends PerishableFood{

    private ConcreateFood(String name, double price, Integer available, Integer maxQuantity,
        LocalDate orderDate, LocalDate expirationDate) {
      super(name, price, available, maxQuantity,orderDate,expirationDate);
    }
  }
}