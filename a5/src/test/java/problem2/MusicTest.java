package problem2;

import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class MusicTest {
    private RecordingArtist testArt;
    private String testTitle;
    private Integer testYear;
    private Music testMusic;
    private Music testMusic2;
    private Band testBand;
    private ArrayList<RecordingArtist> testGroup;
    private RecordingArtist r1;
    private RecordingArtist r2;




    @Before
    public void setUp() throws Exception {
        testArt = new RecordingArtist("Briana","Zhang");
        testTitle = "Offer";
        testYear = 1996;
        testMusic = new Music(testArt,testTitle,testYear);

        r1 = new RecordingArtist("Bambi","Zhang");
        r2 = new RecordingArtist("Yiyu","Zhang");
        testGroup = new ArrayList<>();
        testGroup.add(r1);
        testGroup.add(r2);
        testBand = new Band(testGroup,"Pants");
        testMusic2 = new Music(testBand,"CS",1997);

    }

    @Test
    public void testEquals() {
        assertEquals(testMusic,testMusic);
        assertNotEquals(testMusic,null);
        Music test2 = new Music(testArt,"Offer",1996);
        assertEquals(test2,testMusic);
        Music test3 = new Music(new RecordingArtist("Yiyu","Zhang"),"Off",1997);
        assertNotEquals(test3,testMusic);
    }

    @Test
    public void testHashCode() {
        Music test2 = new Music(new RecordingArtist("Briana","Zhang"),"Offer",1996);
        Music test3 = new Music(new RecordingArtist("Yiyu","Zhang"),"Off",1997);
        assertEquals(test2.hashCode(),testMusic.hashCode());
        assertNotEquals(test3.hashCode(),testMusic.hashCode());
    }


    @Test
    public void testToString() {
        String res = "Item{creator=Creator:Person{first=Briana last=Zhang}RecordingArtist, title=Offer, year=1996}Music";
        assertEquals(res,testMusic.toString());
    }
}