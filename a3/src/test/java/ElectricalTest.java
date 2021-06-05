import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ElectricalTest {
    private Electrical el;

    @Before
    public void setUp() throws Exception {
        el = new Electrical("2010 Milvia Street",
                            PropertySize.Large,false,2,2,false);
    }


    @Test
    public void calculatePrice() {
        assertEquals(el.calculatePrice(),450.0);
    }

    @Test
    public void testToString() {
        String result = "Electrical:address='2010 Milvia Street' size=Large monthly=false previous=2 employee=2 complex=false";
        assertEquals(result,el.toString());

    }
}