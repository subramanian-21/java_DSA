package strings.easy;

import java.util.Arrays;

public class Leet1528 {
    public static void main(String[] args) {
        System.out.println(sort("is2 sentence4 This1 a3"));
    }
    static String sort(String s){
        String[] spl = s.split(" ");
        String[] out = new String[spl.length];
        for(int i = 0;i<spl.length;i++){
            int ind = spl[i].charAt(spl[i].length()-1) - '1';
            out[ind] = spl[i].substring(0,spl[i].length()-1);
        }
        
        return Arrays.toString(out);
    }
}
