package midTerm.p1;

import java.util.Objects;

/**
 * Represents a class for Wedding Coordinator
 */
public class WeddingCoordinator extends EventManager{
    private static final Integer WEDDING_BONUS = 1000;
    private static final Integer MAXIMUM_BONUS = 4000;

    /**
     * Constructs a Wedding Coordinator
     * @param basePay - contractual base pay
     * @param bonus - contractual bonus
     * @param overTimeEarning - contractual overtime earnings
     * @param overTimeHours - number of overtime hours that month
     * @param numberOfPeople - number of people
     * @param numberOfEvents - number of projects
     */
    public WeddingCoordinator(Double basePay, Double bonus, Double overTimeEarning,
                              Integer overTimeHours, Integer numberOfPeople, Integer numberOfEvents) {
        super(basePay, bonus, overTimeEarning, overTimeHours, numberOfPeople, numberOfEvents);
    }

    /**
     * Calculate the wedding bonus
     * @return wedding bonus
     */
    public Integer getWeddingBonus(){
        Integer bonus = this.getNumberOfEvents() * WEDDING_BONUS;
        if(bonus > MAXIMUM_BONUS){
            return MAXIMUM_BONUS;
        }
        return bonus;
    }

    /**
     * {@inheritDoc}
     */

    @Override
    public Double calculateTotalEarnings() {
        return super.calculateTotalEarnings() + this.getWeddingBonus();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        WeddingCoordinator that = (WeddingCoordinator) o;
        return Objects.equals(getBasePay(), that.getBasePay()) &&
                Objects.equals(getBonus(), that.getBonus()) &&
                Objects.equals(getOverTimeEarning(), that.getOverTimeEarning()) &&
                Objects.equals(getOverTimeHours(), that.getOverTimeHours()) &&
                Objects.equals(getNumberOfPeople(), that.getNumberOfPeople()) &&
                Objects.equals(getNumberOfEvents(), that.getNumberOfEvents());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getNumberOfPeople(),getNumberOfEvents());
    }

    @Override
    public String toString() {
        return super.toString() + "WeddingCoordinator{}";
    }


}
