package problem3;
import problem2.Swimmer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * Represent a class which iterate the Swimmer class
 */
public class SwimmerIterator implements Iterator<Swimmer> {
    private List<Swimmer> swimmers;
    private int currentPlayer;

    public SwimmerIterator(List<Swimmer> swimmers){
        this.swimmers = swimmers;
        this.currentPlayer = 0;
    }

    private List<Swimmer> filter(List<Swimmer> list){
        List<Swimmer> res = new ArrayList<>();
        for(Swimmer swimmer: list){
            if(swimmer.getButterfly50mTimes().size() >= 5){
                for(Double record: swimmer.getFreestyle50mTimes()){
                    if(record < 26.17){
                        res.add(swimmer);
                        break;
                    }
                }
            }
        }
        return res;
    }



    @Override
    public boolean hasNext() {
        return this.currentPlayer < this.swimmers.size();
    }

    @Override
    public Swimmer next() {
        if(!this.hasNext()){
            throw new NoSuchElementException();
        }else{
            return swimmers.get(currentPlayer++);
        }
    }
}
