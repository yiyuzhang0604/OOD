import java.util.Objects;

/**
 * Specialist class provides functions and fields of specialist services
 */
public abstract class Specialist extends AbstractServices {
    private Integer employeeNum;
    private boolean complex;
    public static final double BASEPRICE = 200.0;

    /**
     * Construct a specialist class
     * @param address - the address of the service
     * @param propertySize - the size of the property
     * @param monthly - true if it is monthly service
     * @param previousCarry - the number of previous services
     * @param employeeNum - the number of employees
     * @param complex - the complexity of the service
     * @throws IllegalArgumentException throw exception
     */
    public Specialist(String address, PropertySize propertySize, Boolean monthly, Integer previousCarry, Integer employeeNum, boolean complex) throws IllegalArgumentException {
        super(address, propertySize, monthly, previousCarry);
        if(employeeNum < 1){
            this.employeeNum = 1;
        }
        if(complex){
            if(getPropertySize() == PropertySize.SMALL || getPropertySize() == PropertySize.MEDIUM){
                this.employeeNum = 2;
            }else if(getPropertySize() == PropertySize.Large){
                this.employeeNum = 3;
            }
        }
    }

    /**
     * Get the number of employee
     * @return the number of employee
     */
    public Integer getEmployeeNum() {
        return employeeNum;
    }

    /**
     * Get if the task is complex
     * @return true/false
     */
    public boolean isComplex() {
        return complex;
    }

    /**
     * Calculate the price of the service
     * @return the price
     */
    @Override
    public double calculatePrice() {
        return employeeNum * BASEPRICE;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Specialist sp = (Specialist) o;
        return employeeNum == sp.employeeNum && complex == sp.complex;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), employeeNum,complex);
    }

    @Override
    public String toString() {
        return super.toString() + " employee:" + employeeNum + " complex:" + complex;
    }
}

