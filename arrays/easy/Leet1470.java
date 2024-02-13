package easy;
import java.util.Arrays;

/**
 * Leet1470
 * Given the array nums consisting of 2n elements in the form
 * [x1,x2,...,xn,y1,y2,...,yn].
 * 
 * Return the array in the form [x1,y1,x2,y2,...,xn,yn].
 */
public class Leet1470 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 4, 3, 2, 1 };

        int n = arr.length / 2;

        System.out.println(Arrays.toString(shuffle(arr, n)));

    }

    static int[] shuffle(int[] nums, int n) {

        int[] res = new int[nums.length];
        int s = 0;
        int e = n;
        for (int i = 0; i < nums.length; i += 2) {

            if (s < n) {
                res[i] = nums[s];
                s++;
            }
        }
        for (int i = 1; i < nums.length; i += 2) {

            if (e < nums.length) {
                res[i] = nums[e];
                e++;
            }
        }

        return res;
    }
}
