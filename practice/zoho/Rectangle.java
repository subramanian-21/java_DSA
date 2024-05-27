package zoho;

public class Rectangle {
    public static void main(String[] args) {
        printXO(5,6);
    }
    static void printRect(int m){
        
        for (int i = 0; i < 2*m-1; i++) {
            for (int j = 0; j < 2*m-1; j++) {
              int top = i;
              int left = j;
              int right = 2*m-2-j;
              int bottom = 2*m-2-i;
              int min = m-Math.min(Math.min(top, left),Math.min(bottom, right));
              if(min%2 == 1){
                System.out.print("X");
            }else{
                System.out.print("O");
            }
            }
            System.out.println();
        }
    }
    static void printXO(int m,int n){
        for(int i = 0;i<m;i++){
            for (int j = 0; j < n; j++) {
                int top = i;
                int bottom = m-1-i;
                int right = n-1-j;
                int left = j;

                int min = Math.min(Math.min(top,left),Math.min(right,bottom));
                if(min%2 == 0){
                    System.out.print(" X ");
                }else{
                    System.out.print(" O ");
                }
            }
            System.out.println();
        }

    }
}
