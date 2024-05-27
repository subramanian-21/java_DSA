package zoho;

/**
 * Given a string, we have to reverse the string without changing the position of punctuations and spaces.
Input: house no : 123@ cbe
Output: ebc32 1o : nes@ uoh

 */
public class ReverseWithoutSymbols {
    public static void main(String[] args) {
        System.out.println(reverse("A man, in the boat says : I see 1-2-3 in the sky"));
    }
    static String reverse(String str){
        String rev = "";
        String out = "";
        for(int i = 0;i<str.length();i++){
            if(!isSymbol(str.charAt(i))){
                rev = str.charAt(i)+rev;
            }
        }
        int ind = 0;
        for(int i = 0;i<str.length();i++){
            if(!isSymbol(str.charAt(i))){
                out+=rev.charAt(ind);
                ind++;
            }else{
                out+=str.charAt(i);
            }
        }
        return out;
    }
    static boolean isSymbol(char ch){
        if(ch == '@' || ch == ' ' || ch == '*' || ch == '+' || ch == '-' || ch == '!' || ch == ':'){
            return true;
        }
        return false;
    }
}
