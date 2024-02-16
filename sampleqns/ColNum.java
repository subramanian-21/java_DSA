package sampleqns;

public class ColNum {
    public static void main(String[] args) {
        System.out.println(columnNum("ZZ"));
    }
    static int columnNum(String str){

        int n = 0;

        for (int i = 0; i < str.length(); i++) {
            n = n*26;
            char ch = str.charAt(i);
            n += (ch - 'A'+1);
        }

        return  n;
    }
}
