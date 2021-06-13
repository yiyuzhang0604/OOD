package problem1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CourseCatelogTest {
    private CourseCatelog testCatelog;
    private Course testC;
    private Course[] testArray;

    @Before
    public void setUp() throws Exception {
        testCatelog = new CourseCatelog(10);
        testC = new Course("English","EN",88);
        testArray = new Course[10];
    }

    @Test
    public void getCapacity() {
        assertEquals(testCatelog.getCapacity(),10);
    }


    @Test
    public void getSize() {
        assertEquals(testCatelog.getSize(),0);
    }

    @Test
    public void append() {
        testCatelog.append(testC);
        assertEquals(testCatelog.getSize(),1);
        assertTrue(testCatelog.contains(testC));

        Course testC1 = new Course("English","EN",98);
        testCatelog.append(testC1);
        assertEquals(testCatelog.getSize(),2);
        assertTrue(testCatelog.contains(testC));


    }

    @Test
    public void remove() {
        Course testC3 = new Course("English","EN",98);
        testCatelog.append(testC3);
        testCatelog.remove(testC3);
        Course[] arr = testCatelog.getCourseArray();
        assertEquals(arr[0],null);
        assertEquals(testCatelog.getSize(), 0);
        assertFalse(testCatelog.contains(testC3));

        testCatelog.append(testC);
        Course testC1 = new Course("English","EN",78);
        testCatelog.append(testC1);
        testCatelog.remove(testC1);
        assertFalse(testCatelog.contains(testC1));
    }

    @Test
    public void contains() {
        testCatelog.append(testC);
        Course s = new Course("History","HS",78);
        assertTrue(testCatelog.contains(testC));
        assertFalse(testCatelog.contains(s));
    }

    @Test
    public void indexOf() {
        testCatelog.append(testC);
        Course[] list = testCatelog.getCourseArray();
        assertEquals(testCatelog.indexOf(testC),0);
        Course s = new Course("History","HS",78);
        assertEquals(testCatelog.indexOf(s),-1);


    }

    @Test
    public void count() {
        assertEquals(testCatelog.count(),testCatelog.getSize());
        testCatelog.append(testC);
        assertEquals(testCatelog.count(),testCatelog.getSize());

    }
    @Test
    public void get() {
        testCatelog.append(testC);

        Course testC1 = new Course("English","EN",98);
        testCatelog.append(testC1);
        assertEquals(testCatelog.get(0), testC);
        assertEquals(testCatelog.get(1),testC1);

    }



    @Test
    public void isEmpty() {
        assertTrue(testCatelog.isEmpty());
        Course testC3 = new Course("English","EN",88);
        testCatelog.append(testC3);
        assertFalse(testCatelog.isEmpty());
    }

    @Test
    public void testEquals() {
        assertEquals(testCatelog,testCatelog);
        CourseCatelog test2 = new CourseCatelog(10);
        CourseCatelog test3 = new CourseCatelog(10);
        assertArrayEquals(test2.getCourseArray(),test3.getCourseArray());
        assertNotEquals(null, testCatelog);
        assertEquals(test2.getSize(),test3.getSize());
        assertEquals(test2,test3);

    }

    @Test
    public void testHashCode() {
        CourseCatelog testCatelog1 = new CourseCatelog(10);
        CourseCatelog testCatelog2 = new CourseCatelog(10);
        assertEquals(testCatelog1.hashCode(),testCatelog2.hashCode());

    }

    @Test
    public void testToString() {
        String result = "CourseCatelog{capacity=10, courseArray=[null,null,null,null,null,null,null,null,null], size=0}";
        assertEquals(result,testCatelog.toString());
    }
}