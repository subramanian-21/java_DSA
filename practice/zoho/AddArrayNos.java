package zoho;

import java.util.ArrayList;
public class AddArrayNos {
    public static void main(String[] args) {
        int[] a = {7,2,3,4,5,3,1,2,7,2,8};
        int[] b = {1,2,3};
        System.out.println(addArray(a, b));
    }
    static ArrayList<Integer> addArray(int[] a,int[] b){
        ArrayList<Integer> arr = new ArrayList<>();
        long x = 0;
        long y = 0;
        for(int i = 0;i<a.length;i++){
            x =(long)(a[i]*Math.pow(10, i)+x);
        }
        for(int i = 0;i<b.length;i++){
            y=(long)(b[i]*Math.pow(10, i)+y);
        }
        System.out.println(x);
        System.out.println(y);
        x += y;
        while (x>0) {
            int rem = (int)x%10;
            arr.add(0,rem);
            x/=10;
        }
        return arr;   
    }
}
