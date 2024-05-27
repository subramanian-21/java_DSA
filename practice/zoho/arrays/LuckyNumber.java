package zoho.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * link : https://leetcode.com/problems/lucky-numbers-in-a-matrix/description/
 * Example 1:

Input: matrix = [[3,7,8],[9,11,13],[15,16,17]]
Output: [15]
Explanation: 15 is the only lucky number since it is the minimum in its row and the maximum in its column.
Example 2:

Input: matrix = [[1,10,4,2],[9,3,8,7],[15,16,17,12]]
Output: [12]
Explanation: 12 is the only lucky number since it is the minimum in its row and the maximum in its column.
 */
public class LuckyNumber {
    public static void main(String[] args) {
        int[][] arr = {{3,7,8},
                       {9,11,13},
                       {15,16,17}};

        System.out.println(lucky(arr));
    }
    static List<Integer> lucky(int[][] arr){
        List<Integer> out = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int mi = Integer.MAX_VALUE;
            int ma = Integer.MIN_VALUE;
            int ind = 0;
            
            for (int j = 0; j < arr[0].length; j++) {
                if(mi > arr[i][j]){
                    mi = arr[i][j];
                    ind = j;
                }
            }
            System.out.println(mi);
            for (int j = 0; j < arr.length; j++) {
                ma = Math.max(ma, arr[j][ind]);
            }
            if(mi == ma){
                out.add(ma);
            }
        }
        return out; 
    }
}
