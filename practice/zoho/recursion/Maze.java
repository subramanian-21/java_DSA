package zoho.recursion;

import java.util.Arrays;

public class Maze {
    public static void main(String[] args) {
        boolean[][] maze = {{true,false,true},{true,true,true},{true,true,true}};
        int[][] path = new int[maze.length][maze[0].length];


        mazeWithObstaclesPrint("", maze, 0, 0, path, 1);
    }
    static void mazeWithObstacles(String p,boolean[][] maze, int r, int c){
        if( r==maze.length-1 && c == maze[0].length-1 ){
            System.out.println(p);
            
            return;
        }
        if(!maze[r][c]){
            return;
        }
        maze[r][c] = !maze[r][c];
        if(r < maze.length-1){
            mazeWithObstacles(p+'R', maze, r+1, c);
        }
        if(c < maze[0].length-1){
            mazeWithObstacles(p+'D', maze, r, c+1);
        }

        if(r > 0){
            mazeWithObstacles(p+'L', maze, r-1, c);
        }
        if(c > 0){
            mazeWithObstacles(p+'U', maze, r, c-1);
        }

        maze[r][c] = !maze[r][c];
    }

    static void mazeWithObstaclesPrint(String p,boolean[][] maze, int r, int c,int[][] path,int count){
        if( r==maze.length-1 && c == maze[0].length-1 ){
            path[r][c] = count;
            for(int[] a: path){
                System.out.println(Arrays.toString(a));
            }
            System.out.println();
            return;
        }
        if(!maze[r][c]){
            return;
        }
        maze[r][c] = !maze[r][c];
        path[r][c] = count;
        if(r < maze.length-1){
            mazeWithObstaclesPrint(p+'R', maze, r+1, c,path,count+1);
        }
        if(c < maze[0].length-1){
            mazeWithObstaclesPrint(p+'D', maze, r, c+1,path,count+1);
        }

        if(r > 0){
            mazeWithObstaclesPrint(p+'L', maze, r-1, c,path,count+1);
        }
        if(c > 0){
            mazeWithObstaclesPrint(p+'U', maze, r, c-1,path,count+1);
        }

        maze[r][c] = !maze[r][c];
        path[r][c] = 0;
    }
}
