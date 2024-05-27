package zoho;

public class PossibleApls {
    public static void main(String[] args) {
        System.out.println(generateString(676));
    }
    static String generateString(int n){
        String out = "";


        while (n>0) {
            int rem = n%26;

            if(rem == 0){
                out = 'Z' + out;
                n = (n/26)-1;
            }else{
                out = (char)((rem-1)+'A')+out;
                n = n/26;
            }
        }
        return out;

    }
    static int opposite(String str){
        int n = 0;
        for(int i = 0;i<str.length();i++){
            n = n*26;
            char ch = str.charAt(i);
            n += ch-'A'+1;
        }
        return n;
    }
}
