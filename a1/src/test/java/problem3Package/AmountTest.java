package problem3Package;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AmountTest {
    private Integer expectedDollar;
    private Integer expectedCent;
    private Amount testAmount;

    @Before
    public void setUp() throws Exception {
        expectedDollar = 54;
        expectedCent = 29;
        testAmount = new Amount(expectedDollar,expectedCent);
    }

    @Test
    public void getDollar() {
        assertEquals(expectedDollar, testAmount.getDollar());
    }

    @Test
    public void getCent() {
        assertEquals(expectedCent, testAmount.getCent());
    }
}