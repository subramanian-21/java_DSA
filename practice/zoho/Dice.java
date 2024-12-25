package zoho;

public class Dice {
    public static void main(String[] args) {
        dice("", 4);
    }
    static void dice(String p,int up){
        if(up == 0){
            System.out.println(p);
            return;
        }
        for (int i = 1; i <=6 && i<=up; i++) {
            dice(p+i, up-i);
        }
    }
}
