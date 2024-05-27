package zoho;

public class Processed {
    public static void main(String[] args) {
        String s = "ABC";
        System.out.println(skipA(s));
    }
    static String skipA(String up){
        if(up.isEmpty()){
            return "";
        }
        
        if(up.startsWith("a")){
            return skipA(up.substring(1));
        }else{
            return up.charAt(0) + skipA(up.substring(1));
        }
    } 
}
