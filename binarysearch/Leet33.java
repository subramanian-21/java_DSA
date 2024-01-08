package binarysearch;

// rotated sorted array to find target element
public class Leet33 {
    public static void main(String[] args) {
        int[] arr = { 5,6,7,0,1,2,3,4 };

        System.out.println(binaryRotated(arr, 0));
    }

    static int binaryRotated(int[] arr, int n) {
        int pivot = findPivot(arr);
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
}
