public class Gardening extends Exterior{
    public Gardening(String address, PropertySize propertySize, Boolean monthly, Integer previousCarry) throws IllegalArgumentException {
        super(address, propertySize, monthly, previousCarry);
    }

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
