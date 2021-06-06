import java.util.Objects;

/**
 * Exterior is an abstract class which provides functions and field for exterior services
 */
public abstract class Exterior extends AbstractServices {

    /**
     * Constructs an Exterior class object
     * @param address - the address of the service
     * @param propertySize - the size of property
     * @param monthly - if it is monthly
     * @param previousCarry the number of previous service
     * @throws IllegalArgumentException throw exception
     */
    public Exterior(String address, PropertySize propertySize, Boolean monthly, Integer previousCarry) throws IllegalArgumentException {
        super(address, propertySize, monthly, previousCarry);
    }

    /**
     * Calculate the price
     * @return new price
     */
    @Override
    public double calculatePrice(){
        int LARGE_RATE = 4;
        int MEDIUM_RATE = 2;
        if(getPropertySize() == PropertySize.Large){
            return HOURLY_PRICE * LARGE_RATE;
        }else if(getPropertySize() == PropertySize.MEDIUM){
            return HOURLY_PRICE* MEDIUM_RATE;
        }else {
            return HOURLY_PRICE;
        }
    }
}
