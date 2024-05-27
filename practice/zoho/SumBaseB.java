package zoho;

public class SumBaseB {
    public static void main(String[] args) {
       sum("3442", "344210", 5); 
    }
    static void sum(String a,String b, int base){
        int aLen = a.length();
        int bLen = b.length();

        String sum = "";
        int current = 0;
        int carry = 0;

        int diffLen = Math.abs(aLen-bLen);

        String space = "";

        for (int i = 0; i < diffLen; i++) {
            space+="0";
        }

        if (aLen > bLen) {
            b = space+b;
        }else{
            a = space+a;
        }

        for(int i = a.length()-1;i>=0;i--){
            current = carry + (a.charAt(i) - '0') +(b.charAt(i) - '0');
            carry = current/base;
            current = current%base;

            sum = (char)(current+'0')+sum;
        }

        if(carry != 0){
            sum = (char)(carry +'0')+sum;
        }

        System.out.println(a+" + "+b+" = "+sum);

    }
}
