package searching.easy;

import java.util.*;

public class FairCandySwap {
    
    public static void main(String[] args) {
        System.out.println(Arrays.toString(swapCandy(new int[] {1,1}, new int[] {2,2})));
    }
    static int[] swapCandy(int[] num1,int[] num2){

        int s1 = 0;
        int s2 = 0;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < num1.length; i++) {
            s1+=num1[i];
        }
        
        for (int i = 0; i < num2.length; i++) {
            s2+=num2[i];
            set.add(num2[i]);
        }
        int dif = (s2-s1)/2;

        for (int i = 0; i < num1.length; i++) {
            if (set.contains(num1[i]+dif)) {
                return new int[] {num1[i] , num1[i]+dif };
            }
        }
        return new int[] {};
    }
}
