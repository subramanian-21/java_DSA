package easy;
import java.util.ArrayList;
import java.util.Arrays;

class Leet26 {
    public static void main(String[] args) {
        int arr[] = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };

        System.out.println(removeDuplicates(arr));
    }

    // static int removeDuplicates(int[] nums) {
    //     ArrayList<Integer> arr = new ArrayList<>();
    //     for (int i = 0; i < nums.length; i++) {
    //         for (int j = 0; j < arr.size() ; j++) {
    //             if (nums[i] != arr.get(j)) {
    //                 arr.add(nums[i]);
    //             } else {
    //                 continue;
    //             }
    //         }
    //     }
    //     return arr.size();
    // }


    /// acceptable ans

    static int removeDuplicates(int[] nums) {
        int e =0;
        for(int i =e+1;i< nums.length;i++){
           if(nums[i] != nums[e]){
            e++;
            nums[e] = nums[i];
           }
        }
        System.out.println(Arrays.toString(nums));
        return e+1;
    }


}

