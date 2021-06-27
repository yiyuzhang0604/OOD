package problem2;

/**
 * Represents an abstract class
 */
public abstract class ABagOfWords implements BagOfWords{
    @Override
    public BagOfWords add(String s) {
        return new ConsBag(s,this);
    }
}
