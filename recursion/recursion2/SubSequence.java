package recursion.recursion2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SubSequence {
    public static void main(String[] args) {
        System.out.println(seqArr("abc",""));
    }
    static void seq(String up, String p){
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        seq(up.substring(1), p+ch);
        seq(up.substring(1), p);
        
    }

    static List<String> seqArr(String up,String p){
        if (up.isEmpty()) {
            List<String> arr = new ArrayList<>();
            arr.add(p);
            return arr;
        }

        char ch = up.charAt(0);
        List<String> one = seqArr(up.substring(1), p+ch);
        List<String> two = seqArr(up.substring(1), p);
        one.addAll(two);
        return one;
    }
    static void seqAsii(String up, String p){
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        seqAsii(up.substring(1), p+ch);
        seqAsii(up.substring(1), p);
        seqAsii(up.substring(1), p+(ch+0));
        
    }
}
