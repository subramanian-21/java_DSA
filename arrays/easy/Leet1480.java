package easy;
import java.util.Arrays;

/**
 * Leet1480
 * Given an array nums. We define a running
 * sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
 * 
 * Return the running sum of nums.
 */
public class Leet1480 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
    
        System.out.println(Arrays.toString(runningSum(arr)));

    }

    static int[] runningSum(int[] nums) {
      int[] res = new int[nums.length];
      int a =0;
      for(int i =0;i<nums.length;i++){
          res[i] = a+nums[i];
           a = a+nums[i];
      }
      return res;
    }
}