public class Leet1281 {
    /*
     * Given an integer number n,
     * return the difference between the product
     * of its digits and the sum of its digits.
     */

     public static void main(String[] args) {
        int num = 329;
        System.out.println(subtractProductAndSum(num));

     }
     static int subtractProductAndSum(int n) {
        int mul, add ,l,sub;
        mul = 1;add = 0;
        while (n>0) {
            l = n%10;
            mul *=l;
            add+=l;
            n= n/10;
        }
        sub = mul - add;
        return  sub;
     }


    
}