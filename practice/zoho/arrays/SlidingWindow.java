package zoho.arrays;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
public class SlidingWindow {
    public static void main(String[] args) {
        sw(new int[]{1,3,5,2,1,8,6,9},3);
    }
    static void sw(int[] arr,int k){
        List<Integer> li = new ArrayList<>();
        Deque<Integer> dq = new ArrayDeque<>();

        for(int i = 0;i<arr.length;i++){
            if (!dq.isEmpty() && dq.peek() == i-k) {
                dq.removeFirst();
            }
            while (!dq.isEmpty() && arr[dq.peekLast()] < arr[i]) {
                dq.pop();
            }
            dq.add(i);
            if(i>=k-1){
                li.add(arr[dq.peek()]);
            }
        }
        System.out.println(li);
    }
}
