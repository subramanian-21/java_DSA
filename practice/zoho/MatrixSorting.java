package zoho;

import java.util.Arrays;

public class MatrixSorting {
    public static void main(String[] args) {

        String s = "ABCA";
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println(distinctPermutations(arr,0));
    }
    static  int distinctPermutations(char[] arr,int index){
        if(index >= arr.length){
            System.out.println(Arrays.toString(arr));
            return 1;
        }
        int c= 0;
        int ind = 0;
        if(index > 0 && arr[index] == arr[index-1]){
           ind = 1;
        }
        
        for(int i = index+ind;i<arr.length;i++){
            swap(arr, index+ind, i);
            c+=distinctPermutations(arr, index+ind+1);
            swap(arr, index+ind, i);
        }
        return  c;

    }
    static  void swap(char[] arr ,int i ,int j){
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
}