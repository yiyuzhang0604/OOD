package problem1;

import org.junit.Before;
import org.junit.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;


import static org.junit.Assert.*;

public class NonProfitTest {
    private String testName;
    private ArrayList<Donation> testList;
    private NonProfit testNGO;
    private OneTimeDonation oneTime;
    private LocalDateTime testReceive;
    private int testAmount;



    @Before
    public void setUp() throws Exception {
        testName = "Offer";
        testList = new ArrayList<>();
        testNGO = new NonProfit(testName,testList);
        testReceive = LocalDateTime.of(2021,6,10,11,20);
        testAmount = 100;
        oneTime = new OneTimeDonation(testAmount,testReceive);
    }

    @Test
    public void getName() {
        assertEquals(testName,testNGO.getName());
    }

    @Test
    public void getDonationList() {
        assertEquals(testList,testNGO.getDonationList());

        testNGO.donate(oneTime);
        ArrayList<Donation> exp = new ArrayList<>();
        exp.add(oneTime);
        assertEquals(testNGO.getDonationList(),exp);
    }


    @Test
    public void donate() {
        testNGO.donate(oneTime);
        ArrayList<Donation> exp = new ArrayList<>();
        exp.add(oneTime);
        assertEquals(testNGO.getDonationList(),exp);
    }

    @Test
    public void getTotalDonationsForYear() {
        LocalDateTime test = LocalDateTime.of(2021,6,10,11,20);
        LocalDateTime process = LocalDateTime.of(2021,6,14,23,45);
        Pledges testD = new Pledges(test,process,100);

        MonthlyDonation month = new MonthlyDonation(100,test);
        month.setCancellationDate(LocalDateTime.of(2021,12,21,2,34));

        testNGO.donate(testD);
        testNGO.donate(oneTime);
        testNGO.donate(month);
        assertEquals(testNGO.getTotalDonationsForYear(2021),900);
    }
    @Test
    public void testToString() {
        testNGO.donate(oneTime);
        String res = "NonProfit{name=Offer, donationList=[One Time Donation: Donation{amount=100, receiveTime=2021-06-10T11:20}]}";
        assertEquals(res,testNGO.toString());
    }
    @Test
    public void testEquals() {
        assertEquals(testNGO,testNGO);
        assertFalse(testNGO.equals(null));
        assertTrue(testNGO.equals(testNGO));

        NonProfit testNGO2 = new NonProfit("Offer",testList);
        assertTrue(testNGO2.equals(testNGO));

        NonProfit testNGO3 = new NonProfit("Off",testList);
        assertFalse(testNGO3.equals(testNGO));

    }

    @Test
    public void testHashCode() {
        NonProfit testNGO2 = new NonProfit("Offer",testList);
        assertEquals(testNGO2.hashCode(),testNGO.hashCode());

    }
}