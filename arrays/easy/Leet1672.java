package easy;
/**
 * You are given an m x n integer grid accounts where
 * accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in
 * the j​​​​​​​​​​​th​​​​ bank.
 * Return the wealth that the richest customer has.
 * 
 * A customer's wealth is the amount of money they have in all their bank
 * accounts.
 * The richest customer is the customer that has the maximum wealth.
 */
public class Leet1672 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{3,2,1}};
        System.out.println(maximumWealth(arr));

    }
    static int maximumWealth(int[][] accounts) {
        int max = 0;

        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
               sum+= accounts[i][j];
               if(sum>max){
                max = sum;
               }
            }
        }
        return max;
    }
}
