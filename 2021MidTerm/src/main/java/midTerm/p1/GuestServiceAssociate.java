package midTerm.p1;

import java.util.Objects;

/**
 * Represents a class for guestServiceAssociate
 */
public class GuestServiceAssociate extends GuestRelationsSpecialist{
    public GuestServiceAssociate(Double basePay, Double bonus, Double overTimeEarning, Integer overTimeHours) {
        super(basePay, bonus, overTimeEarning, overTimeHours);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        GuestServiceAssociate that = (GuestServiceAssociate) o;
        return Objects.equals(getBasePay(), that.getBasePay()) &&
                Objects.equals(getBonus(), that.getBonus()) &&
                Objects.equals(getOverTimeEarning(), that.getOverTimeEarning()) &&
                Objects.equals(getOverTimeHours(), that.getOverTimeHours());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode());
    }

    @Override
    public String toString() {
        return super.toString() + "GuestServiceAssociate{}";
    }
}
