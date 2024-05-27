package sampleqns;

import java.util.Arrays;

// input : [0,1,0,2,3]
// output: [1,2,3,0,0]
public class PushZeros {
public static void main(String[] args) {
    int[] arr = {3,5,0,0,4};

    moveZeroes(arr);
    System.out.println(Arrays.toString(arr));
    
}
static void  func(int[] arr){
    int j = 0;
    for(int i = 1;i<arr.length;i++){
        if(arr[j] == 0 && arr[i] !=0){
            swap(arr, i, j);
            j++;
        }
    }
}  

static void swap(int[] arr,int i,int j){
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}
static void moveZeroes(int[] nums) {
    int z = 0;
    int nz = 0;

    while (nz<nums.length) {
        if(nums[nz] == 0){
            nz++;
        }else{
            swap(nums, z, nz);
            z++;nz++;
        }
    }

 }

}
