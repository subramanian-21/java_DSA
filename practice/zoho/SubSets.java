package zoho;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSets {
    public static void main(String[] args) {
        System.out.println(subsetIterDuplicate(new int[] {1,2,2}));
    }
    static List<List<Integer>> subsetIter(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        for (int nums: arr) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(nums);
                outer.add(inner);
            }
        }
        return outer;
    }
    static List<List<Integer>> subsetIterDuplicate(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());
        int start = 0;
        int end = 0;

        for(int i=  0;i<arr.length;i++){
            start = 0;
            if(i >0 && arr[i] == arr[i-1]){
                start = end+1;
            }
            end = outer.size()-1;
            int n = outer.size();
            for(int j = start;j<n;j++){
                List<Integer> inner = new ArrayList<>(outer.get(j));
                inner.add(arr[i]);
                outer.add(inner);
            }

        }

        return outer;
        
    }
    static ArrayList<String> subset(String str){
        ArrayList<String> arr = process("", str);
        return arr;
    }
    static ArrayList<String> process(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> arr = new ArrayList<>();
            arr.add(p);
            return arr;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = process(p, up.substring(1));
        ArrayList<String> right = process(p+ch, up.substring(1));
        left.addAll(right);
        return left;
    }
}
