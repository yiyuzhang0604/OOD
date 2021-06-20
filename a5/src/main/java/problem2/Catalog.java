package problem2;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/**
 *Catalog class store all the collections
 */
public class Catalog {
    private ArrayList<Item> catalog;

    /**
     * Constructs a catelog
     */
    public Catalog() {
        catalog = new ArrayList<Item>();
    }
    /**
     * Constructs a Catalog with pass in list
     * @param catalog list of items
     */
    public Catalog(ArrayList<Item> catalog){
        this.catalog = catalog;
    }

    /**
     * Get the list of all collection
     * @return list
     */
    public ArrayList<Item> getCatalog() {
        return catalog;
    }

    /**
     * Add collection to the catalog
     * @param collection - the item
     */
    public void add(Item collection){
        this.catalog.add(collection);
    }

    /**
     * Remove the collection from catalog
     * @param collection - item
     */
    public void remove(Item collection){
        this.catalog.remove(collection);
    }


    /**
     * Retreive all the items which have keyword in title
     * @param keyword - keyword
     * @return list
     */
    public ArrayList<Item> search(String keyword){
        keyword = keyword.toLowerCase();
        ArrayList<Item> res = new ArrayList<>();
        for(Item i: this.catalog){
            String title = i.getTitle().toLowerCase();
            if(title.contains(keyword)){
                res.add(i);
            }
        }
        return res;
    }

    /**
     * Retrieve all items that have exact match with author
     * @param author - the author
     * @return list
     */
    public ArrayList<Item> search(Author author){
        ArrayList<Item> res = new ArrayList<>();
        for(Item i:this.catalog){
            if(i instanceof Book){
                if(i.getCreator().equals(author)){
                    res.add(i);
                }

            }
        }
        return res;
    }

    /**
     * Retrieve all items in the catelog exact match for the given author
     * @param artist - singer
     * @return list
     */
    public ArrayList<Item> search(RecordingArtist artist){
        ArrayList<Item> res = new ArrayList<>();
        for(Item i:this.catalog){
            if(i instanceof Music){
                if(i.getCreator().equals(artist)){
                    res.add(i);
                }else if(i.getCreator() instanceof Band){
                    Band band = (Band)i.getCreator();
                    ArrayList<RecordingArtist> group = band.getGroup();
                    for(int j = 0; j < group.size();j++){
                        if(group.get(j).equals(artist)){
                            res.add(i);
                        }
                    }
                }
            }
        }
        return res;
    }
}
