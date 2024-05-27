package zoho;

public class MultiplyWithPlus {
    public static void main(String[] args) {
        System.out.println(multiply(1000,23));
    }
    static long multiply(int a,int b){
        long mul = 0;
        int x = Math.max(a, b);
        int y = Math.min(a, b);
        while (y>0) {
            mul+=x;
            y--;
        }


        return mul;

    }
    
}