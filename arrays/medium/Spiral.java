package medium;

import java.util.ArrayList;
import java.util.List;

//Leet code 54
public class Spiral {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};

        System.out.println(spiralOrder(mat));
    }
    
     static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> arr = new ArrayList<>();

        int l = 0;
        int r = matrix[0].length - 1;
        int t = 0;
        int b = matrix.length - 1;
        while (l<=r && t<=b) {
            
            for(int i  = l;i<=r;i++){
                arr.add(matrix[t][i]);
            }
            t++;
            for(int i = t ; i<b;i++){
                arr.add(matrix[i][r]);
            }
            r--;

            if(!(l<=r && t<=b)){
                return arr;
            }
    
            for(int i = r;i>=l;i--){
                arr.add(matrix[b][i]);
            }
            b--;
    
            for(int i = b;i>=t;i--){
                arr.add(matrix[i][l]);
            }
            l++;
        }

        return arr;
     }
}
