/**
 * Cleaning class provides functions and fields of a cleaning service
 */
public class Cleaning extends Interior{
    public Cleaning(String address, PropertySize propertySize, Boolean monthly, Integer previousCarry, int petNum) throws IllegalArgumentException {
        super(address, propertySize, monthly, previousCarry, petNum);
    }

    /**
     * Calculate the price of the cleaning service
     * @return new price
     * @throws IllegalArgumentException throw exception
     */
    @Override
    public double calculatePrice() throws IllegalArgumentException {
        double price;
        Integer MEDIUM_RATE = 2;
        Integer LARGE_RATE = 4;
        switch(getPropertySize()){
            case SMALL:
                price = HOURLY_PRICE;
                break;
            case MEDIUM:
                price = HOURLY_PRICE * MEDIUM_RATE;
                break;
            case Large:
                price = HOURLY_PRICE * LARGE_RATE;
                break;
            default:
                throw new IllegalArgumentException("Property size not recognize");

        }
        double petPrice = petFee(price);
        double newPrice = applyDiscount(petPrice);
        return newPrice;
    }

    @Override
    public String toString() {
        return "Cleaning:" + super.toString();
    }
}
