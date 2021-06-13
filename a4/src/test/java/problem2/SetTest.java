package problem2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SetTest {
    private Set testSet;
    private int[] testSetArray;


    @Before
    public void setUp() throws Exception {
        testSet = new Set(10);
        testSetArray = new int[10];
    }


    @Test
    public void getSize() {
        assertEquals(testSet.getSize(),0);
    }

    @Test
    public void getCapacity() {
        assertEquals(testSet.getCapacity(),10);

    }
    @Test
    public void getSet(){
        int[] exp = testSet.getSet();
        int[] exp1 = new int[10];
        assertArrayEquals(exp,exp1);
    }

    @Test
    public void emptySet() {
        assertEquals(testSet.emptySet().getCapacity(),0);
    }

    @Test
    public void isEmpty() {
        assertTrue(testSet.isEmpty());
        Set addSet = testSet.add(1);
        assertTrue(testSet.isEmpty());
        assertFalse(addSet.isEmpty());

    }

    @Test
    public void add() {
        Set addSet = testSet.add(1);
        assertTrue(testSet.isEmpty());
        assertEquals(addSet.getSize(),1);
        assertTrue(addSet.contains(1));


    }

    @Test
    public void contains() {
        Set addSet = testSet.add(1);
        assertFalse(addSet.contains(2));
        assertTrue(addSet.contains(1));

    }

    @Test
    public void remove() {
        Set addSet = testSet.add(1);
        Set addSet2 = addSet.add(2);
        Set rm = addSet2.remove(2);
        assertFalse(rm.contains(2));

    }

    @Test
    public void size() {
        assertSame(testSet.size(),0);

    }

    @Test
    public void testEquals() {
        assertEquals(testSet,testSet);
        assertNotEquals(testSet, null);
        Set test1 = new Set(18);
        assertNotEquals(test1, testSet);

        Set exp1 = testSet.add(1);
        Set exp2 = new Set(10);
        Set exp3 = exp2.add(2);

        int[] arr1 = exp1.getSet();
        int[] arr2 = exp3.getSet();
        boolean check = true;
        check = exp1.equals(exp3);
        for(int i = 0; i < arr1.length; i++){
            assertNotEquals(arr1[i],arr2[i]);

        }
        assertFalse(check);
        assertNotEquals(exp1,exp2);

    }

    @Test
    public void testHashCode() {
        Set test1 = new Set(10);
        assertEquals(test1.hashCode(), testSet.hashCode());
    }

    @Test
    public void testToString() {
        String result = "Set{set=[0, 0, 0, 0, 0, 0, 0, 0, 0, 0], size=0, capacity=10}";
        assertEquals(result, testSet.toString());
    }
}