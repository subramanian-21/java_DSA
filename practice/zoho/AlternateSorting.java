package zoho;

import java.util.Arrays;

public class AlternateSorting {
    public static void main(String[] args) {
        int[] arr = {5,2,8,7,4,3,9};
        System.out.println(Arrays.toString(arr));

        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int[] arr){
        for(int i = 0;i<arr.length;i+=2){
                int lastIn = arr.length-i-1;
            
                int maxIn  = maxIndex(arr, 0, lastIn);
                swap(arr, maxIn, lastIn);
            }
        for(int i = 1;i<arr.length;i+=2){
                int lastIn = arr.length-i-1;
            
                int minIn  = minIndex(arr, 1, lastIn);
                swap(arr, minIn, lastIn);
        }
    }
    static int maxIndex(int[] arr, int s,int e){
        int max = s;

        for (int i = s; i <=e ; i+=2) {
            if(arr[max] > arr[i]){
                max = i;
            }
        }
        return max;
    }
    static int minIndex(int[] arr, int s,int e){
        int min = s;

        for (int i = s; i <=e ; i+=2) {
            min =Math.min(min,arr[i]);
        }
        return min;
    }
    static void alternateSort(int[] arr){

        int[] odd = new int[arr.length - (arr.length/2)];
        int[] even = new int[arr.length/2];
        
        int index = 0;
        for(int i = 0;i<arr.length;i+=2){
            odd[index] = arr[i];
            index++;
        }
        index =0;
        for(int i = 1;i<arr.length;i+=2){
            even[index] = arr[i];
            index++;
        }
        index = 0;
        bubbleSort(odd,true);
        bubbleSort(even,false);
        int oddIndex = 0;
        for(int i = 0;i<arr.length;i+=2){
            arr[i] = odd[oddIndex];
            oddIndex++;
        }
        int evenIndex =0;
        for(int i = 1;i<arr.length;i+=2){
            arr[i] = even[evenIndex];
            evenIndex++;
        }
    }
    static void optimised(int[] arr){
        for (int i = 0; i < arr.length; i+=2) {
            for (int j = 0; j < arr.length; j+=2) {
                if(arr[i] > arr[j]){
                    swap(arr, i, j);
                }
            }
        }
        for (int i = 1; i < arr.length; i+=2) {
            for (int j = 1; j < arr.length; j+=2) {
                if (arr[i] < arr[j]) {
                    swap(arr, i, j);
                }
            }
        }
    }
    static void swap(int[]a ,int i,int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    static void bubbleSort(int[] arr,boolean asc){
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr.length;j++){
                if(asc){
                    if(arr[i] < arr[j]){
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }else{
                    if(arr[i] > arr[j]){
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
               
            }
        }
    }
}
