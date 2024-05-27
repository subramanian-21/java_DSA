package easy;
import java.util.Arrays;

class Leet26 {
    public static void main(String[] args) {
        int arr[] = { 1,3,5,7,2,4,6,8};
        cyclicsort(arr);
        System.out.println(Arrays.toString(arr));
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
    static void cyclicsort(int[] arr){
        int i = 0;
        while (i < arr.length) {
            int c = arr[i]-1;
            if(arr[i] == arr[c]){
                i++;
            }else{
                swap(arr,i,c);
            }
        }
    }
    static void swap(int[] arr, int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

