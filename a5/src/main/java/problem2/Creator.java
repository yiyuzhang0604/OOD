package problem2;

import java.util.Objects;

/**
 * Abstract class Creator
 */
public abstract class Creator {

    /**
     * Constructs a Creator
     */
    public Creator(){
    }



    /**
     * Function to see if two creators are the same
     * @param a creator a
     * @param b creator b
     * @return boolean
     */
    public boolean match(Creator a, Creator b){
        if(!a.getClass().equals(b.getClass())){
            return false;
        }else{
            return true;
        }
    }


    @Override
    public String toString() {
        return "Creator:";
    }
}
