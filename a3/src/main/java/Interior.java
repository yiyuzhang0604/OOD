import java.util.Objects;

public abstract class Interior extends AbstractServices{
    private int petNum;

    /**
     * Constructs an abstract class Interior which is a subclass from abstract class AbstractServices
     * @param address - the address of the service
     * @param propertySize - the size of the property
     * @param monthly - true if it is monthly service
     * @param previousCarry - the number of previous services
     * @param petNum - the number of pets
     * @throws IllegalArgumentException
     */
    public Interior(String address, PropertySize propertySize, Boolean monthly, Integer previousCarry, int petNum) throws IllegalArgumentException {
        super(address, propertySize, monthly, previousCarry);
        if(petNum < 0){
            throw new IllegalArgumentException("The number of pets cannot be negative");
        }

        this.petNum = petNum;
    }

    /**
     * Calculate the new price after adding pet fee
     * @param fullPrice - the original price
     * @return the new price
     */
    public double petFee(double fullPrice){
        double RATE = 0.0;
        if(petNum <= 2){
            RATE = 0.03;
        }else if(petNum > 2){
            RATE = 0.07;
        }
        return fullPrice * RATE;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Interior interior = (Interior) o;
        return petNum == interior.petNum;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), petNum);
    }

    @Override
    public String toString() {
        return super.toString() + "pets=" +petNum;
    }
}
