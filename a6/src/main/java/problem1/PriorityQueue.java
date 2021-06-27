package problem1;

/**
 * Interface for PriorityQueue
 */
public interface PriorityQueue {
    /**
     * Create an empty PQ
     * @return new PQ
     */
    static PriorityQueue createEmtpy(){
        return new EmptyPQ();
    }

    /**
     * Check if PQ is empty
     * @return boolean
     */
    Boolean isEmpty();

    /**
     * Add element to PQ
     * @param priority - integer
     * @param value -String
     * @return new PQ
     */
    PriorityQueue add(Integer priority, String value);

    /**
     * Retrieve the value of the element which has highest priority
     * @return the String value
     */
    String peek();

    /**
     * Return a copy of the PQ without the element with the highest priority
     * @return PQ
     */
    PriorityQueue pop();
}
