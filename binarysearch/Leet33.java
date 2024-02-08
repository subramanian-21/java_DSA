package binarysearch;

// rotated sorted array to find target element
public class Leet33 {
    public static void main(String[] args) {
        int[] arr = { 1,3 };

        System.out.println(binaryRotated(arr, 0));
    }

    static int binaryRotated(int[] arr, int n) {
        int pivot = findPivotWithDuplicates(arr);
        if(pivot == -1) return binarySearch(arr, 0, arr.length - 1 , n);
        if (arr[pivot] == n)
            return pivot;
        if (n <= arr[0])
            return binarySearch(arr, pivot + 1, arr.length - 1, n);

        return binarySearch(arr, 0, pivot - 1, n);
    }

    static int findPivot(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid>start && arr[mid] > arr[mid + 1])
                return mid;

            if ( mid < end && arr[mid - 1] > arr[mid])
                return mid - 1;

            if (arr[mid] >= arr[start])
                start = mid + 1;
            else
                end = mid - 1;

        }
        return -1;
    }

    static int binarySearch(int[] arr, int s, int e, int target) {

        int start = s;
        int end = e;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    static int findPivotWithDuplicates(int[] nums){
        int start = 0;
        int end = nums.length -1;

        while(start <= end){
            int mid = start+(end-start)/2;

            if(start<mid && nums[mid -1] > nums[mid]){
                return mid -1;
            }
            if(mid<end && nums[mid]>nums[mid+1]){
                return mid;
            }

            if(nums[start] == nums[mid] && nums[mid] == nums[end]){
                if(nums[start] > nums[start+1]){
                    return start;
                }
                start++;
                if(nums[end] < nums[end-1]){
                    return end-1;
                }
                end--;
            }
            
            
            if(nums[start] < nums[mid] || (nums[start] == nums[mid] && nums[mid]>nums[end])){
            start =mid+1;
        }else{
            end = mid -1;
        }
        }
        return nums.length -1;
    }
}




