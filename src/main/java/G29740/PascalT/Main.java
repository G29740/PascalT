package G29740.PascalT;

/**
 * Entry point of application.
 * Creates and displays a Pascal's triangle.
 * @author G29740
 */
public class Main {
    /**
     * Main method example
     * @param args App arguments
     */
    public static void main(String[] args) {
        try {
            PascalT p = new PascalT(20);
            p.displayPascalT();
        } catch (PascalTException e) {
            e.printStackTrace();
        }
    }
}