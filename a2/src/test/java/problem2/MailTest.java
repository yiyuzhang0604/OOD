package problem2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MailTest {
    private Integer expectedWidth;
    private Integer expectedHeight;
    private Integer expectedDepth;
    private Recipient expectedRecipient;
    private Mail testM;

    @Before
    public void setUp() throws Exception {
        expectedWidth = 1;
        expectedHeight = 1;
        expectedDepth = 1;
        expectedRecipient = new Recipient("Briana","Zhang","brianazhang@gmail.com");
        testM = new Mail(expectedWidth,expectedHeight,expectedDepth,expectedRecipient);
    }

    @Test
    public void getRecipient() {
        assertEquals(expectedRecipient,testM.getRecipient());
    }
}