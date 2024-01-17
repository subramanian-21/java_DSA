package searching.easy;

public class ValidPerfectSq {
    public static void main(String[] args) {
        
    }
    public boolean isPerfectSquare(int num) {
        if(num<=1) return true;
        long start = 0;
        long end = num/2;

        while(start<=end){
            long mid = start+(end-start)/2;

            if(mid*mid == num){
                return true;
            }
            if(mid*mid > num){
                end = mid -1;
            }else{
                start = mid+1;
            }
        }
        return false;
    }
}
