package bitwise;
/*
 *                     1        2^0
 *                    1 1       2^1
 *                   1 2 1      2^2
 *                  1 3 3 1     2^3
 *                 1 4 6 4 1    2^4
 *               1 5 10 10 5 1  2^5
 */
public class PascalsTriangle {
    public static void main(String[] args) {
        System.out.println(nthRow(5));
    }
    static int nthRow(int n){
        return (1<<n-1);
    }
}
