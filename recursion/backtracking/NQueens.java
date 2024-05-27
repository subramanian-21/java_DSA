package recursion.backtracking;

import java.util.Arrays;

public class NQueens {
    public static void main(String[] args) {
        int row = 8;
        boolean[][] board = new boolean[row][row];
        System.out.println(nq(board,0));
    }
    static int nq(boolean[][] board, int row){
        if(row == board.length){
            display(board);
            return 1;
        }
        int c = 0;
        for (int col = 0; col < board.length; col++) {
            if(isSafe(board,row,col)){
                board[row][col] = true;
                c += nq(board, row+1);
                board[row][col] = false;
            }
        }
        return c;
    }

    static boolean isSafe(boolean[][] board, int row, int col){
        
        // for(int i = 0;i<row;i++){
        //     if(board[i][col]){
        //         return false;
        //     }
        // }
        int minLeft =  Math.min(row, col);
        for(int i = 1;i <= minLeft;i++){
            if (board[row-i][col-i]) {
                return false;
            }
        }

        int minRight = Math.min(row, board.length - col-1);
        for(int i = 1;i <= minRight;i++){
            if (board[row-i][col+i]) {
                return false;
            }
        }

        return true;

    }
    static void display(boolean[][] board){
        for(int i = 0;i<board.length;i++){
            for(int j = 0;j<board[0].length;j++){
                if(board[i][j] == true){
                    System.out.print("Q ");
                }else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }

        System.out.println();
    }
}
