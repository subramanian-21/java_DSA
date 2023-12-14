import java.util.Arrays;

/**
 * You are given a 0-indexed m x n binary matrix grid.
 * A 0-indexed m x n difference matrix diff is created with the following
 * procedure:
 * 
 * Let the number of ones in the ith row be onesRowi.
 * Let the number of ones in the jth column be onesColj.
 * Let the number of zeros in the ith row be zerosRowi.
 * Let the number of zeros in the jth column be zerosColj.
 * diff[i][j] = onesRowi + onesColj - zerosRowi - zerosColj
 * 
 * Return the difference matrix diff.
 */
public class Leet2482 {

    public static void main(String[] args) {
        int[][] arr = { { 1, 1, 1 }, { 1, 1, 1 } };
        int[][] res = onesMinusZeros(arr);
        for (int i = 0; i < 2; i++) {
            System.out.println(Arrays.toString(res[i]));
        }

    }

    static int[][] onesMinusZeros(int[][] grid) {
        int[][] res = new int[grid.length][grid[0].length];

        int[] r1 = new int[grid[0].length];
        int[] r0 = new int[grid[0].length];
        int[] c1 = new int[grid.length];
        int[] c0 = new int[grid.length];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 0) {
                    r0[j]++;
                    c0[i]++;
                } else {
                    r1[j]++;
                    c1[i]++;
                }

            }

        }
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[i].length; j++) {

                res[i][j] = r1[j] + c1[i] - r0[j] - c0[i];
            }
        }

        return res;
    }
}