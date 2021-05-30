package problem2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LockerTest {
    private Mail testM;
    private Integer expectedWidth;
    private Integer expectedHeight;
    private Integer expectedDepth;
    private Locker testL;
    private Recipient testR;

    @Before
    public void setUp() throws Exception {
        testR = new Recipient("Briana","Zhang","brianazhang@gmail.com");
        testM = new Mail(1,1,1,testR);
        expectedWidth = 100;
        expectedHeight = 100;
        expectedDepth = 100;
        Mail originalLocker = new Mail(0,0,0,null);
        testL = new Locker(expectedWidth,expectedHeight,expectedDepth,originalLocker);
    }

    @Test
    public void addMail(Mail testM) throws Exception {

        Locker testEmptyLocker = new Locker(0,0,0,null);
        Mail testMail = testEmptyLocker.getMail();
        assertEquals(testMail.getRecipient(),null);



        //testL.addMail(testM);
        //assertEquals(testL.getMail(),testM);

    }

    @Test
    public Mail pickUpMail(Recipient testR){
    Mail expectedPickUp = testL.getMail();
    assertEquals(expectedPickUp, testL.pickUpMail(testR));
    return expectedPickUp;
    }
}
