
import java.util.Arrays;
public class ZerosToEnd {
    public static void main(String[] args) {
        int[] arr  = {1,0,9,8,0,7,0,3,0,0,2,1,4};
        ze(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void zeb(int[] arr){
        
    }
    static void ze(int[] arr){
        int n = arr.length;

        int k = 0;

        for(int i = k+1;i<n;i++){
            if(arr[k] != 0){
                swap(arr,i,k);
                k++; 
            }else{
                k++;
            }
        }
        
    }
    static void swap(int[] arr,int i,int k){
        int temp = arr[i];
        arr[i] = arr[k];
        arr[k] = temp;

        }
}
