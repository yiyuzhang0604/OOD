package problem2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RecordingArtistTest {
    private String expFirst;
    private String expLast;
    private RecordingArtist testArt;

    @Before
    public void setUp() throws Exception {
        expFirst = "Briana";
        expLast = "Zhang";
        testArt = new RecordingArtist(expFirst,expLast);
    }

    @Test
    public void testGetFirst() {
        assertEquals("Briana",testArt.getFirst());
        assertNotEquals("Bri",testArt.getFirst());
    }

    @Test
    public void testGetLast() {
        assertEquals("Zhang",testArt.getLast());
        assertNotEquals("Zhan",testArt.getLast());
    }

    @Test
    public void testEquals() {
        assertEquals(testArt,testArt);
        assertNotEquals(testArt,null);
        RecordingArtist test2 = new RecordingArtist("Briana","Zhang");
        assertEquals(test2,testArt);

        Author test3 = new Author("Yiyu","Zhang");
        assertNotEquals(test3,testArt);
    }

    @Test
    public void testToString() {
        String res = "Creator:Person{first=Briana last=Zhang}RecordingArtist";
        assertEquals(res,testArt.toString());
    }

    @Test
    public void testHashCode() {
        RecordingArtist test2 = new RecordingArtist("Briana","Zhang");
        assertEquals(test2.hashCode(),testArt.hashCode());
    }
}