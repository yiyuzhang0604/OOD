package problem3Package;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CardHolderTest {
    private String expectedFirstName;
    private String expectedLastName;
    private CardHolder testOwner;

    @Before
    public void setUp() throws Exception {
        expectedFirstName = "Briana";
        expectedLastName = "Zhang";
        testOwner = new CardHolder(expectedFirstName,expectedLastName);
    }

    @Test
    public void getFirstName() {
        assertEquals(expectedFirstName, testOwner.getFirstName());
    }

    @Test
    public void getLastName() {
        assertEquals(expectedLastName, testOwner.getLastName());
    }
}