package Lab1;
import java.util.*;
public class AddMatrices {
    public static void main(String[] args) {
    	Scanner inp = new Scanner(System.in);
        System.out.print("Input rows: ");
        int rows = inp.nextInt();
        System.out.print("Input cols: ");
        int cols = inp.nextInt();
        int[][] fi = new int[rows][cols];
        int[][] se = new int[rows][cols];
        System.out.println("Elements of 1st matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                fi[i][j] = inp.nextInt();
            }
        }
        System.out.println("Elements of 2nd matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                se[i][j] = inp.nextInt();
            }
        }
        if (fi.length != se.length || fi[0].length != se[0].length) {
            System.out.println(" 2 matrices with different size");
            return;
        }

        int[][] sum = new int[rows][cols];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = fi[i][j] + se[i][j];
            }
        }

        System.out.println("Sum matrix is:");
        for (int[] row : sum) {
            for (int e : row) {
                System.out.print(e + " ");
            }
            System.out.println();
        }
    }
}

