package simpleRecursiveList;

import org.junit.Before;
import org.junit.Test;
import recursiveSet.ConsSet;

import static org.junit.Assert.*;

public class ListTest {
    private Empty testEmpty = new Empty();

    @Before
    public void setUp() throws Exception {
        testEmpty = new Empty();

    }

    @Test
    public void size() {
        assertTrue(testEmpty.size()==0);
        List list2 = testEmpty.add(1);
        assertTrue(list2.size() == 1);


    }

    @Test
    public void isEmpty() {
        assertTrue(testEmpty.isEmpty());
        List list2 = testEmpty.add(1);
        assertFalse(list2.isEmpty());

    }

    @Test
    public void add() {
        List list2 = testEmpty.add(1);
        assertFalse(list2.isEmpty());
        assertTrue(list2.contains(1));


    }

    @Test
    public void last() {
        List list2 = testEmpty.add(1);
        assertTrue(list2.last() == 1);
        List list3 = testEmpty.add(2);
        assertTrue(list3.last() == 2);



    }

    @Test
    public void contains() {
        List list2 = testEmpty.add(1);
        assertTrue(list2.contains(1));


    }

    @Test
    public void elementAt() {
        List list2 = testEmpty.add(1);
        List list3 = list2.add(2);
        assertSame(list2.elementAt(0),1);

        assertSame(list3.elementAt(0),2);
        assertSame(list3.elementAt(1),1);

    }
}