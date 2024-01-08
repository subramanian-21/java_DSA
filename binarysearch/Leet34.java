package binarysearch;

public class Leet34 {
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        System.out.println(searchRange(arr, 8));
    }

    static int[] searchRange(int[] nums, int target) {
        int[] arr = {-1,-1};
        int start = search(nums,target,true);
        int end = search(nums, target, false);
        arr[0] = start;
        arr[1] = end;
        System.out.println(start+ " "+ end);
        return arr; 
    }

    static int search(int[] arr,int target,boolean isStart){
        int ans = -1;
        int start = 0;
        int end = arr.length-1;
        while (start<=end) {
            int mid =  start+(end-start)/2;
            if(arr[mid]>target){
                end = mid-1;
            }else if(arr[mid]<target){
                start = mid+1;
            }
            else{
                ans = mid;
                if(isStart){
                    end = mid -1;
                }else{
                    start = mid+1;
                }
            }
        }
        return ans;
    }
}
