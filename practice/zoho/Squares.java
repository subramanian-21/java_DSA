package zoho;

public class Squares {
    public static void main(String[] args) {
        squares(0,100); 
    }

    static void squares(int i, int j) {
        for (int j2 = i; j2 <=j; j2++) {
            if(isPerfectSquare(j2)){
                System.out.println(j2);
            }
        }
    }
    static boolean isPerfectSquare(int n){
        if(n == 1 ){
            return true;
        }
        if(n == 0){
            return false;
        }
        int start = 0;
        int end = n/2;
        while (start <= end) {
            int mid = start+(end-start)/2;

            if(mid*mid == n){
                return true;
            }else if(mid * mid >n){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return false;
    }

}
