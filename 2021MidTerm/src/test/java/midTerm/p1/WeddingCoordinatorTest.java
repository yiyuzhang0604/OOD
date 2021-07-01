package midTerm.p1;

import org.junit.Before;
import org.junit.Test;

import java.util.Objects;

import static org.junit.Assert.*;

public class WeddingCoordinatorTest {
    private WeddingCoordinator testWedding;
    private WeddingCoordinator testWedding2;


    @Before
    public void setUp() throws Exception {
        testWedding = new WeddingCoordinator(100.0, 50.0, 20.0,
                30, 5, 5);
        testWedding2 = new WeddingCoordinator(100.0, 50.0, 20.0,
                30, 5, 3);
    }

    @Test
    public void getNumberOfPeople() {
        assertSame(testWedding.getNumberOfPeople(), 5);
    }

    @Test
    public void getNumberOfEvents() {
        assertSame(testWedding.getNumberOfEvents(), 5);
    }

    @Test
    public void getOvertimeEarning() {
        assertTrue(testWedding.getOvertimeEarning().equals(660.0));
    }

    @Test
    public void getMangerBonus() {
        assertTrue(testWedding.getMangerBonus().equals(500));
    }


    @Test
    public void getWeddingBonus() {
        assertTrue(testWedding.getWeddingBonus() == 4000);
        assertTrue(testWedding2.getWeddingBonus() == 3000);
    }

    @Test
    public void calculateTotalEarnings() {
        assertTrue(testWedding.calculateTotalEarnings().equals(5310.0));
    }

    @Test
    public void testHashCode() {
        assertNotEquals(testWedding.hashCode(), null);
        assertNotEquals(testWedding.hashCode(), testWedding2.hashCode());

        WeddingCoordinator test3 = new WeddingCoordinator(100.0, 50.0, 20.0,
                30, 5, 5);
        assertEquals(testWedding.hashCode(), test3.hashCode());

    }

    @Test
    public void testEquals(){
        assertFalse(testWedding.equals(null));
        assertFalse(testWedding.equals(testWedding2));
        WeddingCoordinator test3 = new WeddingCoordinator(100.0, 50.0, 20.0,
                                                            30, 5, 5);
        assertTrue(testWedding.equals(test3));

    }

    @Test
    public void testToString(){
        String result = "EmployeeAbstract{basePay=100.0, bonus=50.0, overTimeEarning=20.0, overTimeHours=30}EventManager{numberOfPeople=5, numberOfEvents=5}WeddingCoordinator{}";
        assertEquals(result,testWedding.toString());
    }
}
