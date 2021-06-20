package problem2;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;
import java.util.ArrayList;

public class CatalogTest {
    private RecordingArtist testArt;
    private String testTitle;
    private Integer testYear;
    private Music testMusic;
    private Music testMusic2;
    private Band testBand;
    private ArrayList<RecordingArtist> testGroup;
    private RecordingArtist r1;
    private RecordingArtist r2;

    private Author testAuth;
    private String testTitle2;
    private Integer testYear2;
    private Book testBook;

    private ArrayList<Item> testList;
    private Catalog testCatalog;


    @Before
    public void setUp() throws Exception {
        testArt = new RecordingArtist("Briana","Zhang");
        testTitle = "Offer";
        testYear = 1996;
        testMusic = new Music(testArt,testTitle,testYear);

        r1 = new RecordingArtist("Jay","Chow");
        r2 = new RecordingArtist("Yoga","Lin");
        testGroup = new ArrayList<>();
        testGroup.add(r1);
        testGroup.add(r2);
        testBand = new Band(testGroup,"Pants");
        testMusic2 = new Music(testBand,"CS",1997);

        testAuth = new Author("Yoda","X");
        testTitle2 = "Computer Science";
        testYear2 = 1995;
        testBook = new Book(testAuth,testTitle2,testYear2);

        testCatalog = new Catalog();
        testCatalog.add(testBook);
        testCatalog.add(testMusic);
        testCatalog.add(testMusic2);
    }

    @Test
    public void getCatalog() {
        ArrayList<Item> exp = new ArrayList<>();
        exp.add(testBook);
        exp.add(testMusic);
        exp.add(testMusic2);
        for(int i = 0; i < exp.size();i++){
            assertEquals(exp.get(i), testCatalog.getCatalog().get(i));
        }
    }

    @Test
    public void search() {
        String keyword = "off";
        String keyword2 = "OFF";
        ArrayList<Item> exp = new ArrayList<>();
        exp.add(testMusic);

        ArrayList<Item> actual = testCatalog.search(keyword);
        ArrayList<Item> actual2 = testCatalog.search(keyword2);

        assertEquals(exp,actual);
        assertEquals(exp,actual2);

    }

    @Test
    public void testSearch() {
        ArrayList<Item> actual = testCatalog.search(testAuth);
        ArrayList<Item> exp = new ArrayList<>();
        exp.add(testBook);
        assertEquals(exp,actual);


    }

    @Test
    public void testSearch1() {
        ArrayList<Item> actual = testCatalog.search(r1);
        ArrayList<Item> exp = new ArrayList<>();
        exp.add(testMusic2);
        assertEquals(exp,actual);

        ArrayList<Item> actual1 = testCatalog.search(testArt);
        ArrayList<Item> exp2 = new ArrayList<>();
        exp2.add(testMusic);
        assertEquals(exp2,actual1);



    }
}