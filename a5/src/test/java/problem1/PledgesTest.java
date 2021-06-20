package problem1;

import org.junit.Before;
import org.junit.Test;

import java.time.LocalDateTime;

import static org.junit.Assert.*;

public class PledgesTest {
    private LocalDateTime testReceive;
    private int testAmount;
    private Pledges testDonation;
    private Pledges testDonation2;
    private LocalDateTime testProcessTime;

    @Before
    public void setUp() throws Exception {
        testReceive = LocalDateTime.of(2021,6,10,11,20);
        testAmount = 100;
        testDonation = new Pledges(testAmount,testReceive);

        testDonation2 = new Pledges(testAmount);
        testProcessTime = LocalDateTime.of(2021,6,13,4,55);

    }

    @Test
    public void getProcessDate() {
        testDonation.setPledgeDate(testProcessTime);
        assertEquals(testDonation.getProcessDate(),testProcessTime);

    }

    @Test
    public void setPledgeDate() {
        testDonation.setPledgeDate(testProcessTime);
        assertEquals(testDonation.getProcessDate(),testProcessTime);
    }

    @Test
    public void changePledgeDate() throws Exception{
        Throwable e = null;
        try {
            LocalDateTime newDate = LocalDateTime.of(2020, 12, 4, 23, 43);
            testDonation.changePledgeDate(newDate);
        } catch(Throwable ex){
            e = ex;
        }
        assertTrue(e instanceof IllegalArgumentException);

        LocalDateTime correct = LocalDateTime.of(2021,7,8,12,23);
        testDonation.changePledgeDate(correct);
        assertEquals(testDonation.getProcessDate(),correct);

    }

    @Test
    public void removePledgeDate() {
        testDonation.setPledgeDate(testProcessTime);
        testDonation.removePledgeDate();
        assertEquals(testDonation.getProcessDate(),null);
    }

    @Test
    public void getAmount() {
        assertEquals(testDonation.getAmount(2021),0);

        testDonation.setPledgeDate(LocalDateTime.now());
        assertEquals(testDonation.getAmount(2021),100);

    }
    @Test
    public void testEquals() {
        assertEquals(testDonation,testDonation);
        assertNotEquals(testDonation,null);
        assertFalse(testDonation.equals(null));
        assertTrue(testDonation.equals(testDonation));
        LocalDateTime cancelTime1 = LocalDateTime.of(2021,10,6,3,4);
        Pledges test2 = new Pledges(200,cancelTime1);
        assertFalse(testDonation.equals(test2));
    }

    @Test
    public void testHashCode() {
        LocalDateTime test = LocalDateTime.of(2021,6,10,11,20);
        Pledges testD = new Pledges(100,test);
        assertEquals(testDonation.hashCode(),testD.hashCode());

    }

    @Test
    public void testToString() {
        String res = "Pledges{processDate=null}Donation{amount=100, receiveTime=2021-06-10T11:20}";
        assertEquals(res,testDonation.toString());

    }
}