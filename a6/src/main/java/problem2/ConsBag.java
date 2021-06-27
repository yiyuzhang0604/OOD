package problem2;

import java.util.Objects;

/**
 * Represent a non-empty Bag
 */
public class ConsBag extends ABagOfWords{
    private String value;
    private BagOfWords rest;
    private static final int ZERO = 0;
    private static final int ONE = 1;


    /**
     * Constructs a ConsBag object
     * @param value String value
     * @param rest the rest of the Bag
     */
    public ConsBag(String value, BagOfWords rest) {
        this.value = value;
        this.rest = rest;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean isEmpty() {
        return this.size().equals(ZERO);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer size() {
        return ONE + this.rest.size();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BagOfWords add(String s) {
        return new ConsBag(this.value, this.rest.add(s));
        // add string at the end
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean contains(String s) {
        if(this.value.equals(s)){
            return true;
        }else{
            return this.rest.contains(s);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConsBag consBag = (ConsBag) o;
       if(!this.size().equals(consBag.size())){
           return false;
       }
       if(!(this.contains(consBag.value))){
           return false;
       }
       return this.rest.equals(consBag.rest);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {
        return Objects.hash(value, rest);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return "BagOfWords [element=" + this.value + ", set=" + this.rest + "]";
    }
}
