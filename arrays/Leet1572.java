/**
 * Given a square matrix mat, return the sum of the matrix diagonals.
 * 
 * Only include the sum of all the elements on the primary diagonal and all the
 * elements on the secondary diagonal that are not part of the primary diagonal.
 */
public class Leet1572 {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.println(diagonalSum(arr));

    }

    static int diagonalSum(int[][] mat) {
        int out = 0;
        int start = 0;
        int end = mat[0].length - 1;
        for (int i = 0; i < mat.length; i++) {
            
            if (start != end) {
                out += mat[i][start] + mat[i][end];
            }else{
                out += mat[i][start];
            }
            System.out.println(out);

            if (end <= end / 2) {
                start--;
                end++;
            } else {
                start++;
                end--;
            }
            System.out.println(start + " " + end);

        }
        return out;
    }
}
