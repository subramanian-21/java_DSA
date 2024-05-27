package zoho;

public class FirstOccurence {
    public static void main(String[] args) {
        String a = "test12string12123";
        String b = "123";

        System.out.println(isIncludes(a, b));

    }
    static int isIncludes(String a, String b){
        if(a.length() < b.length()){
            return -1;
        }
        int aLen = a.length();
        int bLen = b.length();
        int n = aLen - bLen+1;
        int bFirst = b.charAt(0);
        for (int i = 0; i < n; i++) {
            int ch = a.charAt(i);
            if(ch == bFirst){
                int j = i+1;
                int k = 1;
                while (j<aLen && k<bLen) {
                    if(a.charAt(j) == b.charAt(k)){
                        j++;k++;
                    }else{
                        break;
                    }
                }
                if(k == bLen){
                    return i;
                }
            }
        }

        return -1;
    }
}
