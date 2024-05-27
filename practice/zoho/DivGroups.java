package zoho;

import java.util.ArrayList;
import java.util.List;

public class DivGroups {
    public static void main(String[] args) {
        int[] arr = {3, 6, 7, 2, 9};
        int x = 8;
        System.out.println(group(arr, x));
    }
    static int group(int[] arr,int x){
        List<List<Integer>> out = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            int ele = arr[i];
            List<Integer> inner = new ArrayList<>();
            inner.add(ele);
            for(int j = i+1;j<arr.length;j++){
                if(count == x){
                    out.add(inner);
                    count = 0;
                    ele = 0;
                    inner.clear();
                }else{
                    if((ele+arr[j])%x == 0){
                        inner.add(arr[j]);
                        count++;
                        ele += arr[j];
                    }else{
                        count = x;
                    }
                }
            }
        }
         
        
        System.out.println(out);
        return out.size();
        
    }
}
