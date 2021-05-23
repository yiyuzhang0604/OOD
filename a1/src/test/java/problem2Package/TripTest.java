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


    @Before
    public void setUp() throws Exception {
        expectedStart = "Berkeley";
        expectedEnd = "Pleasanton";
        expectedStartTime = new Time(8, 30,23);
        expectedEndTime = new Time(9, 20,10);
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