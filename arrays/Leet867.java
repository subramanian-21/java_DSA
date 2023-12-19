import java.util.Arrays;

/**
 * 
 * 
 * Given a 2D integer array matrix, return the transpose of matrix.
 * 
 * The transpose of a matrix is the matrix flipped over its main diagonal,
 * switching the matrix's row and column indices.
 */

public class Leet867 {
    public static void main(String[] args) {
        int[][] arr= {{1,2,3},{4,5,6}};

        int[][] out = transpose(arr);

        for(int i=0;i<out.length;i++){
            System.out.println(Arrays.toString(out[i]));
        }
    }
    static int[][] transpose(int[][] matrix) {
        int[][] arr = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                arr[i][j] = matrix[j][i];
            }
        }

        return arr;
    }
}
