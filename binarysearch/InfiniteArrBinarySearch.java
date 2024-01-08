package binarysearch;
public class InfiniteArrBinarySearch {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,8,9,12,23,45,56,67,87,90,121,131,133,1333};

        System.out.println(binarysearch(arr, 131));
    }

    static int binarysearch(int[] arr,int t){
        int start = 0;
        int end = 1;
        while(start<=end){
            int mid = start+(end-start)/2;

            if(arr[mid]>t){
                end = mid-1;
            }else if(arr[mid]<t){
                start = mid+1;
                end = end+start*2;
            }else{
                return mid;
            }
        }

        return -1;
    }
}