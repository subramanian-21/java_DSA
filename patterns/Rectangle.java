package patterns;

public class Rectangle {
    public static void main(String[] args) {
    reclangle(5, 5);    
    }
    static void reclangle(int h,int w){
        for(int i = 0;i<h;i++){
            for (int j = 0; j < w; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
