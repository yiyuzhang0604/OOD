package modifiedPackage;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NameTest {
    private String expectedFirst;
    private String expectedMiddle;
    private String expectedLast;
    private Name expectedFull;

    @Before
    public void setUp() throws Exception {
        expectedFirst = "Yiyu";
        expectedMiddle = "Bambi";
        expectedLast = "Zhang";
        expectedFull = new Name(expectedFirst, expectedMiddle, expectedLast);
    }

    @Test
    public void getFirstName() {
        assertEquals(expectedFirst, expectedFull.getFirstName());
    }

    @Test
    public void getMiddleName() {
        assertEquals(expectedMiddle, expectedFull.getMiddleName());
    }

    @Test
    public void getLastName() {
        assertEquals(expectedLast, expectedFull.getLastName());
    }
}