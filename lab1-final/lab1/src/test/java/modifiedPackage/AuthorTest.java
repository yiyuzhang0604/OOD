package modifiedPackage;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AuthorTest {
    private Name expectedName;
    private String expectedEmail;
    private String expectedAddress;
    private Author testAuthor;

    @Before
    public void setUp() throws Exception {
        expectedName = new Name("Yiyu","Bambi", "Zhang");
        expectedEmail = "yiyuzhang0604@gmail.com";
        expectedAddress = "Berkeley, CA";
        testAuthor = new Author(expectedName, expectedEmail, expectedAddress);

    }

    @Test
    public void getName() {
        assertEquals(expectedName.getFirstName(), testAuthor.getName().getFirstName());
        assertEquals(expectedName.getMiddleName(), testAuthor.getName().getMiddleName());
        assertEquals(expectedName.getLastName(), testAuthor.getName().getLastName());
    }


    @Test
    public void getEmail() {
        assertEquals(expectedEmail, testAuthor.getEmail());
    }

    @Test
    public void getAddress() {
        assertEquals(expectedEmail, testAuthor.getEmail());
    }
}