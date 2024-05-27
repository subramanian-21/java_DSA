package zoho;

import java.util.ArrayList;
import java.util.List;

public class LookoutSequence {
    public static void main(String[] args) {
        printSequence(6);
    }
    static void printSequence(int n){
        List<String> arr = new ArrayList<>();
        arr.add("1");
        arr.add("11");

        for (int i = 1; i < n-1; i++) {
            int count = 1;
            char ch = arr.get(i).charAt(0);
            String str = "";

            for (int j = 1; j < arr.get(i).length(); j++) {
                if(ch == arr.get(i).charAt(j)){
                    count++;
                }else{
                    str += count+""+ch;
                    count = 1;
                    ch = arr.get(i).charAt(j);
                }
                if(j == arr.get(i).length()-1){
                    str += count+""+ch;
                }
            }
            arr.add(str);
            
        }
        System.out.println(arr);
        // List<String> arr = new ArrayList<>();
        
        // arr.add("1");
        // arr.add("11");
        
        // for(int i = 1;i<n;i++){
        //     int count = 1;
        //     char ch = arr.get(i).charAt(0);
        //     String st = "";
        //     for(int j = 1;j<arr.get(i).length();j++){
        //         if(ch == arr.get(i).charAt(j)){
        //             count++;
        //         }else{
        //             st += count+""+ch;
        //             count = 1;
        //             ch = arr.get(i).charAt(j);
                    
        //         }
        //         if(j == arr.get(i).length()-1){
        //             st += count+""+ch;     
        //         }
        //     }
        //     arr.add(st);
        // }
        // System.out.println(arr);
    }
    
}
