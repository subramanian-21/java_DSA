package zoho;

public class IntToBinary {
    public static void main(String[] args) {
        binary(100);
    }
    static void binary(int n){
        String out = "";
        while (n>0) {
            int rem = n%2;
            n =n/2;
            out = rem+out;
        }
        System.out.println(out);
    }
}
