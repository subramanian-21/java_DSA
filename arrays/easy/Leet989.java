package easy;
import java.util.ArrayList;
import java.util.List;

/**
 * The array-form of an integer num is an array representing its digits in left
 * to right order.
 * 
 * For example, for num = 1321, the array form is [1,3,2,1].
 * Given num, the array-form of an integer, and an integer k, return the
 * array-form of the integer num + k.
 * 
 * 
 */
public class Leet989 {
    public static void main(String[] args) {
        int[] out = { 1,2,6,3,0 };
        int k = 1;
        System.out.println(addToArrayForm(out, k));
    }

    static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> arr = new ArrayList<>();
        long n = 0;
        for (int i = 0; i < num.length; i++) {
            n += num[i] * Math.pow(10, num.length - 1 - i);
        }
        n +=k;

        while (n > 0) {
            
            arr.add(0, (int) n%10);
            n = n / 10;
        }

        return arr;
    }
}
