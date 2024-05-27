public class SecondLargest {
    public static void main(String[] args) {
        int[]  arr = {1,2,3,4,5,12,3,1,3,14,15,12,16,17};
        System.out.println(sl(arr));
    }
    static int sl(int[] arr){
        int n = arr.length;
        int l = arr[0];
        int sl = 0;
        for(int i = 0;i<n;i++){
            if(arr[i] > l){
                sl = l;
                l = arr[i];
            }

            if(arr[i] < l && arr[i] > sl){
                sl = arr[i];
            }
        }

        return sl;
    }
}
