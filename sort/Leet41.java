package sort;

import java.util.Arrays;

public class Leet41 {

    public static void main(String[] args) {
        System.out.println(firstMissingPositive(new int[] {3,4,-1,1}));
    }
    static int firstMissingPositive(int[] nums) {
        int i = 0;
       
        while (i<nums.length) {
            int c = nums[i] -1 ;
            if ( nums[i] <nums.length && nums[i] >0 && nums[i] != nums[c]){
                swap(nums, i, c);
            }else{
                i++;
            }
        }
        for(int j = 0;j<nums.length;j++){
            if( nums[j] != j+1 ){
                return j+1;
            }
        }
        return nums.length+1;
    }

    static void swap(int[]  nums, int i ,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
