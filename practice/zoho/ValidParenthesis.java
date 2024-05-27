package zoho;
import java.util.*;
public class ValidParenthesis {
    public static void main(String[] args) {
        String str = "(((A))";
        System.out.println(isValid(str));
    }
    static boolean isValid(String str){
        List<Character> arr = new ArrayList<>();
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i) == '('){
                arr.add(str.charAt(i));
            }else if(str.charAt(i) == ')'){
                arr.remove(arr.size()-1);
            }
        }
        return arr.size() == 0;
    }
}
