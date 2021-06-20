package problem1;
import java.time.LocalDateTime;

/**
 * OneTimeDonation is a subclass of Donation
 */
public class OneTimeDonation extends Donation{
    /**
     * Constructs a OneTimeDonation object
     * @param amount - the amount
     * @param receiveTime - the receive time
     */
    public OneTimeDonation(int amount, LocalDateTime receiveTime) {
        super(amount, receiveTime);
    }

    /**
     * Constructs a OneTimeDonation object when there is not receive date
     * @param amount - amount
     */
    public OneTimeDonation(int amount) {
        super(amount);
    }


    @Override
    public int getAmount(int year){
        return this.getAmount();
    }
    @Override
    public String toString() {
        return "One Time Donation: " + super.toString();
    }
}
