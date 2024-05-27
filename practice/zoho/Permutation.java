package zoho;

import java.util.ArrayList;
import java.util.Arrays;

public class Permutation {
    public static void main(String[] args) {
        combinatons("", "abc");
        System.out.println(permList("", "abc"));
        ;
    }
    static void perm(String p,String up){
       if(up.isEmpty()){
        System.out.println(p);
        return;
       }
       char ch = up.charAt(0);

       for (int i = 0; i <= p.length(); i++) {
        String f = p.substring(0, i);
        String s = p.substring(i);
        perm(f+ch+s, up.substring(1));
       }
        
    }
    static ArrayList<String> permList(String p,String up){
        if(up.isEmpty()){
         ArrayList<String> arr = new ArrayList<>();
         arr.add(p);
          return arr;
        }
        char ch = up.charAt(0);
        ArrayList<String> arr =new ArrayList<>();
        for (int i = 0; i <= p.length(); i++) {
         String f = p.substring(0, i);
         String s = p.substring(i);
         arr.addAll(permList(f+ch+s, up.substring(1)));
        }
        return arr;
         
     }
     static void generatePermutations(int[] arr, int index) {
        if (index == arr.length - 1) {
            System.out.println(Arrays.toString(arr));
            return;
        }
        for (int i = index; i < arr.length; i++) {
            swap(arr, index, i);
            generatePermutations(arr, index + 1);
            swap(arr, index, i);

        }
    }
    static  void combinatons(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch= up.charAt(0);

        combinatons(p+ch, up.substring(1));
        combinatons(p, up.substring(1));

    }
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public int numDecodings(String s) {
        if(s.isEmpty()){
            return  1;
        }
        int c = 0;
        
    }
}
