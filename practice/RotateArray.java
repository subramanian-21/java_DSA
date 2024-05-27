
import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int [] arr =  {1,2,3,4,5,12,3,1,3,14,15,12,16,17};

        rotateNtimes(arr,10000);

        System.out.println(Arrays.toString(arr));
    }
    static void rotateOnce(int[] arr){
        int n = arr.length;

        int temp = arr[0];

        for(int i = 1 ;i<n;i++){
            arr[i-1] = arr[i];
        }

        arr[n-1] = temp;
    
    }

    static void rotateNtimes(int[] arr, int k){
        
        int n = arr.length;
       k = k%n;
        for(int j = 0;j< k;j++){
            int temp = arr[0];

            for(int i = 1 ;i<n;i++){
                arr[i-1] = arr[i];
            }
    
            arr[n-1] = temp;
        }
    }
}
