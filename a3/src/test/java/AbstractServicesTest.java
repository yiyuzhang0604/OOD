import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AbstractServicesTest {
    private specificService testServ;

    @Before
    public void setUp() throws Exception {
        testServ = new specificService("2010 Milvia Street",
                                        PropertySize.Large,true,2);

    }

    @Test
    public void applyDiscount() {
        assertEquals(testServ.applyDiscount(120.0),108.0,0.0);
    }

    @Test
    public void monthlyDiscount() {
    }

    @Test
    public void tenDiscount() {
    }

    @Test
    public void testToString() {
    }

    @Test
    public void testEquals() {
    }

    @Test
    public void testHashCode() {
    }

    @Test
    public void getAddress() {
    }

    @Test
    public void getPropertySize() {
    }

    @Test
    public void isMonthly() {
    }

    @Test
    public void getPrevious() {

    }

    private class specificService extends AbstractServices {

        public specificService(String address, PropertySize propertySize,
                               Boolean monthly, Integer previousCarry) throws IllegalArgumentException {
            super(address, propertySize, monthly, previousCarry);
        }
        @Override
        public double calculatePrice(){
            return 0.0;
        }
    }
}