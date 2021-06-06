/**
 * Electrical class provides functions of electrial service
 */
public class Electrical extends Specialist {
    private Integer MAX = 4;
    private double fee = 50.0;

    /**
     * Constructs an electrical service
     * @param address - the address of the service
     * @param propertySize - the size of property
     * @param monthly - if it is monthly
     * @param previousCarry the number of previous service
     * @param employeeNum - the number of empolyee needed
     * @param complex - if the task is complex or not
     * @throws IllegalArgumentException throw exception
     */
    public Electrical(String address, PropertySize propertySize, Boolean monthly, Integer previousCarry, Integer employeeNum, boolean complex) throws IllegalArgumentException {
        super(address, propertySize, monthly, previousCarry, employeeNum, complex);
    }

    /**
     * Calculate the price of electrical service
     * @return new price
     */
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
