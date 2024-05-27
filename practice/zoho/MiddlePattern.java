package zoho;

public class MiddlePattern {
    public static void main(String[] args) {
        pattern("SUBRAMANIAN");
    }
    static void pattern(String s){
        int space = (s.length()-1)*2;
        char[] ch = new char[s.length()];
        int mid = s.length()/2;
        for (int i = 0; i < s.length(); i++) {
            mid = mid%s.length();
            ch[i] = s.charAt(mid);
            mid++;
        }
        for (int i = 0; i < ch.length; i++) {
            if (space >0) {
                for (int j = 0; j <= space; j++) {
                    System.out.print(" ");
                }
            }
            for (int j = 0; j <=i; j++) {
                System.out.print(ch[j]);
            }
            space-=2;
            System.out.println();
        }
      
		
    }

}

    /**
              g
            GR
          GRA
       GRAM
     GRAMP
   GRAMPR
GRAMPRO        
     */

