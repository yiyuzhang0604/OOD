package problem1Package;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OwnerTest {
    private Owner testOwner;
    private String expectedFirstName;
    private String expectedLastName;
    private String expectedPhoneNumber;


    @Before
    public void setUp() throws Exception {
        expectedFirstName = "Yiyu";
        expectedLastName = "Zhang";
        expectedPhoneNumber = "4028784632";
        testOwner = new Owner(expectedFirstName, expectedLastName, expectedPhoneNumber);
    }

    @Test
    public void getFirstName() {
        assertEquals(expectedFirstName, testOwner.getFirstName());
    }

    @Test
    public void getLastName() {
        assertEquals(expectedLastName, testOwner.getLastName());
    }

    @Test
    public void getPhoneNumber() {
        assertEquals(expectedPhoneNumber, testOwner.getPhoneNumber());
    }
}