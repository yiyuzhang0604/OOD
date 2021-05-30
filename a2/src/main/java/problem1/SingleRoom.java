package problem1;

public class SingleRoom extends Room{
    public SingleRoom(Integer maxOccupancy, Integer price, Integer numberGuest) {
       super(maxOccupancy,price,numberGuest);
    }


    public boolean isAvailable(){
        if(numberGuest == 0) return true;
        return false;
    }

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



