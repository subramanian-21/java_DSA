package zoho;
/**
 * V1 = “1.0.31”
V2 = “1.0.27”
Output:  v1 is latest
Because V2 < V1
Input: 
V1 = “1.0.10”
V2 = “1.0.27”
Output:  v2 is latest
Because V1 < V2 
 */
public class CompareVersions {
    public static void main(String[] args) {
        System.out.println(latest("1.0.31", "2.0.27"));
    }
    static String latest(String a,String b){
        int aNum = 0;
        int bNum = 0;

        for(int i = 0;i<a.length();i++){
            char ch = a.charAt(i);
            if(ch != '.'){
                aNum = aNum *10 + ch-'0';
            }
        }
        for(int i = 0;i<b.length();i++){
            char ch = b.charAt(i);
            if(ch != '.'){
                bNum = bNum *10 + ch-'0';
            }
        }
        return  (aNum > bNum) ? a : b;
    }
}
