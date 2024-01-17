package medium;

import java.util.Arrays;

public class SetMatrixZero {
    public static void main(String[] args) {
        int[][] matrix = { { 0, 1, 2, 0 }, { 3, 4, 5, 2 }, { 1, 3, 1, 5 } };

        setMatrixZeroOptimised(matrix);
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }

    }

    static void setMatrixZeroOptimised(int[][] mat) {
        int[] col = new int[mat[0].length];
        int[] row = new int[mat.length];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 0) {
                    row[i] = -1;
                    col[j] = -1;
                }
            }
        }

        for (int i = 0; i < row.length; i++) {
            if (row[i] == -1) {
                for (int b = 0; b < mat[0].length; b++) {
                        mat[i][b] = 0;
                }
            }
        }
        for(int i =0;i<col.length;i++){
            if (col[i] == -1) {
                for (int b = 0; b < mat.length; b++) {
                        mat[b][i] = 0;
                }
            }
        }
    }

    static void setMatrixZeroBruteforce(int[][] mat) {

        for (int i = 0; i < mat.length; i++) {
            int row = -1;
            int col = -1;
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 0) {
                    row = i;
                    col = j;

                }

                if (row != -1) {
                    for (int a = 0; a < mat[0].length; a++) {
                        if (mat[row][a] != 0)
                            mat[row][a] = -10;
                    }
                    for (int b = 0; b < mat.length; b++) {
                        if (mat[b][col] != 0)
                            mat[b][col] = -10;
                    }
                }

            }

        }

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == -10) {
                    mat[i][j] = 0;
                }
            }
        }
    }
}
