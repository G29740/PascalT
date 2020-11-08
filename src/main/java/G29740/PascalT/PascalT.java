package G29740.PascalT;

/**
 * This class represents a Pascal's Triangle.
 * It contains a simple constructor to build the triangle
 * as well as a method to display it in the console.
 * @author G29740
 */
public class PascalT {
    private final int[][] triangle;
    private final int nbLines;

    /**
     * Constructor of Pascal's Triangle.
     * Build a two dimensional array of int where each row has an increased
     * number of occurrences based on the number of lines received in parameter.
     * @param nbLines The number of lines that the triangle should display
     * @throws PascalTException Throws an exception if number of lines is smaller than 0 or higher than 25
     */
    public PascalT(int nbLines) throws PascalTException {
        if ((nbLines < 1) || (nbLines > 25)) {
            throw new PascalTException("Number of lines must be > 0 and max. 25");
        }
        this.nbLines = nbLines;
        triangle = new int[nbLines][];
        for (int i = 0; i < nbLines; i++) {
            triangle[i] = new int[i + 1];
            triangle[i][0] = 1;
            triangle[i][i] = 1;
            for (int j = 1; j < i; j++) {
                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
            }
        }
    }

    /**
     * This method displays the triangle justified to the left in the console window.
     */
    public void displayPascalT(){
        System.out.println("Pascal's triangle of size ["+nbLines+"]");
        for (int[] ints : triangle) {
            for (int elem : ints)
                System.out.print(elem + "\t");
            System.out.print("\n");
        }
    }
}