package zoho;

public class Pattern6 {
    public static void main(String[] args) {
        pattern(7);
    }
    static void pattern(int n){
        for (int i = 0; i < n; i++) {
            for(int j = 0;j< n;j++){
                int top = i;
                int left = j;
                int bottom = n-i-1;
                int right = n-j-1;

                System.out.print(n-Math.min(Math.min(top, left), Math.min(bottom, right)));
            }
            System.out.println();
        }
    }
}
