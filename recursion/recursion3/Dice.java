package recursion.recursion3;

import java.util.ArrayList;

public class Dice {
    public static void main(String[] args) {
      System.out.println( possiblities(4, ""));
    }
    static ArrayList<String> possiblities(int inp,String out){
        if(inp == 0){
            ArrayList<String> arr = new ArrayList<>();
            arr.add(out);
            return arr;
        }
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 1; i <= 6 && i<= inp; i++) {
            arr.addAll(possiblities(inp-i, out+i));
        }

        return arr;
    }
}
