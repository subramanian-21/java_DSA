package easy;
public class Leet1886 {
   
        static boolean findRotation(int[][] mat, int[][] target) {
            for(int i = 0;i<4;i++){
                rotateSame(target);
                if(isSame(mat,target)){
                    return true;
                }
            }
            return false;
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
    
}
