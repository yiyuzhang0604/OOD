package problem2;

import java.util.Objects;

/**
 * Abstract class Person provides basic info for individual
 */
public abstract class Person extends Creator {
    private String first;
    private String last;

    /**
     * Constructs a person
     * @param first - first name
     * @param last - last name
     */
    public Person(String first, String last) {
        this.first = first;
        this.last = last;
    }

    /**
     * Get first name
     * @return first name
     */
    public String getFirst() {
        return first;
    }

    /**
     * Get last name
     * @return last name
     */
    public String getLast() {
        return last;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirst(),getLast());
    }

    @Override
    public String toString() {
        return super.toString() + "Person{first=" + first + " last=" + last + "}";
    }
}
