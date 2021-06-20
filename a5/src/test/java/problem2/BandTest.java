package problem2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class BandTest {
    private ArrayList<RecordingArtist> testGroup;
    private String testName;
    private Band testBand;
    private RecordingArtist r1;
    private RecordingArtist r2;



    @Before
    public void setUp() throws Exception {
        testGroup = new ArrayList<>();
        r1 = new RecordingArtist("Jay","Chow");
        r2 = new RecordingArtist("Yoga","Lin");
        testGroup.add(r1);
        testGroup.add(r2);
        testName = "Pants";
        testBand = new Band(testGroup,testName);

    }

    @Test
    public void getGroup() {
        ArrayList<RecordingArtist> exp = new ArrayList<>();
        exp.add(r1);
        exp.add(r2);
        ArrayList<RecordingArtist> actual = testBand.getGroup();
        for(int i = 0; i < actual.size(); i++){
            assertEquals(exp.get(i),actual.get(i));
        }
    }

    @Test
    public void getName() {
        assertEquals(testBand.getName(),"Pants");
        assertNotEquals(testBand.getName(),"P");
    }

    @Test
    public void testEquals() {
        assertEquals(testBand,testBand);
        assertNotEquals(testBand,null);

        ArrayList<RecordingArtist> exp = new ArrayList<>();
        RecordingArtist r3 = new RecordingArtist("Yimou","Zhang");
        exp.add(r3);
        Band testBand2 = new Band(exp,"P");
        assertNotEquals(testBand2,testBand);

        ArrayList<RecordingArtist> exp2 = new ArrayList<>();
        exp2.add(r1);
        exp2.add(r2);
        Band testBand3 = new Band(exp2,"Pants");
        assertEquals(testBand3,testBand);
    }

    @Test
    public void testHashCode() {
        ArrayList<RecordingArtist> exp2 = new ArrayList<>();
        exp2.add(r1);
        exp2.add(r2);
        Band testBand3 = new Band(exp2,"Pants");
        assertEquals(testBand3.hashCode(),testBand.hashCode());

    }

    @Test
    public void testToString() {
        String res = "Creator:Band{group=[Creator:Person{first=Jay last=Chow}RecordingArtist, Creator:Person{first=Yoga last=Lin}RecordingArtist], name=Pants}";
        assertEquals(res,testBand.toString());
    }
}