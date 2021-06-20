package problem1;
import java.time.LocalDateTime;
import java.time.Month;

/**
 * MonthlyDonation class to handle monthly donation
 */
public class MonthlyDonation extends Donation{
    public static final int NO_DONATION = 0;
    public static final int JANUARY = 1;
    public static final int DECEMBER = 12;
    /**
     * Construct a monthlyDonation object
     * @param amount - the amount of donation
     * @param receiveTime - the time receive the donation
     */
    private LocalDateTime cancelDate;
    public MonthlyDonation(int amount, LocalDateTime receiveTime) {
        super(amount, receiveTime);
    }


    /**
     * Set the cancel date for monthly donation
     * @param cancel - the cancel date
     * @throws IllegalArgumentException - throw if cancel date is before receive date
     */
    public void setCancellationDate(LocalDateTime cancel) throws IllegalArgumentException{
        if(cancel.isBefore(this.getReceiveTime())){
            throw new IllegalArgumentException("The cancellation data cannot happen before received date");
        }else{
            this.cancelDate = cancel;
        }
    }

    public LocalDateTime getCancelDate() {
        return cancelDate;
    }

    /**
     * Get amount
     * @param year - the year
     * @return the total mount of the year
     */
    @Override
    public int getAmount(int year){
        int totalMonth = 0;
        if(this.getReceiveTime().getYear() != year){
            return NO_DONATION;
        }else{
            LocalDateTime begin = LocalDateTime.of(year,(this.receiveTime.getYear() < year)? DECEMBER:
                                                  this.getReceiveTime().getMonthValue(),this.getReceiveTime().getDayOfMonth(),0,0);
            LocalDateTime end = LocalDateTime.of(year,(this.getCancelDate().getYear() > year)? DECEMBER:
                                                 this.getCancelDate().getMonthValue(),this.getCancelDate().getDayOfMonth(),0,0);

            if(end.getDayOfMonth() < this.getReceiveTime().getDayOfMonth()){
                totalMonth = end.getMonthValue() - begin.getMonthValue();
            }else {
                totalMonth = end.getMonthValue() - begin.getMonthValue() + 1;
            }
            return totalMonth * this.getAmount();
        }


    }

    @Override
    public String toString() {
        return "Monthly Donation: " + super.toString();
    }
}
