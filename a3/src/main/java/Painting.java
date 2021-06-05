/**
 * Painting represents an Interior service
 */
public class Painting extends Interior{
    /**
     * Constructs a Painting object
     * @param propertySize - the address of the property
     * @param monthly - if it is monthly service
     * @param previousCarry - the number of previous services
     * @param petNum - the number of pets
     * @throws IllegalArgumentException - if pet number < 0
     */
    public Painting(String address, PropertySize propertySize, Boolean monthly, Integer previousCarry, int petNum) throws IllegalArgumentException {
        super(address, propertySize, monthly, previousCarry, petNum);
    }

    /**
     * Calculate the price of the painting service
     * @return the total price
     * @throws IllegalArgumentException
     */
    @Override
    public double calculatePrice() throws IllegalArgumentException{
        int requiredHour;
        switch (getPropertySize()){
            case SMALL:
            case MEDIUM:
                requiredHour = 16;
                break;
            case Large:
                requiredHour = 24;
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
