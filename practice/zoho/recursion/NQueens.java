package zoho.recursion;

public class NQueens {
    public static void main(String[] args) {
        int n = 8;
        boolean[][] num = new boolean[n][n];
        System.out.println(printQueens(num, 0));

    }
    static int printQueens(boolean[][] board,int row){
        
        if(row == board.length){
            display(board);
            System.out.println();
            return 1;
        }
        int count = 0;
        for(int i = 0;i< board[0].length;i++){
            if(isSafe(board,row,i)){
                board[row][i] = true;
                count += printQueens(board, row+1);
                board[row][i] = false;
            }
        }

        return count;
    }
    private static boolean isSafe(boolean[][] board, int row, int col) {
        for(int i = 0;i<row;i++){
            if(board[i][col]){
                return false;
            }
        }
        int maxLeft = Math.min(row, col);

        for(int i = 1;i<=maxLeft;i++){
            if(board[row-i][col-i]){
                return false;
            }
        }
        int maxRight = Math.min(row,board.length-col-1);
        for(int i = 1;i<=maxRight;i++){
            if(board[row-i][col+i]){
                return false;
            }
        }
        return true;
    }
    static  void display(boolean [][] board){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if(board[i][j]){
                    System.out.print("Q ");
                }else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
    
}
