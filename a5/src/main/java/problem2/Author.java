package problem2;

/**
 * Author class extends from Person
 */
public class Author extends Person{
    /**
     * Constructs an Author
     * @param first - first name
     * @param last - last name
     */
    public Author(String first, String last) {
        super(first, last);
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Author that = (Author) o;
        return getFirst() == that.getFirst() && getLast() == that.getLast();
    }

    @Override
    public String toString() {
        return super.toString() + "Author";
    }
}
