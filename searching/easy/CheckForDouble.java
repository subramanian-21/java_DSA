package searching.easy;

import java.util.*;

public class CheckForDouble {

    public static void main(String[] args) {
        System.out.println(checkForDouble(new int[] {10,2,3}));
    }
    static boolean checkForDoubleOp(int[] arr){

        HashMap<Integer,Integer> m = new HashMap<>();
        for(int i = 0;i<arr.length;i++){
            m.put(arr[i], i);
        }
        for(int i = 0;i<arr.length;i++){
            if(m.containsKey(arr[i]*2) && m.get(arr[i]*2) != i){
                return true;
            }
        }
        return false;
    }
    static boolean checkForDouble(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(i!=j && arr[i] == arr[j]*2){
                    return true;
                }
            }
        }
        return false;
    }
}
