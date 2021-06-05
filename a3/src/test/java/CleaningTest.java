import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CleaningTest {
    private Cleaning testClean;

    @Before
    public void setUp() throws Exception {
        testClean = new Cleaning("2010 Milvia Street",
                                PropertySize.Large,false,2, 2);

    }

    @Test
    public void calculatePrice() {

        assertEquals(329.6,testClean.calculatePrice(),0.0);

        Cleaning clean1 = new Cleaning("2010 Milvia Street",
                                        PropertySize.Large,true,9, 2);
        assertEquals(164.8,clean1.calculatePrice(),0.0);

        Cleaning clean2 = new Cleaning("2010 Milvia Street",
                                        PropertySize.SMALL,false,9, 2);
        assertEquals(41.2,clean2.calculatePrice(),0.0);

        Cleaning clean3 = new Cleaning("20 Milvia Street",
                                        PropertySize.SMALL,true,0, 2);
        assertEquals(74.16,clean3.calculatePrice(),0.0);




    }

    @Test
    public void testToString() {
        String result = "Cleaning:address='2010 Milvia Street' size=Large monthly=false previous=2 pets=2";
        assertEquals(result,testClean.toString());
    }
}