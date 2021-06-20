package problem2;

import java.util.Objects;

/**
 * Item class is an abstract class which provides basic information for item
 */
public abstract class Item {
    private Creator creator;
    private String title;
    private int year;

    /**
     * Constructs an Item
     * @param creator - the creator
     * @param title - the title
     * @param year - publish year
     */
    public Item(Creator creator, String title, int year) {
        this.creator = creator;
        this.title = title;
        this.year = year;
    }


    /**
     * Get the creator of the item
     * @return Person
     */
    public Creator getCreator() {
        return creator;
    }



    /**
     * Get the title of the item
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Get the publish year
     * @return the year
     */
    public int getYear() {
        return year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCreator(),getYear(),getTitle());
    }

    @Override
    public String toString() {
        return "Item{" +
                "creator=" + creator +
                ", title=" + title +
                ", year=" + year +
                '}';
    }
}
