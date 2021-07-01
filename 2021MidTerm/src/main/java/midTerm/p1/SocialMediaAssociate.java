package midTerm.p1;

import java.util.Objects;

/**
 * Rerpresents a class for SocialMediaAssociate
 */
public class SocialMediaAssociate extends EmployeeAbstract{
    /**
     * Constructs a SocialMediaAssociate
     * @param basePay - contractual base pay
     * @param bonus - contractual bonus
     * @param overTimeEarning - contractual overtime earnings
     * @param overTimeHours - number of overtime hours that month
     */
    public SocialMediaAssociate(Double basePay, Double bonus, Double overTimeEarning, Integer overTimeHours) {
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
        SocialMediaAssociate that = (SocialMediaAssociate) o;
        return Objects.equals(basePay, that.basePay) && Objects.equals(bonus, that.bonus) && Objects.equals(overTimeEarning, that.overTimeEarning) && Objects.equals(overTimeHours, that.overTimeHours);
    }

    @Override
    public int hashCode() {
        return Objects.hash(basePay, bonus, overTimeEarning, overTimeHours);
    }

    @Override
    public String toString() {
        return super.toString() + "SocialMediaAssociate{}";
    }
}
