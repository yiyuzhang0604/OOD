package problem1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AbstractFoodTest {
  private ConcreateFood foodTest;


  @Before
  public void setUp() throws Exception {
    foodTest = new ConcreateFood("Taco", 2.00, 100,50);
  }

  @Test
  public void getName() {
    assertEquals(foodTest.getName(),"Taco");
  }

  @Test
  public void getPrice() {
    assertEquals(foodTest.getPrice(),2.00,0.0);
  }

  @Test
  public void getAvailable() {
    assertSame(foodTest.getAvailable(),100);
  }

  @Test
  public void getMaxQuantity() {
    assertSame(foodTest.getMaxQuantity(),50);
  }

  @Test
  public void testEquals() {
    ConcreateFood foodTest2 = new ConcreateFood("Taco", 2.00, 100,50);
    assertEquals(foodTest,foodTest);
    assertEquals(foodTest,foodTest2);
    ConcreateFood foodTest3 = new ConcreateFood("Taco", 4.00, 100,50);
    assertNotEquals(foodTest2,foodTest3);
  }

  @Test
  public void testHashCode() {
    ConcreateFood foodTest2 = new ConcreateFood("Taco", 2.00, 100,50);
    assertEquals(foodTest2.hashCode(), foodTest.hashCode());

  }

  @Test
  public void testToString() {
    String result = "AbstractFood name=Taco price=2.00 available=100 maxQuantity=50";
    assertEquals(result,foodTest.toString());
  }
  private class ConcreateFood extends AbstractFood{

    private ConcreateFood(String name, double price, Integer available, Integer maxQuantity) {
      super(name, price, available, maxQuantity);
    }
  }
}