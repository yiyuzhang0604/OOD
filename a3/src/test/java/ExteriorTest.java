import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExteriorTest {
    private ExteriorService testServ;

    @Before
    public void setUp() throws Exception {
        testServ = new ExteriorService("2010 Milvia Street",
                                        PropertySize.Large,true,2);
    }

    @Test
    public void calculatePrice() {
        assertEquals(320.0,testServ.calculatePrice(),0.0);
        ExteriorService serv2 = new ExteriorService("2010 Milvia Street",
                                                    PropertySize.MEDIUM,true,2);
        assertEquals(160,serv2.calculatePrice(),0.0);

        ExteriorService serv3 = new ExteriorService("2010 Milvia Street",
                PropertySize.SMALL,true,2);
        assertEquals(80.0,serv3.calculatePrice(),0.0);
    }

    private class ExteriorService extends Exterior {

        private ExteriorService(String address, PropertySize propertySize,
                               Boolean monthly, Integer previousCarry) throws IllegalArgumentException {
            super(address, propertySize, monthly, previousCarry);
        }
    }
}