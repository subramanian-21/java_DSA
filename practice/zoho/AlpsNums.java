package zoho;


public class AlpsNums {
    public static void main(String[] args) {
        System.out.println(generate("a21b22y22c30"));
    }
    static String generate(String str){
        String out = "";
        int n = 0;
        for (int i = 0; i < str.length(); i++) {
            int ind = i;
            char ch = str.charAt(ind);
            if(isNumber(ch)){
                if(ind+1 < str.length() && isNumber(str.charAt(ind+1))){
                    n = joinNumbers(str.substring(ind, ind+2));
                }else{
                    n = joinNumbers(str.substring(ind, ind+1));
                }
                if(n>9){
                    i+=2;
                }
                while (n>0) {
                    out+=str.charAt(ind-1);
                    n--;
                }
            }
            
            n = 0;
        }
        return out;
    }
    static boolean isNumber(char ch){
        return Character.isDigit(ch);
    }
    static int joinNumbers(String s){
        return Integer.parseInt(s);
    }

}
