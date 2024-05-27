package zoho;

import java.util.Arrays;

public class DutchNationalFlag {
    public static void main(String[] args) {
        int[] arr = {0,1,2,2,1,2,0,1,1,1,0,0,0,1};

        algo(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void algo(int[] arr){
        int n = arr.length;
        int low = 0;
        int mid = 0;
        int high = n-1;
        
        while (mid <= high) {
            if(arr[mid] == 0){
                swap(arr, mid, low);
                low++;
                mid++;
            }else if(arr[mid] == 1){
                mid++;
            }else{
                swap(arr, mid, high);
                high--;
            }
        }
    }
    static void swap(int[] arr, int i,int j){
        int temp =  arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
