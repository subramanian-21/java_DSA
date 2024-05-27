package recursion.backtracking;

public class Suduko {
    public static void main(String[] args) {
        int[][] board = new int[][]{
            {3, 0, 6, 5, 0, 8, 4, 0, 0},
            {5, 2, 0, 0, 0, 0, 0, 0, 0},
            {0, 8, 7, 0, 0, 0, 0, 3, 1},
            {0, 0, 3, 0, 1, 0, 0, 8, 0},
            {9, 0, 0, 8, 6, 3, 0, 0, 5},
            {0, 5, 0, 0, 9, 0, 6, 0, 0},
            {1, 3, 0, 0, 0, 0, 2, 5, 0},
            {0, 0, 0, 0, 0, 0, 0, 7, 4},
            {0, 0, 5, 2, 0, 6, 3, 0, 0}
    };
    if(solveSuduko(board)){
        display(board);
    }else{
        System.out.println("Wrong");
    }
    }
    static  boolean solveSuduko(int[][] board){
        int n = board.length;
        int row = -1;
        int col = -1;

        boolean emptyLeft = true;

        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                if(board[i][j] == 0){
                    row = i;
                    col = j;
                    emptyLeft = false;
                    break;
                }
            }
            if(!emptyLeft){
                break;
            }
        }
        if(emptyLeft){
            return true;
        }
        for(int i = 1;i<=n;i++){
            if(isSafe(board, row, col, i)){
                board[row][col] = i;
                if(solveSuduko(board)){
                    return true;
                }else{
                    board[row][col] = 0; 
                }
            }
        }
        return  false;
    }
    static  boolean isSafe(int[][] board, int row,int col,int num){
        for(int i = 0;i<board.length;i++){
            if(board[row][i] == num){
                return false;
            }
        }
        for(int[] nums : board){
            if(nums[col] == num){
                return false;
            }
        }
        int cellSize = (int)(Math.sqrt(board.length));
        int p1  = row - (row%cellSize);
        int p2 = col - (col%cellSize);

        for(int i = p1;i< p1+cellSize;i++){
            for(int j = p2;j< p2+cellSize;j++){
                if(board[i][j] == num){
                    return  false;
                }
            }
        }
        return true;
    }
    static void display(int[][] board){
        for(int i = 0;i<board.length;i++){
            for(int j = 0;j<board[0].length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println();
    }
}
