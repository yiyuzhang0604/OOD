/**
 * Gardening class provides functions and fields of the service
 */
public class Gardening extends Exterior{
    /**
     *Constructs a Gardening service
     * @param address - the address of the service
     * @param propertySize - the size of property
     * @param monthly - if it is monthly
     * @param previousCarry the number of previous service
     * @throws IllegalArgumentException throw exception
     */
    public Gardening(String address, PropertySize propertySize, Boolean monthly, Integer previousCarry) throws IllegalArgumentException {
        super(address, propertySize, monthly, previousCarry);
    }

    /**
     * Calculate the price of gardening
     * @return new price
     */
    @Override
    public double calculatePrice() {
        double waste = 20.0;
        return applyDiscount(super.calculatePrice() + waste);
    }

    @Override
    public String toString() {
        return "Gardening:" + super.toString();
    }
}
