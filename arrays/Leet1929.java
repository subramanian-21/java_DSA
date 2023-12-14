import java.util.Arrays;

/**
 * Given an integer array nums of length n,
 * you want to create an array ans of length 2n
 * where ans[i] == nums[i] and ans[i + n] == nums[i]
 * for 0 <= i < n (0-indexed).
 * Specifically, ans is the concatenation of two nums arrays.
 * 
 * Return the array ans.
 */
public class Leet1929 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4 };

        System.out.println(Arrays.toString(getConcatenation(arr)));
    }

    static int[] getConcatenation(int[] nums) {
        int len = nums.length * 2;
        int[] newArr = new int[len];
        int n = 0;
        for (int i = 0; i < len; i++) {
            if (n < nums.length) {
                newArr[i] = nums[n];
                n++;
            } else {

                newArr[i] = nums[0];
                n = 1;
            }

        }
        return newArr;
    }
}