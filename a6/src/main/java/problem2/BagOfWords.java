package problem2;

/**
 * Represents BagOfWords ADT
 */
public interface BagOfWords {
    /**
     * Creates an emptyBagOfWords
     * @return emptyBagOfWords
     */
    public static BagOfWords emptyBagOfWords(){
        return new EmptyBag();
    }

    /**
     * Check if it is empty
     * @return boolean
     */
    Boolean isEmpty();

    /**
     * Return the number of elements in the BagOfWords, including duplicates
     * @return number of elements
     */
    Integer size();

    /**
     * Return a new BagOfWords that contains the new add element
     * @param s new element
     * @return new BagOfWrods
     */
    BagOfWords add(String s);

    /**
     * Check if s is in the BagOfWords
     * @param s String
     * @return boolean
     */
    Boolean contains(String s);

}
