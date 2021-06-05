import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class InteriorTest {
    private InteriorService testServ;

    @Before
    public void setUp() throws Exception {
        testServ = new InteriorService("2010 Milvia Street",
                                        PropertySize.Large,true,2, 2);

    }
    @Test(expected = IllegalArgumentException.class)
    public void negativePet(){
        InteriorService testServ2 = new InteriorService("2010 Milvia Street",
                                        PropertySize.Large,true,2, -2);
    }

    @Test
    public void petFee() {
        assertEquals(testServ.petFee(120.0),123.6,0.0);

        InteriorService serv2 = new InteriorService("2010 Milvia Street",
                                                    PropertySize.Large,true,2, 3);
        assertEquals(serv2.petFee(120.0),128.4,0.0);

    }

    @Test
    public void testEquals() {
        assertEquals(testServ,testServ);
        assertNotEquals(testServ,null);
        InteriorService serv2 = new InteriorService("2010 Milvia Street",
                                                    PropertySize.Large,true,2, 1);
        assertNotEquals(serv2,testServ);

    }

    @Test
    public void testHashCode() {
        InteriorService serv2 = new InteriorService("2010 Milvia Street",
                                                    PropertySize.Large,true,2, 2);
        assertEquals(serv2.hashCode(),testServ.hashCode());

        InteriorService serv3 = new InteriorService("2010 Milvia Street",
                                                    PropertySize.Large,true,2, 1);
        assertNotEquals(serv3.hashCode(),testServ.hashCode());
    }

    @Test
    public void testToString() {
        String result = "address='2010 Milvia Street' size=Large monthly=true previous=2 pets=2";
        assertEquals(result,testServ.toString());
    }
    @Test
    public void getPetNum(){
        assertEquals(testServ.getPetNum(), 2);
    }

    private class InteriorService extends Interior {

        private InteriorService(String address, PropertySize propertySize,
                                Boolean monthly, Integer previousCarry, Integer petNum) throws IllegalArgumentException {
            super(address, propertySize, monthly, previousCarry,petNum);
        }
        @Override
        public double calculatePrice(){
            return 0.0;
        }
    }
}