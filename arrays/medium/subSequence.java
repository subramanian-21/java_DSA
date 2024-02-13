package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subSequence {
    public static void main(String[] args) {
        System.out.println(subSeqWithDuplicates(new int[] {2,1,1,2}));
    }
    static List<List<Integer>> subSeq(int[] arr){
        List<List <Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num:arr){
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(num);
                outer.add(inner);
            }
        }
        return outer;
    }
    static List<List<Integer>> subSeqWithDuplicates(int[] arr){
        Arrays.sort(arr);
        List<List <Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int s = 0;
        int e = 0;
        for(int j = 0;j<arr.length;j++){
            s = 0;
            if(j>0 && arr[j] == arr[j-1]){
                s = e+1;
            }
             e = outer.size()-1;
            int n = outer.size();
            for (int i = s; i < n; i++) {
                List<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(arr[j]);
                outer.add(inner);
            }
        }
        return outer;
    }
}
