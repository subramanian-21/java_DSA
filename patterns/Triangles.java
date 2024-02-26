package patterns;

public class Triangles {
    static void rightTriangle(int h){
        for(int i = 0;i<h;i++){
            for(int j = 0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void rightTriangleNumbered(int h){
        for (int i = 0; i < h; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j+1+" ");
            }
            System.out.println();
        }
    }
    static void rightTriangleNumbered2(int h){
        for (int i = 0; i < h; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(i+1+" ");
            }
            System.out.println();
        }
    }
    static void rightTriangleReversed(int h){
        for (int i = h-1; i >=0 ; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void rightTriangleReversedNumbered(int h){
        for (int i = h-1; i >=0 ; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j+1+" ");
            }
            System.out.println();
        }
    }
    static void equilateral(int h){
        for (int i = 0; i < h; i++) {
            for(int j = 0;j<(h-i-1);j++){
                System.out.print("  ");
            }
            
            for(int k = 0;k<2*i+1;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void equilateralReversed(int h){
        for (int i = 0; i<h; i++) {
            for(int j = 0;j<i;j++){
                System.out.print("  ");
            }
            
            for(int k = 0;k<2*h-(2*i+1);k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void diamond(int n){
       for(int i = 0;i<n;i++){
        for(int j = 0;j<(n-i-1);j++){
            System.out.print(" ");
        }
        for(int k = 0;k<2*i+1;k++){
            System.out.print("*");
        }
        System.out.println();
       }
       for(int i = 0;i<n;i++){
        for(int j = 0;j<i;j++){
            System.out.print(" ");
        }
        for(int k = 0;k<2*n-(2*i+1);k++){
            System.out.print("*");
        }
        System.out.println();
       }
    }
    static void halfDiamond(int n){
        for(int i = 0;i<=2*n-1;i++){
            int stars = i;
            if(i>n) stars = 2*n-i ;
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void rightBinary(int n){
        for(int i = 0;i<n;i++){
            for (int j = 0; j <=i ; j++) {
                if((i+j)%2 ==  0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
                
            }
            System.out.println();
        }
    }
    static void mNumbers(int n){
        int stars = 2*n -2;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(j);
            }
            for (int k = 0; k < stars; k++) {
                System.out.print(" ");
            }
            
            for(int j = i;j>=1;j--){
                System.out.print(j);
            }
            stars-=2;
            System.out.println();
        }
    }
    static void pyramidOfNumbers(int n){
        int count = 0;
        for(int i = 0;i<n;i++){
            
            for(int j = 0;j<=i;j++){
                count++;
                System.out.print(count+" ");
            }
            System.out.println();
        }
    }
    static void pyramidOfAlps(int n){
        
        for(int i = 0;i<n;i++){
            
            for(int j = 0;j<=i;j++){
              
                System.out.print((char)('A'+j));
            }
            System.out.println();
        }
    }
    static void pyramidOfAlps2(int n){
        
        for(int i = 0;i<n;i++){
            
            for(int j = 0;j<=i;j++){
              
                System.out.print((char)('A'+i));
            }
            System.out.println();
        }
    }
    static void pyramidOfAlpsReverse(int n){
        for (int i = n; i >0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print((char)('A'+j));
            }
            System.out.println();
        }
    }
    static void pyramidOfAlps1(int n){
        int c = 0;
       for (int i = 0; i < n; i++) {
        char alp = 'A';
        for (int j = 0; j < n-i-1; j++) {
            System.out.print(" ");
        }
       

        for(int j=  0;j<2*i+1;j++){
            System.out.print(alp);
            if(j<c){
                alp++;
            }else{
                alp--;
            }
        }
        c++;
        System.out.println();
       }
    }
    static void pattern18(int n){
        String str = "";

        for(int i =0;i<n;i++){
            char alp = 'A';
            for(int j = 0;j<=i;j++){
                str+=(char)(alp+(n-j-1)); 
            }
            if(i!=n-1)
            str+="\n";
        }
        System.out.println(str);
    }
    static void pattern19(int n){
        int init = 0;
        for(int i =0;i<n;i++){
            for(int j = 0;j<n-i;j++){
                System.out.print("* ");
            }
            for(int k = 0;k<init;k++){
                System.out.print("  ");
            }
            for(int j = 0;j<n-i;j++){
                System.out.print("* ");
            }
            System.out.println();
            init+=2;
        }
        init = n*2-2;
        for(int i=  0;i<n;i++){
            for(int j = 0;j<=i;j++){
                System.out.print("* ");
            }
            for(int k = 1;k<=init;k++){
                System.out.print("  ");
            }
            for(int j = 0;j<=i;j++){
                System.out.print("* ");
            }
            init-=2;
            System.out.println();
        }

    }
    static void pattern20(int n){
        int gap = 2*n-1;
        int col = 1;
        for(int i = 0;i<=2*n-1;i++){
            if(i<n){
                col = i;
            }else{
                col = 2*n-i;
            }
            for(int j =0;j<col;j++){
                System.out.print("* ");
            }
            for(int k = 0;k<=gap;k++){
                System.out.print("  ");
            }
            for(int j =0;j<col;j++){
                System.out.print("* ");
            }
            if(i<n) gap-=2;
            else gap+=2;
            System.out.println();
        }
    }
    static void pattern21(int n){
        for (int i = 0; i < n; i++) {
            if(i==0 || i==n-1){
                for(int j = 0;j<n;j++){
                    System.out.print("+");
                }
            }else{
                System.out.print("+");
                for(int j = 0;j<n-2;j++){
                    System.out.print(" ");
                }
                System.out.print("+");
            }
            System.out.println();
        }
    }

    static void pattern22(int n){
        for(int i = 0;i<2*n-1;i++){
            for(int j = 0;j<2*n-1;j++){
                int top = i;
                int left = j;
                int right = 2*n-2-j;
                int down = 2*n-2-i;
                System.out.print(Math.min(Math.min(top, left),Math.min(down, right) ));
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern22(5);
    }
    
}
