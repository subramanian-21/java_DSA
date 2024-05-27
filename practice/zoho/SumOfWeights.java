package zoho;

import java.util.*;

public class SumOfWeights {
    public static void main(String args[]) {
        int arr[] = new int[] { 10, 36, -54, 89, 12 };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i] < arr[j]){
                    int t =  arr[i];
                    arr[i] = arr[j];
                    arr[j] = t ;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

        int wrr[] = new int[5];

        for (int i = 0; i < 5; i++) {
            wrr[i] = 0;
            if (isPerfectSquare(arr[i])) {
               
                wrr[i] = wrr[i] + 5;
            }

            if (arr[i] % 4 == 0 && arr[i] % 6 == 0) {
                wrr[i] = wrr[i] + 4;
            }

            if (arr[i] % 2 == 0) {
                wrr[i] = wrr[i] + 3;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print("<" + arr[i] + "," + wrr[i] + ">");
        }

    

    }

    static boolean isPerfectSquare(int n)
    {
        // Base case: 0 and 1 are perfect squares
        if (n <= 1) {
            return true;
        }
 
        // Initialize boundaries for binary search
        long left = 1, right = n;
 
        while (left <= right) {
            // Calculate middle value
            long mid = left + (right - left) / 2;
 
            // Calculate square of the middle value
            long square = mid * mid;
 
            // If the square matches n, n is a perfect
            // square
            if (square == n) {
                return true;
            }
            // If the square is smaller than n, search the
            // right half
            else if (square < n) {
                left = mid + 1;
            }
            // If the square is larger than n, search the
            // left half
            else {
                right = mid - 1;
            }
        }
 
        // If the loop completes without finding a perfect
        // square, n is not a perfect square
        return false;
    }
}