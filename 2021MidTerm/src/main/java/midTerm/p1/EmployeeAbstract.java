package midTerm.p1;

import java.util.Objects;

/**
 * Represents an abstract class for Employee
 */
public abstract class EmployeeAbstract implements PayrollSystem{
    protected Double basePay;
    protected Double bonus;
    protected Double overTimeEarning;
    protected Integer overTimeHours;

    /**
     * Constructs an EmployeeAbstract obejct
     * @param basePay - contractual base pay
     * @param bonus - contractual bonus
     * @param overTimeEarning - contractual overtime earnings
     * @param overTimeHours - number of overtime hours that month
     */
    public EmployeeAbstract(Double basePay, Double bonus, Double overTimeEarning, Integer overTimeHours) {
        this.basePay = basePay;
        this.bonus = bonus;
        this.overTimeEarning = overTimeEarning;
        this.overTimeHours = overTimeHours;
    }

    /**
     * Get the base pay
     * @return base pay
     */
    public Double getBasePay() {
        return basePay;
    }

    /**
     * Get the bonus
     * @return bonus
     */
    public Double getBonus() {
        return bonus;
    }

    /**
     * Get the overtime Earnings
     * @return overtime Earnings
     */
    public Double getOverTimeEarning() {
        return overTimeEarning;
    }

    /**
     * get the overtime hours
     * @return overtime hours
     */
    public Integer getOverTimeHours() {
        return overTimeHours;
    }

    /**
     * Calculate the subtotal earning
     * @return subtotal
     */
    public Double calculateTotalEarnings(){
        return this.basePay + this.bonus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeAbstract that = (EmployeeAbstract) o;
        return Objects.equals(basePay, that.basePay) && Objects.equals(bonus, that.bonus) && Objects.equals(overTimeEarning, that.overTimeEarning) && Objects.equals(overTimeHours, that.overTimeHours);
    }

    @Override
    public int hashCode() {
        return Objects.hash(basePay, bonus, overTimeEarning, overTimeHours);
    }

    @Override
    public String toString() {
        return "EmployeeAbstract{" +
                "basePay=" + basePay +
                ", bonus=" + bonus +
                ", overTimeEarning=" + overTimeEarning +
                ", overTimeHours=" + overTimeHours +
                '}';
    }
}
