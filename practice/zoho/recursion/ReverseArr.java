package zoho.recursion;

import java.util.Arrays;

/**
 * Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]

 */
public class ReverseArr {
    public static void main(String[] args) {
        char[] arr = {'s','u','b','r','a','m','a','n','i','a','n'};
        reverse(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(char[] arr,int s,int e){
        if(s>=e){
            return;
        }
        char temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;

        reverse(arr, ++s, --e);   
    }
}
