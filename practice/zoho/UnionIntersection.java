package zoho;

import java.util.ArrayList;

public class UnionIntersection {
    public static void main(String[] args) {
        int[] a = {1,3,4,5,6,8,9};
        int[] b = {1, 5,8,9,2};
        unionIntersection(a, b);
    }
    static void unionIntersection(int[]a ,int[]b){
        ArrayList<Integer> union = new ArrayList<>();
        ArrayList<Integer> intersect = new ArrayList<>();
        ArrayList<Integer> except = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i<a.length && j<b.length) {
            if(a[i] <b[j]){
                union.add(a[i++]);
            }else if(a[i] > b[j]){
                union.add(b[j++]);
            }else{
                intersect.add(a[i++]);
                union.add(b[j++]);
            }
        }
        while (i<a.length) {
            union.add(a[i++]);
        }
        while (j<b.length) {
            union.add(b[j++]);
        }
        System.out.println(union);
        System.out.println(intersect);
    }
}
