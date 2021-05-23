package problem2Package;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TimeTest {
    public Integer expectedHour;
    public Integer expectedMin;
    public Integer expectedSec;
    public Time expectedTime;


    @Before
    public void setUp() throws Exception {
        expectedHour = 1;
        expectedMin = 20;
        expectedSec = 45;
        expectedTime = new Time(expectedHour, expectedMin,expectedSec);
    }
    @Test
    public void getHour(){
        assertEquals(expectedHour, expectedTime.getHour());
    }

    @Test
    public void getMinutes(){
        assertEquals(expectedMin, expectedTime.getMinutes());
    }

    @Test
    public void getSeconds(){
        assertEquals(expectedSec, expectedTime.getSeconds());
    }
}