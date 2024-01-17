package searching.easy;

public class SquareRoot {
    public static void main(String[] args) {
        System.out.println(root(200000000));
    }
    static int root(int x){
        long start = 0;
        long end = x/2;

        while (start<=end) {
            long mid = start + (end - start) /2;

            if(mid*mid <=x && (mid+1)*(mid+1)>x){
                return (int)mid;
            }
            if(mid*mid > x){
                end = mid-1;
            }else{
                start= mid+1;
            }
        }
        return 0;
    }
}
