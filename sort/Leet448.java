package sort;

import java.util.ArrayList;
import java.util.List;

// all missing int from [1-n] 
    // cyclic sort
public class Leet448 {
    public static void main(String[] args) {
        System.out.println(findDisappearedNumbers(new int[] {4,3,2,7,8,2,3,1}));
    }
     static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> arr = new ArrayList<>();

        int i = 0;
        while (i<nums.length) {
            int c = nums[i] -1;

            if(nums[i] != nums[c]){
                swap(nums, i, c);
            }else{
                i++;
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != j+1){
                arr.add(j+1);
            }
        }
        return arr;
    }
    static void swap(int[] arr,int i, int c){
        int temp = arr[i];
        arr[i] = arr[c];
        arr[c]= temp;
    }
}
