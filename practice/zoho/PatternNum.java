package zoho;

public class PatternNum {
    public static void main(String[] args) {
        printButterfly(5);
    }
    static void print(int n){
        for(int i =0;i<n;i++){
            for(int j = n-i;j>=1;j--){
                System.out.print(" ");
            }
            for(int j = i;j>0;j--){
                System.out.print(j);
            }
            System.out.print(0);
            for(int j = 1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        
    }
    static  void printButterfly(int n){

        for (int i = 1; i <= n*2; i++) {
            for (int j = 1; j <= n*2; j++) {
                if(i <= n){
                    if((j < i+1)|| (j > n*2-i)){
                        System.out.print("*");
                       }else{
                        System.out.print(" ");
                    }
                }else{
                    if((j > i)|| (j < n*2-i+1)){
                        System.out.print("*");
                       }else{
                        System.out.print(" ");
                    }
                }
               
            }
            System.out.println();
        }
    }
}
