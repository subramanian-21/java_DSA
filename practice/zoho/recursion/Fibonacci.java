package zoho.recursion;
/**
 * F(0) = 0, F(1) = 1
F(n) = F(n - 1) + F(n - 2), for n > 1.

Input: n = 2
Output: 1
Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.
 */
public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fib(5));
    }
    static int fib(int n){
        if(n<=0){
            return 0;
        }
        if(n==0|| n==1){
            return 1;
        }
        return fib(n-1) | fib(n-2);
    }
}
