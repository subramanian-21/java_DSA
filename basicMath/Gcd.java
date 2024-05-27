package basicMath;

public class Gcd {
    public static void main(String[] args) {
        gcd(9, 18);
    }
    
    static void gcd(int n1,int n2){
        int num = Math.min(n1, n2);
        int res = 0;
        for(int i = 1;i<=num;i++){
            if(n1%i == 0 && n2%i == 0){
                res = i;
            }
        }
        System.out.println(res);
    }
}
