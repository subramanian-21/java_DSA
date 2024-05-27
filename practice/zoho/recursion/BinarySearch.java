package zoho.recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-1,0,3,5,9,12};
        System.out.println(search(arr, 13, 0, arr.length));
    }
    static int search(int[] arr,int target,int s,int e){
        if(s>e || s>arr.length-1 || e<=0){
            return -1;
        }
        int mid = s+(e-s)/2;
        if(arr[mid] == target){
            return mid;
        }else if(arr[mid] > target){
            return search(arr, target, s, mid-1);
        }else{
            return search(arr, target, mid+1, e);
        }
    }
}
