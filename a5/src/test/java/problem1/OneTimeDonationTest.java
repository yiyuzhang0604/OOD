package problem1;

import org.junit.Before;
import org.junit.Test;

import java.time.LocalDateTime;

import static org.junit.Assert.*;

public class OneTimeDonationTest {
    private LocalDateTime testReceive;
    private int testAmount;
    private OneTimeDonation testDonation;
    OneTimeDonation test2;

    @Before
    public void setUp() throws Exception {
        testReceive = LocalDateTime.of(2021,6,10,11,20);
        testAmount = 100;
        testDonation = new OneTimeDonation(testAmount,testReceive);
        test2 = new OneTimeDonation(100);


    }

    @Test
    public void getAmount() {
        assertEquals(testDonation.getAmount(),100);
        assertEquals(test2.getAmount(),100);

    }

    @Test
    public void testToString() {
        String res = "One Time Donation: Donation{amount=100, receiveTime=2021-06-10T11:20}";
        assertEquals(res,testDonation.toString());
    }
    @Test
    public void testEquals() {
        assertEquals(testDonation,testDonation);
        assertNotEquals(testDonation,null);
        assertFalse(testDonation.equals(null));
        assertTrue(testDonation.equals(testDonation));
        LocalDateTime cancelTime1 = LocalDateTime.of(2021,10,6,3,4);
        OneTimeDonation test2 = new OneTimeDonation(200,cancelTime1);
        assertFalse(testDonation.equals(test2));
    }

    @Test
    public void testHashCode() {
        LocalDateTime test = LocalDateTime.of(2021,6,10,11,20);
        OneTimeDonation testD = new OneTimeDonation(100,test);
        assertEquals(testDonation.hashCode(),testD.hashCode());

    }

}