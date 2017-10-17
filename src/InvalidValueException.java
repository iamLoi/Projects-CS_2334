/**
 * InvalidValueException.java
 * 
 * @author Loi Huynh
 * @version Sep 27, 2017
 */

public class InvalidValueException extends RuntimeException
{
    /**
     * Default constructor
     * 
     * @param message
     *            to be outputted
     */
    public InvalidValueException(String message)
    {
        System.out.println(message);
    }
}
