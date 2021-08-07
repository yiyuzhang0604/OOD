package problem1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TravelerIterator implements Iterator {
    private List<Traveler> noUSTravelers;

    public TravelerIterator(List<Traveler> noUSTravelers) {
        this.noUSTravelers = findNonUSTravelers(noUSTravelers);
    }

    private List<Traveler> findNonUSTravelers(List<Traveler> travelers) {
        List<Traveler> result = new ArrayList<>();
        for(Traveler traveler: travelers) {
            if(!hasTravelOutsideUS(traveler)){
                result.add(traveler);
            }
        }
        return result;
    }

    private boolean hasTravelOutsideUS(Traveler traveler){
        for(Destination destionation: traveler.traveledDestinations()) {
            if(!destionation.getCountry().equals("US")) {
                return true;
            }
        }
        return false;
    }

    /**
     * Returns true if the iteration has more elements.
     * @return true if ther is more elements
     */
    @Override
    public boolean hasNext() {
        return (noUSTravelers.size() > 0);
    }

    /**
     * Return the next element in the iteration
     * @return the next element
     */
    @Override
    public Object next() {
        if(this.hasNext()){
            return this.noUSTravelers.remove(0);
        }
        return null;
    }

    @Override
    public void remove() {
        throw new RuntimeException("Method not implemented");
    }
}
