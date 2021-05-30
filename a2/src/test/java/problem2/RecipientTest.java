package problem2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RecipientTest {
    private String expectedFirst;
    private String expectedLast;
    private String expectedEmai;
    private Recipient testR;

    @Before
    public void setUp() throws Exception {
        expectedFirst = "Briana";
        expectedLast = "Zhang";
        expectedEmai = "brianazhang@gmail.com";
        testR = new Recipient(expectedFirst, expectedLast,expectedEmai);
    }

    @Test
    public void getFirstName() {
        assertEquals(expectedFirst, testR.getFirstName());
    }

    @Test
    public void getLastName() {
        assertEquals(expectedLast, testR.getLastName());
    }

    @Test
    public void getEmail() {
        assertEquals(expectedEmai, testR.getEmail());
    }
}