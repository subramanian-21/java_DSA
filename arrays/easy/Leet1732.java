package easy;
/*

 * There is a biker going on a road trip. 
 * The road trip consists of n + 1 points at different altitudes. 
 * The biker starts his trip on point 0 with altitude equal 0.
 * 
 * You are given an integer array gain of length n 
 * where gain[i] is the net gain in altitude between points i​​​​​​ and i + 1 for all (0 <= i < n).
 *  Return the highest altitude of a point.
 */

public class Leet1732 {
    public static void main(String[] args) {
        int[] arr = { -4, -3, -2, -1, 4, 3, 2 };

        System.out.println(largestAltitude(arr));
    }

    static int largestAltitude(int[] gain) {
        int out = 0;
        int[] arr = new int[gain.length + 1];
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                arr[i] = 0;
            } else {
                arr[i] = gain[i - 1] + arr[i - 1];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > out) {
                out = arr[i];
            }
        }

        return out;
    }

}
