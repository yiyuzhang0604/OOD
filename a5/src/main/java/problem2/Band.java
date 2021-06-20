package problem2;
import java.util.ArrayList;
import java.util.Objects;

/**
 * Band class with band name and the band members
 */
public class Band extends Creator{
    private ArrayList<RecordingArtist> group;
    private String name;

    /**
     * Constructs a band
     * @param group - the list of recording artists
     * @param name - the name of the band
     */
    public Band(ArrayList<RecordingArtist> group, String name) {
        this.group = group;
        this.name = name;
    }

    /**
     * Get the member list
     * @return the member list
     */

    public ArrayList<RecordingArtist> getGroup() {
        return group;
    }

    /**
     * Get the name of the band
     * @return name
     */
    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Band that = (Band) o;
        ArrayList<RecordingArtist> member = that.getGroup();
        ArrayList<RecordingArtist> actual = getGroup();
        for(int i = 0; i < member.size(); i++){
            if(!member.get(i).equals(actual.get(i))){
                return false;
            }
        }
        return getName() == that.getName();
    }

    @Override
    public int hashCode() {
        return Objects.hash(group, name);
    }

    @Override
    public String toString() {
        return super.toString() + "Band{" +
                "group=" + group +
                ", name=" + name +
                '}';
    }
}
