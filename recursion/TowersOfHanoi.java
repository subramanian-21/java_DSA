package recursion;

public class TowersOfHanoi {
    
    public static void main(String[] args) {
        TowersOfHanoiFunction(3,'A','B','C');
    }
    static void TowersOfHanoiFunction(int n,char src,char aux , char dest){
        if(n ==1 ){ System.out.println(src + " --> "+ dest); return;};

        TowersOfHanoiFunction(n-1,src,dest,aux);
        TowersOfHanoiFunction(1, src, aux, dest);
        TowersOfHanoiFunction(n-1, aux, src, dest);
    }
}
