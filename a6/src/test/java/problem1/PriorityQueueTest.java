package problem1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PriorityQueueTest {
    private EmptyPQ testEmpty;
    private PriorityQueue testCons;
    private PriorityQueue testCons2;
    private PriorityQueue testCons3;

    @Before
    public void setUp() throws Exception {
        testEmpty = new EmptyPQ();
        testCons = testEmpty.add(2,"Bambi");
        testCons2 = testCons.add(3,"Briana");
        testCons3 = new ConsPQ(3,"milk");

    }
    @Test
    public void testConstructor() {
        String exp = "ConsPQ [pq=|3,milk|[| |]]";
        assertEquals(testCons3.toString(),exp);
    }

    @Test
    public void createEmtpy() {
        assertTrue(testEmpty.isEmpty());

    }

    @Test
    public void testIsEmpty() {
        assertTrue(testEmpty.isEmpty());
        assertFalse(testCons.isEmpty());
        assertFalse(testCons.isEmpty());

    }

    @Test
    public void add() {
        PriorityQueue test2 = testCons.add(3,"bike");
        String exp = "ConsPQ [pq=|3,bike|ConsPQ [pq=|2,Bambi|[| |]]]";
        assertEquals(exp,test2.toString());
        PriorityQueue test3 = test2.add(3,"apple");
        String exp2 = "ConsPQ [pq=|3,apple|ConsPQ [pq=|3,bike|ConsPQ [pq=|2,Bambi|[| |]]]]";
        assertEquals(exp2,test3.toString());
        PriorityQueue test4 = test3.add(3,"zoo");
        String exp3 = "ConsPQ [pq=|3,apple|ConsPQ [pq=|3,bike|ConsPQ [pq=|3,zoo|ConsPQ [pq=|2,Bambi|[| |]]]]]";
        assertEquals(exp3,test4.toString());

        PriorityQueue test5 = testCons.add(1,"cookie");
        String exp4 = "ConsPQ [pq=|2,Bambi|ConsPQ [pq=|1,cookie|[| |]]]";
        assertEquals(exp4,test5.toString());



    }
    @Test
    public void testEmptyPeek() throws Exception {
        Throwable e = null;
        try{
            testEmpty.peek();
        } catch(Throwable ex){
            e = ex;
        }
        assertTrue(e instanceof IllegalPriorityQueueException);
    }

    @Test
    public void testEmptyPop() throws Exception {
        Throwable e = null;
        try{
            testEmpty.pop();
        } catch(Throwable ex){
            e = ex;
        }
        assertTrue(e instanceof IllegalPriorityQueueException);
    }

    @Test
    public void peek() {
        assertEquals(testCons2.peek(), "Briana");
        assertEquals(testCons.peek(), "Bambi");
    }

    @Test
    public void pop() {
        assertEquals(testCons2.pop(),testCons);
        PriorityQueue ans = testCons.pop();
        assertTrue(ans.isEmpty());

        PriorityQueue empty = new EmptyPQ();
        PriorityQueue test2 = testCons3.pop();
        assertEquals(empty, test2);
    }

    @Test
    public void testToString() {
        String res = "ConsPQ [pq=|2,Bambi|[| |]]";
        assertEquals(res,testCons.toString());
        String res1 = "ConsPQ [pq=|3,Briana|ConsPQ [pq=|2,Bambi|[| |]]]";
        assertEquals(res1,testCons2.toString());

    }
    @Test
    public void testEquals() {
        assertTrue(testEmpty.equals(testEmpty));
        assertFalse(testEmpty.equals(null));
        EmptyPQ test2 = new EmptyPQ();
        assertTrue(testEmpty.equals(test2));
        PriorityQueue test3 = test2.add(2,"b");
        assertFalse(testEmpty.equals(test3));

        assertFalse(testCons.equals(testCons2));

        PriorityQueue exp = testEmpty.add(2,"Bambi");
        assertTrue(testCons.equals(exp));

        PriorityQueue exp2 = testCons.add(2,"bike");
        PriorityQueue exp3 = testCons.add(2,"ike");
        PriorityQueue exp4 = testCons.add(3,"bike");
        assertFalse(exp2.equals(exp3));
        assertFalse(exp2.equals(exp4));


    }
    @Test
    public void testHashCode() {
        assertEquals(testEmpty.hashCode(),31);
        PriorityQueue test2 = testEmpty.add(2,"Bambi");
        assertEquals(test2.hashCode(),testCons.hashCode());
        assertNotEquals(test2.hashCode(),testCons2.hashCode());


    }
}