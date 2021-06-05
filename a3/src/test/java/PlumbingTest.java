import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlumbingTest {
    private Plumbing pb;

    @Before
    public void setUp() throws Exception {
        pb = new Plumbing("2010 Milvia Street",
                        PropertySize.Large,false,2,2,false);
    }

    @Test
    public void calculatePrice() {
        assertEquals(420.0,pb.calculatePrice(),0.0);
    }

    @Test
    public void testToString() {
        String result = "Plumbing:address='2010 Milvia Street' size=Large monthly=false previous=2 employee=2 complex=false";
        assertEquals(result,pb.toString());
    }
}