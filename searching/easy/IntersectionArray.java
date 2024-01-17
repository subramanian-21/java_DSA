package searching.easy;

import java.util.*;

public class IntersectionArray {
    public static void main(String[] args) {
          
         System.out.println(Arrays.toString(  intersection(new int[] {1,2,2,1,3}, new int[] {1,2,2,3})));
    }
    static int[] intersectionOfArrayOnlyUnique(int[] nums1,int[] nums2){

        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> out = new ArrayList<>();    
        for(int i = 0;i<nums1.length;i++){
            set.add(nums1[i]);
        }
        Iterator<Integer> iit = set.iterator();
        while (iit.hasNext()) {
            System.out.println(iit.next());
        }

        for (int i = 0; i < nums2.length; i++) {
            if(set.contains(nums2[i])){
                out.add(nums2[i]);
                set.remove(nums2[i]);
            }
        }
        int[] arr = new int[out.size()];
        
        for(int i = 0;i<arr.length;i++){
            arr[i] = out.get(i);
        }
       
        return arr;
    }

    static int[] intersection(int[] nums1,int[] nums2){
        HashMap<Integer,Integer> m = new HashMap<>();
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            if (!m.containsKey(nums1[i])) {
                m.put(nums1[i], 1);
            }else{
                m.put(nums1[i], m.get(nums1[i])+1); 
            }
        }

        for(int i = 0;i<nums2.length;i++){
            if(m.get(nums2[i])>0){
                l.add(nums2[i]);
                m.put(nums2[i], m.get(nums2[i])-1);
            }
        }
        int[] arr = new int[l.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = l.get(i);
        }    
        return arr;
    }
}
