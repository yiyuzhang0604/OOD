import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PaintingTest {
    private Painting testPaint;

    @Before
    public void setUp() throws Exception {
        testPaint = new Painting("2010 Milvia Street",
                                PropertySize.Large,true,2, 2);
    }

    @Test
    public void calculatePrice() {
        assertEquals(testPaint.calculatePrice(),1779.84,0.0);

        Painting paint2 = new Painting("2010 Milvia Street",
                                        PropertySize.MEDIUM,false,3, 2);
        assertEquals(paint2.calculatePrice(),1318.4,0.0);

        Painting paint3 = new Painting("2010 Milvia Street",
                                        PropertySize.SMALL,true,3, 2);
        //assertEquals(paint3.calculatePrice(),1318.4,0.0);

    }

    @Test
    public void testToString() {
        String result = "Painting:address='2010 Milvia Street' size=Large monthly=true previous=2 pets=2";
        assertEquals(result,testPaint.toString());
    }
}