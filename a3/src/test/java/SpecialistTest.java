import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SpecialistTest {

    private SpecialistService sp;

    @Before
    public void setUp() throws Exception {
        sp = new SpecialistService("2010 Milvia Street",
                                    PropertySize.Large,false,2,2,true);
    }

    @Test
    public void getEmployeeNum() {
        int em = 2;
        assertSame(sp.getEmployeeNum(),em);
    }

    @Test
    public void isComplex() {
        assertEquals(sp.isComplex(), true);
    }

    @Test
    public void calculatePrice() {
        assertEquals(sp.calculatePrice(),400.0,0.0);
    }

    @Test
    public void testEquals() {
        assertEquals(sp,sp);
    }

    @Test
    public void testHashCode() {
    }

    @Test
    public void testToString() {
    }

    private class SpecialistService extends Specialist {

        private SpecialistService(String address, PropertySize propertySize,
                                Boolean monthly, Integer previousCarry,Integer employeeNum,boolean complex ) throws IllegalArgumentException {
            super(address, propertySize, monthly, previousCarry,employeeNum,complex);
        }
        @Override
        public double calculatePrice(){
            return 0.0;
        }
    }
}