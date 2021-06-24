package recursiveSet;

import org.junit.Before;
import org.junit.Test;
import simpleRecursiveList.Empty;

import static org.junit.Assert.*;

public class SetTest {
    private EmtpySet empty;

    @Before
    public void setUp() throws Exception {
        empty = new EmtpySet();

    }

    @Test
    public void emptySet() {
        assertTrue(empty.isEmpty());
    }

    @Test
    public void isEmpty() {
        assertTrue(empty.isEmpty());

    }

    @Test
    public void add() {
        Set set2 = empty.add(2);
        assertFalse(set2.isEmpty());
        assertTrue(set2.contains(2));

    }

    @Test
    public void contains() {
        Set set2 = empty.add(2);
        assertFalse(set2.isEmpty());
        assertTrue(set2.contains(2));
        assertFalse(set2.contains(1));

    }

    @Test
    public void remove() {
        Set set2 = empty.add(2);
        Set set3 = set2.add(3);
        Set set4 = set3.remove(3);
        assertTrue(set4.contains(2));
        assertFalse(set4.contains(3));

    }

    @Test
    public void size() {
        Set set2 = empty.add(2);
        Set set3 = set2.add(3);
        Set set4 = set3.remove(3);
        assertTrue(set4.size() ==1);

    }
}