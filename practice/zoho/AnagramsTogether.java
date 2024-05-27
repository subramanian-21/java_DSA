package zoho;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnagramsTogether {
    public static void main(String[] args) {
        System.out.println(climbStairs(3));
    }
    static void anagrams(String[] arr){
        if(arr.length == 0){
            System.out.println("");
            return;
        }
        Map<String,List<String>> m = new HashMap<>();
        for(String str:arr){
            String freq = letterCount(str);

            if(m.containsKey(freq)){
                m.get(freq).add(str);
            }else{
                List<String> li = new ArrayList<>();
                li.add(str);
                m.put(freq, li);
            }
        }
        System.out.println(new ArrayList<>(m.values()));
    }
    static String letterCount(String str){
        int[] freq = new int[26];
        for(char ch : str.toCharArray()){
            freq[ch-'a']++;
        }
        String out = "";
        char ch = 'a';
        for(int i = 0;i<freq.length;i++){
            out += (char)(ch+i);
            out += freq[i];
        }

        return  out;
    }
    static int climbStairs(int n) {
       if(n == 0){
        return 1;
       } 
       int c = 0;
       if(n > 0){
        c+=climbStairs(n-1);
       }
       if(n>1){
        c+=climbStairs(n-2);
       }

       return c;
    }
}
