package midTerm.p2;

/**
 * Throws an exception if the given number does not exist
 */
public class InvalidEmployeeNumberException extends Exception{
    public InvalidEmployeeNumberException(String message){
        super(message);
    }
}
