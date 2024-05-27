package zoho.recursion;
/**
 * Input : geeksforgeeKs
Output : K

Input  : geekS
Output : S
 */
public class FindUpperCase {
    public static void main(String[] args) {
        System.out.println(findUpper("subramaniaN",0));
    }
    static char findUpper(String up,int ind){
        if(ind == up.length()){
            return '-';
        }
        if(Character.isUpperCase(up.charAt(ind))){
            return up.charAt(ind);
        }
        return findUpper(up,++ind);
    }
}
