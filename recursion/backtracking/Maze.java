package recursion.backtracking;

import java.util.ArrayList;
import java.util.Arrays;

public class Maze {
    public static void main(String[] args) {
        boolean[][] maize = {{true,true,true},{true,true,true},{true,true,true}};

        int[][] path = new int[maize.length][maize.length];
        backtrackingPrintPath(maize, 0, 0, "",path,1);
       
    }
    static int rightDown(int r,int c){
        if(r ==1 || c == 1){
            return 1;
        }

        int left = rightDown(r-1, c);
        int right =rightDown(r, c-1);

        return left+right;
    }
    static void rightDownPrint(int r,int c,String out){
        if(r ==1 && c == 1){
            System.out.println(out);
            return;
        }

        if(r>1)rightDownPrint(r-1, c,out+'D');
        if(c>1)rightDownPrint(r, c-1,out+'R');

    }
    static ArrayList<String> rightDownArray(boolean[][] maize,int r,int c,String out){
        if(r == maize.length-1 && c == maize[0].length-1 ){
            ArrayList<String> arr = new ArrayList<>();
            arr.add(out);
            return arr;
        }
        ArrayList<String> arr = new ArrayList<>();
        if(r<maize.length-1 && (maize[r][c])){
           arr.addAll(rightDownArray(maize,r+1, c,out+'D'));
        };
        if(c<maize[0].length-1&&(maize[r][c] )){
            arr.addAll(rightDownArray(maize,r, c+1,out+'R'));
        }
        // if(r>1&&c>1){
        //     arr.addAll(rightDownArray(r-1, c-1,out+'D'));
        // }

        return arr;

    }
    static void backtracking(boolean[][] maize,int r, int c, String out){
        if(r == maize.length-1 && c == maize[0].length-1){
            System.out.println(out);
            return;
        }
        if(!maize[r][c]) return;

        maize[r][c] = false;

        if(r<maize.length-1){
            backtracking(maize, r+1, c, out+"D");
        }
        if(c<maize[0].length-1){
            backtracking(maize, r, c+1, out+"R");
        }
        if(r>0){
            backtracking(maize, r-1, c, out+"T");
        }
        if(c>0){
            backtracking(maize, r, c-1, out+"L");
        }
        maize[r][c] = true;
    }
    static void backtrackingPrintPath(boolean[][] maize,int r, int c, String out,int[][] path,int step){
        if(r == maize.length-1 && c == maize[0].length-1){
            path[r][c] = step;
            for (int i = 0; i < path.length; i++) {
                System.out.println(Arrays.toString(path[i]));
            }
            System.out.println(out);
            System.out.println();
            return;
        }
        if(!maize[r][c]) return;

        maize[r][c] = false;
        path[r][c] = step;
        if(r<maize.length-1){
            backtrackingPrintPath(maize, r+1, c, out+"D",path,step+1);
        }
        if(c<maize[0].length-1){
            backtrackingPrintPath(maize, r, c+1, out+"R",path,step+1);
        }
        if(r>0){
            backtrackingPrintPath(maize, r-1, c, out+"T",path,step+1);
        }
        if(c>0){
            backtrackingPrintPath(maize, r, c-1, out+"L",path,step+1);
        }
        maize[r][c] = true;
        path[r][c] = 0;
    }
}
