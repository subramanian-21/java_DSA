package zoho;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {329,23,2,1,1,4,5,7,8,2000,9,0,1};

        sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    
    static void sort(int[] nums,int low,int high){
       if(low >= high){
        return;
       }

       int s = low;
       int e = high;

       int mid = (s+e)/2;

       int pivot = nums[mid];

       while (s<=e) {
            while (nums[s] <pivot) {
                s++;
            }
            while (nums[e]>pivot) {
                e--;
            }

            if(s<=e){
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;e--;
            }
       }

       sort(nums, low, e);
       sort(nums, s, high);
    }
}
