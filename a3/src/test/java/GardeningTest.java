import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GardeningTest {
    private Gardening testGard;


    @Before
    public void setUp() throws Exception {
        testGard = new Gardening("2010 Milvia Street",
                                PropertySize.Large,true,2);

    }

    @Test
    public void calculatePrice() {
        assertEquals(testGard.calculatePrice(),306.0,0.0);

        Gardening gard1 = new Gardening("2010 Milvia Street",
                                        PropertySize.MEDIUM,true,2);
        assertEquals(gard1.calculatePrice(),162.0,0.0);

        Gardening gard2 = new Gardening("2010 Milvia Street",
                                        PropertySize.SMALL,true,2);
        assertEquals(gard2.calculatePrice(),90,0.0);

    }

    @Test
    public void testToString() {
        String result = "Gardening:address='2010 Milvia Street' size=Large monthly=true previous=2";
        assertEquals(result,testGard.toString());
    }
}