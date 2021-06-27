package problem1;

/**
 * Represents an EmptyPQ
 */
public class EmptyPQ extends APriorityQueue {
    private static final int HASH_CODE = 31;

    /**
     * {@inheritDoc}
     */
    @Override
    public String peek() {
        throw new IllegalPriorityQueueException("Called peak on an empty priorityQueue");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PriorityQueue pop() {
        throw new IllegalPriorityQueueException("Called pop on an empty priorityQueue");
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {
        return HASH_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return "[| |]";
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if(!(o instanceof EmptyPQ)) {
            return false;
        }
        return true;
    }
}
