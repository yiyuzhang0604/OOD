package problem2;
import java.util.ArrayList;
import java.util.Objects;

/**
 * Music is a subclass of Item
 */
public class Music extends Item{

    private RecordingArtist creator;
    private Band band;
    private String bandName;

    /**
     * Constructs a Music object
     * @param creator - RecordingArtist or Band
     * @param title - name of music
     * @param year - publish year
     */
    public Music(RecordingArtist creator, String title, int year) {
        super(creator, title, year);
    }

    /**
     * Construct a music object with band
     * @param band- band
     * @param title - name
     * @param year - publish year
     */
    public Music(Band band, String title, int year){
        super(band,title,year);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Music music = (Music) o;
        if(getCreator().getClass() != ((Music) o).getCreator().getClass()) return false;

        return (getTitle() == ((Music) o).getTitle() &&
                getYear() == ((Music) o).getYear() &&
                getCreator() == ((Music) o).getCreator());
    }


    @Override
    public String toString() {
        return super.toString() + "Music";
    }
}
