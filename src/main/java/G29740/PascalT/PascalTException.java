package G29740.PascalT;

/**
 * This class represents the Exception object thrown while building the PascalT object.
 * @author G29740
 */
public class PascalTException extends Exception {
    /**
     * Creates a new instance of PascalTException without detail message.
     */
    public PascalTException() {
        super("Exception in PascalT class");
    }

    /**
     * Constructs an instance of PascalTException with the specified detail message.
     * @param msg the detail message.
     */
    public PascalTException(String msg) {
        super(msg);
    }
}