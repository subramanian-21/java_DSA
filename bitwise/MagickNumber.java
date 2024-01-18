package bitwise;

public class MagickNumber {
    //decimal to any base;;
    public static void main(String[] args) {
        System.out.println(magickNumber(1, 5));

        System.out.println((int)(Math.log(8)/Math.log(2)+1));
    }
    
    static int magickNumber(int n,int base){
        int ans = 0;
        int b = 1;
        while (n > 0) {
            int last = n & 1;
            n = n>>1;
            ans = ans + (last * b);
            b = b*base;
        }
        return ans;

    }
}
