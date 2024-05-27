package zoho;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 10;
        int[] dp = new int[n+1];
        for(int i = 0;i<dp.length;i++){
            dp[i] = -1;
        }
        System.out.println(fib(n,dp));
    }
    static int fib(int n, int[] dp){
        if(n <= 1){
            return n;
        }
        if(dp[n] != -1){
            return dp[n];
        }
        return dp[n] = fib(n-1, dp)+fib(n-2, dp);
    }
    static int fib(int n){
        if(n <= 1){
            return n;
        }
      
        return fib(n-1)+fib(n-2);
    }
}
