package recursion.recursion3;

import java.util.ArrayList;

public class PhoneNumber {
    public static void main(String[] args) {
        System.out.println(phone("111", ""));
    }
    static ArrayList<String> phone(String inp,String out){
        if(inp.isEmpty()){
            ArrayList<String> arr = new ArrayList<>();
            arr.add(out);
            return arr;
        }
        ArrayList<String> arr = new ArrayList<>();

        int digit = inp.charAt(0) - '0';

        for (int i = (digit-1)*3; i < digit*3; i++) {
            char ch = (char)('a'+i);
           arr.addAll(phone(inp.substring(1), out+ch));
        }
        return arr;
      
    }
}
