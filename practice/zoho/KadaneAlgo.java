package zoho;

public class KadaneAlgo {
    public static void main(String[] args) {
        int[] arr = {-2 ,-3 ,4 ,-1, -2, 1 ,5 ,-3};
        System.out.println(algo(arr));
    }
    static int algo(int[] arr){
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];

            if(sum<0){
                sum = 0;
            }
            max = Math.max(max, sum);
        }
        return max;
    }
}
