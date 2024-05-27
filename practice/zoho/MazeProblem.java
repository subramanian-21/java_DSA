package zoho;

import java.util.ArrayList;

public class MazeProblem {
    public static void main(String[] args) {
        System.out.println(maizePath("", 3, 3));
        ;
    }
    static int maizeCount(int r,int c){
        if(r == 1 || c == 1){
            return 1;
        }
        int right = maizeCount(r, c-1);
        int down = maizeCount(r-1, c);

        return right+down;
    }
    static ArrayList<String> maizePath(String p,int r,int c){
        if(r == 1 && c == 1){
            ArrayList<String> arr = new ArrayList<>();
            arr.add(p);
            return arr;
        }
        ArrayList<String> arr=  new ArrayList<>();
        if(r>1 && c>1){
            arr.addAll(maizePath(p+'D',r-1, c-1));
        }
        if(r>1){
            arr.addAll(maizePath(p+'V',r-1, c));
        }
        if(c>1){
            arr.addAll(maizePath(p+'H',r, c-1));
        }

        return arr;
    }

}
