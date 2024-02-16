package sampleqns;

import java.util.Arrays;

public class missingElements {
    public static void main(String[] args) {
        int [] arr = {5,4,1,2,1,0,8,7,4,2,1,5,7,2,3,9};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclic(int[] arr){
       for (int i = 0; i < arr.length; i++) {
        
        int c = arr[i] -1;
        if(arr[i]<arr.length&& arr[c]!=arr[i]){
            swap(arr, i, c);
        }
       }
    }
    static void swap(int[] arr, int i,int j ){
        int temp =  arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
