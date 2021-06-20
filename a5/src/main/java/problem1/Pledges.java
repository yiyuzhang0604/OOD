package problem1;
import java.time.LocalDateTime;
import java.util.Objects;

/**
 * Pledges class is a subclass of Donation class
 */
public class Pledges extends Donation{
    private LocalDateTime processDate;
    public static final int ZERO_DONATION = 0;
    /**
     * Constructs a Pledge class object when both two arguments are passed in
     * @param amount - the amount of the pledge
     * @param receiveTime - the date receive the pledge
     */
    public Pledges(int amount, LocalDateTime receiveTime) {
        super(amount, receiveTime);
    }

    /**
     * Constructs a Pledege when no create date is passed in
     * @param amount amount
     */
    public Pledges(int amount){
        super(amount);
    }


    /**
     * Constructs a pleadge with the receive date, process date and amount
     * @param receiveDate - the date receive the pledge
     * @param processDate - the date the pledge will process
     * @param amount - the donation amount
     */
    public Pledges(LocalDateTime receiveDate, LocalDateTime processDate, int amount) throws IllegalArgumentException{
        super(amount,receiveDate);
        this.setPledgeDate(processDate);

    }

    /**
     * Get the processDate
     * @return the processDate
     */
    public LocalDateTime getProcessDate() {
        return processDate;
    }

    /**
     * Set the process date
     * @param processDate the date that the pledge will be processed
     */
    public void setPledgeDate(LocalDateTime processDate){
        this.processDate = processDate;
    }

    /**
     * Change the process date
     * @param newDate - the new process date
     */
    public void changePledgeDate(LocalDateTime newDate) throws IllegalArgumentException{
        if(newDate.isBefore(this.getReceiveTime())){
            throw new IllegalArgumentException("Process date cannot be prior to receive date!");
        }else{
            this.setPledgeDate(newDate);
        }
    }

    /**
     * Remove the process date
     */
    public void removePledgeDate(){
        this.processDate = null;
    }

    /**
     * Get the total amount of certain year
     * @param year - the year
     * @return the total amount
     */

    @Override
    public int getAmount(int year){
        LocalDateTime currTime = LocalDateTime.now();
        LocalDateTime process = this.getProcessDate();
        if(process == null || process.isAfter(currTime)) return ZERO_DONATION;
        return this.getAmount();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Pledges pledges = (Pledges) o;
        return Objects.equals(processDate, pledges.processDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), processDate);
    }

    @Override
    public String toString() {
        return "Pledges{" +
                "processDate=" + processDate +
                '}'+ super.toString();
    }
}
