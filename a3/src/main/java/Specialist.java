import java.util.Objects;

public abstract class Specialist extends AbstractServices {
    private Integer employeeNum;
    private boolean complex;
    public static final double BASEPRICE = 200.0;

    /**
     * Construct a specialist class
     * @param address
     * @param propertySize
     * @param monthly
     * @param previousCarry
     * @param employeeNum
     * @param complex - the complexity of the service
     * @throws IllegalArgumentException
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

    public Integer getEmployeeNum() {
        return employeeNum;
    }

    public boolean isComplex() {
        return complex;
    }

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

