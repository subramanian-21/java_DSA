package patterns;

public class Triangles {
    static void equilateral(int n){
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n-i+1;j++){
                System.out.print("  ");
            }
            for(int j = 0;j<2*i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void equilateralRev(int n){
        for(int i = 0;i<n;i++){
            for(int j = 0;j<i;j++){
                System.out.print("  ");
            }
            for(int j = 0;j<2*(n-i-1)+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        equilateralRev(5);
    }
}
