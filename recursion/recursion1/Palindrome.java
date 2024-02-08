package recursion.recursion1;

public class Palindrome {
    
    public static void main(String[] args) {
        System.out.println(palNum(1312222231));
    }
    static boolean palNum(int n){
            int num= (int)(Math.log10(n));

            int s = (int)(n/Math.pow(10, num));
            int e = n%10;

            n =n/10;
            n=n-s*(int)(n/Math.pow(10, num));

            return pal(num, s, e);
    }
static boolean pal(int n,int s, int e){
    if(s!=e) return false;

    if(n <=0) return true;

    int num= (int)(Math.log10(n));

    s = (int)(n/Math.pow(10, num));
    e = n%10;

    n =n/10;

    n=n-s*(int)(Math.pow(10, num));
System.out.println(n);
    return pal(num, s, e);

}

}
