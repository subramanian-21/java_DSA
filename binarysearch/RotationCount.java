package binarysearch;

public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2,3,4};
        System.out.println(countPivot(arr));
    }

    static int countPivot(int[] arr){
        int pivot = findPivot(arr);
        return pivot+1;
    }

    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length -1;

        while (start <= end) {
            int mid = start + (end-start)/2;

            if(mid<end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }

            if(arr[start]<=arr[mid]){
                start = mid+1;
            }else{
                end = mid -1;
            }
        }
        return -1;
    }
}
