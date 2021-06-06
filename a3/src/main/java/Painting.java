/**
 * Painting represents an Interior service
 */
public class Painting extends Interior{
    /**
     * Constructs a Painting object
     * @param address - the address of the property
     * @param propertySize - the size
     * @param monthly - if it is monthly service
     * @param previousCarry - the number of previous services
     * @param petNum - the number of pets
     * @throws IllegalArgumentException throw exception
     */
    public Painting(String address, PropertySize propertySize, Boolean monthly, Integer previousCarry, int petNum) throws IllegalArgumentException {
        super(address, propertySize, monthly, previousCarry, petNum);
    }

    /**
     * Calculate the price of the painting service
     * @return the total price
     * @throws IllegalArgumentException throw exception
     */
    @Override
    public double calculatePrice() throws IllegalArgumentException{
        int requiredHour;
        int MEDIUM_RATE = 16;
        int LARGE_RATE = 24;
        switch (getPropertySize()){
            case SMALL:
            case MEDIUM:
                requiredHour = MEDIUM_RATE;
                break;
            case Large:
                requiredHour = LARGE_RATE;
                break;
            default:
                throw new IllegalArgumentException("Invalid argument" + getPropertySize());
        }
        double fullPrice = HOURLY_PRICE * requiredHour;
        return applyDiscount(petFee(fullPrice));

    }

    @Override
    public String toString() {
        return "Painting:" + super.toString();
    }
}
