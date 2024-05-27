package bitwise;

public class Count {
    public static void main(String[] args) {
        System.out.println(count(100000));
    }
    static int count(int n){
        return (int)(Math.log10(n)+1);
    }
}
