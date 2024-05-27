package zoho;
/**
 * Given a number, convert it into corresponding alphabet.
Input Output

1 A
26 Z
27 AA
676 ZZZ

 */

public class ExcelNumbers {
    public static void main(String[] args) {
        System.out.println(solve(676));
    }
    static String solve(int n){
        String str = "";
        while (n > 0) {
            int rem = n%26;
            
            if(rem == 0){
                str = 'Z'+str;
                n = (n/26)-1;
            }else{
                str = (char)((rem-1)+'A')+ str;
                n = n/26;
            }
        }
        return str;
    }
}
