import java.util.Objects;

/**
 * WindowCleaning class provides functions and fields for the windowclearning service
 */
public class WindowCleaning extends Exterior{
    private static final Integer MAX_FLOOR = 3;
    private static final Integer MIN_FLOOR = 1;
    private Integer floorNums;

    /**
     * Constructs a window cleaning service
     *@param address - the address of the service
     * @param propertySize - the size of the property
     * @param monthly - true if it is monthly service
     * @param previousCarry - the number of previous services
     * @param floorNums - the number of floors
     * @throws IllegalArgumentException throw exception
     */
    public WindowCleaning(String address, PropertySize propertySize, Boolean monthly, Integer previousCarry, Integer floorNums)
                        throws IllegalArgumentException{
        super(address, propertySize, monthly, previousCarry);
        if(floorNums < MIN_FLOOR){
            throw new IllegalArgumentException("Please enter a number that is greater than 1");
        }
        if(floorNums > MAX_FLOOR){
            throw new IllegalArgumentException("Too many floors!");
        }
        this.floorNums = floorNums;
    }

    /**
     * Calculate the price of the service
     * @return the total price for window cleaning
     */
    @Override
    public double calculatePrice() {
        double fullPrice = super.calculatePrice();
        return applyDiscount(extraFee(fullPrice));
    }

    /**
     * Calculate extra fee due to floors
     * @param fullPrice
     * @return the fee after adding extra fee
     */
    private double extraFee(double fullPrice){
        double RATE = 0.05;
        if(floorNums > 1){
            return fullPrice + fullPrice * RATE;
        }
        return fullPrice;
    }

    /**
     * Get the number of floors
     * @return the number of floors
     */
    public Integer getFloorNums() {
        return floorNums;
    }

    @Override
    public String toString() {
        return "Window cleaning:" + super.toString() + " floor:" + floorNums;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if(!super.equals(o)) return false;
        WindowCleaning that = (WindowCleaning) o;
        return floorNums.equals(that.floorNums);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(),floorNums);
    }
}
