package bitwise;

public class NthBit {
    public static void main(String[] args) {
        System.out.println(ithBit1(4,3));
    }
    static int ithBit(int bin,int n){
        return (bin & 1<<(n-1));
    }
    static int ithBit1(int bin,int n){
        return (bin | 1<< (n-1) );
    }
}
