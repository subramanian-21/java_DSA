import java.util.Arrays;

public class Leet566 {

    public static void main(String[] args) {
        int[][] arr = {{1,2},{3,4}};

        int[][] ans = matrixReshape(arr, 2, 2);
        for(int i = 0;i<ans.length;i++){
            System.out.println(Arrays.toString(ans[i]));
        }

    }
    static int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] arr = new int[r][c];

        int x = 0;
        int y = 0;
        int row = mat.length;
        int col = mat[0].length;

        if(row*col != r*c) return mat;

        for(int i =0;i<mat.length;i++){
            for(int j = 0;j<mat[i].length;j++){
                arr[x][y] = mat[i][j];
                y++;

                if(y > c-1){
                    y=0;
                    x++;
                }
            }
        }
        return arr;
        
    }
}
