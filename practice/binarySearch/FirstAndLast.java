package binarySearch;

import java.util.Arrays;

public class FirstAndLast {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(firstAndLast(new int[] {1,2,2,2,2,3,4,5}, 0 )));
    }

    static int[] firstAndLast(int[] arr, int target){
        int[] ret = {-1,-1};

        ret[0] = bs(arr, target, true);
        if (ret[0] != -1) {
        ret[1] = bs(arr, target, false);
            
        }

        return ret;
    }

    static int bs(int[]  arr, int target,boolean firstOc){
        int index = -1;
        int start  = 0;
        int end = arr.length -1;

        while (start <= end) {
            int mid = start +(end-start)/2;

            if(arr[mid] > target){
                end = mid-1;
            }else if (arr[mid] < target){
                start = mid+1;
            }else{
                index  = mid;
                if(firstOc){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }
        }
        return index;
    }
}
