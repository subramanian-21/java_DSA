
public class Leet1380 {
    // 1380. Lucky Numbers in a Matrix

    public static void main(String[] args) {
        int[][] arr = { { 1,10,4,2}, { 9,3,8,7 },{15,16,17,12} };

        System.out.println(luckyNumbers(arr));
    }

    static int luckyNumbers(int[][] matrix) {
       
        
        int o = 0;
        for (int i = 0; i < matrix.length; i++) {
        int minR = Integer.MAX_VALUE;
         int minC = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                minR = Math.min(minR, matrix[i][j]);
                minC = Math.max(minC, matrix[j][i]);
                
            }
            System.out.println(minR + " "+minC);

            if (minR == minC) {
                return minC;
            }
        }
        return o;
    }
}
