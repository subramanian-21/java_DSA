package sort;

import java.util.Arrays;

public class Leet287 {

    public static void main(String[] args) {
        System.out.println(findDuplicate(new int[] {1,3,4,2,2}));
    }
    static int findDuplicate(int[] nums) {
        int i = 0;
        while (i<nums.length) {
            
            int c = nums[i] - 1;
            if(nums[i] != nums[c]){
                swap(nums, i, c);
            }else{
                i++;
            }

        }

        for(int j = 0;j<nums.length;j++){
            if(nums[j] != j+1) return nums[j];
        }
        return nums.length;
    }  
    static void swap(int[] arr, int i, int c){
        int temp = arr[i];
        arr[i] = arr[c];
        arr[c] = temp;
    }

}
