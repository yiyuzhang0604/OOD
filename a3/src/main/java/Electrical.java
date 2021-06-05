public class Electrical extends Specialist {
    private Integer MAX = 4;
    private double fee = 50.0;

    public Electrical(String address, PropertySize propertySize, Boolean monthly, Integer previousCarry, Integer employeeNum, boolean complex) throws IllegalArgumentException {
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
        return "Electrical" + super.toString();
    }
}
