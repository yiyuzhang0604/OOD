public class Cleaning extends Interior{
    public Cleaning(String address, PropertySize propertySize, Boolean monthly, Integer previousCarry, int petNum) throws IllegalArgumentException {
        super(address, propertySize, monthly, previousCarry, petNum);
    }

    @Override
    public double calculatePrice() throws IllegalArgumentException {
        double price;
        switch(getPropertySize()){
            case SMALL:
                price = HOURLY_PRICE;
                break;
            case MEDIUM:
                price = HOURLY_PRICE * 2;
                break;
            case Large:
                price = HOURLY_PRICE * 4;
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
