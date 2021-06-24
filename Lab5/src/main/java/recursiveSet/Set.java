package recursiveSet;

/**
 * Set is an interfaces which provides blueprints of set
 */
public interface Set {
    /**
     * Create an empty set
     * @return new set
     */
    Set emptySet();

    /**
     * Check if set is empty
     * @return boolean
     */
    Boolean isEmpty();

    /**
     * Add to set if not in set
     * @param value - value
     * @return - new set
     */
    Set add(Integer value);

    /**
     * Check if set has this element
     * @param value - value
     * @return boolean
     */
    Boolean contains(Integer value);

    /**
     * Remove element from set
     * @param value - value
     * @return new set
     */
    Set remove(Integer value);

    /**
     * Check size
     * @return size
     */
    Integer size();
}
