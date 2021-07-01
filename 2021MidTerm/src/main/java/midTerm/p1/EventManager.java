package midTerm.p1;

import java.util.Objects;

/**
 * Represents an EventManger abstract class
 */
public abstract class EventManager extends EmployeeAbstract{
    private static final Double EVENT_FACTOR = 1.1;
    private static final Integer PEOPLE_BONUS = 100;
    private static final Integer BONUS_MAXIMUM = 1000;
    private Integer numberOfPeople;
    private Integer numberOfEvents;

    /**
     * Constructs an event manager
     * @param basePay - contractual base pay
     * @param bonus - contractual bonus
     * @param overTimeEarning - contractual overtime earnings
     * @param overTimeHours - number of overtime hours that month
     * @param numberOfPeople - number of people
     * @param numberOfEvents - number of projects
     */
    public EventManager(Double basePay, Double bonus, Double overTimeEarning, Integer overTimeHours, Integer numberOfPeople, Integer numberOfEvents) {
        super(basePay, bonus, overTimeEarning, overTimeHours);
        this.numberOfPeople = numberOfPeople;
        this.numberOfEvents = numberOfEvents;
    }

    /**
     * Get the number of people they manage
     * @return the number of people
     */
    public Integer getNumberOfPeople() {
        return numberOfPeople;
    }

    /**
     * Return the number of events they throw this month
     * @return the number of events
     */
    public Integer getNumberOfEvents() {
        return numberOfEvents;
    }

    /**
     * Calculate the overtime earnings of Event Manager
     * @return overtime earnings
     */
    public Double getOvertimeEarning(){
        return this.overTimeEarning * this.overTimeHours * EVENT_FACTOR;
    }

    /**
     * Calculate the manager bonus
     * @return the manager bonus
     */
    public Integer getMangerBonus(){
        Integer bonus = this.numberOfPeople * PEOPLE_BONUS;
        if(bonus > BONUS_MAXIMUM){
            return BONUS_MAXIMUM;
        }
        return bonus;
    }

    /**
     * {@inheritDoc}
     */

    @Override
    public Double calculateTotalEarnings() {
        return super.calculateTotalEarnings() + this.getOvertimeEarning() + this.getMangerBonus();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        EventManager that = (EventManager) o;
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
        return super.toString() + "EventManager{" +
                "numberOfPeople=" + numberOfPeople +
                ", numberOfEvents=" + numberOfEvents +
                '}';
    }
}
