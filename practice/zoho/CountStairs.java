package zoho;

public class CountStairs {
    public static void main(String[] args) {
        System.out.println(countStairs(5+1));
    }
    static int countStairs(int n){
        if(n <= 1){
            return n;
        }
        return  countStairs(n-1)+countStairs(n-2);
    }
}
