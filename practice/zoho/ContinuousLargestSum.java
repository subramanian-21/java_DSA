package zoho;

public class ContinuousLargestSum {
    public static void main(String[] args) {
        int[] arr = {0,5,6,0,9,0,0,1};
        System.out.println(clsp(arr));
    }
    static int clsp(int[] arr){
        int sum = 0;
        int max = 0;
        for (int i = 0; i < arr.length-1; i++) {
            sum = arr[i]+arr[i+1];
            max = Math.max(max,sum);
        }
        return max; 
       }

}
