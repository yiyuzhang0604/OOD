package problem1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RoomTest {
  private Integer expectedMax;
  private Integer expectedPrice;
  private Integer expectedNumber;
  private Room testRoom;
  private Room testRoom2;

  @Before
  public void setUp() throws Exception {
    expectedMax = 3;
    expectedPrice = 200;
    expectedNumber = 0;
    testRoom = new Room(expectedMax,expectedPrice, expectedNumber);
    testRoom2 = new Room(expectedMax, expectedPrice, 1);
  }

  @Test
  public void getMaxOccupancy() {
    assertEquals(expectedMax, testRoom.getMaxOccupancy());
  }

  @Test
  public void getPrice() {
    assertEquals(expectedPrice, testRoom.getPrice());
  }

  @Test
  public void getNumberGuest() {
    assertEquals(expectedNumber, testRoom.getNumberGuest());
  }

  @Test
  public void isAvailable() {
    assertEquals(true, testRoom.isAvailable());
    assertEquals(false,testRoom2.isAvailable());
  }

  @Test
  public void bookRoom() {
    testRoom.bookRoom(1);
    int exp = 1;
    assertSame(exp, testRoom.getNumberGuest());

    testRoom.bookRoom(1);
    assertSame(testRoom.getNumberGuest(),1);

    Throwable e = null;
    try{
      testRoom.bookRoom(-3);
    }catch(Throwable ex){
      e = ex;
    }
    assertTrue(e instanceof IllegalArgumentException);

  Throwable y = null;
    try{
    testRoom.bookRoom(100);
  }catch(Throwable yx){
    y = yx;
  }
  assertTrue(y instanceof IllegalArgumentException);
}
}