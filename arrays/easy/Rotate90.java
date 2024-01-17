package easy;
import java.util.Arrays;

public class Rotate90 {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        for (int i = 0; i < mat.length; i++) {
        System.out.println(Arrays.toString(mat[i]));
       }
       rotateSame(mat);
        for (int i = 0; i < mat.length; i++) {
        System.out.println(Arrays.toString(mat[i]));
       }

       
    }
    static int[][] rotate(int[][] mat){
        int[][] arr = new int[mat.length][mat[0].length];
        int len = mat[0].length;
        for(int i = 0;i<arr.length;i++){
            for(int j =0;j<arr[0].length;j++){
                arr[j][len-1-i] = mat[i][j];
                 
            }
        }
        return arr;
    }

    static void rotateSame(int[][] mat){
        transpose(mat);
        for(int i = 0;i<mat.length;i++){
            reverse(mat[i]);
        }
    }

    static void transpose(int[][] mat){
        for (int i = 0; i < mat.length; i++) {
            for (int j = i+1; j < mat[i].length; j++) {
                int temp = mat[i][j];
               mat[i][j] = mat[j][i];
               mat[j][i] = temp;
            }
        }
    }
    static void reverse(int[] mat){
        int start = 0;
        int end = mat.length -1;
        while(start<end){
            // swap
            int temp = mat[start];
            mat[start]  = mat[end];
            mat[end] = temp;
            start++;
            end--;
        }
    }
    static boolean isSame(int[][] mat, int[][] tar){
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if(mat[i][j] != tar[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
}
