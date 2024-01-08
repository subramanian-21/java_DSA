package binarysearch;

public class CeilingOfNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,7,8};
        System.out.println(FindCeling(arr,5));
    }
    static int FindCeling(int[] arr,int n){

        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = (start+end)/2;

            if(arr[mid] == n){
                return n;
            }

            if(arr[mid] > n){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return arr[start];
    }
}

