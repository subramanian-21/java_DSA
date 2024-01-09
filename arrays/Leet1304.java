import java.util.Arrays;

public class Leet1304 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumZero(5)));
    }
    static int[] sumZero(int n) {

        int[] arr = new int[n];
        if(n%2 ==0){
            for(int i = 1;i<n;i+=2){
                arr[i-1] = i;

                arr[i] = -i;
            }
        }else{
            for (int i = 0; i < n-1; i+=2) {
                  arr[i+1] = -(i+1);

                arr[i] = i+1;
            }
        }
        return arr;
    }
}
