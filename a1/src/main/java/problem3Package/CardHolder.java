package problem3Package;

/**
 * cardHolder is a class object that has first name and last name
 */

public class CardHolder {
    private String firstName;
    private String lastName;

    /**
     * Constructor that creates a cardholder object with these parameters:
     * @param firstName - first name of the cardholder
     * @param lastName - last name of the cardholder
     */

    public CardHolder(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * return the first name of the card holder
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @return the last name of the card holder
     */
    public String getLastName() {
        return lastName;
    }
}
