public class Plumbing extends Specialist{
    private double fee = 20.0;

    public Plumbing(String address, PropertySize propertySize, Boolean monthly, Integer previousCarry, Integer employeeNum, boolean complex) throws IllegalArgumentException {
        super(address, propertySize, monthly, previousCarry, employeeNum, complex);
    }
    @Override
    public double calculatePrice() {
        double fullPrice = super.calculatePrice();
        double newPrice = fullPrice + fee;
        return applyDiscount(newPrice);
    }
    @Override
    public String toString() {
        return "Plumbing" + super.toString();
    }
}
