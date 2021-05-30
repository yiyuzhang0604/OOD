package problem2;

/**
 * Recipient is a class object which has first name, last name and email address of the recipient
 */
public class Recipient {
    private String firstName;
    private String lastName;
    private String email;


    /**
     * Constructs a recipient class object
     * @param firstName - first name
     * @param lastName - last name
     * @param email - email address
     */
    public Recipient(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }
}

