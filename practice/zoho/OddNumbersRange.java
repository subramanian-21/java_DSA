package zoho;

public class OddNumbersRange {
    public static void main(String[] args) {
        oddRange(2, 15);
    }
    static void oddRange(int s,int e){
        for(int i = s;i<e;i++){
            if(i%2 == 1){
                System.out.print(i +",");
            }
        }
    }
}
