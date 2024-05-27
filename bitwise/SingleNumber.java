package bitwise;

public class SingleNumber {
    public static void main(String[] args) {
        
    }
    static int sN(int[]a ){
        int xor = 0;
        for(int i = 0;i<a.length;i++){
            xor = xor^a[i];
        }
        return xor;
    }
}
