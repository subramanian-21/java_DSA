package sort;

import java.util.Arrays;

public class Leet645 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(findErrorNums(new int[] {1,1})));
    }
    static int[] findErrorNums(int[] nums) {
        int[] arr = new int[2];
        int i = 0;
        while(i<nums.length){
            int c = nums[i] -1;

            if(nums[i] != nums[c]){
                swap(nums,i,c);
            }else{
                i++;
            }
        }
        for(int j = 0;j<nums.length;j++){
            if(nums[j] != j+1){
                arr[0] = nums[j];
                arr[1] = j+1;
            }
        }
        return arr;

    }
       static void swap(int[] arr, int i, int c){
        int temp = arr[i];
        arr[i] = arr[c];
        arr[c] = temp;
    }
}
