import java.util.ArrayList;
import java.util.Arrays;

/**
 * Given two arrays of integers nums and index. Your task is to create target
 * array under the following rules:
 * 
 * Initially target array is empty.
 * From left to right read nums[i] and index[i], insert at index index[i] the
 * value nums[i] in target array.
 * Repeat the previous step until there are no elements to read in nums and
 * index.
 * Return the target array.
 * 
 * It is guaranteed that the insertion operations will be valid.
 */
public class Leet1389 {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 3, 4 };
        int[] index = { 0, 1, 2, 2, 1 };

        System.out.println(Arrays.toString(createTargetArray(arr, index)));

    }

    static int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> tar = new ArrayList<>();
        int[] out = new int[nums.length];

        for(int i = 0;i<nums.length;i++){
            tar.add(index[i],nums[i]);
        }

        for(int i = 0;i<nums.length;i++){
            out[i] = tar.get(i);
        }
       
        return out;
    }
}
