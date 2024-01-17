package searching.easy;

public class ArrangeCoins {
    public int arrangeCoins(int n) {
        if(n == 1) return n;
       long start = 0;
       long end = n;
       long out = 0;

       while(start<=end){
           long mid = start + (end-start)/2;
           long box = mid*(mid+1)/2;

           if(box>n){
                end = mid-1;
                
           }else{
               start=  mid+1;
               out = Math.max(mid,out);
              
           }
       }
       return (int)out;
    }
}
