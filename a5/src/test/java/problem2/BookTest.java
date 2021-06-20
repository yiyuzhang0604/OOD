package problem2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BookTest {
    private Author testAuth;
    private String testTitle;
    private Integer testYear;
    private Book testBook;

    @Before
    public void setUp() throws Exception {
        testAuth = new Author("Briana","Zhang");
        testTitle = "Offer";
        testYear = 1996;
        testBook = new Book(testAuth,testTitle,testYear);
    }

    @Test
    public void testEquals() {
        assertEquals(testBook,testBook);
        assertNotEquals(testBook,null);
        Book test2 = new Book(testAuth,"Offer",1996);
        assertEquals(test2,testBook);
        Book test3 = new Book(new Author("Yiyu","Zhang"),"Off",1997);
        assertNotEquals(test3,testBook);
    }


    @Test
    public void testToString() {
        String res = "Book:Item{creator=Creator:Person{first=Briana last=Zhang}Author, title=Offer, year=1996}";
        assertEquals(res,testBook.toString());
    }

    @Test
    public void testHashCode() {
        Book test2 = new Book(new Author("Briana","Zhang"),"Offer",1996);
        assertEquals(test2.hashCode(),testBook.hashCode());

        Book test3 = new Book(new Author("Yiyu","Zhang"),"Off",1997);
        assertNotEquals(test3.hashCode(),testBook.hashCode());
    }


}