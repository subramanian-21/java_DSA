package binarysearch;
//leet 410
public class splitArrayLargestSum {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40};

        System.out.println(splitArray(arr, 2));
    }

    static int splitArray(int[] nums, int k) {

        int start = 0;
        int end = 0;

        for(int i = 0;i<nums.length;i++){
            start = Math.max(start, nums[i]);
            end+=nums[i];
        }

        while (start < end) {
            int mid = start + (end-start)/2;

            int pieces = 1;
            int sum = 0;
            for(int num :nums){
                if ( sum + num > mid ) {
                    sum = num;
                    pieces++;
                }else{
                    sum+=num;
                }
            }

            if(pieces>k){
                start = mid+1;
            }else{
                end = mid;
            }
        }
        return start;
    }
}
