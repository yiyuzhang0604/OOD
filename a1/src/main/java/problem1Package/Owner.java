package problem1Package;

/**
 * This is a Onwer class object which have firstName, lastName and phoneNumber attributes
 */
public class Owner {
    public String firstName;
    public String lastName;
    public String phoneNumber;

    /**
     * Constructor that creates an owner object
     * @param firstName - first name of the owner
     * @param lastName - last name of the owner
     * @param phoneNumber - phone number of the owner
     */

    public Owner(String firstName, String lastName, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    /**
     * return the first name;
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * @return the last name
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * @return the phone number
     */
    public String getPhoneNumber() {
        return this.phoneNumber;
    }
}
