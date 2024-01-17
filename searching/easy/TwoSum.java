package searching.easy;

import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSumSorted(new int[] {2,7,11,15}, 9)));
    }
    static int[] twoSumSorted(int[] nums,int target){
        int[] arr = {-1,-1};

        int start = 0;
        int end = nums.length -1;

        while(start<end){
            if(nums[start]+nums[end] == target){
                arr[0] = start;
                arr[1] = end;
                return arr;
            }
            if(nums[start] + nums[end] >target){
                end --;
            }else{
                start ++;
            }
        }
        
        return arr;
    }
}
