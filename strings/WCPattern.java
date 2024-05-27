package strings;
public class WCPattern {
    public static void main(String [] args){

    }
    static void patternMatcing(String str,String pattern){
        int startIndex = pattern.indexOf("*");
        int endIndex;
        if(startIndex != -1){
            endIndex  = pattern.lastIndexOf("*");
        }
        boolean res = false;
        if(startIndex == -1){
           res = patternMatching(str, pattern, 0, 0);
        }else{

        }
    }
    static boolean patternMatching(String str,String pattern, int start,int end){
        int a =str.length();
        int b = pattern.length();

        if(a != b) return false;

        for(int i = 0;i<a;i++){
            if(str.charAt(i) == pattern.charAt(i) || pattern.charAt(i) == '?'){

            }else{
                return false;
            }
        }
        
        return  true;
    }
}
