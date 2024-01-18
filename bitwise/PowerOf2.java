package bitwise;

public class PowerOf2 {
    public static void main(String[] args) {
        System.out.println(isPower2(0));
    }
    static boolean isPower2(int num){
        if(num == 0) return false;
        return (num & num-1) == 0;
    }
}
