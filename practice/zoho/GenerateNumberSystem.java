package zoho;

import java.util.Arrays;

public class GenerateNumberSystem {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(generate(15)));
    }

    static String[] generate(int n) {
        String[] arr = new String[n+1];
        arr[0]  ="";
        int size = 1;
        int m = 1;

        while (size <= n) {
            for(int i = 0;i<m && size+i <=n;i++){
                arr[size+i] = "3"+ arr[size-m+i];
            }
            for(int i = 0;i<m && size+m+i <=n;i++){
                arr[size+m+i] = "4"+ arr[size-m+i];
            }
            m*=2;
            size+=m;
        }
        return arr;

        // String[] arr = new String[n+1];
        // arr[0] = "";
        // int size = 1;
        // int m = 1;

        // while (size <= n) {
        //     for (int i = 0; i < m && size+i <=n; i++) {
        //         arr[size+i] = "3"+arr[size-m+i];
        //     }
        //     for (int i = 0; i < m && size+m+i <=n; i++) {
        //         arr[size+m+i] = "4"+arr[size-m+i];
        //     }
        //     m=m*2;
        //     size+=m;
        // }
        // return arr;











        // String[] arr = new String[n + 1];
        // arr[0] = "";
        // int size = 1;
        // int m = 1;
        // while (size <= n) {
        //     for (int i = 0; i < m && size + i <= n; i++) {
        //         arr[size + i] = "3" + arr[size - m + i];
        //     }
        //     for (int i = 0; i < m && size + m + i <= n; i++) {
        //         arr[size + m + i] = "4" + arr[size - m + 1];
        //     }
            
        //     m *= 2;
        //     size += m;
        // }
        // return arr;
    }
}
