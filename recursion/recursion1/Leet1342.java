package recursion.recursion1;
/**
 * Number of steps to reduce a number to zero
 * 
 * if n== odd then n =n-1;
 * else n=  n/10;
 */
public class Leet1342 {
    public static void main(String[] args) {
        System.out.println(func(14, 0));
    }
    static int func(int n, int c){
        if(n == 0 ) return c;

        if(n%2 == 0){
            n = n/2;
        }else{
            n = n-1;
        }

        return func(n, ++c);
    }
}
