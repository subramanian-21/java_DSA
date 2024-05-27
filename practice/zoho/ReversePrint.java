package zoho;

public class ReversePrint {
    public static void main(String[] args) {
        System.out.println(rec("Hi this is me subramanian"));
    }
    static String rec(String str){
        int k = str.indexOf(" ");
        if(k == -1){
            return str;
        }else{
            return rec(str.substring(k+1)) +" " + rec(str.substring(0, k));
        }
    }
}
