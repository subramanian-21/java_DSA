package sort.selectionSort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[]arr = {12,1,13,15,8,2,3};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr){
        for(int i = 0;i<arr.length;i++){
            int index = i;

            for(int j = i;j<arr.length;j++){
                if(arr[index]>arr[j]){
                    index = j;
                }
            }
            System.out.println(arr[index]);
            if(arr[i] != arr[index]){
                swap(arr, i, index);
            }
        }
    }
    static void swap(int[] arr, int i1,int i2){
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }
}
