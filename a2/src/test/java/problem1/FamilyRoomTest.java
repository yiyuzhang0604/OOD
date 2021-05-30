package problem1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FamilyRoomTest {
    private Integer expectedMax;
    private Integer expectedPrice;
    private Integer expectedNumber;
    private Integer expectedMax1;
    private Integer expectedPrice1;
    private Integer expectedNumber1;

    private Room testRoom;
    private Room testRoom2;


    @Before
    public void setUp() throws Exception {
        expectedMax = 4;
        expectedPrice = 100;
        expectedNumber = 0;

        expectedMax1 = 4;
        expectedPrice1 = 100;
        expectedNumber1 = 1;

        testRoom = new SingleRoom(expectedMax,expectedPrice,expectedNumber);
        testRoom2 = new SingleRoom(expectedMax1,expectedPrice1,expectedNumber1);
    }

    @Test
    public void isAvailable() {
        assertEquals(testRoom.isAvailable(), true);
        assertEquals(testRoom2.isAvailable(),false);

    }

    @Test
    public void bookRoom() {
        testRoom.bookRoom(1);
        int exp = 1;
        assertSame(testRoom.getNumberGuest(),exp);

        testRoom.bookRoom(1);
        assertSame(testRoom.getNumberGuest(),exp);

        Throwable e = null;
        try{
            testRoom.bookRoom(-3);
        }catch(Throwable ex){
            e = ex;
        }
        assertTrue(e instanceof IllegalArgumentException);

        Throwable y = null;
        try{
            testRoom.bookRoom(100);
        }catch(Throwable yx){
            y = yx;
        }
        assertTrue(y instanceof IllegalArgumentException);
    }
}
