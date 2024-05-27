package zoho;

import java.util.ArrayList;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int [] arr = {8, 3, 4, 7, 9,0,7,4,3,6};
        System.out.println(findSum(arr, 7));
    }
    static ArrayList<ArrayList<Integer>> findSum(int[] arr, int target){
        ArrayList<ArrayList<Integer>> out = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=  0;i<arr.length;i++){
            if(map.containsKey(target-arr[i])){
                ArrayList<Integer> inner = new ArrayList<>();
                inner.add(target-arr[i]);
                inner.add(arr[i]);
                
                out.add(inner);
            }else{
                map.put(arr[i], i);
            }
        }
        return out;
    }
}
