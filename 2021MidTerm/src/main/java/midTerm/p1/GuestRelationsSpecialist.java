package midTerm.p1;

import java.util.Objects;

/**
 * An abstract class for Guest Relations Specialist
 */
public abstract class GuestRelationsSpecialist extends EmployeeAbstract {
    /**
     * Constructs a GuestRelationsSpecialist object
     * @param basePay - contractual base pay
     * @param bonus - contractual bonus
     * @param overTimeEarning - contractual overtime earnings
     * @param overTimeHours - number of overtime hours that month
     */
    public GuestRelationsSpecialist(Double basePay, Double bonus, Double overTimeEarning, Integer overTimeHours) {
        super(basePay, bonus, overTimeEarning, overTimeHours);
    }

    @Override
    public String toString() {
        return super.toString() + "GuestRelationsSpecialist{}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        GuestRelationsSpecialist that = (GuestRelationsSpecialist) o;
        return Objects.equals(getBasePay(), that.getBasePay()) &&
                Objects.equals(getBonus(), that.getBonus()) &&
                Objects.equals(getOverTimeEarning(), that.getOverTimeEarning()) &&
                Objects.equals(getOverTimeHours(), that.getOverTimeHours());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode());
    }
}

