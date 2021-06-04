import java.util.Objects;

public abstract class AbstractServices implements Services{

    private String address;
    private PropertySize propertySize;
    private Boolean monthly;
    private Integer previousCarry;
    public static final Double HOURLY_PRICE = 80.0;


    /**
     * Constructs an AbstractService object
     * @param address - the address of the service
     * @param propertySize - the size of the property
     * @param monthly - if the services is conducted monthly
     * @param previousCarry - the number of previous services conducted
     * @throws IllegalArgumentException
     */
    public AbstractServices(String address, PropertySize propertySize, Boolean monthly, Integer previousCarry) throws IllegalArgumentException{
        if(previousCarry < 0){
            throw new IllegalArgumentException("Can't have negative previous services");
        }

        this.address = address;
        this.propertySize = propertySize;
        this.monthly = monthly;
        this.previousCarry = previousCarry;
    }

    /**
     * Method that determine which discount should be applied
     * @param fullPrice - original price
     * @return newPrice - the price after applying dicount
     */
    public double applyDiscount(double fullPrice){
        double newPrice = 0;
        if(previousCarry % 9 == 0){
            newPrice = tenDiscount(fullPrice);
        }else if(monthly == true){
            newPrice = monthlyDiscount(fullPrice);
        }
        return newPrice;
    }

    /**
     * monthly discount
     * @param fullPrice - the full price of the services
     * @return the price after applying the monthly discount
     */
    public double monthlyDiscount(double fullPrice){
        double RATE = 0.1;
        return fullPrice *(1 - RATE);
    }

    /**
     * tenth services dicount
     * @param fullPrice - the full price of the services
     * @return the price after applying the special discount
     */

    public double tenDiscount(double fullPrice){
        double RATE = 0.5;
        return fullPrice * RATE;

    }
    @Override
    public String toString(){
        return String.format("address = %s size = %s monthly = %b prvious = %d",
                             address,propertySize,monthly,previousCarry);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractServices that = (AbstractServices) o;
        return Objects.equals(address, that.address) &&
                propertySize == that.propertySize &&
                Objects.equals(monthly, that.monthly) &&
                Objects.equals(previousCarry, that.previousCarry);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address, propertySize, monthly, previousCarry);
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public PropertySize getPropertySize() {
        return propertySize;
    }

    @Override
    public boolean isMonthly() {
        return monthly;
    }

    @Override
    public int getPrevious() {
        return previousCarry;
    }
}
