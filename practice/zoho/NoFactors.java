package zoho;

import java.util.Arrays;

public class NoFactors {
    public static void main(String[] args) {
        int[] arr = {8, 2, 3, 12, 16};
        arrange(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void arrange(int[] arr){
        for(int i = 0;i<arr.length;i++){
            for (int j = 0; j < arr.length; j++) {
                if(noOfFactors(arr[i]) > noOfFactors(arr[j])){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    static int noOfFactors(int n){
        int num = 0;
        for(int i = 1;i<=n;i++){
            if(n%i == 0){
                num++;
            }
        }
        return num;
    }
}
