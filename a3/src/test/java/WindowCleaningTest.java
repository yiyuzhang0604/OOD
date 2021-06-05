import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WindowCleaningTest {
    private WindowCleaning testWindow;

    @Before
    public void setUp() throws Exception {
        testWindow = new WindowCleaning("2010 Milvia Street",
                                        PropertySize.Large,false,2,1);
    }
    @Test(expected = IllegalArgumentException.class)
    public void negativeFloor(){
        testWindow = new WindowCleaning("2010 Milvia Street",
                                        PropertySize.Large,true,2,-2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void overFloor(){
        testWindow = new WindowCleaning("2010 Milvia Street",
                                        PropertySize.Large,true,2,5);
    }



    @Test
    public void calculatePrice() {
        assertEquals(testWindow.calculatePrice(),320.0, 0.0);

        WindowCleaning w1 = new WindowCleaning("2010 Milvia Street",
                                                PropertySize.Large,false,9,2);
        assertEquals(w1.calculatePrice(),168.0, 0.0);

        WindowCleaning w2 = new WindowCleaning("2010 Milvia Street",
                                                PropertySize.MEDIUM,true,1,2);
        assertEquals(w2.calculatePrice(),151.2, 0.0);

        WindowCleaning w3 = new WindowCleaning("2010 Milvia Street",
                                                PropertySize.SMALL,true,1,2);
        assertEquals(w3.calculatePrice(),75.6, 0.0);


    }

    @Test
    public void getFloorNums() {
        assertEquals(testWindow,1);
    }

    @Test
    public void testToString() {
        String result = "Window cleaning:address='2010 Milvia Street' size=Large monthly=false previous=2 floor=1";
        assertEquals(result,testWindow.toString());
    }

    @Test
    public void testEquals() {
        assertEquals(testWindow,testWindow);
        assertNotEquals(testWindow,null);
        WindowCleaning w4 = new WindowCleaning("2010 Milvia Street",
                                                PropertySize.Large,false,5,4);
        assertNotEquals(testWindow,w4);
    }

    @Test
    public void testHashCode() {
        WindowCleaning testWindow2 = new WindowCleaning("2010 Milvia Street",
                                        PropertySize.Large,false,2,1);
        assertNotEquals(testWindow.hashCode(),testWindow2.hashCode());

    }
}