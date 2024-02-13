package recursion.backtracking;

public class NKnights {
    public static void main(String[] args) {
        int r = 4;
        boolean[][] board = new boolean[r][r];

        System.out.println(nk(board, 0, 0, r));
    }
    static int nk(boolean[][] board,int row,int col,int knights){
        if(knights == 0){
            return 1;
        }
        if(row == board.length-1 && col == board.length){
            return 0;
        }
        int c =0;
        if(col == board.length){
            return nk(board, row+1, 0, knights);
        }
        if(isSafe(board,row,col)){
            board[row][col] = true;
            c+=nk(board, row, col+1, knights-1);
            board[row][col] = false;
        }
        return nk(board, row, col+1, knights);

        return c;
    }
    static boolean isSafe(boolean[][] board,int row,int col){
        int minLeft = Math.min(row, col);

        for (int i =1; i <= minLeft; i++) {
            if(board[row-i][col-i]){
                return false;
            }
        }
        int minRight = Math.min(row,board.length-col-1);

        for (int i =1; i <= minRight; i++) {
            if(board[row-i][col+i]){
                return false;
            }
        }
        return true;
    }
}
