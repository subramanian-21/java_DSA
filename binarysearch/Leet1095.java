package binarysearch;
// this is solution for 1095
// but not the exact way to solve

public class Leet1095 {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};

        System.out.println(findInMountainArray(5, arr));
    }

     static int findInMountainArray(int target, int[] mountainArr) {
        int start = 0;
        int end = mountainArr.length -1;

        while (start<end) {
            int mid = start+(end-start)/2;

            if(mountainArr[mid]>mountainArr[mid+1]){
                end = mid;
            }else{
                start = mid+1;
            }
        }
        if(mountainArr[start] == target) return start; 
        int left = binaryAscendingDescending(mountainArr, 0, start, target);
        int right = binaryAscendingDescending(mountainArr, start+1, mountainArr.length-1, target);

        if(left!=-1){
            return left;
        }
        else if(right!=-1){
            return right;
        }
        else{
            return -1;
        }
    }

    static int binaryAscendingDescending(int[] arr, int start, int end, int target) {
        boolean isAscending = arr[start] < arr[end];
        int s = start;
        int e = end;
        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (arr[mid] == target) return mid;

            if (isAscending) {
                if (target > arr[mid]) {
                    s = mid + 1;
                } else{
                    e = mid - 1;
                }
            }else{
                 if (target < arr[mid]) {
                    s = mid + 1;
                } else{
                    e = mid - 1;
                }
            }
        }
        return -1;
    }
    
}
