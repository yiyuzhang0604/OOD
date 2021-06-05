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

        specificService serv1 = new specificService("200 Milvia Street",
                                                    PropertySize.Large,true,9);
        assertEquals(serv1.applyDiscount(120.0),60.0,0.0);

        specificService serv2 = new specificService("2010 Milvia Street",
                                                    PropertySize.SMALL,false,9);
        assertEquals(serv2.applyDiscount(120.0),60.0,0.0);

        specificService serv3 = new specificService("20 Milvia Street",
                                                    PropertySize.SMALL,false,8);
        assertEquals(serv3.applyDiscount(120.0),120.0,0.0);



    }

    @Test
    public void monthlyDiscount() {
        assertEquals(108.0, testServ.monthlyDiscount(120),0.0);

    }


    @Test
    public void tenDiscount() {
        specificService serv2 = new specificService("2010 Milvia Street",
                                                    PropertySize.SMALL,false,9);
        assertEquals(60.0, serv2.tenDiscount(120),0.0);


    }

    @Test
    public void testToString() {
        String expectedResult = "address='2010 Milvia Street' size=Large monthly=true previous=2";
        assertEquals(expectedResult,testServ.toString());
    }

    @Test
    public void testEquals() {
        assertEquals(testServ,testServ);
        assertNotEquals(testServ,null);
        specificService serv2 = new specificService("2010 Milvia Street",
                                                        PropertySize.Large,true,2);
        assertEquals(serv2,testServ);
    }

    @Test
    public void testHashCode() {
        specificService serv2 = new specificService("2010 Milvia Street",
                                                    PropertySize.Large,true,2);
        assertEquals(testServ.hashCode(),serv2.hashCode());
    }

    @Test
    public void getAddress() {
        assertEquals("2010 Milvia Street", testServ.getAddress());
    }

    @Test
    public void getPropertySize() {
        assertEquals(PropertySize.Large, testServ.getPropertySize());
    }

    @Test
    public void isMonthly() {
        assertTrue(testServ.isMonthly());
    }

    @Test
    public void getPrevious() {
        assertEquals(testServ.getPrevious(),2);

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