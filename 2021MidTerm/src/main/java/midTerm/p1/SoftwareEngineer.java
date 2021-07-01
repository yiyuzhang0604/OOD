package midTerm.p1;

import java.util.Objects;

/**
 * Represents a class for Software Engineer
 */
public class SoftwareEngineer extends EmployeeAbstract{
    /**
     * Constructs a SoftwareEngineer
     * @param basePay - contractual base pay
     * @param bonus - contractual bonus
     * @param overTimeEarning - contractual overtime earnings
     * @param overTimeHours - number of overtime hours that month
     */
    public SoftwareEngineer(Double basePay, Double bonus, Double overTimeEarning, Integer overTimeHours) {
        super(basePay, bonus, overTimeEarning, overTimeHours);
    }
    @Override
    public Double calculateTotalEarnings() {
        return super.calculateTotalEarnings();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SoftwareEngineer that = (SoftwareEngineer) o;
        return Objects.equals(basePay, that.basePay) && Objects.equals(bonus, that.bonus) && Objects.equals(overTimeEarning, that.overTimeEarning) && Objects.equals(overTimeHours, that.overTimeHours);
    }

    @Override
    public int hashCode() {
        return Objects.hash(basePay, bonus, overTimeEarning, overTimeHours);
    }

    @Override
    public String toString() {
        return super.toString() + "SoftwareEngineer{}";
    }

}
