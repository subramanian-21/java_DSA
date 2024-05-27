package zoho;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSeq {
    public static void main(String[] args) {
        System.out.println(subsetDup(new int[] {1,2,2,2}));
    }
    static void substring(String p,String up){
        if(up.isEmpty()){
            
                System.out.println(p);
                return;
        
           
        }
        substring(p+up.charAt(0), up.substring(1));
        substring(p, up.substring(1));
    }
    static ArrayList<String> subStrRet(String p,String up){
        if(up.isEmpty()){
            if(!p.equals("") || !p.equals(" ")){
            ArrayList<String> li = new ArrayList<>();
            li.add(p);
            return li;
            }
        }

        ArrayList<String> l = subStrRet(p+up.charAt(0), up.substring(1));
        ArrayList<String> r = subStrRet(p, up.substring(1));

        l.addAll(r);

        return l;
    }

    static List<List<Integer>> subsetArr(int[]  nums){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int i = 0;i<nums.length;i++){
            int n = outer.size();

            for(int j = 0;j<n;j++){
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(nums[i]);
                outer.add(internal);
            }
        }

        return outer;
    }
    static List<List<Integer>> subsetDup(int[] nums){
        Arrays.sort(nums);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start = 0;
        int end = 0;
        for (int i = 0; i < nums.length; i++) {
            start = 0;
            if(i>0 && nums[i] == nums[i-1]){
                start = end+1;
            }
            end = outer.size()-1;
            int n = outer.size();
            for (int j = start; j < n; j++) {
                List<Integer> inner = new ArrayList<>(outer.get(j));
                inner.add(nums[i]);
                outer.add(inner);
            }
        }
        return outer; 
    }
}
