package zoho;

import java.util.ArrayList;
import java.util.List;

public class MaxSumSubarray {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSum(arr, 3));
        System.out.println(maxSum(arr));
    }
    static int maxSum(int[] arr, int k){
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for(int i = 0;i<k;i++){
            sum+=arr[i];
        }
        for (int i = k; i < arr.length; i++) {
            sum = sum - arr[i-k] + arr[i];
            max = Math.max(max, sum);
        }
        return max;
    }
    static List<Integer>  maxSum(int[] nums){
        List<Integer> arr = new ArrayList<>();
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int s = 0;
        int e = 0;

        for(int i = 0;i<nums.length;i++){
            sum+=nums[i];
            if(max < sum){
                max = sum;
                e = i;
            }
            if(sum < 0){
                sum = 0;
                s=i+1;
            }
        }
        for (int i = s; i <= e; i++) {
            arr.add(nums[i]);
        }
        System.out.println(e);
        System.out.println(max);
        return arr;
    }
}
