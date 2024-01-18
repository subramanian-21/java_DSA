package bitwise;

public class OddOrEven {
    public static void main(String[] args) {
        System.out.println(isOdd(0));
    }
    private static boolean isOdd(int n){
        return (n & 1) == 1;
    }
}
