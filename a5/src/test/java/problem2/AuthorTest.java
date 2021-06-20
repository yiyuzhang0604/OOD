package problem2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AuthorTest {
    private String expFirst;
    private String expLast;
    private Author testAuth;

    @Before
    public void setUp() throws Exception {
        expFirst = "Briana";
        expLast = "Zhang";
        testAuth = new Author(expFirst,expLast);
    }
    @Test
    public void testGetFirst() {
        assertEquals("Briana",testAuth.getFirst());
        assertNotEquals("Bri",testAuth.getFirst());
    }

    @Test
    public void testGetLast() {
        assertEquals("Zhang",testAuth.getLast());
        assertNotEquals("Zhan",testAuth.getLast());
    }

    @Test
    public void testEquals() {
        assertEquals(testAuth,testAuth);
        assertNotEquals(testAuth,null);
        Author test2 = new Author("Briana","Zhang");
        assertEquals(test2,testAuth);

        Author test3 = new Author("Yiyu","Zhang");
        assertNotEquals(test3,testAuth);
    }

    @Test
    public void testToString() {
        String res = "Creator:Person{first=Briana last=Zhang}Author";
        assertEquals(res,testAuth.toString());
    }

    @Test
    public void testHashCode() {
        Author test2 = new Author("Briana","Zhang");
        assertEquals(test2.hashCode(),testAuth.hashCode());
    }

}