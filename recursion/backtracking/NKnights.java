package recursion.backtracking;
public class NKnights {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        knights(board,0,0,n);


    }
    static void knights(boolean[][] board,int r,int c,int kn){
        if(kn == 0){
            display(board);
            System.out.println();
            return; 
        }
        if(r == board.length-1 && c == board[0].length){
            return;
        }
        if(c == board[0].length){
            knights(board, r+1, 0, kn);
            return;
        }
        if (isSafe(board, r, c)) {
            board[r][c] = true;
            knights(board, r, c+1, kn-1);
            board[r][c] = false;
        }
        knights(board, r, c+1, kn);
        
    }
    static  boolean  isSafe(boolean[][] board , int r,int c){
        if(isValid(board, r-1, c-2)){
            if(board[r-1][c-2]){
                return false;
            }
        }
        if(isValid(board, r-2, c-1)){
            if(board[r-2][c-1]){
                return false;
            }
        }
        if(isValid(board, r-2, c+1)){
            if(board[r-2][c+1]){
                return false;
            }
        }
        if(isValid(board, r-1, c+2)){
            if(board[r-1][c+2]){
                return false;
            }
        }
        return  true;
    }
    static boolean isValid(boolean[][] board, int r,int c){
        if( r>=0 && r < board.length && c >=0 && c < board[0].length){
            return true;
        }
        return false;
    }
    static void display(boolean[][] board){
        for(int i = 0;i<board.length;i++){
            for(int j = 0;j<board[0].length;j++){
                if(board[i][j] == true){
                    System.out.print("K ");
                }else{
                    System.out.print("O ");
                }
            }
            System.out.println();
        }

        System.out.println();
    }
    
    
}