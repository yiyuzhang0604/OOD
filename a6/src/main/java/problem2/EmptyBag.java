package problem2;

/**
 * Represents an EmptyBag class
 */
public class EmptyBag extends ABagOfWords {
    private static final int HASH_CODE = 31;
    private static final int ZERO = 0;

    /**
     * Instantiates a new emptyBag
     */
    public EmptyBag() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean isEmpty() {
        return true;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer size() {
        return ZERO;
    }

    /**
     * {@inheritDoc}
     */

    @Override
    public int hashCode(){
        return HASH_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean contains(String s) {
        return false;
    }
    @Override
    public String toString() {
        return "{}";
    }
}
