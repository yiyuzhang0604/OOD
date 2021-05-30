package problem1;

/**
 * Room is a class object with 3 attributes
 */
public class Room {
  protected Integer maxOccupancy;
  protected Integer price;
  protected Integer numberGuest;

  /**
   * Constructs a new Room object with provided parameters
   * @param maxOccupancy - Integer, maximum number of people that can stay in the room
   * @param price - Integer, the price of the room
   * @param numberGuest - The number of guests currently booked this room
   */

  public Room(Integer maxOccupancy, Integer price, Integer numberGuest) {
    this.maxOccupancy = maxOccupancy;
    this.price = price;
    this.numberGuest = numberGuest;
  }

  /*
  Return maxOccupancy
   */

  public Integer getMaxOccupancy() {
    return maxOccupancy;
  }

  /**
   * @return price
   */
  public Integer getPrice() {
    return price;
  }

  /**
   * @return numberGuest
   */
  public Integer getNumberGuest() {
    return numberGuest;
  }

  /**
   * @return boolean, true if the room is available, false if not
   */
  public boolean isAvailable(){
    if(numberGuest == 0) return true;
    return false;
  }

  /**
   *
   * @param guestNumber - number of guests that want to book the room
   */
  public void bookRoom(int guestNumber){
    if(numberGuest == 0 && guestNumber > 0 && guestNumber <= maxOccupancy){
      numberGuest += guestNumber;
    }else if(guestNumber <= 0){
      throw new IllegalArgumentException("Guest number need to be greater than 0");
    }else if(guestNumber > maxOccupancy){
      throw new IllegalArgumentException("Guest number cannot exceed the maximum occupancy");
    }
  }
}
