package medium;

public class ProductOfArray {
    
    public int[] productExceptSelf(int[] nums) {
        int mul = 1;
        int[] pre = new int[nums.length];
        pre[0] = 1;
        for(int i = 1;i<nums.length;i++){
            pre[i] = pre[i-1]*nums[i-1];
        }
        for(int i = nums.length-2;i>=0;i--){
            mul = mul*nums[i+1];
            pre[i] = pre[i]*mul;
        }
        return pre;
    }
}
