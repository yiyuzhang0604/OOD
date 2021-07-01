package midTerm.p1;

/**
 * Concrete class for Chef
 */
public class Chef extends EmployeeAbstract{
    private static final Double CHEF_FACTOR = 1.5;

    /**
     * Constructs a Chef object
     * @param basePay - contractual base pay
     * @param bonus - contractual bonus
     * @param overTimeEarning - contractual overtime earnings
     * @param overTimeHours - number of overtime hours that month
     */
    public Chef(Double basePay, Double bonus, Double overTimeEarning, Integer overTimeHours) {
        super(basePay, bonus, overTimeEarning, overTimeHours);
    }

    /**
     * Calculate Chef's overtime earnings
     * @return overtime earnings
     */
    public Double getOvertimeEarning(){
        return this.overTimeEarning * this.overTimeHours * CHEF_FACTOR;
    }

    /**
     * {@inheritDoc}
     */

    @Override
    public Double calculateTotalEarnings() {
        return super.calculateTotalEarnings() + this.getOvertimeEarning();
    }

    @Override
    public String toString() {
        return super.toString() + "Chef{}";
    }
}

