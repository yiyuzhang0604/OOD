package midTerm.p1;

import java.util.Objects;

/**
 * Concrete class for FoodServer
 */
public class FoodServer extends EmployeeAbstract {
    private static final Double CHEF_RATE = 1.5;
    private Double tip;

    /**
     * Constructs a FoodServer object
     * @param basePay - contractual base pay
     * @param bonus - contractual bonus
     * @param overTimeEarning - contractual overtime earnings
     * @param overTimeHours - number of overtime hours that month
     * @param tip - tip
     */
    public FoodServer(Double basePay, Double bonus, Double overTimeEarning, Integer overTimeHours, Double tip) {
        super(basePay, bonus, overTimeEarning, overTimeHours);
        this.tip = tip;
    }

    /**
     * Get the tips
     * @return tips
     */
    public Double getTip() {
        return tip;
    }

    /**
     * Calculate the overtime earnings for food servers
     * @return overtime earnings
     */
    public Double getOvertimeEarning(){
        return this.getOverTimeEarning() * this.getOverTimeHours() * CHEF_RATE;
    }

    /**
     * {@inheritDoc}
     */

    @Override
    public Double calculateTotalEarnings() {
        return super.calculateTotalEarnings() + this.getOvertimeEarning() + this.getTip();
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        FoodServer that = (FoodServer) o;
        return Objects.equals(getBasePay(), that.getBasePay()) &&
                Objects.equals(getBonus(), that.getBonus()) &&
                Objects.equals(getOverTimeEarning(), that.getOverTimeEarning()) &&
                Objects.equals(getOverTimeHours(), that.getOverTimeHours()) &&
                Objects.equals(getTip(), that.getTip());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getTip());
    }

    @Override
    public String toString() {
        return super.toString() + "FoodServer{" +
                "tip=" + tip +
                '}';
    }
}
