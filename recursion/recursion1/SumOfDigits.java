package recursion.recursion1;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(RON(12345));
    }
    static int SOD(int n){
        if(n%10 == n){
            return n;
        }
        return n%10+ SOD(n/10);
    }
    //product of digits
    static int POD(int n){
        if(n%10 == n){
            return n;
        }
        return n%10* POD(n/10);
    }

    // reverse of a number
    static int RON(int n){
        if(n%10 == n){
            return n;
        }
        int nod = (int)(Math.log10(n)+1);
        int l =n%10;
        return (int)(l*Math.pow(10, nod-1)+RON(n/10));

    }
}
