package problem2;

import java.util.Objects;

/**
 * Book class is a subclass of Item
 */
public class Book extends Item{
    /**
     * Constructs a Book
     * @param creator - Author
     * @param title - title of book
     * @param year - year
     */
    public Book(Author creator, String title, int year) {
        super(creator, title, year);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return (getTitle() == ((Book) o).getTitle() &&
                getYear() == ((Book) o).getYear() &&
                getCreator() == ((Book) o).getCreator());
    }



    @Override
    public String toString() {
        return "Book:" + super.toString();
    }
}
