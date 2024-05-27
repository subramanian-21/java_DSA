package zoho;

public class RecursionReverse {
    public static void main(String[] args) {
        
        System.out.println(reverse("one two three four five"));
    }
    static String reverse(String str){
       int k = str.indexOf(" ");

       if(k == -1){
        return rev(str);
       }else{
        return reverse(str.substring(0, k)) +" " +reverse(str.substring(k+1));
       }
    }
    static String rev(String str){
        if(str.length() ==1){
            return str;
        }
        return rev(str.substring(1)) + rev(str.charAt(0)+""); 
    }
}
