package easy;
/**
 * Given an array nums of integers, return how many of them contain an even
 * number of digits.
 */
public class Leet1295 {
    public static void main(String[] args) {
        int[] arr = {555,901,482,1771};
        System.out.println(findNumbers(arr));
    }
    static int findNumbers(int[] nums) {
        int out = 0,n;
        for (int i = 0; i < nums.length; i++) {
            n = nums[i];
            int c = 0;
            while (n>0) {
                n=n/10;
                c++;
            }
            if(c%2 == 0){
                out++;
            }
        }
        return out;
    }
}
