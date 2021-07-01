package midTerm.p1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MeetingSpecialistTest {
    private MeetingSpecialist test1;
    private MeetingSpecialist test2;


    @Before
    public void setUp() throws Exception {
        test1 = new MeetingSpecialist(100.0, 50.0, 20.0,
                                    30, 5, 5);
        test2 = new MeetingSpecialist(100.0, 50.0, 20.0,
                                    30, 5, 7);
    }

    @Test
    public void getNumberOfPeople() {
        assertSame(test1.getNumberOfPeople(), 5);
    }

    @Test
    public void getNumberOfEvents() {
        assertSame(test1.getNumberOfEvents(), 5);
    }

    @Test
    public void getOvertimeEarning() {
        assertTrue(test1.getOvertimeEarning().equals(660.0));
    }

    @Test
    public void getMangerBonus() {
        assertTrue(test1.getMangerBonus().equals(500));
    }


    @Test
    public void getEventBonus() {
        assertTrue(test1.getEventBonus() == 2500);
        assertTrue(test2.getEventBonus() == 3000);
    }

    @Test
    public void calculateTotalEarnings() {
        assertTrue(test1.calculateTotalEarnings().equals(3810.0));
    }

    @Test
    public void testHashCode() {
        assertNotEquals(test1.hashCode(), null);
        assertNotEquals(test1.hashCode(), test2.hashCode());

        MeetingSpecialist test3 = new MeetingSpecialist(100.0, 50.0, 20.0,
                                                        30, 5, 5);
        assertEquals(test1.hashCode(), test3.hashCode());

    }

    @Test
    public void testEquals() {
        assertFalse(test1.equals(null));
        assertFalse(test1.equals(test2));
        MeetingSpecialist test3 = new MeetingSpecialist(100.0, 50.0, 20.0,
                                                        30, 5, 5);
        assertTrue(test1.equals(test3));

    }

    @Test
    public void testToString() {
        String result = "EmployeeAbstract{basePay=100.0, bonus=50.0, overTimeEarning=20.0, overTimeHours=30}EventManager{numberOfPeople=5, numberOfEvents=5}MeetingSpecialist{}";
        assertEquals(result, test1.toString());
    }
}