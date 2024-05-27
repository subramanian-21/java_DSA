package zoho;

import java.util.Arrays;

public class RotateMatrix {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},
                       {4,5,6},
                       {7,8,9}};
        rotate(mat);
        System.out.println(Arrays.deepToString(mat));
    }
    static void rotate(int[][] mat){
        int row = 0;
        int col = 0;
        int maxCol = mat[0].length-1;
        int maxRow = mat.length-1;

        while (row < maxRow && col < maxCol) {
            int prev = mat[row+1][col];

            for (int i = col; i <= maxCol; i++) {
                int current = mat[row][i];
                mat[row][i] = prev;
                prev = current;
            }
            row++;

            for(int i = row;i<=maxRow;i++){
                int current = mat[i][maxCol];
                mat[i][maxCol] = prev;
                prev = current;
            }
            maxCol--;
            if(row <= maxRow){
                for (int i = maxCol; i >= col; i--) {
                    int current = mat[maxRow][i];
                    mat[maxRow][i] = prev;
                    prev = current;
                }
                maxRow--;
            }
            if(col <= maxCol){
                for (int i = maxRow; i >= row; i--) {
                    int current = mat[i][col];
                    mat[i][col] = prev;
                    prev = current;
                }
                col++;
            }
        }
    }
    static void rotate90(int[][] mat){
        transpose(mat);

        for (int i = 0; i < mat.length; i++) {
            reverse(mat[i]);
        }
    }
    static void transpose(int[][] mat){
        for(int i = 0;i<mat.length;i++){
            for (int j = 0; j < mat.length; j++) {
                mat[i][j] = mat[j][i];
            }
        }
    }
    static void reverse(int[] arr){
        int i = 0;
        int j = arr.length-1;

        while (i<j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;j--;
        }
    }
}
