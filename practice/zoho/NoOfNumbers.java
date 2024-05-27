package zoho;
/**
 * You’re given a number n. If write all the numbers from 1 to n in a paper, we have to find the
number of characters written on the paper.For example if n=13, the output should be 18 if n = 101,
the output should be 195
 */

public class NoOfNumbers {
    public static void main(String[] args) {
        System.out.println(nos(13));
    }
    static int nos(int n){
        int c = 0;
        for (int i = 1; i <= n; i++) {
            int num = (int)(Math.log10(i)+1);
            c+=num;
        }
        return c;
    }
}
