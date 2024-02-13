package recursion.recursion1;

public class Palindrome {
    
    public static void main(String[] args) {
        System.out.println(pal(1300000231));
    }
    // static boolean palNum(int n){
    //         int num= (int)(Math.log10(n));

    //         int s = (int)(n/Math.pow(10, num));
    //         int e = n%10;

    //         n =n/10;
    //         n= n-s*(int)(Math.pow(10, num));
            
    //         return pal(n);
    // }
static boolean pal(int n){
    int num = n;
    int res = 0;
    while (num > 0) {
        int rem = num%10;
        res = res*10+rem;
        num = num/10;
    }
    System.out.println(res);
    if(n == res) return true;


    return false;

}

}
