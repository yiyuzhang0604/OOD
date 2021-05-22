import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class AuthorTest {
    private String expectedName;
    private String expectedEmail;
    private String expectedAddress;
    private Author testAuthor;

    @org.junit.Before
    public void setUp() throws Exception {
        expectedName = "Yiyu Zhang";
        expectedEmail = "yiyuzhang0604@gmail.com";
        expectedAddress = "Berkeley, CA";
        testAuthor = new Author(expectedName, expectedEmail, expectedAddress);

    }

    @org.junit.Test
    public void getName() {
        assertEquals(expectedName, testAuthor.getName());
    }

    @org.junit.Test
    public void getEmail() {
        assertEquals(expectedEmail, testAuthor.getEmail());
    }

    @org.junit.Test
    public void getAddress() {
        assertEquals(expectedAddress, testAuthor.getAddress());
    }
}