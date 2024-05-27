package zoho;

public class ZohoMaze {

    public static void main(String[] args) {
        char[][] arr = {{'a', 'z', 'o', 'l'},
                        {'n', 'x', 'h', 'o'},
                        {'v', 'y', 'i', 'v'},
                        {'o', 'r', 's', 'e'}};
        String[] dictionary = {"van", "zoho", "love", "are", "is"}; 
        exist(arr, dictionary);
    }

    public static  boolean exist(char[][] board, String[] dict) {
        int m = board.length;
        int n = board[0].length;

        boolean[][] visited = new boolean[m][n];
        boolean result = false;
        for(String word:dict){
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                    if (board[i][j] == word.charAt(0)) {
                        backtrack(board, word, visited, i, j, 0);
                    }    
            }
        }
    }
        
        return false;
    }
    
    private static  boolean  backtrack(char[][] board, String word, boolean[][] visited, int i, int j, int index) {
        if (index == word.length()-1) {
            return true;
        }
        
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || visited[i][j] || board[i][j] != word.charAt(index)) {
            return false;
        }
        
        visited[i][j] = true;
        
            if(backtrack(board, word, visited, i + 1, j, index + 1)||
            backtrack(board, word, visited, i, j + 1, index + 1)){
                System.out.println(word);
            }
        
        visited[i][j] = false;


        return false;
    }
}
