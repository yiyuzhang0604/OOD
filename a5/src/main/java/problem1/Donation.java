package problem1;
import java.time.LocalDateTime;
import java.util.Objects;

/**
 * Abstract class Donation, include basic information about the donation
 */
public abstract class Donation {
    protected int amount;
    protected LocalDateTime receiveTime;

    /**
     * Construct a donation
     * @param amount - the amount of the donation
     * @param receiveTime - the time that receive the donation
     */
    public Donation(int amount, LocalDateTime receiveTime) {
        this.amount = amount;
        this.receiveTime = receiveTime;
        if(this.receiveTime == null){
            this.receiveTime = LocalDateTime.now();
        }
    }

    /**
     * Constructs a donation object with only amount
     * @param amount amount
     */

    public Donation(int amount){
        this.amount = amount;
        this.receiveTime = LocalDateTime.now();
    }

    /**
     * Return the amount
     * @return amount
     */
    public int getAmount() {
        return amount;
    }

    /**
     * An abstract method to get donation amount of certain year
     * @param year - the year
     * @return - total amount
     */
    public abstract int getAmount(int year);

    /**
     * Return the receive time
     * @return receive time
     */
    public LocalDateTime getReceiveTime() {
        return receiveTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Donation donation = (Donation) o;
        return amount == donation.amount && receiveTime.equals(donation.receiveTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, receiveTime);
    }

    @Override
    public String toString() {
        return "Donation{" +
                "amount=" + amount +
                ", receiveTime=" + receiveTime +
                '}';
    }
}

