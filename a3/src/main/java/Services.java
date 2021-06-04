/**
 * Service is an interfaces which provides the blueprints of any kind of services
 */

public interface Services {

    /**
     * Returns the price of the service
     * @return the price of the service
     */
    double calculatePrice();

    /**
     *
     * @return a string representation of this service
     */
    String toString();

    /**
     * Test if the two services are equal
     */
    boolean equals(Object o);

    /**
     * Generate the hashcode for this service
     */
    int hashCode();

    /**
     * Get the address of this service
     */
    String getAddress();

    /**
     * Get the property size of the service
     */
    PropertySize getPropertySize();

    /**
     *
     * @return true if the service is monthly, false if not
     */
    boolean isMonthly();

    /**
     *
     * @return the number of previous services
     */
    int getPrevious();

}
