package zoho.recursion;
/**
 * Input: arr = {1, 4, 3, -5, -4, 8, 6};
Output: min = -5, max = 8

Input: arr = {1, 4, 45, 6, 10, -8};
Output: min = -8, max = 45
 */
public class MinMax {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(max(arr, arr.length));
    }
    static int min(int[] arr, int index){
        if(index == 1){

            return arr[0] ;
        }
        return Math.min(arr[index-1], min(arr,index-1));
    }
    static int max(int[] arr, int index){
        if(index == 1){
            return arr[0] ;
        }
        return Math.max(arr[index-1], max(arr,index-1));
    }
}
