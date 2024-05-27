package recursion;

import java.util.Arrays;

public class Sample {
    public static void main(String[] args) {
        String s = "Hi this is me Subramanian";
        PrintN( s);
    }
    
    static void PrintN(String text){
        if(text.length() == 0){
            return;
        }
        char[] s = text.toCharArray();
        int index = 0;
        String str = "";
        for(int i = 0;i<text.length();i++){
            if(i == text.length()-1){
                index = i;
            }
            if(s[i] == ' '){
                index = i;
                break;
            }
            str+=s[i];
        }
        System.out.println(str);
        PrintN(text.substring(index+1));
    }
}
