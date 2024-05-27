package zoho;

public class PyramidPattern {
    public static void main(String[] args) {
        pattern(6);
    }
    static void pattern(int n){

        int ind = n;
        int num = 1;
        for (int i = 1; i <= n; i++) {
            num = i;
            while (ind>i-1) {
                
                System.out.print(num+" ");
                num = num+ind;
                ind--;
            }
            ind = n;
            System.out.println();
        }
    }
}
