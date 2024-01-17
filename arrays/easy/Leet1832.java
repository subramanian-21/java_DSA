package easy;
/*
 * A pangram is a sentence where every letter of the English alphabet appears at least once.

Given a string sentence containing only lowercase English letters,
 return true if sentence is a pangram, or false otherwise.
 */
public class Leet1832 {
    public static void main(String[] args) {
        String inp = "thequickbrownf";

        System.out.println(checkIfPangram(inp));
    }

    static boolean checkIfPangram(String sentence) {
        boolean[] boolArr = new boolean[26];
        char[] sen = sentence.toCharArray();
        boolean b = true;

        for(int i =0;i<sen.length;i++){
            boolArr[sen[i] - 'a'] = true;
        }

        for (int i = 0; i < boolArr.length; i++) {
            if(!boolArr[i]){
                b = false;
            }
        }
        return b;
    }
    // ---------------------------- or -----------------------------------------

    // static boolean checkIfPangram(String sentence) {
    // boolean bool = false;
    // char[] arr = sentence.toCharArray();
    // char[] alphs = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
    // 'm', 'n', 'o', 'p', 'q', 'r', 's',
    // 't', 'u', 'v', 'w', 'x', 'y', 'z' };
    // for (int i = 0; i < alphs.length; i++) {
    // bool = false;
    // for (int j = 0; j < arr.length; j++) {
    // if (alphs[i] == arr[j]) {
    // bool = true;
    // }
    // }
    // if(!bool){
    // return false;
    // }
    // }
    // return bool;
    // }

}
