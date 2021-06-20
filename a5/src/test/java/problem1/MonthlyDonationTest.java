package problem1;

import jdk.vm.ci.meta.Local;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import java.time.LocalDateTime;

public class MonthlyDonationTest {
    private LocalDateTime testReceive;
    private int testAmount;
    private MonthlyDonation testDonation;

    @Before
    public void setUp() throws Exception {
        testReceive = LocalDateTime.of(2021,6,10,11,20);
        testAmount = 100;
        testDonation = new MonthlyDonation(testAmount,testReceive);

    }

    @Test
    public void setCancellationDate() throws Exception{
        Throwable e = null;
        try{
            LocalDateTime testFail = LocalDateTime.of(2020,12,24,21,10);
            testDonation.setCancellationDate(testFail);
        } catch(Throwable ex){
            e = ex;
        }
        assertTrue(e instanceof IllegalArgumentException);

        LocalDateTime testProcess = LocalDateTime.now();
        testDonation.setCancellationDate(testProcess);
        assertEquals(testDonation.getCancelDate(),testProcess);


    }

    @Test
    public void getCancelDate() {
        LocalDateTime testProcess = LocalDateTime.now();
        testDonation.setCancellationDate(testProcess);
        assertEquals(testDonation.getCancelDate(),testProcess);

    }

    @Test
    public void getAmount() {
        LocalDateTime cancelTime = LocalDateTime.of(2021,10,24,3,4);
        testDonation.setCancellationDate(cancelTime);
        assertEquals(testDonation.getAmount(2021),500);

        LocalDateTime cancelTime1 = LocalDateTime.of(2021,10,6,3,4);
        testDonation.setCancellationDate(cancelTime1);
        System.out.print(cancelTime);
        assertEquals(testDonation.getAmount(2021),400);
    }

    @Test
    public void testEquals() {
        assertEquals(testDonation,testDonation);
        assertNotEquals(testDonation,null);
        assertFalse(testDonation.equals(null));
        assertTrue(testDonation.equals(testDonation));
        LocalDateTime cancelTime1 = LocalDateTime.of(2021,10,6,3,4);
        MonthlyDonation test2 = new MonthlyDonation(200,cancelTime1);
        assertFalse(testDonation.equals(test2));
    }

    @Test
    public void testHashCode() {
        LocalDateTime test = LocalDateTime.of(2021,6,10,11,20);
        MonthlyDonation testD = new MonthlyDonation(100,test);
        assertEquals(testDonation.hashCode(),testD.hashCode());

    }

    @Test
    public void testToString() {
        String res = "Monthly Donation: Donation{amount=100, receiveTime=2021-06-10T11:20}";
        assertEquals(res,testDonation.toString());
    }
}