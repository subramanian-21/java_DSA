package easy;
import java.util.Arrays;

/**
 * Given the array nums, for each nums[i] find out how many numbers in the array
 * are smaller than it. That is, for each nums[i] you have to count the number
 * of valid j's such that j != i and nums[j] < nums[i].
 * 
 * Return the answer in an array.
 */
public class Leet1365 {
    public static void main(String[] args) {
        int[] arr = {8,1,2,2,3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(arr)));

    }
    static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arr = new int[nums.length];
        for (int i = 0; i < arr.length; i++) {
            int max =0;
            for (int j = 0; j < arr.length; j++) {
                if(nums[i]>nums[j]){
                    max++;
                }
            }
            arr[i] = max;
        }
        return arr;
        
    }
}
