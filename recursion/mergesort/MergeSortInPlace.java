package recursion.mergesort;

import java.util.Arrays;

public class MergeSortInPlace {
    public static void main(String[] args) {
        int[] arr = {2,34,5,2,1,1,32,465,57,8,55};

        mergeSort(arr, 0, arr.length -1);

        System.out.println(Arrays.toString(arr));
    }
    static void mergeSort(int[]  arr, int s , int e){
        if(e-s == 1) return;

        int mid = (s+e)/2;

        mergeSort(arr, s, mid);
        mergeSort(arr, mid, e);

        merge(arr, s, mid, e);
    }

    static void merge(int[]  arr, int s, int mid, int e){
        int[] ret = new int[e-s];
        int i = s;
        int j = mid;
        int k = 0;
        while (i<mid && j<e) {
            if(arr[i] < arr[j]){
                ret[k] = arr[i++];
            }else{
                ret[k] = arr[j++];
            }
            k++;
        }
        while (i<mid) {
            ret[k] = arr[i++];
            k++;
        }
        while (j<e) {
            ret[k] = arr[j++];
            k++;
        }

        for (int m = 0;m<ret.length;m++) {
            arr[s+m] = ret[m];
        }
    }
}
