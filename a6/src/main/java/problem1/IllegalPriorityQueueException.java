package problem1;

/**
 * Represents an invalid operation on a PriorityQueue
 */
public class IllegalPriorityQueueException extends RuntimeException {
    public IllegalPriorityQueueException(String message) {
        super(message);
    }
}
