package binarysearch;

public class Recursive {
    public static void main(String[] args) {
        System.out.println(bs(new int[] {1,2,3,4,5,6,78,99,100}, 98));
    }
    
    static int bs(int[] arr, int target){
        return bsr(arr, target, 0, arr.length -1);
    }

    static int bsr(int[] arr,int target,int start, int end){
        if(start > end){
            return -1;
        }
        int mid = (start+end)/2;

        if(arr[mid] == target ){
            return mid;
        }else if( arr[mid] > target){
          return  bsr(arr, target, start, mid -1);
        }else{
            return bsr(arr, target, mid+1, end);
        }
    }
}
