package easy;
/**
 * Given two strings s and t, return true if t is an anagram of s, and false
 * otherwise.
 * 
 * An Anagram is a word or phrase formed by rearranging the letters of a
 * different word or phrase, typically using all the original letters exactly
 * once.
 */
public class Leet242 {
    public static void main(String[] args) {
        String str = "aacc";

        String cmp = "ccac";

        System.out.println(isAnagram(str, cmp));
    }
    static boolean isAnagram(String s, String t) {
        boolean out = true;
        if(s.length()!=t.length()){
            return false;
        }
        char[] str = s.toCharArray();
        char[] cmp = t.toCharArray();

        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < cmp.length; j++) {
                if(str[i] == cmp[j]){
                    cmp[j] = '1';
                    break;    
                }
            }
        }
        for (int i = 0; i < cmp.length; i++) {
            if(cmp[i] != '1'){
                return false;
            }
        }
        return out;
    }
}