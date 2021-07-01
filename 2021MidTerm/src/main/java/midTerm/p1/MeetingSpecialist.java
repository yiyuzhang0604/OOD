package midTerm.p1;

import java.util.Objects;

/**
 * Rerpresents a class for MeetingSpecialist
 */
public class MeetingSpecialist extends EventManager{
    private static final Integer EVENT_BONUS = 500;
    private static final Integer MAXIMUM_BONUS = 3000;

    /**
     * Constructs a Meeting Specialist
     * @param basePay - contractual base pay
     * @param bonus - contractual bonus
     * @param overTimeEarning - contractual overtime earnings
     * @param overTimeHours - number of overtime hours that month
     * @param numberOfPeople - number of people
     * @param numberOfEvents - number of projects
     */
    public MeetingSpecialist(Double basePay, Double bonus, Double overTimeEarning,
                             Integer overTimeHours, Integer numberOfPeople, Integer numberOfEvents) {
        super(basePay, bonus, overTimeEarning, overTimeHours, numberOfPeople, numberOfEvents);
    }

    /**
     * Calculate the event bonus
     * @return event bonus
     */
    public Integer getEventBonus(){
        Integer bonus = this.getNumberOfEvents() * EVENT_BONUS;
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
        return super.calculateTotalEarnings() + this.getEventBonus();
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        MeetingSpecialist that = (MeetingSpecialist) o;
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
        return super.toString() + "MeetingSpecialist{}";
    }
}
