package zoho;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class SlidingWindowMax {
    public static void main(String[] args) {
        int[] arr = {1,3,-1,-3,5,3,6,7};

        System.out.println(maxSlide(arr, 3));
    }
    static ArrayList<Integer> maxSlide(int[] arr,int k){
        ArrayList<Integer> res = new ArrayList<>();
        Deque<Integer> dq = new ArrayDeque<>();

        for (int i = 0; i < arr.length; i++) {
            if(!dq.isEmpty() && dq.peek() == i-k){
                dq.removeFirst();
            }
            while (dq.size()>0 && arr[dq.getLast()] < arr[i]) {
                dq.removeLast();
            }
            dq.add(i);
            if( i >= k-1 ){
                res.add(arr[dq.peek()]);
            }
        }
        return res;
    }
}
