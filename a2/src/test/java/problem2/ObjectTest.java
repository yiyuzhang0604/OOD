package problem2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ObjectTest {
    private Integer expectedWidth;
    private Integer expectedHeight;
    private Integer expectedDepth;
    private Object testObj;

    @Before
    public void setUp() throws Exception {
        expectedWidth = 1;
        expectedHeight = 1;
        expectedDepth = 1;
        testObj = new Object(expectedWidth,expectedHeight,expectedDepth);
    }

    @Test
    public void getWidth() {
        assertEquals(testObj.getWidth(), expectedWidth);
    }

    @Test
    public void getHeight() {
        assertEquals(testObj.getHeight(), expectedHeight);
    }

    @Test
    public void getDepth() {
        assertEquals(testObj.getDepth(), expectedDepth);
    }
}