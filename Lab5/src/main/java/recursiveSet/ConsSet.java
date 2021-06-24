package recursiveSet;

/**
 * Set that has elements
 */
public class ConsSet implements Set{
    private Integer value;
    private Set rest;

    /**
     * Construct a ConSet
     * @param value - first element
     * @param rest - the rest of set
     */
    public ConsSet(Integer value, Set rest) {
        this.value = value;
        this.rest = rest;
    }

    @Override
    public Set emptySet() {
        return new EmtpySet();
    }

    @Override
    public Boolean isEmpty() {
        return false;
    }

    @Override
    public Set add(Integer value) {
        if(this.contains(value)){
            return this;
        }else{
            return new ConsSet(value, this);
        }
    }

    @Override
    public Boolean contains(Integer value) {
        if(this.value.equals(value)){
            return true;
        }else{
            return this.rest.contains(value);
        }
    }

    @Override
    public Set remove(Integer value) {
        if(!this.contains(value)){
            return this;
        }else if(!this.value.equals(value)){
            return new ConsSet(this.value,this.rest.remove(value));
        }else{
            return this.rest;
        }
    }

    @Override
    public Integer size() {
        return 1 + this.rest.size();
    }
}
