package problem1;

import java.util.ArrayList;
import java.util.Objects;

public class NonProfit {
    private String name;
    private ArrayList<Donation> donationList;

    /**
     * Constructs a NonProfit object
     * @param name - the name of the non-profit
     * @param donationList - the collection of the donations received
     */
    public NonProfit(String name, ArrayList<Donation> donationList) {
        this.name = name;
        this.donationList = donationList;
    }

    /**
     * Get the name of the non-profit
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Get the list of donation
     * @return list of donation
     */
    public ArrayList<Donation> getDonationList() {
        return donationList;
    }

    /**
     * Add new donation to the current collection
     * @param donation - the donation
     */
    public void donate(Donation donation){
        this.donationList.add(donation);
    }

    /**
     * Get the total donation amount of certain year
     * @param year - year
     * @return - the total amount
     */
    public int getTotalDonationsForYear(Integer year){
        int total = 0;
        for(Donation item: donationList){
            total += item.getAmount(year);
        }
        return total;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NonProfit nonProfit = (NonProfit) o;
        return Objects.equals(name, nonProfit.name) && Objects.equals(donationList, nonProfit.donationList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, donationList);
    }

    @Override
    public String toString() {
        return "NonProfit{" +
                "name=" + name +
                ", donationList=" + donationList +
                '}';
    }
}
