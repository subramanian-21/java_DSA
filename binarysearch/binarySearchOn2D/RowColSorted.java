//search in row wise and column wise sorted matrix

import java.util.Arrays;

/**
 * [10,20,30]
 * [11,21,31]
 * [12,22,32]
 * search element = 22
*/
public class RowColSorted {
    public static void main(String[] args) {
        int[][] mat = {{10,20,30},{11,21,31},{12,22,32}};
        System.out.println(Arrays.toString(searchIn2D(mat, 22)));
    }
    static int[] searchIn2D(int[][] mat,int target){
        int i =0 ;
        int j = mat.length - 1;
        int len = mat[0].length;

        while (i<len && j>=0) {
            if(mat[i][j] == target){
                return new int[] {i,j};
            }

            if(mat[i][j] > target){
                j--;
            }else{
                i++;
            }
        }
        return new int[] {-1,-1};
        
    }
}