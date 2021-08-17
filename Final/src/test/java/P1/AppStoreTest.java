package P1;

import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class AppStoreTest {
    private MobileApp testApp1;
    private MobileApp testApp2;
    private MobileApp testApp3;
    private String name1 = "angry bird";
    private String name2 = "zombie";
    private String name3 = "bambi";
    private List<Name> developer1;
    private List<Name> developer2;
    private List<Name> developer3;
    private Name a = new Name("Yiyu","P", "Zhang");
    private Name b = new Name("Briana", "B", "Zhang");
    private Name c = new Name("Samoye","D","Zhang");
    private List<String> permission1;
    private List<String> permission2;
    private List<String> permission3;
    private LocalDate date1;
    private LocalDate date2;
    private LocalDate update1;
    private LocalDate update2;
    private AppStore testAppStore;
    private HashMap<MobileApp, Integer> testApprove;
    private List<MobileApp> testUnderReview;


    @Before
    public void setUp() throws Exception {
        developer1 = new ArrayList<>();
        developer2 = new ArrayList<>();
        developer3 = new ArrayList<>();

        developer1.add(a);
        developer2.add(b);
        developer3.add(c);
        permission1 = new ArrayList<>();
        permission2 = new ArrayList<>();
        permission3 = new ArrayList<>();
        permission1.add("yes");
        permission1.add("yeah");
        permission2.add("no");
        permission3.add("yes");

        date1 = LocalDate.of(2014, 12, 25);
        date2 = LocalDate.of(2015, 11,24);
        update1 = LocalDate.of(2020, 12, 22);
        update2 = LocalDate.of(2021, 5, 10);
        testApp1 = new MobileApp(name1, MobileAppCategory.GAME_APP, 2.35f, 1024.5f,
                developer1, permission1, date1,update1);
        testApp2 = new MobileApp(name2, MobileAppCategory.GAME_APP, 4.32f, 5.45f,
                developer2, permission2, date2, update1);
        testApp3 = new MobileApp(name3, MobileAppCategory.PRODUCTIVITY_APP, 4.56f, 2048.8f,
                developer3, permission3, date2, update2);
        testApprove = new HashMap<>();
        testUnderReview = new ArrayList<>();
        testApprove.put(testApp1, 1000);
        testApprove.put(testApp2, 2000);
        testUnderReview.add(testApp3);
        testAppStore = new AppStore(testApprove, testUnderReview);

    }

    @Test
    public void mysteryMethod() {
        List<MobileApp> expectedList = new ArrayList<>();
        // request game app, release after 2015.01.01
        LocalDate requestDate = LocalDate.of(2015, 1, 1);
        expectedList.add(testApp2);
        assertEquals(expectedList, testAppStore.mysteryMethod(MobileAppCategory.GAME_APP, requestDate) );
    }

    @Test
    public void filterByRequestedPermissions() {
        testUnderReview.add(testApp1);
        testUnderReview.add(testApp2);
        List<MobileApp> exp = new ArrayList<>();
        Integer max = 2;
        String tar1 = "no";
        String tar2 = "oh";
        exp.add(testApp3);
        exp.add(testApp1);
        List<MobileApp> act = testAppStore.filterByRequestedPermissions(max, tar1,tar2);
        assertEquals(act, exp);

    }
}