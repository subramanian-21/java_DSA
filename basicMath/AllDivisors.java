package basicMath;

public class AllDivisors {
    public static void main(String[] args) {
        printDivisors(9);
    }
    static void printDivisors(int n){
        for(int i = 1;i<=n;i++){
            if(n%i == 0){
                System.out.print(i+" ");
            }
        }
    }
}
