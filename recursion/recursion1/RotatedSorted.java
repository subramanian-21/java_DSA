package recursion.recursion1;

public class RotatedSorted {
    public static void main(String[] args) {
        System.out.println(binarySearch(new int[] {5,6,7,8,9,1,2,3,4}, 4, 0, 9));
    }
    static int binarySearch(int[] arr,int target,int start,int end){

        if(start>end){
            return -1;
        }

        int mid = start+(end-start)/2;

        if(arr[mid] == target) return mid;

        if(arr[start]<=arr[mid]){
            if(target >= arr[start] && target <= arr[mid]){
                return binarySearch(arr, target, start, mid-1);
            }else{
                return binarySearch(arr, target, mid+1, end);
            }
        }
        if(target >= arr[mid] && target <=arr[end]){
            return binarySearch(arr, target, mid+1, end);
        }
        return binarySearch(arr, target, start, mid-1);

    }
}
