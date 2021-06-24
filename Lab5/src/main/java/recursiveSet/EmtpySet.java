package recursiveSet;

/**
 * EmptySet implements Set
 */
public class EmtpySet implements Set{
    /**
     * Construct an empty set
     */
    public EmtpySet() {
    }
    @Override
    public Set emptySet() {
        return new EmtpySet();
    }

    @Override
    public Boolean isEmpty() {
        return true;
    }

    @Override
    public Set add(Integer value) {
        return new ConsSet(value,this);
    }

    @Override
    public Boolean contains(Integer value) {
        return false;
    }

    @Override
    public Set remove(Integer value) {
        return this;
    }

    @Override
    public Integer size() {
        return 0;
    }
}
