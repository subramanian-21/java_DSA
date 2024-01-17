package binarysearch;

public class Leet81 {

    public static void main(String[] args) {
        System.out.println(searchOp(new int[] {1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1},2));
    }
    static boolean search(int[] nums, int target) {
        if(nums.length == 1 ){
           if(nums[0] == target){
               return true;
           }else{
               return false;
           }
       }
       int pivot = findPivot(nums);
       if(pivot == -1) return binarySearch(nums,0,nums.length -1,target);
       if(nums[pivot] == target) return true;
       System.out.println(pivot);
       if(target <  nums[0] ){
           return binarySearch(nums,pivot+1,nums.length -1,target);
       }

       return binarySearch(nums,0,pivot-1,target);
   }
   static int findPivot(int[] nums){
       int start = 0;
       int end = nums.length -1;
       while(start < end){
           int mid = start+(end-start)/2;
       System.out.println("start: "+start+" mid: "+mid+" end: "+end);


           if(start<mid && nums[mid - 1] > nums[mid]){
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
         else if(nums[start] < nums[mid] || (nums[start] == nums[mid] && nums[mid]>nums[end])){
           start = mid+1;
       }else{
           end = mid -1;
       }
     
       }
       return -1;
   }
   static boolean binarySearch(int[] nums,int start,int end,int target){
       while(start<=end){
           int mid = start+(end-start)/2;

           if(nums[mid] == target){
               return true;
           }
           if(nums[mid] > target){
               end = mid -1;
           }else{
               start = mid+1;
           }
       }
       return false;
   }

   static boolean searchOp(int[] nums,int target){
    int start = 0;
    int end = nums.length-1;

    while (start<=end) {
        int mid = start + (end - start)/2;
        if (nums[mid]==target) return true;
        if (nums[start]==nums[mid] && nums[mid]==nums[end]) {
            start++;
            end--;
        }else if (nums[start] <= nums[mid]) {
            if (nums[start] <= target && target < nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        } else {
            if (nums[mid]<target && target<=nums[end]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
    }
    return false;
   }
}
