public class Leet53 {
    public static void main(String[] args) {
        
    }
    public int maxSubArray(int[] nums) {
        int index = 0;
        int max=Integer.MIN_VALUE;
        int sum = 0;

        for(int i = 0;i<nums.length;i++){
            sum = sum + nums[i];

            if(sum > max){
                max = sum;
            }

            if(sum<0){
                sum = 0;
            }
        }
        return max;

    }
}
