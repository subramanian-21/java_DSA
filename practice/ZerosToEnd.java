
import java.util.Arrays;

public class ZerosToEnd {

    public static void main(String[] args) {
        int[] arr = {1, 0, 9, 8, 0, 7, 0, 3, 0, 0, 2, 1, 4};
        ze(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void zeb(int[] arr) {

    }

    static void ze(int[] arr) {
        int z = 0;
        int nz = 0;

        while(nz < arr.length){
            if(arr[nz] == 0){
                nz ++;
            }else{
                swap(arr,nz,z);
                z++;
                nz++;
            }
        }
    }
    static void swap(int[] arr, int i, int k) {
        int temp = arr[i];
        arr[i] = arr[k];
        arr[k] = temp;
    }
}
