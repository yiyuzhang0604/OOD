package problem2;

/**
 * RecordingArtist is a subclass from Person
 */
public class RecordingArtist extends Person{
    /**
     * Constructs a RecordingArtist
     * @param first - first name
     * @param last - last name
     */
    public RecordingArtist(String first, String last) {
        super(first, last);
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        RecordingArtist that = (RecordingArtist) o;
        return getFirst() == that.getFirst() && getLast() == that.getLast();
    }

    @Override
    public String toString() {
        return super.toString() + "RecordingArtist";
    }
}
