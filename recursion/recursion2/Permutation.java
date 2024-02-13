package recursion.recursion2;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static void main(String[] args) {
        System.out.println(perArr("abc", ""));
    }

    static void per(String inp,String out){
        if(inp.isEmpty()){
            System.out.println(out);
            return;
        }
        char ch =inp.charAt(0);

        for (int i = 0; i <= out.length() ; i++) {
            String s = out.substring(0,i);
            String l =out.substring(i, out.length());

            per(inp.substring(1), s+ch+l);
        }
       }
       static List<String> perArr(String inp,String out){

        if(inp.isEmpty()){
            List<String> arr = new ArrayList<>();

            arr.add(out);
            return arr;
        }
        char ch =inp.charAt(0);
        List<String> arr = new ArrayList<>();
        for (int i = 0; i <= out.length() ; i++) {
            String s = out.substring(0,i);
            String l =out.substring(i, out.length());

            arr.addAll(perArr(inp.substring(1), s+ch+l));
        }
        return arr;
        
    }
}
