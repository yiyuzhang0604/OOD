package midTerm.p1;

import java.util.Objects;

/**
 * Represents a class for manager
 */
public class Manger extends EmployeeAbstract{
    private static final Double OVERTIME_FACTOR = 1.2;
    private static final Integer MANGE_BONUS = 500;
    private static final Integer MAXIMUM_BONUS = 5000;
    private Integer numberOfPeople;
    private Integer numberOfEvents;

    /**
     * Constructs a manager
     * @param basePay - contractual base pay
     * @param bonus - contractual bonus
     * @param overTimeEarning - contractual overtime earnings
     * @param overTimeHours - number of overtime hours that month
     * @param numberOfPeople - number of people
     * @param numberOfEvents - number of projects
     */
    public Manger(Double basePay, Double bonus, Double overTimeEarning, Integer overTimeHours, Integer numberOfPeople, Integer numberOfEvents) {
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
     * Calculate the overtime earning for manager
     * @return overtime earning
     */
    public Double getOvertimeEarning(){
        return this.overTimeEarning * this.overTimeHours * OVERTIME_FACTOR;
    }
    public Integer getMangerBonus(){
        Integer bonus = this.numberOfPeople * MANGE_BONUS;
        if(bonus > MAXIMUM_BONUS){
            return MAXIMUM_BONUS;
        }
        return bonus;

    }

    @Override
    public Double calculateTotalEarnings() {
        return super.calculateTotalEarnings() + this.getOverTimeEarning() + this.getMangerBonus();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Manger that = (Manger) o;
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
        return super.toString() + "Manger{" +
                "numberOfPeople=" + numberOfPeople +
                ", numberOfEvents=" + numberOfEvents +
                '}';
    }
}
