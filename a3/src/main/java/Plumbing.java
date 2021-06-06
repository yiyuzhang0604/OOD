/**
 * Plumbing class provides functions and field of plumbing services
 */
public class Plumbing extends Specialist{
    private double fee = 20.0;

    /**
     * Constructs a plumbing service
     * @param address - the address of the service
     * @param propertySize - the size of property
     * @param monthly - if it is monthly
     * @param previousCarry the number of previous service
     * @param employeeNum - the number of employees needed
     * @param complex - if the task is complex
     * @throws IllegalArgumentException throw exception
     */
    public Plumbing(String address, PropertySize propertySize, Boolean monthly, Integer previousCarry, Integer employeeNum, boolean complex) throws IllegalArgumentException {
        super(address, propertySize, monthly, previousCarry, employeeNum, complex);
    }

    /**
     * Calculate the price of service
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
        return "Plumbing" + super.toString();
    }
}
