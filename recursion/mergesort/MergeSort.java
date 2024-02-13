package recursion.mergesort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
    
        
        System.out.println(Arrays.toString(mergeSort(new int[]{1,0,2,4,5,3,2,1,7,8,3,2,1,4,6})));
    }

    static int[] mergeSort(int[] arr){
        if(arr.length == 1){
            return arr;
        }

        int mid = arr.length/2;

        int[] first = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] second = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return mergeArray(first, second);
    }
    static int[] mergeArray(int[] first,int[] second){
        int i = 0,j = 0,k =0;
        int[] arr = new int[first.length+second.length];

        while (i<first.length && j<second.length) {
            if(first[i] > second[j]){
                arr[k] = second[j];
                j++;
            }else{
                arr[k] = first[i];
                i++;
            }
            k++;
        }

        while (i<first.length) {
            arr[k] = first[i];
            i++;
            k++;
        }
        while (j<second.length) {
            arr[k] = second[j];
            j++;
            k++;
        }

        return arr; 
    }
}
