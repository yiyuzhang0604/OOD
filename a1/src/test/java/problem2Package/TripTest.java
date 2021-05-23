package problem2Package;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TripTest {
    public String expectedStart;
    public String expectedEnd;
    public Time expectedStartTime;
    public Time expectedEndTime;
    public Trip testTrip;
    public Integer HR1 = 8;
    public Integer HR2 = 9;
    public Integer MIN1 = 30;
    public Integer MIN2 = 20;
    public Integer SEC1 = 23;
    public Integer SEC2 = 10;


    @Before
    public void setUp() throws Exception {
        expectedStart = "Berkeley";
        expectedEnd = "Pleasanton";
        expectedStartTime = new Time(HR1, MIN1,SEC1);
        expectedEndTime = new Time(HR2, MIN2,SEC2);
        testTrip = new Trip(expectedStart, expectedEnd, expectedStartTime, expectedEndTime);

    }

    @Test
    public void getDurtion() {
        Time expectedDuration = new Time(0,49,47);
        Time testStart = new Time(8, 30,23);
        Time testEnd = new Time(9,40,10);
        Trip testTrip2 = new Trip("SF", "LA", testStart, testEnd);
        Time expect = new Time(1,9,47);

        assertEquals(expect.getHour(), testTrip2.getDurtion().getHour());
        assertEquals(expect.getMinutes(), testTrip2.getDurtion().getMinutes());
        assertEquals(expect.getSeconds(), testTrip2.getDurtion().getSeconds());

        Time expected2 = new Time(0,49,47);
        assertEquals(expected2.getHour(), testTrip.getDurtion().getHour());
        assertEquals(expected2.getMinutes(), testTrip.getDurtion().getMinutes());
        assertEquals(expected2.getSeconds(), testTrip.getDurtion().getSeconds());




    }

    @Test
    public void getStart() {
        assertEquals(expectedStart, testTrip.getStart());
    }

    @Test
    public void getEnd() {
        assertEquals(expectedEnd, testTrip.getEnd());
    }

    @Test
    public void getStartTime() {
        assertEquals(expectedStartTime, testTrip.getStartTime());
    }

    @Test
    public void getEndTime() {
        assertEquals(expectedEndTime, testTrip.getEndTime());
    }
}