package zoho.recursion;
/**
 * Input:
N = 10
Output: 1 2 3 4 5 6 7 8 9 10
 */
public class PrintNos {
    public static void main(String[] args) {
        printRec(10);
    }
    static void printRec(int n){
        if(n == 0){
            return;
        }
        printRec(n-1);
        System.out.print(" "+n+" ");
    }
    static void revPrintRec(int n){
        if(n == 0){
            return;
        }
        System.out.print(" "+n+" ");
        revPrintRec(--n);
        
    }
}
