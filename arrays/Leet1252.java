import java.util.Arrays;

/**
 * 
 * There is an m x n matrix that is initialized to all 0's. There is also a 2D
 * array indices where each indices[i] = [ri, ci] represents a 0-indexed
 * location to perform some increment operations on the matrix.
 * 
 * For each location indices[i], do both of the following:
 * 
 * Increment all the cells on row ri.
 * Increment all the cells on column ci.
 * Given m, n, and indices, return the number of odd-valued cells in the matrix
 * after applying the increment to all locations in indices.
 */
public class Leet1252 {
    public static void main(String[] args) {
        int[][] arr = { { 0, 1 }, { 1, 1 } };

        System.out.println(oddCells(2, 3, arr));
    }

    static int oddCells(int m, int n, int[][] indices) {
        int out = 0;

        int[][] arr = new int[m][n];

        for (int i = 0; i < indices.length; i++) {
            int r = indices[i][0];
            int c = indices[i][1];

            for (int k = 0; k < m; k++) {
                arr[k][c] += 1;

            }
            for (int j = 0; j < n; j++) {
                arr[r][j] += 1;
            }

        }
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] %2 != 0) {
                    out++;
                }  
            }
        }

        return out;
    }

}
