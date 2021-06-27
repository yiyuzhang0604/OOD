package problem2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BagOfWordsTest {
    private EmptyBag testEmpty;
    private BagOfWords testBag;
    private BagOfWords testBag2;

    @Before
    public void setUp() throws Exception {
        testEmpty = new EmptyBag();
        testBag = testEmpty.add("Hi");
        testBag2 = testBag.add("There");
    }

    @Test
    public void emptyBagOfWords() {
        assertTrue(testEmpty.isEmpty());
    }

    @Test
    public void isEmpty() {
        assertTrue(testEmpty.isEmpty());
        assertFalse(testBag.isEmpty());

    }

    @Test
    public void size() {
        assertTrue(testEmpty.size()==0);
        assertTrue(testBag2.size()==2);
        assertTrue(testBag.size()==1);


    }

    @Test
    public void add() {
        BagOfWords exp = testEmpty.add("Hi");
        assertEquals(exp, testBag);
        assertTrue(testBag.contains("Hi"));
        assertTrue(testBag2.contains("There"));
        assertFalse(testBag.contains("There"));


    }

    @Test
    public void contains() {
        assertFalse(testEmpty.contains("Bambi"));
        assertTrue(testBag.contains("Hi"));
        assertTrue(testBag2.contains("There"));
        assertFalse(testBag.contains("There"));

    }
    @Test
    public void testEquals() {
        assertTrue(testEmpty.equals(testEmpty));
        assertTrue(testBag.equals(testBag));
        assertFalse(testBag.equals(testBag2));
        assertFalse(testBag.equals(null));

        //BagOfWords test3 = testEmpty.add("There");
        //BagOfWords test4 = test3.add("Hi");
        //assertTrue(test4.equals(testBag2));
    }

    @Test
    public void testHashCode() {
        BagOfWords exp = new EmptyBag();
        assertEquals(testEmpty.hashCode(),exp.hashCode());
        BagOfWords exp2 = testEmpty.add("Hi");
        assertEquals(exp2.hashCode(),testBag.hashCode());
        assertNotEquals(exp2.hashCode(),testBag2.hashCode());
    }
    @Test
    public void testToString() {
        String exp = "BagOfWords [element=Hi, set={}]";
        assertEquals(exp, testBag.toString());
    }

}