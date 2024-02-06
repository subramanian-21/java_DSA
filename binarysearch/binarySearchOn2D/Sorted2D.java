import java.util.Arrays;

public class Sorted2D {

/***
 * 
 * {1,3,5,6}
 * {7,8,9,12}
 * {17,19,23,29}
 * {31,34,36,39}
 * {42,44,46,49}
 * 
 * target = 36;
 */
    public static void main(String[] args) {
        int[][] mat = {{1,3,5,6},{7,8,9,12},{17,19,23,29},{31,34,36,39},{42,44,46,49}};

        System.out.println(Arrays.toString(binaryIn2D(mat,49)));
    }

    static int[] binaryIn2D(int[][] mat,int target){
        int m = mat.length;
        int n = mat[0].length;

        int rowStart = 0;
        int rowEnd = m-1;
        int colMid = (n-1)/2;

        if(m == 1){
            return binarySearch(mat, target, 0, 0, n-1);
        }

        while (rowStart < rowEnd-1) {
            int mid = rowStart+(rowEnd-rowStart)/2;

            if(mat[mid][colMid] == target){
                return new int[]{mid,colMid};
            }

            if(mat[mid][colMid] < target){
                rowStart = mid;
            }else{
                rowEnd = mid;
            }
        } 

        

        if(target ==  mat[rowStart][colMid]){
            return new int[] {rowStart,colMid};
        }else if(target == mat[rowStart+1][colMid]){
            return new int[] {rowStart+1,colMid};
        }
        System.out.println(rowStart+" "+rowEnd);
        if(target <= mat[rowStart][colMid-1]){
            System.out.println(1);
           return binarySearch(mat, target, rowStart, 0 , colMid-1);
        }
        else if(target >= mat[rowStart][colMid+1] && target <= mat[rowStart][n-1]){
            System.out.println(2);
            return binarySearch(mat, target, rowStart, colMid+1, n-1);
        }
        else if(target <= mat[rowStart+1][colMid-1]){
            System.out.println(3);
            return binarySearch(mat, target, rowStart+1, 0, colMid-1);
        }else{
            System.out.println(4);
            return binarySearch(mat, target, rowStart+1, colMid+1, n-1);
        }

    }

    static int[] binarySearch(int[][] mat,int target,int row,int start,int end){
        while (start <= end) {
            int mid = start +(end-start)/2;

            if(mat[row][mid] == target){
                return new int[] {row,mid};
            }
            if(mat[row][mid] > target){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return new int[] {-1,-1};
    }
}
